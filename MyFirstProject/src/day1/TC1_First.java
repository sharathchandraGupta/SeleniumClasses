package day1;

import java.lang.reflect.Method;

public class TC1_First {

    public void m1() { }

    public void m2() { 
    	
    }

    public String m3() { return "Test"; }

    public static void main(String args[])
    {
        try {
            Class c = TC1_First.class;
            Method[] m = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
            System.out.println(m[i].getName().toString());
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}