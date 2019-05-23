import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YellingTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//R1: ONE PERSON IS  YELLING
	
	@Test
	public void testOnePersonIsYelling() {
		
	}
	//R2: NO ONE IS YELLING
	@Test
	public void testDivisibleBy3() {
		Yelling y = new Yelling();
		
		String result = y.Scream("Null");
		assertEquals("No one is Yelling", result);
	}
		//R3: UPPERCASE YELLING
		//R4: TWO PERSONS ARE YELLING
		//R5: MORE THAN TWO PERSONS ARE YELLING
		//R6: SHOUTING LOUD AT THE PEOPLE
}
