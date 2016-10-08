package Test;

import org.junit.Test;
import org.junit.Assert;

import Controler.Car;

public class testCarObject {

	@Test
	public void shouldCreateLicenseNumber() {
		// Given
		String licenseNumber = "ABXZ-123";
		// When
		Car car = new Car(licenseNumber);

		// Then
		Assert.assertTrue(car.getLicenseNumber().equals(licenseNumber));

	}

	@Test
	public void shouldCreateDate() {
		// Given
		String licenseNumber = "PCD-2542";
		String date = "12-12-2016";
		// When
		Car cardate = new Car(licenseNumber, date);
		// Then
		Assert.assertTrue(cardate.getDate().equals(date));
	}

	@Test
	public void shouldSetDate() {
		String date = "2013-12-04";

		Car car = new Car("XYZ-1252");
		car.setDate(date);

		Assert.assertTrue("Succesfull", car.getDate() == date);
	}

	@Test
	public void functionInTheRoad() {
		Car car = new Car("XYZ-1252", "10-10-2016", "09:20");
		Assert.assertTrue(car.inTheRoad());
	}

	@Test
	public void functionInTheTime() {
		Car car = new Car("XYZ-1252", "10-10-2016", "09:20");
		Assert.assertTrue(car.inTheTime());
	}

	@Test
	public void funtionPicoYPlaca(){
		Car car = new Car("XYZ-1252", "10-10-2016", "09:20");
		Assert.assertNotNull(car.EstatePicoyPlaca());
	}
}
