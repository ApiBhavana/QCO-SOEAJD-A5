package UtilityPac;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UtilityClass 
{
	/**
	 * 
	 * @param path pass the path of the properties file
	 * @param key pass the Url key from prop file
	 * @return String
	 * @throws IOException
	 */
	public String readDataFromPropFile(String path, String key) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	/**
	 * 
	 * @param path
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String readingDataFromExcelSingleValue(String path, String SheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		String dataCell = workBook.getSheet(SheetName).getRow(rowNum).getCell(cellNum).toString();
		return dataCell;
	}


}
