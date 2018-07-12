package interFaceConcept;

public interface WebDriver{

	final int a =3;
	final static int b =3;	
	
	public static void get(){
		System.out.println(a);
	};

	public void getTitle();
	
	void getPageSource();

}

