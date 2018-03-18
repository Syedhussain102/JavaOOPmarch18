package tutorial1;

public class TestCon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 obj = new Constructor1("samsung");
		Constructor1 obj1 = new Constructor1("samsung",347);
		Constructor1 obj2 = new Constructor1(347,78.3);
	//non static methods
		//1
		obj.nonstaticmethod1();
		//2
		int rr=obj1.nonstaticmethod2();
		System.out.println(rr);
		//3
		obj2.nonstaticmethod3(5464);
		//4
		int ahg=obj.nonstaticmethod4(28,9);
		System.out.println(ahg);
		
		// static methods 
		StaticMethod.tryout();
		StaticMethod.tryout1();
		
		// static variable 
		System.out.println(StaticMethod.age1);
		System.out.println(StaticMethod.name1);
		
		
		// set and get
		
		Setandget mm = new Setandget(); 
			mm.setx("samsung galaxy s6 edge");
			System.out.println(mm.gety());
			
		
		
		
		
		

	}

}
