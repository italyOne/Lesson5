package TestNG;

public class EmployeesPayment {

	int calculateSalary(int baseRate, int experienceRatio, int bonus) {
		int calculateSalary = baseRate + experienceRatio + bonus;
		return calculateSalary;
	}

	int avgAgeOfWorkers(int amountOfWorkers, int ageOfWorkers) {
		int avgAgeOfWorkers = ageOfWorkers / amountOfWorkers;
		return avgAgeOfWorkers;
	}

	int qaTesterRating(int amountOfWrittenTc, int amountOfExecutedTc, int amountOfIssues) {
		int qaTesterRating = (amountOfWrittenTc + amountOfExecutedTc) * amountOfIssues;
		return qaTesterRating;
	}

	int bonus(int amountOfRegularWeekHours, int actualAmountOfWeekHours) {
		int bonus = actualAmountOfWeekHours - amountOfRegularWeekHours;
		{
			return bonus;
		}
	} 

	int actualAmountOfWeekHours(int startWorkingTime, int endWorkingTime, int dateOfTheStartOfWeek,
			int dateOfTheEndOfWeek) {
		int workingDaysInWeek = dateOfTheEndOfWeek - dateOfTheStartOfWeek;
		int workingDayHours = endWorkingTime - startWorkingTime;
		int actualAmountOfWeekHours = workingDaysInWeek * workingDayHours;
		return actualAmountOfWeekHours;
	}
	int additionalFee(boolean smoker, int feeAmount, int workingDaysInWeek){
		int additionalFee = 0;
		if(smoker = true){
			additionalFee = feeAmount*workingDaysInWeek;
	}
		else {
			additionalFee = 0;}
			
		return additionalFee;
	}
}
