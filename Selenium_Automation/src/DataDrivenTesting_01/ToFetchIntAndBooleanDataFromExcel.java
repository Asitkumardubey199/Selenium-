package DataDrivenTesting_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchIntAndBooleanDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    FileInputStream fis = new FileInputStream("./testData/Excelsheet3.xlsx/");
		Workbook workbook	= WorkbookFactory.create(fis);
	    
	    Sheet Sheet = workbook.getSheet("Sheet1");
	    double intValue =Sheet.getRow(0).getCell(0).getNumericCellValue();
		boolean booleanValue = Sheet.getRow(0).getCell(1).getBooleanCellValue();
		
		System.out.println(intValue);
		System.out.println(booleanValue); 
		
	    
	     
	    

	}

}
