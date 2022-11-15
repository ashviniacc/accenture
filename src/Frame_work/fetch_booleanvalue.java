package Frame_work;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_booleanvalue {
 public static void main(String[] args)throws Throwable {
	//creat object of file input stram class
		FileInputStream fes=new FileInputStream("C:\\\\Users\\\\user\\\\Downloads\\\\july9.xlsx");
		// use creat method to call excel sheeet
		Boolean value=WorkbookFactory.create(fes).getSheet("sheet1").getRow(1).getCell(0).getBooleanCellValue();
		System.out.println(value);
}



}


