package com.mikevinson.domainsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getThisComputersLocalAddress {

	public static void main(String args[]) throws UnknownHostException{
		InetAddress me = InetAddress.getLocalHost();
		String dottedQuad = me.getHostAddress();
		System.out.println("My address is " + dottedQuad);
	}
}
