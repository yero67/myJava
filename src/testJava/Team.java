package testJava;

public class Team {
	String teamName;
	int nombreButs;
	int points;
	int matchJoue;
	int matchGagne;
	int matchPerdu;
	
	public Team(String nom){
		this.teamName = nom;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNombreButs() {
		return nombreButs;
	}
	public void setNombreButs(int nombreButs) {
		this.nombreButs = nombreButs;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getMatchJoue() {
		return matchJoue;
	}
	public void setMatchJoue(int matchJoue) {
		this.matchJoue = matchJoue;
	}
	public int getMatchGagne() {
		return matchGagne;
	}
	public void setMatchGagne(int matchGagne) {
		this.matchGagne = matchGagne;
	}
	public int getMatchPerdu() {
		return matchPerdu;
	}
	public void setMatchPerdu(int matchPerdu) {
		this.matchPerdu = matchPerdu;
	}
	
	public String extract(String string){
		return null;
	}
	
}
