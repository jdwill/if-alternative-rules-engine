package com.jdwill;

public interface Rule {
	
	boolean evaluate(Expression expression);
	
	Result getResult();

}
