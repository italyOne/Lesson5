package TestNG;

import org.testng.annotations.Test;

public class EmployeesPaymentTest {
	EmployeesPayment emp = new EmployeesPayment();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@BeforeClass
	public static void setUp() throws Exception {
		
		System.out.println("Before");
	}

	@After 
	public void tearDown() throws Exception { 
		System.out.println("After");
	}

	@Test
	public void testCalculateSalary() {
		assertEquals(1040, emp.calculateSalary(650, 365, 25));
	}

	private void assertEquals(int i, int calculateSalary) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testAvgAgeOfWorkers() {
		assertEquals(38, emp.avgAgeOfWorkers(150, 5700));
	}

	@Test
	public void testQaTesterRating() {
		assertEquals(30400, emp.qaTesterRating(1000, 520, 20));
	}

	@Test
	public void testBonus() {
		assertEquals(5, emp.bonus(40, 45));
	}

	@Test
	public void testActualAmountOfWeekHours() {
		assertEquals(35, emp.actualAmountOfWeekHours(10, 17, 0, 5));
	}

	@Test
	public void testAdditionalFee() {
		assertEquals(250, emp.additionalFee(false, 50, 5));
	}
}
