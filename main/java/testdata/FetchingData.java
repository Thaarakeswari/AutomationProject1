package testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingData {

	public static String email;
	public static String password1;
	public static String name;
	public static String phnumber;
	public static String pass;
	public static WebDriver driver;
	

	public static void data() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\HARI\\eclipse-workspace\\MavenProjects\\test-output\\Book1.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		email = NumberToTextConverter.toText(w1.getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue());

		password1 = w1.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();

	}
	public static void newuserregistation() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\HARI\\eclipse-workspace\\MavenProjects\\test-output\\Book1.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		name = w1.getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue();
		phnumber = NumberToTextConverter.toText(w1.getSheet("Sheet3").getRow(1).getCell(1).getNumericCellValue());
		pass = w1.getSheet("Sheet3").getRow(1).getCell(2).getStringCellValue();
		

	}

	
}
