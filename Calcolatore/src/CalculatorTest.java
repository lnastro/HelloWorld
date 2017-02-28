package Calcolatore;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
	    System.out.println("Sono in Test");
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
  
	assertEquals(6, sum);
	
  }
}