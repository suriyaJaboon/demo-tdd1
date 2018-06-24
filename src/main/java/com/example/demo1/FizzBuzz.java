package com.example.demo1;

public class FizzBuzz {
	
//	public String say(int input) {
//		if(input == 15) {
//			return "FizzBuzz";
//		}
//		if(input % 5 == 0) {
//			return "Buzz";
//		}
//		if(input % 3 == 0) {
//			return "Fizz";
//		}
//		return input + "";
//	}
	
	public String say(int input) {
        if(input == 15) 
            return "FizzBuzz";
        
        IFizzBuzz[] rules = { new BuzzRule(), 
                              new FizzRule(),
                              new JavaRule()};
        for (IFizzBuzz rule : rules) {
            if(rule.isValid(input)) 
                return rule.say();
        }
        
        return input + "";
    }
}

class BuzzRule implements IFizzBuzz {
	
	@Override
	public boolean isValid(int input) {
        return input%5 == 0;
    }
	
	@Override
    public String say() {
        return "Buzz";
    }
}

class FizzRule implements IFizzBuzz {
    public boolean isValid(int input) {
        return input%3 == 0;
    }
    public String say() {
        return "Fizz";
    }
}

class JavaRule implements IFizzBuzz {
    public boolean isValid(int input) {
        return input%7 == 0;
    }
    public String say() {
        return "Java";
    }
}