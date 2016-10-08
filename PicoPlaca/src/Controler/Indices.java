package Controler;

public class Indices {
	int day;
	int number;
	private Car car;

	public Indices() {

	}

	public Indices(int day, int number) {
		this.day = Abstract.getInstance().diaSemanal(car.getDate());
		this.number = Abstract.getInstance().lastNumber(car.getLicenseNumber());
	}

	public int getIndiceDay() {
		return day;
	}

	public void setIndiceDay(int day) {
		this.day = day;
	}

	public int getIndiceNumber() {
		return number;
	}

	public void setIndiceNumber(int number) {
		this.number = number;
	}

}
