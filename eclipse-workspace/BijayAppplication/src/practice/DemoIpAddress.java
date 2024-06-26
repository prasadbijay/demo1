package practice;

import java.net.InetAddress;

public class DemoIpAddress {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress lc=InetAddress.getLocalHost();
			System.out.println(" ip address "+lc.getLocalHost());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
