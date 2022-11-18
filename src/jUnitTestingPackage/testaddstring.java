package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		jUnitTestingFunctions junitstring = new jUnitTestingFunctions();
		String result = junitstring.addstring("vanshika", "agrawal");
		assertEquals("vanshikaagrawal",result);
	}

}
