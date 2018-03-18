package tutorial1;

public class TestComputer {

	public static void main(String[] args) {
		//non static 
		Computer dell = new Computer();
		System.out.println(dell.d);
		dell.test(13,15);

		//static
	
		Computer.test1();
		System.out.println(Computer.a);
		
		
		
		
		
		
		
		


	}

}
