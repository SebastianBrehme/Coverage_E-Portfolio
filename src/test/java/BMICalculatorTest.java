package test.java;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import main.java.BMICalculator;

public class BMICalculatorTest {
	
	static BMICalculator c;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		c = new BMICalculator();
	}

	@Test
	public void testCalculation() 
	{
		assertEquals(18.52, c.calculate(60.0, 1.8), 0.01);
	}
	
	@Test
	public void testResultInvalid()
	{
		assertEquals("Invalid Values", c.getResult("women", 40, 1.5));
	}
	
	@Test
	public void testResultMan()
	{
		assertEquals("BMI: 18,52; Untergewicht", c.getResult("maennlich", 60, 1.8));
	}
	
	@Test
	public void testResultWrongNumbers()
	{
		assertEquals("Please enter height between 0.3 and 2.6 m and a weight between 2 and 300 kg", c.getResult("weiblich", 0, 1.5));	
	}
	
	@Test
	public void testResultWomen()
	{
		assertEquals("BMI: 35,56; Adipositas", c.getResult("weiblich", 80, 1.5));
	}

}
