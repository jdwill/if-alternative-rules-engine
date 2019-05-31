package com.jdwill;

public class Application {
	
	public static void main(String[] args) {
		int firstAddend = 5;
		int secondAddend = 5;
		Operator operator = Operator.ADD;
		
		Expression expression = new Expression(firstAddend, secondAddend, operator);
		RuleEngine ruleEngine = new RuleEngine();
		Result result = ruleEngine.process(expression);
		
		System.out.println(firstAddend + " + " + secondAddend + " = " + result.getValue());
	}

}
