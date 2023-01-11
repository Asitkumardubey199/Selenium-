package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis =new FileInputStream("./testData/ClassInfo.xlsx");
		Workbook workbook =WorkbookFactory.create(fis);
		workbook.getSheet("class").getRow(1).createCell(4).setCellValue("value");
		
		FileOutputStream fos= new FileOutputStream("./testData/ClassInfo.xlsx");
		workbook.write(fos);
		System.out.println("data is modified");
		workbook.close();
		

		

	}

}
