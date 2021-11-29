package org.instragram;

public class Interview {

	static int temp;
	private static int count(int a) {

		temp=a;
		int d=0;
		while (a>0) {
			int b =a/10;
			int c =a%10;
			a=b;
			d=c+(d*10);

		}
		return d;	

	}

	public static void main(String[] args) {

		int count = count(645513);
		System.out.println(count);
		System.out.println("DAN");



	}

}
