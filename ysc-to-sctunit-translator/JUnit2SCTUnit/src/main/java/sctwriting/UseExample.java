package sctwriting;

import java.util.ArrayList;
import java.util.List;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

public class UseExample {
	public static void main(String[] args) {
		List<TestCase> testSuite = new ArrayList<TestCase>();
		
		TestCase test1 = new TestCase("test1");
		test1.addEnter();
		test1.addEvent("evento1");
		test1.addProceedCycle();
		test1.addAssertState("stato1", true);
		test1.addAssertState("stato2", false);
		test1.addIsActive(true);
		test1.addIsFinal(true);
		test1.addExit();
		
		TestCase test2 = new TestCase("test2");
		test2.addEnter();
		test2.addAssertState("stato1", false);
		test2.addIsActive(false);
		test2.addIsFinal(false);
		test2.addExit();
		
		testSuite.add(test1);
		testSuite.add(test2);
		
		STGroupFile group = new STGroupFile(".\\template\\sct_template.stg");
		ST st = group.getInstanceOf("test_class");
		st.add("statechart_name", "LightSwitch");
		st.add("test_suite", testSuite);
		System.out.println(st.render());
	}

}
