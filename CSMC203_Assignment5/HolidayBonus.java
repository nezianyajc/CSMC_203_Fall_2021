
public class HolidayBonus {

	public static double[] calculateHolidayBonus(double[][] data, double 
			high, double low,  double other ) {
		
		double[] holidayBonuses = new double[data.length];
		
		for(int row = 0; row < data.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				if(data[row][column] > 0) {
					if(data[row][column] == TwoDimRaggedArrayUtility.getLowestInColumn(data, column))
					{
						holidayBonuses[row] += low;
					} else if(data[row][column] == TwoDimRaggedArrayUtility.getHighestInColumn(data, column))
					{
						holidayBonuses[row] += high;
					} else {
						holidayBonuses[row] += other;
					}
				}
			}
		}
			
		return holidayBonuses;
		
	}
	
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other)
	{
		double total = 0;
		double[] totalBonuses = calculateHolidayBonus(data, high,low, other);
		
		for(int i = 0; i < data.length; i++)
		{
			total += totalBonuses[i];
		}
		return total;
	}
}
