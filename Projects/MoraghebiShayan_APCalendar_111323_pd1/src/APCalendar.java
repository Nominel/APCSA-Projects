public class APCalendar {
	
	private static boolean isLeapYear(int year)
	{ 
		if(year%100==0){
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }
	
	public static int numberOfLeapYears(int year1, int year2)
	{ 
		int leaps = 0;
		for(int i = year1; i<=year2;i++){
			if(isLeapYear(i))
				leaps++;
		}
		return leaps;
	}
	
	private static int firstDayOfYear(int year)
	{
		int diff=year-1900,leaps=diff/4,nonleaps=diff-leaps,days=leaps*366+nonleaps*365+6;
        return (days+1)%7;
	}
	
	private static int dayOfYear(int month, int day, int year)
	{
		int totalDays = 0;
		totalDays+=day;
		if (month>1) {
			totalDays+=31;
		}
		if (month>2) {
			totalDays+=28;
			if (isLeapYear(year)||day>28)
				totalDays+=1;
		}
		if (month>3) {
			totalDays+=31;
		}
		if (month>4) {
			totalDays+=30;
		}
		if (month>5) {
			totalDays+=31;
		}
		if (month>6) {
			totalDays+=30;
		}
		if (month>7) {
			totalDays+=31;
		}
		if (month>8) {
			totalDays+=31;
		}
		if (month>9) {
			totalDays+=30;
		}
		if (month>10) {
			totalDays+=31;
		}
		if (month>11) {
			totalDays+=30;
		}
		return totalDays;
	}
	
	public static int dayOfWeek(int month, int day, int year)
	{ 
		return (firstDayOfYear(year)+dayOfYear(month, day, year))%7;
	}
}