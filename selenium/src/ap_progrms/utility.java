package ap_progrms;


import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class utility
{
public static String getdata(String shno,int r,int c)throws Throwable

{
	FileInputStream f1 = new FileInputStream("./excel/data.xlsx");
	Workbook book = WorkbookFactory.create(f1);
	String d =book.getSheet(shno).getRow(r).getCell(c).getStringCellValue();
			
	return d;
}
}