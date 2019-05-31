package com.jdwill;

public enum Operator {
	
	 ADD {
	        @Override
	        public int apply(int a, int b) {
	            return a + b;
	        }
	        
	        @Override
	        public String getSymbol() {
	        	return "+";
	        }
	    },

	    MULTIPLY {
	        @Override
	        public int apply(int a, int b) {
	            return a * b;
	        }
	        
	        @Override
	        public String getSymbol() {
	        	return "*";
	        }
	    },

	    SUBTRACT {
	        @Override
	        public int apply(int a, int b) {
	            return a - b;
	        }
	        
	        @Override
	        public String getSymbol() {
	        	return "-";
	        }
	    },

	    DIVIDE {
	        @Override
	        public int apply(int a, int b) {
	            return a / b;
	        }
	        
	        @Override
	        public String getSymbol() {
	        	return "/";
	        }
	    },

	    MODULO {
	        @Override
	        public int apply(int a, int b) {
	            return a % b;
	        }
	        
	        @Override
	        public String getSymbol() {
	        	return "%";
	        }
	    };

	    public abstract int apply(int a, int b);
	    
	    public abstract String getSymbol();

}
