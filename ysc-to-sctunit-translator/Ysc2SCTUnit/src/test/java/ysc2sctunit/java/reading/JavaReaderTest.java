package ysc2sctunit.java.reading;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class JavaReaderTest {
	IJavaReader reader = new JavaReader();
	
	@Test(expected = NullPointerException.class)
	public void testNullInput() throws FileNotFoundException{
		reader.getProceedTimes(null);
	}

	@Test(expected = FileNotFoundException.class)
	public void testEmptyInput() throws FileNotFoundException{
		reader.getProceedTimes("");
	}
	
	@Test(expected = FileNotFoundException.class)
	public void testNotExistingInput() throws FileNotFoundException{
		reader.getProceedTimes("src/test/resources/NotExistingStatechart2.java");
	}

	@Test
	public void testCorrectInput() throws FileNotFoundException {
		Map<Integer, ProceedTime> actual = reader.getProceedTimes("src/test/resources/Statechart2.java");
		Map<Integer, ProceedTime> expected = new HashMap<Integer, ProceedTime>();
		expected.put(0, new ProceedTime(100, TimeUnit.MILLISECONDS));
		expected.put(1, new ProceedTime(3, TimeUnit.SECONDS));
		expected.put(2, new ProceedTime(1000, TimeUnit.NANOSECONDS));
		expected.put(3, new ProceedTime(500, TimeUnit.MICROSECONDS));
		assertThat(actual)
			.usingRecursiveComparison()
			.isEqualTo(expected);
	}

}