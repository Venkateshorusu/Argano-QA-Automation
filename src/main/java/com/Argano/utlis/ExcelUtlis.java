package com.Argano.utlis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Argano.constants.FrameworkConstants;
import com.Argano.exception.InvalidFilePathException;

public final class ExcelUtlis {

	private ExcelUtlis()
	{
		
	}
	
	public static  List<Map<String, String>> getTestDetails(String sheetname) 
	{

		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		try (FileInputStream fs = new FileInputStream(FrameworkConstants.getExcelpath())){

				XSSFWorkbook workbook = new XSSFWorkbook(fs);
			
			XSSFSheet sheet = workbook.getSheet(sheetname);
			//System.out.println(sheet.getSheetName());
			
			Map<String, String> map = null;
			
			int lastrownum = sheet.getLastRowNum();
			int lastcolnum = sheet.getRow(0).getLastCellNum();
			
			for(int i=1;i<=lastrownum;i++)
			{
				map = new HashMap<>();
				for(int j=0;j<lastcolnum;j++)
				{
					
					String key= sheet.getRow(0).getCell(j).getStringCellValue();
//					System.out.println("Sheet Value : " +key);
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
//				System.out.println("Sheet Value : " +value);
					map.put(key, value);
				}
				list.add(map);
		}}
		
		catch (FileNotFoundException e) {
			throw new InvalidFilePathException("Excel file is not found");
		} catch (IOException e) {
			throw new RuntimeException("Exception while reading data from excel");
		}
		return list;
	
}

}