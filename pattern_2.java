package com.codegnan.pattern;

public class pattern_2 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				//System.out.print((char) (97+j));
				//System.out.print((char)(106-j));
				//System.out.print((char)(97+i)+" ");
				System.out.print((char)(106-i)+" ");
			}
			System.out.println();
		}
	}
}