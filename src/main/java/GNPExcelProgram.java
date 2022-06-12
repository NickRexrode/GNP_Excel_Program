import data.OverviewData;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GNPExcelProgram {


    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("Wisconsin_Conference_UMC_Report.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheetAt(0);

        OverviewData overviewData = OverviewData.from(sheet);

        System.out.println(overviewData.toString());
    }

}
