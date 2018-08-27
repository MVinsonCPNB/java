package com.mikevinson.domainsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ScanForOpenIPAddresses {

	public static String addS;

	public static void main(String[] args) {

		// scan for local router gateway ip address
		for (int i = 0; i < 256; i++) {
			try {
				byte[] address = { (byte) 10, 0, 0, (byte) i };
				InetAddress add = InetAddress.getByAddress(address);
				addS = add.getHostAddress();
				if (!add.getHostName().contains("10.0.0")) {
					System.out.println(add);
				}
//				System.out.println(add.getHostName());
			} catch (UnknownHostException ex) {
				System.out.println("UnknownHost for Address" + addS);
			}
		}

		// scan for localhost ip address
		for (int i = 0; i < 256; i++) {
			try {
				byte[] address = { (byte) 127, 0, 1, (byte) i };
				InetAddress add = InetAddress.getByAddress(address);
				addS = add.getHostAddress();
				if (!add.getHostName().contains("127.0.1")) {
					System.out.println(add);
				}
//						System.out.println(add.getHostName());
			} catch (UnknownHostException ex) {
				System.out.println("UnknownHost for Address" + addS);
			}
		}
	}
}
