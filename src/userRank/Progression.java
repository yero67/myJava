package userRank;

public class Progression extends Exception {

	private static final long serialVersionUID = 1L;
	private int  value;
	
		public Progression(int value){
			this.value = value;
		}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
