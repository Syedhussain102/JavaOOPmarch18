package tutorial1;

public class Constructor1 {
	static String Phone;
	int number;
	double degit;
	String color;
	
	//constructor 1
	
	public Constructor1(String a) {
		this.Phone= a;
		System.out.println(a);
	}
	public Constructor1(int b) {
		this.number = b;
		System.out.println(b);
	}
	public Constructor1(double c) {
		this.degit = c;
		System.out.println(c);
	}
	public Constructor1(String d, int e) {
		this.color=d;
		this.number=e;
		System.out.println(d + " " + e);
	}
	public Constructor1(int f, double g) {
		this.number=f;
		this.degit=g;
		System.out.println(f + " " + g);
	}
	//non static methods 
	// 1
	public void nonstaticmethod1 () {
		System.out.println("Java is an ocean but I dont know how to swim :'(");
	}
	//2
	public int nonstaticmethod2 () {
		int aa = 12;
		int bb = 15;
		int cc = aa + bb;
		return cc;
		
	}
	//3
	public void nonstaticmethod3(double call) {
		System.out.println("siri can you please call" + call );
	}
	//4
	public int nonstaticmethod4(int x,int y) {
		int d = x/y;
		return d;
		
		
	}
	// static and non static 
	//public static void staticmethod()
	

}
