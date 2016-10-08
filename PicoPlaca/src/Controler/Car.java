package Controler;

public class Car {

	String licenseNumber;
	String date;
	String time;
	boolean Road = false;
	boolean inThe = false;
	String PicoyPlaca = null;

	public static final int formathours = 24;

	public static final int hour_morning = 7;
	public static final int minute_morning = 0;

	public static final int hour_morning_end = 9;
	public static final int minute_morning_end = 30;

	public static final int hour_evening = 16;
	public static final int minute_evening = 0;

	public static final int hour_evening_end = 19;
	public static final int minute_evening_end = 30;
	

	public Car() {
	}

	public Car(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Car(String licenseNumber, String date) {
		this.licenseNumber = licenseNumber;
		this.date = date;
	}

	public Car(String licenseNumber, String date, String time) {
		this.licenseNumber = licenseNumber;
		this.date = date;
		this.time = time;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLinceseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean inTheRoad() {

		switch (Abstract.getInstance().diaSemanal(date)) {
		case 2:
			if (Abstract.getInstance().lastNumber(licenseNumber) == 1
					|| Abstract.getInstance().lastNumber(licenseNumber) == 2) {
				Road = true;
			}
			break;

		case 3:
			if (Abstract.getInstance().lastNumber(licenseNumber) == 3
					|| Abstract.getInstance().lastNumber(licenseNumber) == 4) {
				Road = true;
			}
			break;
		case 4:
			if (Abstract.getInstance().lastNumber(licenseNumber) == 5
					|| Abstract.getInstance().lastNumber(licenseNumber) == 6) {
				Road = true;
			}
			break;
		case 5:
			if (Abstract.getInstance().lastNumber(licenseNumber) == 7
					|| Abstract.getInstance().lastNumber(licenseNumber) == 8) {
				Road = true;
			}
			break;
		case 6:
			if (Abstract.getInstance().lastNumber(licenseNumber) == 9
					|| Abstract.getInstance().lastNumber(licenseNumber) == 0) {
				Road = true;
			}
			break;

		default:
			break;
		}
		return Road;
	}

	public boolean inTheTime() {

		if (Abstract.getInstance().hora(time) >= hour_morning
				&& Abstract.getInstance().hora(time) <= hour_morning_end) {
			if (Abstract.getInstance().minuto(time) >= minute_morning
					&& Abstract.getInstance().minuto(time) <= minute_morning_end) {
				inThe = true;
			}
		}

		if (Abstract.getInstance().hora(time) >= hour_evening
				&& Abstract.getInstance().hora(time) <= hour_evening_end) {
			if (Abstract.getInstance().minuto(time) >= minute_evening
					&& Abstract.getInstance().minuto(time) <= minute_evening_end) {
				inThe = true;
			}
		}
		return inThe;
	}
	
	public String EstatePicoyPlaca(){
		if (inTheRoad()==true && inTheTime()==true) {
			PicoyPlaca="No puede estar en la via PICO y PLACA";
		}else{
			PicoyPlaca="Puede estar en la via";
		}
		return PicoyPlaca;
	}

}
