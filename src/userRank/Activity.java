package userRank;

public class Activity {

	Rank rank;
	
	public Activity(Rank rank){
		this.setRank(rank);
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
}
