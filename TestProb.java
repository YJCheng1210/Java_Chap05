package Chap05;

import java.util.ArrayList;
import java.util.Random;

public class TestProb {
	public static void main(String arrg[]) {
		String alphabet = "abc";
		ArrayList<String> list = new ArrayList<String>();
		int n = alphabet.length();

		Random rand = new Random();
		
		int combination = 1;
		
		for (int i=1; i<= n; i++)
			combination *= i;
		
		while (list.size() < combination) {
	    	char a = alphabet.charAt(rand.nextInt(n));
	    	char b = alphabet.charAt(rand.nextInt(n));
	    	char c = alphabet.charAt(rand.nextInt(n));

	    	if (a != b && b != c && c != a) {
	    		String s = Character.toString(a) + Character.toString(b) + Character.toString(c); 
	    		if(list.indexOf(s) == -1)
	        		list.add(s);
	        }
	    }
	    System.out.println(list);
	}
}