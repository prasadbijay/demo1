package com.collection;

public class CricketPlayer implements Comparable<CricketPlayer> {
	private String player_name;
	private int player_score;
	public String getPlayer_name() {
		return player_name;
	}
	//public void setPlayer_name(String player_name) {
		//this.player_name = player_name;
	//}
	public int getPlayer_score() {
		return player_score;
	}
	//public void setPlayer_score(int player_score) {
		//this.player_score = player_score;
	//}
	public CricketPlayer(String player_name, int player_score) {
		super();
		this.player_name = player_name;
		this.player_score = player_score;
	}
	@Override
	public String toString() {
		return player_name+"- Runs Score: "+player_score;
	}
	public int compareTo(CricketPlayer other) {
		if (this.player_score != other.player_score) {
			return Integer.compare(other.player_score,this.player_score);
		}
		return this.player_name.compareTo(other.player_name);
		
	}

}
