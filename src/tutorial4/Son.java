package tutorial4;

public class Son extends Parent{
	public void name() {
		System.out.println("new name given");
	}
	public void age() {
		System.out.println("new age");
	}
	public void hair() {
		System.out.println("print hair color");
	}
	public void age(int a) {
		System.out.println("overloading 1");
	}
	public void age(int a,int b) {
		System.out.println("overloading 2");
	}

}
