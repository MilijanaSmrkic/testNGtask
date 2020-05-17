package testNGzadatak;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {

	public Calculator calculator = new Calculator();
	SoftAssert sa = new SoftAssert();

	@Test(priority = 0)
	public void getValueTest() {
		double actual = calculator.getValue();
		sa.assertEquals(actual, 0.0); // 0
		sa.assertAll();
	}

	@Test(priority = 1)
	public void setValueTest() {

		calculator.setValue(10.0); // 10
		sa.assertEquals(calculator.getValue(), 10.0);
		sa.assertAll();
	}

	@Test(priority = 2)
	public void addTest() {
		calculator.add(20.0); // 10+20=30
		sa.assertEquals(calculator.getValue(), 30.0);
		sa.assertAll();
	}

	@Test(priority = 3)
	public void divTest() {
		calculator.div(2.0); // 30/2.0=15.0
		sa.assertEquals(calculator.getValue(), 15.0);
		sa.assertAll();
	}

	// metoda div u klasi Claculator se ne izvrsava jer se deli sa 0
	// pa je zato rezultat
	// nepromenjen odnosno 15
	@Test(priority = 4)
	public void divTest2() {
		calculator.div(0);
		sa.assertEquals(calculator.getValue(), 15.0);
		sa.assertAll();
	}

}
