package org.sampleTestRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderClass {
		//				SECOND WAY ::
	File file;
	FileInputStream inputStream;
	Workbook wb;
	Sheet sheet;
	Row row;
	Cell cell;
	DataFormatter format;
	String[][] stringArray;
	int i,j;
	
	public String[][] getEntireData(String filePath,String sheetName) {
		try {
		file = new File(filePath);
		inputStream = new FileInputStream(file);
		wb = new XSSFWorkbook(inputStream);
		sheet = wb.getSheet(sheetName);
		}catch(FileNotFoundException e) {
			System.out.println("This is File Path problem");
		}catch(IOException e) {
			System.out.println("This is throw the IOException");
		}
		int rowSize = sheet.getPhysicalNumberOfRows();
		int columnSize = sheet.getRow(i).getPhysicalNumberOfCells();
		stringArray = new String[rowSize][columnSize];
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<columnSize; j++) {
				row = sheet.getRow(i);
				cell = row.getCell(j);
				format = new DataFormatter();
				stringArray[i][j] = format.formatCellValue(cell);
			}
		}
		return stringArray;
	}
}












