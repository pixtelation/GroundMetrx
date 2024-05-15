package Generic_Library;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Excel {
    public static String fetchdata(int s,int r,int c) {

        HSSFWorkbook workbook = null;
        try {
            File filepath = new File("./resources/excel/Testdata1.xls");
            FileInputStream stream = new FileInputStream(filepath);
            workbook = new HSSFWorkbook(stream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        HSSFSheet sheet = workbook.getSheetAt(s);
        String data = sheet.getRow(r).getCell(c).toString();
        return data;
    }
}
