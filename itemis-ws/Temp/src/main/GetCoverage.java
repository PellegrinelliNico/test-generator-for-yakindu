package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.emf.ecore.xmi.XMIResource;

import com.yakindu.sct.model.sgraph.SGraphPackage;
import com.yakindu.sctunit.coverage.JSONToMeasurement;
import com.yakindu.sctunit.coverage.Measurement;
import com.yakindu.sctunit.coverage.MeasurementExtension;

public class GetCoverage {

	public static void main(String[] args) throws IOException {
		String wsPath = args[0]; // "C:/Users/lenovo/Desktop/ProgettiGit/test-generator-for-yakindu/itemis-ws"
		String projectName = args[1]; // "TargetStatecharts"
		String covPath = args[2]; // "models/ExamplStc-2024-05-01-142926.cov"

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ysc", new XMIResourceFactoryImpl() {
			public Resource createResource(URI uri) {
				String uriStr = uri.toString();
				System.out.print("Coverage for " + uriStr.substring(uriStr.lastIndexOf("/") + 1) + ": ");

				String[] args = { "-platformResource", projectName, "file:///" + wsPath + "/" + projectName + "/" };
				EcorePlugin.handlePlatformResourceOptions(args);

				EPackage.Registry.INSTANCE.put(SGraphPackage.eNS_URI, SGraphPackage.eINSTANCE);
				EPackage.Registry.INSTANCE.put("http://www.eclipse.org/gmf/runtime/1.0.2/notation",
						NotationPackage.eINSTANCE);

				XMIResource xmiResource = new XMIResourceImpl(uri);
				return xmiResource;
			}
		});

		String covString = new String(Files.readAllBytes(Paths.get(wsPath + "/" + projectName + "/" + covPath)),
				StandardCharsets.UTF_8);

		JSONToMeasurement j2m = new JSONToMeasurement(covString);
		Measurement measurement = j2m.generateMeasurement();

		MeasurementExtension measurementExtension = new MeasurementExtension(measurement);

		Measurement.StateTransitionCoverage coverage = measurementExtension.coverage(measurement);
		int value = (int) ((coverage.coverage) * 100.0F);
		System.out.println(value + "%");
	}

}