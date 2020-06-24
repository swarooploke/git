package ap_progrms;


import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class apa2
{
public static void main(String[] args) throws Throwable

{
	FileInputStream f1 = new FileInputStream("./excel/data.xlsx");
	Workbook book = WorkbookFactory.create(f1);
	String d = book.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(d);
}
}