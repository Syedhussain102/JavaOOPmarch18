package tutorial2;

public class ConcreteClass extends Abstract implements CricketInterface1,CricketInterface2 {
	public void bat() {
		System.out.println("bat is needed for the game of cricket");
	}
	public void ball() {
		System.out.println("ball is needed for the game of cricket");
	}
	public void stumps() {
		System.out.println("2 sets of stumps is needed t oplay the game");
	}
	@Override
	public void players() {
		System.out.println("11 playes from 2 teams needed to play the game");
		
	}
	@Override
	public void umpires() {
		System.out.println("2 umpire on field will operate the game");
		
	}
	@Override
	public void ab2() {
		System.out.println("abcd");
		
	}
	
}
	
