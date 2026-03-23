package edu.ucam.domain;

public class Heroe {

	private String alias;
	private String don;
	private int ranking;
	
	
	
	public Heroe(String alias, String don, int ranking) {
		super();
		this.alias = alias;
		this.don = don;
		this.ranking = ranking;
	}
	
	
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getDon() {
		return don;
	}
	public void setDon(String don) {
		this.don = don;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	
	
}
