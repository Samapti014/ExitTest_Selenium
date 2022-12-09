package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class ReadData{
  
	
    @SuppressWarnings("deprecation")
	@DataProvider(name = "getData")
	public Object[][] getData(Method m) throws EncryptedDocumentException, IOException, InterruptedException {
    	String excelSheetName = m.getName();
		File f = new File(System.getProperty("user.dir")+"\\Resources\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(excelSheetName);
        
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfCols = row.getLastCellNum();
        Cell cell;
       Object[][] data = new Object[noOfRows - 1][noOfCols];
        
        for (int i = 1; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                
                if(cell == null)
                	data[i - 1][j] = " ";
                else {
                switch(cell.getCellType()) {
                case STRING : 
                	data[i - 1][j] = cell.getStringCellValue();
                	break;
                case NUMERIC:
                	cell.setCellType(CellType.STRING);
                    data[i - 1][j] = cell.getStringCellValue();
                    break;
				default:
					break;
					
                }
                }
                
            }
        }
        
        workbook.close();
   
    
    
    return data;
	}

}
