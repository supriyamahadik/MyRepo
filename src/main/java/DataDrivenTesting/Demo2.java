package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Demo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\HP\\Desktop\\Nots\\Data Driven Framework\\Facebook Test Data (1).xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
		int m = sheet.getRow(0).getLastCellNum();                 //it will count total colums in sheet
		System.out.println(m);
		
		int a = sheet.getLastRowNum() + 1;                          //it will count the rows
		System.out.println(a);//20

		for (int i = 0; i < a; i++) 
		{
	
			for(int j=0;j<m;j++)         //for(int j=0;j<=6;j++)
			{
				String r = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(r + "   ");                                                                //i will print    row(0)column(0)    row(0)column(1)   row(0)column(2)  ...
			}                                                                                                                       //                         row(1)column(0)    row(1)column(1)   row(1)column(2)...
			
			System.out.println();
		}
		
		
/*		for(int i=0;i<a;i++)
		{
			String b = sheet.getRow(i).getCell(0).getStringCellValue();          //it will print 0 index column of all rows
			System.out.print(b);
			System.out.print("\t");                                                                            //then will give some space (tab)
			String c = sheet.getRow(i).getCell(1).getStringCellValue();         //it will print 1 index column of all rows     
			System.out.println(c);
		}
*/
/*		for(int i=0;i<10;i++)
		{
			String p = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(p);                                                                                   //username1 username2 username3 username4 ... username10
		}
*/
/*		for (int i = 0; i < a; i++) {
			String b = sheet.getRow(i).getCell(0).getStringCellValue();               //all row 1st column record
			String c = sheet.getRow(i).getCell(1).getStringCellValue();               //all row 2nd column record 
			String d = sheet.getRow(i).getCell(2).getStringCellValue();
			String e = sheet.getRow(i).getCell(3).getStringCellValue();
			String g = sheet.getRow(i).getCell(4).getStringCellValue();
			String h = sheet.getRow(i).getCell(5).getStringCellValue();
			String s = sheet.getRow(i).getCell(6).getStringCellValue();

			System.out.println(b + "   " + c + "   " + d + "  " + e + "   " + g + "  " + h + "   " + s);           //it will all captured record in well format
		}
*/		
	}

}
