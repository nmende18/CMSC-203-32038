
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;


public class TwoDimRaggedArrayUtility extends Object {
	
	
	
	public TwoDimRaggedArrayUtility() {}
	public static final int MAX_ROW = 10;
	public static final int MAX_COLUMN = 10;

	
	public static double[][] readFile(File file)throws FileNotFoundException{
		
String[][] tempArray = new String[MAX_ROW][MAX_COLUMN];
		
		Scanner scanner = new Scanner(file);
		int rowSum = 0;
		for(; scanner.hasNextLine() && rowSum < MAX_ROW; rowSum++) {
			String[] vals = scanner.nextLine().split(" ");
			tempArray[rowSum] = vals;
		}
		
		int rowNum = rowSum;
		if(rowNum == 0) {
			return null;
		}
		
		double[][] arr = new double[rowNum][];
		
		int colNum = 0;
		for(int i = 0; i < rowNum; i++) {
			for(colNum = 0; colNum < tempArray[i].length &&
					tempArray[i][colNum] != null; colNum++) {
				
			}
			arr[i] = new double[colNum];
			for(int j = 0; j < colNum; j++) {
				arr[i][j] = Double.valueOf(tempArray[i][j]).doubleValue();
			}
		}
		return arr;
	
	
		
		
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException{
		
		try(PrintWriter writer = new PrintWriter(outputFile)){
			for(int i = 0; i < data.length; i++) {
				for(int j = 0; j < data[i].length; j++) {
					writer.print(data[i][j] + " ");
				}
				writer.println();
			}
			writer.close();
		}
		
		
		
	}
	public static double getTotal(double[][] data) {
		double sum = 0;
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
			sum += data[row][col];
			}
		}
		return sum;
	}
	public static double getAverage(double[][] data) {
		
		double sum = 0;
		double count = 0;
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
			sum += data[row][col];
			count++;
			}
		}
			double total = 0;
			total = sum / count;
			return total;
	}
			
		
	public static double getRowTotal(double[][] data, int row) {
		
		double total = 0.0;
		if(row >= 0 && row < data.length) {
			for(int col = 0; col < data[row].length; col++) {
				total += data[row][col];
			}
		}
		return total;
		
	}
	public static double getColumnTotal(double[][] data, int col) {
		
		double total = 0.0;
		for(int row = 0; row < data.length; row++) {
			if(col >= 0 && col < data[row].length) {
				total += data[row][col];
			}
		}
		return total;
		
	}
	public static double getHighestInRow(double[][] data, int row) {
		
		double element = data[row][0];
		for(int col = 1; col < data[row].length; col++) {
			if(data[row][col] > element){
				element = data[row][col];
			}
		}
		return element;
		
		
	}
	public static int getHighestInRowIndex(double[][] data, int row) {
		
		double element = data[row][0];
		
		int index = 0;
		for(int col = 1; col < data[row].length; col++) {
			if(data[row][col] > element){
				element = data[row][col];
				index = col;
			}
		}
		return index;
		
	}
	public static double getLowestInRow(double[][] data, int row) {
		
		double element = data[row][0];
		for(int col = 1; col < data[row].length; col++) {
			if(data[row][col] < element){
				element = data[row][col];
			}
		}
		return element;
		
	}
	public static int getLowestInRowIndex(double[][] data, int row) {
		
		double element = data[row][0];
		
		int index = 0;
		for(int col = 1; col < data[row].length; col++) {
			if(data[row][col] < element){
				element = data[row][col];
				index = col;
			}
		}
		return index;
		
		
	}
	public static double getHighestInColumn(double[][] data, int col) {
		
		double element = data[0][col];
		for(int row = 1; row < data.length; row++) {
			if(data[row][col] > element){
				element = data[row][col];
			}
		}
		return element;
		
	}
	public static double getHighestInColumnIndex(double[][] data, int col) {
		
		double element = data[0][col];
		
		int index = 0;
		for(int row = 1; row < data.length; row++) {
			if(data[row][col] > element){
				element = data[row][col];
				index = row;
			}
		}
		return index;
		
	}
	public static double getLowestInColumn(double[][] data, int col) {
		
		double element = data[0][col];
		for(int row = 1; row < data.length; row++) {
			if(data[row][col] < element){
				element = data[row][col];
			}
		}
		return element;
		
	}
	public static int getLowestInColumnIndex(double[][] data, int col) {
		
		double element = data[0][col];
		
		int index = 0;
		for(int row = 1; row < data.length; row++) {
			if(col >= 0 && col < data[row].length) {
			if(data[row][col] < element){
				element = data[row][col];
				index = row;
			}
			
			}
		}
		return index;

		
	}
	public static double getHighestInArray(double[][] data) {
		
		double max = data[0][0];
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				if(data[row][col] > max) {
					max = data[row][col];
				}
			}
		}
		return max;
		
		
	}
	public static double getLowestInArray(double[][] data) {
		
		double min = data[0][0];
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				if(data[row][col] < min) {
					min = data[row][col];
				}
			}
		}
		return min;
		
	}
	
	
	
			

	
}
