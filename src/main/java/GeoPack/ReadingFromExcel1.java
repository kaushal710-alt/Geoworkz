package GeoPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingFromExcel1  {
	
	public  ArrayList <String> getDataFromExcel (String TestCaseName ) throws IOException 
	{
		//File file = new File (System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\TestData.xlsx");
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\TestData2.xlsx");
		XSSFWorkbook excel = new XSSFWorkbook(fis);
		
		ArrayList <String> arrayList = new ArrayList <String>();
		int noOfSheets = excel.getNumberOfSheets();
		for (int i=0;i<noOfSheets;i++) 
		{
			if (excel.getSheetName(i).equalsIgnoreCase("TestDataSheet"))
					{
						XSSFSheet sheet = excel.getSheetAt(i);
						
						Iterator <Row> row = sheet.iterator();
						Row firstRow = row.next();
						Iterator<Cell> cell = firstRow.cellIterator();
						
						int counter=0;
						int col=0;
						
						while (cell.hasNext()) 
						{
							Cell cellValue = cell.next();
							
							if (cellValue.getStringCellValue().equals("TestCase")) 
							{
							col = counter;
							break;
							}
							counter++;
						}
						
						System.out.println(col);
					
		
						while (row.hasNext()) 
						{
							Row secondRow = row.next();
							
							if (secondRow.getCell(col).getStringCellValue().equalsIgnoreCase(TestCaseName))
							{
								
								Iterator<Cell> secondRowCell = secondRow.cellIterator();
								while (secondRowCell.hasNext()) 
								{
								
									Cell cellValue1 = secondRowCell.next();
									
									if (cellValue1.getCellTypeEnum()==CellType.STRING) 
									{
										arrayList.add(cellValue1.getStringCellValue());
									}
							
									else 
									{
										arrayList.add(NumberToTextConverter.toText(cellValue1.getNumericCellValue()));
							}
							}
							
						}
								
					}
						
					}
		}
		return arrayList;
	}
	
}