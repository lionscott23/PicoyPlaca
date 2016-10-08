package Test;

import org.junit.Assert;
import org.junit.Test;

import Controler.Abstract;

public class testAbstract {
	@Test
	public void validateDiaSemanalMonday() {
		String s = "10-10-2016";
		Assert.assertEquals(2, Abstract.getInstance().diaSemanal(s));
	}

	@Test
	public void validateDiaSemanalTuesday() {
		String s = "11-10-2016";
		Assert.assertEquals(3, Abstract.getInstance().diaSemanal(s));

	}

	@Test
	public void validateDiaSemanalWednesday() {
		String s = "12-10-2016";
		Assert.assertEquals(4, Abstract.getInstance().diaSemanal(s));

	}

	@Test
	public void validateDiaSemanalThursday() {
		String s = "13-10-2016";
		Assert.assertEquals(5, Abstract.getInstance().diaSemanal(s));

	}

	@Test
	public void validateDiaSemanalFriday() {
		String s = "14-10-2016";
		Assert.assertEquals(6, Abstract.getInstance().diaSemanal(s));

	}
	
	@Test
	public void validateNumberLincense(){
		String n="QWE-14";
		Assert.assertNotNull(Abstract.getInstance().lastNumber(n));
	}
	
	@Test
	public void validateHour(){
		String h="23:00";
		Assert.assertNotNull(Abstract.getInstance().hora(h));
	}
	
	@Test
	public void validateMinute(){
		String m="23:23";
		Assert.assertNotNull(Abstract.getInstance().minuto(m));
	}

}
