
package ap_progrms;


import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class apa1 
{
public static void main(String[] args) throws Throwable

{
	FileInputStream f1 = new FileInputStream("./excel/data.xlsx");
	Workbook book = WorkbookFactory.create(f1);
	book.getSheet("sheet1").createRow(4).createCell(3).setCellValue("abhinav");
	FileOutputStream f2 = new FileOutputStream("./excel/data.xlsx");
	book.write(f2);
	}
}
