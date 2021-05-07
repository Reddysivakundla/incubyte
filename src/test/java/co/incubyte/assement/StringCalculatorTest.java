package co.incubyte.assement;

import org.junit.Test;

import junit.framework.Assert;

public class StringCalculatorTest {
	
	@Test
	public void AddValid1() throws Exception {
		int v1 = StringCalculator.Add("");
		Assert.assertEquals(0, v1);
	}
	
	@Test
	public void AddValid2() throws Exception {
		int v1 = StringCalculator.Add("1");
		Assert.assertEquals(1, v1);
	}
	
	@Test
	public void AddValid3() throws Exception {
		int v1 = StringCalculator.Add("1,2,3");
		Assert.assertEquals(6, v1);
	}
	
	@Test
	public void AddValid4() throws Exception {
		int v1 = StringCalculator.Add("10001,2");
		Assert.assertEquals(2, v1);
	}
	
	@Test
	public void AddValid5() throws Exception {
		int v1 = StringCalculator.Add("1\n2,3");
		Assert.assertEquals(6, v1);
	}
	
	@Test(expected = Exception.class)
	public void AddInValid1() throws Exception {
		StringCalculator.Add("1,\n2,3");
	}
	
	@Test(expected = Exception.class)
	public void AddInValid2() throws Exception {
		StringCalculator.Add("1,-2,3");
	}
	
}
