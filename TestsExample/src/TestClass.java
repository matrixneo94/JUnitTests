import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class TestClass {

	private TextExampleClass tec;
	 	
	@Before
	public void setUp(){
		this.tec = new TextExampleClass();
	}
	@Test(expected = NullPointerException.class)
	public void exceptionTest(){
		System.out.println("Exception test");
		tec.getAl().add("sdsd");		
	}
	@Test
	public void assertTest(){
		System.out.println("Assertion test");
		System.out.println("Assert null");
		assertNull(tec.getAl());
		tec.setNumberFirst(6);
		System.out.println("Assertion not null");
		assertNotNull(tec.getNumberFirst());
		tec.setNumberSecond(12);
		System.out.println("Assertion equals");
		assertNotEquals(tec.getNumberFirst(), tec.getNumberSecond());
		String s1 = "String";
		String s2 = s1;
		String s3 = new String("String");
		System.out.println("Assertion reference");
		assertSame(s1,s2);
		assertNotSame(s1,s3);
	}
	   

}
