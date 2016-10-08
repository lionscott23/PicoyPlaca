package Aplicacion;

import java.util.Scanner;

import Controler.Abstract;
import Controler.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String CarLicenseNumber;
		String CarDate;
		String CarTime;
		Scanner s = new Scanner(System.in);
		Car car = new Car();

		System.out.println("Placa Auto : XXXX-9999");
		// CarLicenseNumber = s.next();
		// car.setLinceseNumber(CarLicenseNumber);
		car.setLinceseNumber("LEO1");

		System.out.println("Fecha : dd-mm-AAAA");
		// CarDate = s.next();
		// car.setDate(CarDate);
		car.setDate("11-10-2016");

		System.out.println("Hora : HH:mm");
		// CarTime = s.next();
		// car.setTime(CarTime);
		car.setTime("09:30");

		/*
		 * System.out.println("Placa: "
		 * 
		 * + Abstract.getInstance().lastNumber(CarLicenseNumber)); System.out
		 * .println("Dia: " + Abstract.getInstance().diaSemanal(CarDate));
		 * System.out.println("Hora: " +
		 * Abstract.getInstance().hora(CarTime)+":"
		 * +Abstract.getInstance().minuto(CarTime));
		 */

		System.out.println("Estado: " + car.EstatePicoyPlaca());

	}

}
