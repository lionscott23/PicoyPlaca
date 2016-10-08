package Controler;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Abstract {

	public static Abstract _instance = null;

	public int diaSemanal(String date) {
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		String strFecha = date;
		java.util.Date fecha = null;
		try {
			fecha = formato.parse(strFecha);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(fecha);
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	public int lastNumber(String licenseNumber) {
		String last = licenseNumber.substring(licenseNumber.length() - 1);
		int digito = Integer.parseInt(last);
		return digito;
	}

	public int hora(String time) {
		SimpleDateFormat formato = new SimpleDateFormat("hh:mm");
		String strHora = time;
		java.util.Date hora = null;
		try {
			hora = formato.parse(strHora);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(hora);
		return cal.get(Calendar.HOUR);
	}

	public int minuto(String time) {
		SimpleDateFormat formato = new SimpleDateFormat("hh:mm");
		String strMinuto = time;
		java.util.Date minuto = null;
		try {
			minuto = formato.parse(strMinuto);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(minuto);
		return cal.get(Calendar.MINUTE);
	}

	public static Abstract getInstance() {
		if (_instance == null) {
			_instance = new Abstract();
		}
		return _instance;
	}
}
