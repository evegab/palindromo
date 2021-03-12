package com.example.service;

import java.util.ArrayList;

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
	public static String subString(String verify) {
		String auxiliar = "";
		ArrayList<String> tree = new ArrayList<>();
		tree.add(verify);
		
		for(int i = 0; i < tree.size(); i++) {
			if(isPalindrome(tree.get(i))) {
					auxiliar = tree.get(i);
					break;
			}else {
				generateChild(tree, tree.get(i));
			}
		}
		System.out.println("palindromo es: " + auxiliar);
		return auxiliar;
	}
	private static void generateChild(ArrayList<String> list, String parent) {
		if(parent.length() >= 2){
		String leftChild = parent.substring(0, parent.length()-1);
		String rightChild = parent.substring(1);
		if(!itExist(list, leftChild))
			list.add(leftChild);
		if(!itExist(list, rightChild))
			list.add(rightChild);
		}
	}
	public static boolean itExist(ArrayList<String> tree, String child ) {
		for(int i = 0; i < tree.size(); i++) {
			if(tree.get(i).equals(child))
				return true;
		}
		return false;
	}
}
