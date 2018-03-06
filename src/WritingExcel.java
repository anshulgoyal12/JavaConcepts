import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		HSSFSheet sheet0 = workbook.createSheet("Firstsheet");
		HSSFSheet sheet1 = workbook.createSheet("Secondsheet");
		
		/*HSSFRow row0 = sheet0.createRow(1);
		
		HSSFCell cellA = row0.createCell(0);
		HSSFCell cellB = row0.createCell(1);
		
		cellA.setCellValue("First Cell");
		cellB.setCellValue("Second Cell");*/
		
		for(int rows=0; rows<10; rows++){
			
			Row row = sheet0.createRow(rows);
			
			for(int cols=0; cols<10;cols++){
				
				Cell cell = row.createCell(cols);
				
				cell.setCellValue((int)(Math.random()*100));
			}
			
			
		}
		
		File f = new File("C:\\Users\\indianic\\Desktop\\WriteFiles\\myExcelFile.xls");
		FileOutputStream fo = new FileOutputStream(f);
		workbook.write(fo);
		
		fo.close();
		
		System.out.println("File Created..!!!!!");
	}

}
