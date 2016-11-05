package com.bourne.wang.practise._1._2;

import org.junit.Test;

public class _4 {

	public double[] ax2bxc0(double a, double b, double c) throws Exception {
		if (a == 0d) {
			if (b == 0d) {
				throw new Exception("no result");
			}
			return new double[] { -c / b };
		}
		double l = b / (2 * a);
		double a2 = -c / a + l * l;
		if (a2 < 0) {
			throw new Exception("no result");
		}
		double sqrt = Math.sqrt(a2);
		double d = -b / (2 * a);
		double x1 = d + sqrt;
		double x2 = d - sqrt;
		return new double[] { x1, x2 };
	}

	@Test
	public void test_ax2bxc0() throws Exception {
		double a = 2;
		double b = 48;
		double c = 2;
		_4 obj = new _4();
		double[] ds = obj.ax2bxc0(a, b, c);
		System.out.println(ds[0] * ds[0] * a + ds[0] * b + c);
		System.out.println(ds[1] * ds[1] * a + ds[1] * b + c);
		for (double d : ds) {
			System.out.println(d + " ");
		}
	}
}
