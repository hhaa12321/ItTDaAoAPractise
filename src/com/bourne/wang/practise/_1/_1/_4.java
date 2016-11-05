package com.bourne.wang.practise._1._1;

import org.junit.Test;

public class _4 {

	public int rooting(int i) throws Exception {
		if(i > 1) {
			for (int j = 1; j <= i / 2; j++) {
				if(j * j > i) {
					return j - 1;
				}
			}
			throw new Exception("error input");
		} else if (i == 1) {
			return 1;
		} else {
			throw new Exception("error input");
		}
	}
	
	@Test
	public void test_rooting() throws Exception {
		_4 rooter = new _4();
		int result = rooter.rooting(101);
		assert result == 10;
	}
	
}

