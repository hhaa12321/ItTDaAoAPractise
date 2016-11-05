package com.bourne.wang.practise._1._1._11;

import org.junit.Test;

public class a {
	
	public int x = 0;
	public int y = 0;

	public int gcd(int a, int b) throws Exception {
		if (b == 0) {
			x = 1;
			y = 0;
			return a;
		}
		int d = gcd(b, a % b);
		int temp = x;
		x = y;
		y = temp - (a / b) * y;
		return d;
	}



}
