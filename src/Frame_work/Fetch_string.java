package Frame_work;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_string {
	public static void main(String[] args)throws Throwable  {
		//creat object of file input stram class
		FileInputStream fes=new FileInputStream("C:\\\\Users\\\\user\\\\Downloads\\\\july9.xlsx");
		// use creat method to call excel sheeet
		String value=WorkbookFactory.create(fes).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
