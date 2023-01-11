package DataDrivenTesting_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		   FileInputStream fis = new FileInputStream("./testData/Excelsheet1.xlsx/");
			Workbook workbook	= WorkbookFactory.create(fis);

			
			workbook.getSheet("Sheet1").getRow(0).createCell(3).setCellValue("Name");
			
			FileOutputStream fos = new FileOutputStream("./testData/Excelsheet1.xlsx/");
			workbook.write(fos);
	}
	

}
