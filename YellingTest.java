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
assertEquals("Peter is yelling",result );
}
@Test
public void test0PersonIsYelling() {
// NOone PERSON IS YELLINg
Yelling y = new Yelling();
String result = y.Scream("");
assertEquals("Nobody is yelling",result );
}
@Test
public void testUppercaseYelling() {
// Uppercase  YELLINg
Yelling y = new Yelling();
String result = y.Scream("PETER");
assertEquals("PETER IS YELLING",result );
}
@Test
public void testMoreThanTwoPeopleYelling() {
// more than 2 people are yelling
Yelling y = new Yelling(); 
String result = y.Scream("Peter, Kadeem, Albert,");
assertEquals("Peter, Kadeem, and Albert are yelling",result );
}
@Test
public void testLotOfPeopleYelling() {
// Uppercase  YELLINg
Yelling y = new Yelling();
String result = y.Scream("Peter, EMAD");
assertEquals("Peter is yelling. SO IS EMAD!",result );
}
} 