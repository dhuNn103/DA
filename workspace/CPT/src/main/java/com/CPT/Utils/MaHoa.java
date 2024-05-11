package com.CPT.Utils;

import java.security.MessageDigest;

import org.apache.tomcat.util.codec.binary.Base64;


public class MaHoa {
	
	public static String toSha1(String password) throws Exception{
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] encodedHash = digest.digest(password.getBytes());
		
		StringBuilder hexStringBuilder = new StringBuilder(2 * encodedHash.length);
		for(byte b: encodedHash) {
			String hex =Integer.toHexString(0xff & b);
			if(hex.length()==1) {
				hexStringBuilder.append('0');
				
			}
			hexStringBuilder.append(hex);
		}
		return hexStringBuilder.toString();
	}
}
