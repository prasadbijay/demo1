package com.collection;
import java.util.Set;
import java.util.TreeSet;

public class PlayerScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<CricketPlayer> lb=new TreeSet<>();
		lb.add(new CricketPlayer("virat kholi: ",18000));
		lb.add(new CricketPlayer("jacques kallis: ",13000));
		lb.add(new CricketPlayer("riky ponting: ",14000));
		lb.add(new CricketPlayer("sachin tendulkar:: ",16000));
		lb.add(new CricketPlayer("brain lara: ",11000));
		lb.add(new CricketPlayer("Rohit Sharma: ",12000));
		//System.out.println(lb);
		System.out.println("\n"+"		Test Run score: "+"\n");
		for(CricketPlayer p:lb) {
			System.out.println(p);
		}
		

	}

}
