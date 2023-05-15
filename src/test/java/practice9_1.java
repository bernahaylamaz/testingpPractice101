import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class practice9_1 {
    @Test
    public void readExcel() throws IOException {
      String path ="/Users/haylamazb@moravian.edu/Desktop/project1/src/test/java/resources/Capitals.xlsx";
      FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 =workbook.getSheetAt(2);
        Row row1 =sheet1.getRow(2);
        Cell cell = row1.getCell(1);




    }
}
