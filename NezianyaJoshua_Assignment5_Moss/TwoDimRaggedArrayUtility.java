import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	public static double[][] readFile(File file) throws java.io.FileNotFoundException {

		int rows = 0;
		Scanner fileRead = new Scanner(file);

		String[][] strArr = new String[20][];
		while (fileRead.hasNext()) {

			String[] line = fileRead.nextLine().trim().split(" ");

			strArr[rows] = new String[line.length];

			for (int i = 0; i < line.length; i++)
			{
				strArr[rows][i] = line[i];
			}
			rows++;

		}


		double[][] doubleList = new double[rows][];

		for (int i = 0; i < doubleList.length; i++) {
			if (strArr[i] != null) {
				int size = strArr[i].length;
				doubleList[i] = new double[size];
				for (int j = 0; j < strArr[i].length; j++) {
					doubleList[i][j] = Double.parseDouble(strArr[i][j]);
				}
			}
		}
		fileRead.close();
		return doubleList;
	}
	
	
	

	public static void writeToFile(double[][]data, File file) throws java.io.FileNotFoundException {
		PrintWriter writeToFile = new PrintWriter(file);
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				writeToFile.print(data[i][j] + " ");
				}
				writeToFile.println();
			}
		writeToFile.close();
	}
	
	public static double getTotal(double[][]data) {
		double total = 0; 
		
		for(int row =0; row < data.length; row++) {
			for(int column = 0; column < data[row].length; column++) {
				total += data[row][column];
			}
			
		}
		return total;
	}
	
	public static double getAverage(double[][]data) {
		double total = 0;
		int elements = 0;
		double average = elements/total ;

		for(int row =0; row < data.length; row++, elements++) {
			for(int column = 0; column < data[row].length; column++) {
				total += data[row][column];
			}
			
		}
		return average;
	}
	
	public static double getRowTotal(double[][]data, int row) {
		double rTotal = 0;
		
		for(int i = 0; i < data[row].length; i++) {
			rTotal += data[row][i];
		}
		return rTotal;
	
	}
	
	public static double getColumnTotal(double[][]data, int column) {
		double cTotal = 0;
		
		for(int i = 0; i < data.length; i++) {
			cTotal += data[i][column];
		}
		return cTotal;
	
	}
	
	public static double getHighestInRow(double[][]data, int row) {
		int column = 0;
		
		double highRow = data[row][column];
		
		for( column = 1; column < data[row].length; column++) {
			if(row < data[column].length) {
				if(highRow < data[row][column]) {
					highRow = data[row][column];
				}
			}
		}
		return highRow;
	
	}
	
	public static double getLowestInRow(double[][]data, int row) {
		int column = 0;
		
		double lowRow = data[row][column];
		
		for( column = 1; column < data[row].length; column++) {
			if(row < data[column].length) {
				if(lowRow > data[row][column]) {
					lowRow = data[row][column];
				}
			}
		}
		return lowRow;
	
	}
	
	public static double getHighestInRowIndex(double[][]data, int row) {
		int highRowIndex = 0;
		
		double highRow = data[row][0];
		
		for(int i = 1; i < data[row].length; i++) {
			if(data[row][i] > highRow ) {
				highRow = data[row][i];
				highRowIndex = i;
			}
		}
		return highRowIndex;
	
	}
	
	public static double getLowestInRowIndex(double[][]data, int row) {
		int lowRowIndex = 0;
		
		double lowRow = data[row][0];
		
		for(int i = 1; i < data[row].length; i++) {
			if(data[row][i] < lowRow ) {
				lowRow = data[row][i];
				lowRowIndex = i;
			}
		}
		return lowRowIndex;
	
	}
	
	public static double getHighestInColumn(double[][]data, int col) {
		
		double highCol = Double.MAX_VALUE;
		
		for( int i = 0; i < data.length; i++) {
			if(col < data[i].length) {
				if(highCol < data[i][col]) {
					highCol = data[i][col];
				}
			}
		}
		return highCol;
	
	}
	
	public static double getLowestInColumn(double[][]data, int col) {
		
		double lowCol = Double.MAX_VALUE;
		
		for( int i = 0; i < data.length; i++) {
			if(col < data[i].length) {
				if(lowCol > data[i][col]) {
					lowCol = data[i][col];
				}
			}
		}
		return lowCol;
	
	}
	
	public static double getLowestInColumnIndex(double[][]data, int col) {
		int lowColIndex = 0;
		
		double lowCol = Double.MAX_VALUE;
		
		for(int i = 0; i < data.length; i++) {
			if(col < data[i].length ) {
				if(lowCol > data[i][col]) {
				lowCol = data[i][col];
				lowColIndex = i;
				}
			}
		}
		return lowColIndex;
	
	}
	
	public static double getHighestInColumnIndex(double[][]data, int col) {
		int highColIndex = 0;
		
		double highCol = Double.MIN_VALUE;
		
		for(int i = 0; i < data.length; i++) {
			if(col < data[i].length ) {
				if(highCol > data[i][col]) {

				highCol = data[i][col];
				highColIndex = i;
				}
			}
		}
		return highColIndex;
	
	}
	
	public static double getHighestInArray(double[][]data) {
		double highEle = data[0][0];
		
		for(int row = 1; row < data.length; row++ ) {
			for (int col = 0; col < data[row].length; col++) {
				if(highEle < data[row][col]) {
					highEle = data[row][col];
				}
			}
		}
		return highEle;
		
	}
	
	public static double getLowestInArray(double[][]data) {
		double lowEle = data[0][0];
		
		for(int row = 1; row < data.length; row++ ) {
			for (int col = 0; col < data[row].length; col++) {
				if(lowEle > data[row][col]) {
					lowEle = data[row][col];
				}
			}
		}
		return lowEle;
		
	}

	
	
}


