package oopsConpects;

public class Cons_Class1 {
	
	int a;
	String str;
	
	Cons_Class1(int b, String s){
		a=b;
		str=s;
	}
	
	void dis(){
		System.out.println(str+" "+a);
	}
	
	public static void main(String[] args){
		Cons_Class1 obj = new Cons_Class1(10,"Welcome");
		obj.dis();
	}

}
