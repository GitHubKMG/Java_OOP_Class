package jejunu.oop.kmg.JUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticTest {
	@Test
	public void testAddOnePlusTwoEqualsThree() {
		Assert.assertEquals(add(1, 2), 3);
	}

	@Test
	public void testAddOnePlusThreeNotEqualsThree() throws Exception {
		Assert.assertTrue(add(1, 3) != 3);
	}

	public int add(final int x, final int y) {
		return x + y;
	}
}
