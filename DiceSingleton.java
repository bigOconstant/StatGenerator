public class DiceSingleton {

	private Integer dice1;
	private Integer dice2;
	private Integer dice3;
	private Integer dice4;
	
	
	
	
	
	
	
	private static DiceSingleton instance = null;
	protected DiceSingleton(){
		//Exist only to defeat instantiation.
	}
	
	public static DiceSingleton getInstance(){
		
		if(instance == null){
			instance = new DiceSingleton();
		}
		return instance;
		
		
	}

	public Integer getDice1() {
		return dice1;
	}

	public void setDice1(Integer dice1) {
		this.dice1 = dice1;
	}

	public Integer getDice2() {
		return dice2;
	}

	public void setDice2(Integer dice2) {
		this.dice2 = dice2;
	}

	public Integer getDice3() {
		return dice3;
	}

	public void setDice3(Integer dice3) {
		this.dice3 = dice3;
	}

	public Integer getDice4() {
		return dice4;
	}

	public void setDice4(Integer dice4) {
		this.dice4 = dice4;
	}
	
	
	
	
	
	
}
