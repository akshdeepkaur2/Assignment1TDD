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

	@Test
	public void test1PersonIsYelling() {
		// 1 PERSON IS YELLINg
		Yelling y = new Yelling();
		String result = y.Scream("Peter");
		assertEquals("Peter is Yelling",result );
		
	}

}
