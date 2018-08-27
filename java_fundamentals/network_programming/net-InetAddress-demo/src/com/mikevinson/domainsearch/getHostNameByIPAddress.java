package com.mikevinson.domainsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getHostNameByIPAddress {

	public static void main(String[] args) {
		InetAddress ia;
		
		// get googles DNS hostname using their DNS server IP address
		
		try {
			ia = InetAddress.getByName("8.8.8.8");
			System.out.println(ia.getCanonicalHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
