package userRank;

public class User {

	/*
	 * private Rank userRank; private Activity userActivity; private Progression
	 * userProgression;
	 */

	public int rank = -8;
	public int progress = 0;
	public int remain = 0;

	public User() throws Exception {
	}

	/*
	 * public Activity getUserActivity() { return userActivity; } public void
	 * setUserActivity(Activity userActivity) { this.userActivity =
	 * userActivity; } public Rank getUserRank() { return userRank; }
	 */
	/*
	 * public void setUserRank(Rank rank) throws Exception { if(rank.getValue()
	 * == -1 || rank.getValue()==0){ rank.setValue(1); } this.userRank = rank; }
	 */

	/*
	 * public Progression getUserProgression() { return userProgression; }
	 * 
	 * public void setUserProgression(Progression userProgression) {
	 * this.userProgression = userProgression; }
	 */

	/*
	 * public int incProgression(int rank){
	 * 
	 * if(rank == getUserRank().getValue()){ return getUserRank().getValue()+ 3;
	 * }else if(rank < getUserRank().getValue()-2){ return
	 * getUserRank().getValue(); }else if(rank > getUserRank().getValue()-2 &&
	 * rank < getUserRank().getValue()){ return getUserRank().getValue()+1;
	 * }else{ return
	 * 10*((getUserRank().getValue()-rank)*(getUserRank().getValue()-rank)); } }
	 */

	/*
	 * public int incProgression(int rank) {
	 * 
	 * if (this.rank == rank + this.remain) { return this.rank + this.remain +
	 * 3; } else if (rank < this.rank - 2) { return this.rank + this.remain; }
	 * else if (rank > this.rank - 2 && rank < this.rank) { return this.rank +
	 * this.remain + 1; } else { return 10 * ((this.rank + this.remain - rank) *
	 * (this.rank + this.remain - rank)); } }
	 * 
	 * public void updateUserRank(int progressRank) throws Exception {
	 * 
	 * if (this.progress + progressRank >= 100) { this.progress = 0;
	 * if(this.rank > 8){ throw new Exception("No more progression"); }else{
	 * this.rank += 1; } this.remain = this.progress+progressRank - 100; } else
	 * { this.progress += progressRank; } if(this.rank == -1 || this.rank == 0){
	 * this.rank = 1; } }
	 */

	public void incProgression(int rank) {
		int progression = 0;

		try {
			if (rank < -8 || rank > 8 || rank == 0) {

				throw new Exception("Invalid range exception ");
			}

			if (this.rank == rank) {
				progression = 3;
			} else if (rank < this.rank - 2) {
				progression = 0;
			} else if (rank > this.rank - 2 && rank < this.rank) {
				progression = 1;
			} else {
				progression = 10 * ((this.rank + this.remain - rank) * (this.rank + this.remain - rank));
			}

			int p = progression + this.remain;
			updateUserRank(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateUserRank(int progressRank) throws Exception {

		if (this.progress + progressRank >= 100) {
			this.progress = 0;
			if (this.rank > 8) {
				throw new Exception("No more progression");
			} else {
				this.rank += 1;
			}
			this.remain = this.progress + progressRank - 100;
		} else {
			this.progress += progressRank;
		}
		if (this.rank == -1 || this.rank == 0) {
			this.rank = 1;
		}
	}

}
