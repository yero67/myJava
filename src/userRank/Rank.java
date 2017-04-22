package userRank;

public class Rank {
	
	private int value;
	
		public Rank(int value) throws Exception{
			this.setValue(value);
		}

	public int getValue() {
		return value;
	}

	public void setValue(int value) throws Exception {
		if(value < -8 || value == 0 || value > 8){
			throw new Exception("cette note n'est pas attribuée");
		}
		this.value = value;
	}
}
