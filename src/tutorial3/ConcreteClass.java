package tutorial3;

public class ConcreteClass extends Abstruct implements Interface1,interface2 {

	//interface1
	public void guitar() {
		System.out.println("i play guitar");
		
		
	}

	
	public void brand() {
		System.out.println("gibson");
		
		
	}

	
	public void strings() {
		System.out.println("i have 6 strings");
		
		
	}

// interface2
	@Override
	public void drums() {
		System.out.println("i dont know how to play drums");
		
	}


	@Override
	public void sticks() {
		System.out.println("i dont have drum sticks");
		
	}


	@Override
	public void music() {
		System.out.println("music music");
		
	}
	

}
