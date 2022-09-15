package data.housing;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class HousingTrendsByDwellingType {
    private Integer dwellingType_1UnitDetached_2021;
    private Integer dwellingType_2Units_2021;
    private Integer dwellingType_MobileHomeOrTrailer_2021;
    private Integer dwellingType_3to19Units_2021;
    private Integer dwellingType_1UnitAttached_2021;
    private Integer dwellingType_50orMoreUnits_2021;
    private Integer dwellingType_20to49Units_2021;
    private Double dwellingType_1UnitDetached_2021_Percent;
    private Double dwellingType_2Units_2021_Percent;
    private Double dwellingType_MobileHomeOrTrailer_2021_Percent;
    private Double dwellingType_3to19Units_2021_Percent;
    private Double dwellingType_1UnitAttached_2021_Percent;
    private Double dwellingType_50orMoreUnits_2021_Percent;
    private Double dwellingType_20to49Units_2021_Percent;

    public HousingTrendsByDwellingType(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Housing Trends: By Dwelling Type");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "1 Unit Detached":
                    dwellingType_1UnitDetached_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    dwellingType_1UnitDetached_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "2 Units":
                    dwellingType_2Units_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    dwellingType_2Units_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Mobile Home or Trailer":
                    dwellingType_MobileHomeOrTrailer_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    dwellingType_MobileHomeOrTrailer_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "3 to 19 Units":
                    dwellingType_3to19Units_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    dwellingType_3to19Units_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "1 Unit Attached":
                    dwellingType_1UnitAttached_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    dwellingType_1UnitAttached_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "50 or More Units":
                    dwellingType_50orMoreUnits_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    dwellingType_50orMoreUnits_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "20 to 49 Units":
                    dwellingType_20to49Units_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    dwellingType_20to49Units_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
            }

        }
    }

    @Override
    public String toString() {
        return "HousingTrendsByDwellingType{" +
                "dwellingType_1UnitDetached_2021=" + dwellingType_1UnitDetached_2021 +
                "\n dwellingType_2Units_2021=" + dwellingType_2Units_2021 +
                "\n dwellingType_MobileHomeOrTrailer_2021=" + dwellingType_MobileHomeOrTrailer_2021 +
                "\n dwellingType_3to19Units_2021=" + dwellingType_3to19Units_2021 +
                "\n dwellingType_1UnitAttached_2021=" + dwellingType_1UnitAttached_2021 +
                "\n dwellingType_50orMoreUnits_2021=" + dwellingType_50orMoreUnits_2021 +
                "\n dwellingType_20to49Units_2021=" + dwellingType_20to49Units_2021 +
                "\n dwellingType_1UnitDetached_2021_Percent=" + dwellingType_1UnitDetached_2021_Percent +
                "\n dwellingType_2Units_2021_Percent=" + dwellingType_2Units_2021_Percent +
                "\n dwellingType_MobileHomeOrTrailer_2021_Percent=" + dwellingType_MobileHomeOrTrailer_2021_Percent +
                "\n dwellingType_3to19Units_2021_Percent=" + dwellingType_3to19Units_2021_Percent +
                "\n dwellingType_1UnitAttached_2021_Percent=" + dwellingType_1UnitAttached_2021_Percent +
                "\n dwellingType_50orMoreUnits_2021_Percent=" + dwellingType_50orMoreUnits_2021_Percent +
                "\n dwellingType_20to49Units_2021_Percent=" + dwellingType_20to49Units_2021_Percent +
                '}';
    }
}
