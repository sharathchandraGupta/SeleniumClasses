package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws FileNotFoundException, IOException, InvalidFormatException {

		String FilePath = "D:\\Sharath\\Sharath_P\\MorningClass\\MyFirstProject\\TestData\\Book2.xlsx";
		FileInputStream fs = new FileInputStream(FilePath);
		
		XSSFWorkbook wb = new XSSFWorkbook(FilePath);
		XSSFSheet sh = wb.getSheetAt(0);

		int rc = sh.getLastRowNum();
		HashMap<String, Integer> st = new HashMap();
		String URLS;
		for (int i = 1; i <= rc; i++) {

			URLS = sh.getRow(i).getCell(0).getStringCellValue();

			try {
				if (st.containsKey(URLS)) {
					st.put(URLS, st.get(URLS) + 1);
				} else {
					st.put(URLS, 1);
				}

			} catch (Exception e) {

			}
		}

	
		int x;
		int z=1;
		int sr=1;
		
		
		
		for (String a : st.keySet()) {
			x = st.get(a);
			System.out.println(x);
			String act = null;
			for (int i = 0; i < x; i++) {
				boolean flag=false;
				String exp = sh.getRow(z).getCell(1).getStringCellValue();
				
				for (int j = 0; j < x; j++) {
					
					act = sh.getRow(sr + j).getCell(2).getStringCellValue();
					
//					System.out.println(exp + " : " + act);
					
					if(exp.equalsIgnoreCase(act)){
						System.out.println("PASS:  "+exp+":"+act);
						sh.getRow(z).getCell(0).setCellValue("PASS");
						flag = true;
						break;
					}										
					
				}
				if(!flag){
					
					System.out.println("Fail:  "+exp+":"+act);
					sh.getRow(z).getCell(0).setCellValue("FAIL");
				}
				z = z + 1;

			}
			sr=sr+x;
		}
/*	
		FileOutputStream fos = new FileOutputStream(FilePath);
		wb.write(fos);*/
	}	

}
