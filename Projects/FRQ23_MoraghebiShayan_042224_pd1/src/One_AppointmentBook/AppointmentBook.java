package One_AppointmentBook;

import java.util.Arrays;

public class AppointmentBook
{
	boolean[][] minutes;

	public AppointmentBook()
	{
		minutes = new boolean[8][60];
		for (int i = 0; i < minutes.length; i++) {
			for (int j = 0; j < minutes[0].length; j++) {
				minutes[i][j] = true;
			}
		}
	}

	private boolean isMinuteFree( int period, int minute )
	{
		return minutes[period-1][minute];
	}
	
	private void reserveBlock( int period, int startMinute, int duration )
	{
		for (int i = 0; i < duration; i++) {
			minutes[period-1][startMinute+i] = false;
		}
	}
	
	public int findFreeBlock( int period, int duration )
	{
		int startMinute = -1;
		int consecutiveFreeMinutes = 0;

		for (int minute = 0; minute < minutes[0].length; minute++) {
			if (isMinuteFree(period, minute)) {
				if (startMinute == -1) {
					startMinute = minute;
				}
				consecutiveFreeMinutes++;
				if (consecutiveFreeMinutes == duration) {
					return startMinute;
				}
			} else {
				startMinute = -1;
				consecutiveFreeMinutes = 0;
			}
		}

		return -1;
	}
	
	public boolean makeAppointment( int startPeriod, int endPeriod, int duration )
	{
		for (int period = startPeriod; period <= endPeriod; period++) {
			if(findFreeBlock(period, duration) != -1) {
				reserveBlock(period,findFreeBlock(period, duration),duration);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "AppointmentBook{" +
			"minutes=" + Arrays.deepToString(minutes) +
			'}';
	}
}
