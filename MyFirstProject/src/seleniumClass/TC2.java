package seleniumClass;

import java.lang.reflect.Method;

public class TC2 {

	void m1() {

	}

	void m2() {

	}

	void m3() {

	}

	public static void main(String[] args) {

		Class aClass = TC2.class;

		// Get the methods
	    Method[] methods = aClass.getDeclaredMethods();
	    
	    for(Method m:methods ){
	    	System.out.println(m.getName());
	    }
	}
}
