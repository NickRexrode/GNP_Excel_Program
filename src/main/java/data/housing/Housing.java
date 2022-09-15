package data.housing;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class Housing {

    private Integer housingUnits_2010;
    private Integer housingUnits_2021;
    private Integer housingUnits_2026;
    private Double housingUnits_PercentChange_2010_2021;
    private Double housingUnits_PercentChange_2021_2026;

    public Housing(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Housing");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Housing Units":
                    housingUnits_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingUnits_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    housingUnits_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    break;
                case "Percent Change":
                    housingUnits_PercentChange_2010_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    housingUnits_PercentChange_2021_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "D");
                    break;
            }

        }
    }


    @Override
    public String toString() {
        return "Housing{" +
                "housingUnits_2010=" + housingUnits_2010 +
                "\n housingUnits_2021=" + housingUnits_2021 +
                "\n housingUnits_2026=" + housingUnits_2026 +
                "\n housingUnits_PercentChange_2010_2021=" + housingUnits_PercentChange_2010_2021 +
                "\n housingUnits_PercentChange_2021_2026=" + housingUnits_PercentChange_2021_2026 +
                '}';
    }
}
