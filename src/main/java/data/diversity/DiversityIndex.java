package data.diversity;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class DiversityIndex {
    private Double diversityIndexScore_2021;
    private String diversityIndexScore_Description_2021;

    public DiversityIndex(XSSFSheet sheet) {

        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Diversity Index");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Score":
                    this.diversityIndexScore_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "B");
                    this.diversityIndexScore_Description_2021 = readCellRawFromSheetAsString(sheet, rows.get(i).getRowNum(), "C");
                    break;
            }

        }
    }

    @Override
    public String toString() {
        return "DiversityIndex{" +
                "diversityIndexScore_2021=" + diversityIndexScore_2021 +
                ", diversityIndexScore_Description_2021='" + diversityIndexScore_Description_2021 + '\'' +
                '}';
    }
}
