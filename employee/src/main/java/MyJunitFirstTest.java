import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.opensymphony.xwork2.interceptor.annotations.Before;

public class MyJunitFirstTest {
	
	
	@Before
    public void initTest() {
	EmployeesPayment junit = new EmployeesPayment();	
       }

	@After
    public void afterTest() {
        
    }
	
	@Test
	public void calculateSalary() {
		EmployeesPayment junit = new EmployeesPayment();
		int result = junit.calculateSalary(650, 365, 25);
		assertEquals(1040, result);
	}
	@Test
	public void additionalFee() {
		EmployeesPayment junit = new EmployeesPayment();
		int result = junit.additionalFee(false, 50, 5);
		assertEquals(250, result);
	}
	@Test
	public void actualAmountOfWeekHours() {
		EmployeesPayment junit = new EmployeesPayment();
		int result = junit.actualAmountOfWeekHours(10, 17, 0, 5);
		assertEquals(35, result);

}
	public void avgAgeOfWorkers() {
		EmployeesPayment junit = new EmployeesPayment();
		int result = junit.avgAgeOfWorkers(150, 5700);
		assertEquals(38, result);
	}
	@Test
	public void bonus() {
		EmployeesPayment junit = new EmployeesPayment();
		int result = junit.bonus(40, 45);
		assertEquals(5, result);
	}
	@Test
	public void qaTesterRating() {
		EmployeesPayment junit = new EmployeesPayment();
		int result = junit.qaTesterRating(1000, 520, 20);
		assertEquals(30400, result);
	}
}