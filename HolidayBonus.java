
public class HolidayBonus extends TwoDimRaggedArrayUtility {
	
	public HolidayBonus() {}
	
	public static double[] calculateHolidayBonus(double[][] data) {
		
		double[] holiday = new double[data.length];
		
		
		int high = 0, low = 0, bonus = 0;
		for(int i = 0; i < holiday.length; i++) {
				high = (int) TwoDimRaggedArrayUtility.getHighestInColumn(data, i);
				low = (int) TwoDimRaggedArrayUtility.getLowestInColumn(data, i);
				
				for(int j = 0; j < data[i].length; j++) {
					bonus += data[i][j];
				}
				
				holiday[i] = bonus + high + low;
				
			}
		return holiday;
		}
		
		
		
		
		
	
	public static double calculateTotalHolidayBonus(double[][] data) {
		double totalBonus = 0.0;
		
		for(double[] store: data) {
			for(double sales : store) {
				totalBonus += sales;
			}
		}
		return totalBonus;

	}
}

