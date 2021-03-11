package com.example.service;

public class PalindromoService {
	public static String getLargetsPalindrome(String string) {
		if(string==null) {
			return "";
		}else if(string.length() == 1) {
			return string;
		}else {
			return subString(string);
		}
	}
	private static boolean isPalindrome(String str) {
		String invertida = new StringBuilder(str).reverse().toString();
		return invertida.equals(str);
	}
	private static String subString(String verify) {
		String auxiliar = "";
		for(int i = 0; i < verify.length(); i++) {
			for(int j = i + 2; j <= verify.length(); j++) {
				//System.out.println(verify.substring(i, j));
				if (isPalindrome(verify.substring(i, j))) {
					if(verify.substring(i, j).length() > auxiliar.length()) {
						auxiliar = verify.substring(i, j);
					}
				}

			} 
		}
		System.out.println("auxiliar: " + auxiliar);
		return auxiliar;
	}
}
