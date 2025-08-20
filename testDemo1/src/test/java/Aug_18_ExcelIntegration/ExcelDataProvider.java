package Aug_18_ExcelIntegration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	@DataProvider()
	public String[][] getData() throws IOException {
		File s = new File("E:\\WiproElite\\Testing\\Tasks\\DataProvider.xlsx");
		System.out.println(s.exists());
		FileInputStream fis = new FileInputStream(s);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[noOfRows-1][noOfColumns];
		System.out.println("Iterating the data from excel:");
		for (int i = 1; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                DataFormatter df = new DataFormatter();
                data[i-1][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
                System.out.println("Data[" + (i-1) + "][" + j + "] = " + data[i-1][j]);
            }
        }
		System.out.println("-------------------------------------");
		
		workbook.close();
		fis.close();
		return data;		
		
	}
	
}
