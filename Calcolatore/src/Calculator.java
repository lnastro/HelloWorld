package Calcolatore;

public class Calculator {
	public Calculator(){};
	
  public int evaluate(String expression) {
	    System.out.println("Sono in Calcolatore");
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}