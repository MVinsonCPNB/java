package com.mikevinson.domainsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getIPaddressByHostName {

	public static void main(String[] args) {
		// single get by name
		try {
			InetAddress address = InetAddress.getByName("www.oreilly.com");
			System.out.println(address);
		} catch (UnknownHostException ex) {
			System.out.println("Could not find www.oreilly.com");
		}

		// get all names (only returns one)
		try {
			InetAddress[] addresses = InetAddress.getAllByName("www.oreilly.com");
			for (InetAddress address : addresses) {
				System.out.println(address);
			}
		} catch (UnknownHostException ex) {
			System.out.println("Could not find www.oreilly.com");
		}

		// get hostname of ip address (www.weather.com)
		try {
			byte[] weatherDotCom = { 23, 11, (byte) 237, (byte) 109};
			InetAddress address = InetAddress.getByAddress(weatherDotCom);
			System.out.println(address.getCanonicalHostName());
		} catch (UnknownHostException ex) {
			System.out.println("Could not find a hostname associated with 23.11.237.109");
		}

		// get all hostnames associated with the ip address (only returns one)
		try {
			InetAddress[] addresses = InetAddress.getAllByName("23.11.237.109");
			for (InetAddress address : addresses) {
				System.out.println(address.getCanonicalHostName());
			}
		} catch (UnknownHostException ex) {
			System.out.println("Could not find a hostname associated with 23.11.237.109");
		}
		
		// find the address of the local machine
		try {
			InetAddress me = InetAddress.getLocalHost();
			System.out.println(me);
		} catch (UnknownHostException e) {
			System.out.println("Could not find this computer's address");
		}
	}
}
