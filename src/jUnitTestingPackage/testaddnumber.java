package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumber {

	@Test
	public void test() {
		jUnitTestingFunctions junit = new jUnitTestingFunctions();
		int result = junit.addnumbers(100, 200);
		assertEquals(300,result);
	}

}
