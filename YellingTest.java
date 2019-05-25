import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YellingTest {
	private String[] names= {"Peter", "Albert","Emad","Pritesh"};
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
	public void testnooneisyelling() {
		Yelling y = new Yelling();
		
		String result = y.Scream("Null");
		assertEquals("No one is Yelling", result);
	}
		//R3: UPPERCASE YELLING
		//R4: TWO PERSONS ARE YELLING
	@Test
	public void testTwoPersonsAreYelling() {
		Yelling y = new Yelling();
	
		String result = y.Scream("Peter , Kadeem");
		System.out.println(result);
		assertEquals("Peter and Kadeem are Yelling", result);
	}
		//R5: MORE THAN TWO PERSONS ARE YELLING
		//R6: SHOUTING LOUD AT THE PEOPLE
}
