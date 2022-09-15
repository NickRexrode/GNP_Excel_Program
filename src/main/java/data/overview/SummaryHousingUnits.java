package data.overview;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class SummaryHousingUnits {
    private Integer summaryHousingUnits_2010;
    private Integer summaryHousingUnits_2021;
    private Integer summaryHousingUnits_2026;
    private Integer summaryHousingUnitsChange_2010_2021;
    private Integer summaryHousingUnitsChange_2021_2026;
    private Double summaryHousingUnitsChange_2010_2021_Percent;
    private Double summaryHousingUnitsChange_2021_2026_Percent;

    public SummaryHousingUnits(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Summary: Housing Units");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Housing Units":
                    summaryHousingUnits_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    summaryHousingUnits_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    summaryHousingUnits_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    break;
                case "Housing Units Change":
                    summaryHousingUnitsChange_2010_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    summaryHousingUnitsChange_2021_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    break;
                case "Percent Change":
                    summaryHousingUnitsChange_2010_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    summaryHousingUnitsChange_2021_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "D");
                    break;
            }

        }

    }

    @Override
    public String toString() {
        return "SummaryHousingUnits{" +
                "summaryHousingUnits_2010=" + summaryHousingUnits_2010 +
                "\n summaryHousingUnits_2021=" + summaryHousingUnits_2021 +
                "\n summaryHousingUnits_2026=" + summaryHousingUnits_2026 +
                "\n summaryHousingUnitsChange_2010_2021=" + summaryHousingUnitsChange_2010_2021 +
                "\n summaryHousingUnitsChange_2021_2026=" + summaryHousingUnitsChange_2021_2026 +
                "\n summaryHousingUnitsChange_2010_2021_Percent=" + summaryHousingUnitsChange_2010_2021_Percent +
                "\n summaryHousingUnitsChange_2021_2026_Percent=" + summaryHousingUnitsChange_2021_2026_Percent +
                '}';
    }
}
