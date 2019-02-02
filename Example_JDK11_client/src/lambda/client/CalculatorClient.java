package lambda.client;

import lambda.Calculator;

public class CalculatorClient {
	static final String field = " foo ".toString();
	static final String field_2 = " foo ".stripTrailing();
	static final String field_1 = "foo"+"-OK";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator client = new Calculator();
	   client.printCals();
	   System.out.println(field_2);
	   System.out.println(field_1);
	   System.out.println(field);	
	}

}