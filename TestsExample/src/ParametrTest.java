import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class ParametrTest {

	
	private TextExampleClass tec;
	  private int inputNumber;
	   private boolean expectedResult;
	  public ParametrTest(int inputNumber, boolean expectedResult) {
			this.inputNumber = inputNumber;
			this.expectedResult = expectedResult;
		}
	 
	@Before
	public void setUp() throws Exception {
		tec = new TextExampleClass();
	}
	@Parameters(name = "{0}.isPrimaryNumber={1}")
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 5, true },
	         { 12, false },
	         { 29, true },
	         { 32, false },
	         { 37, true }
	      });
	   }
	   @Test
	   public void testArrayEquals() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, tec.validateNumberIsPrimaryNumber(inputNumber));
	   }


	

}
