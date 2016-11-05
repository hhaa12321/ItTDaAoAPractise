package com.bourne.wang.practise._1._1._6;

import org.junit.Test;

public class a {

	public int gcd(int a, int b) throws Exception {
		if(a < 0 || b < 0) {
			throw new Exception("error input");
		}
		if(a != 0 || b != 0) {
			return gcd(a, b % a);
		} else {
			return b;
		}
	}
	
	@Test
	public void test_gcd() throws Exception {
		a gcder = new a();
		System.out.println(gcder.gcd(31415,14142));
	}
}
