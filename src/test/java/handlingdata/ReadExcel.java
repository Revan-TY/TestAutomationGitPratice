package handlingdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static List<Map<String, String>> getData(String excelpath, String sheetName) throws IOException {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet(sheetName);
		XSSFRow header = sheet.getRow(0);

		for (int r = 1; r <= sheet.getLastRowNum(); r++) {
			Map<String, String> rowMap = new HashMap<String, String>();

			XSSFRow row = sheet.getRow(r);

			for (int c = 0; c < row.getLastCellNum(); c++) {
				String key = header.getCell(c).getStringCellValue();
				String value = row.getCell(c).getStringCellValue();
				rowMap.put(key, value);
			}

			data.add(rowMap);
			book.close();
			fis.close();
		}

		return data;
	}
}
