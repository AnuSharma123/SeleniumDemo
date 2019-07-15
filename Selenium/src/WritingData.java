import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WritingData {
public static void main(String[] args) {
	try {
	FileInputStream fis = new FileInputStream("C:\\Users\\Anu\\Desktop\\WritingData.xlsx");
	Workbook w = WorkbookFactory.create(fis);
	Sheet sh = w.getSheet("Sheet1");
	Row row = sh.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue("Java");
	FileOutputStream fio = new FileOutputStream("C:\\Users\\Anu\\Desktop\\WritingData.xlsx");
	w.write(fio);
	fio.close();
	fis.close();
}
catch (Exception e){
	System.out.println(e);
}

}

}
