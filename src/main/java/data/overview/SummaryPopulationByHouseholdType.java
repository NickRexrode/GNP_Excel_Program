package data.overview;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class SummaryPopulationByHouseholdType {
    private Integer populationInFamilyHousehold_2010;
    private Integer populationInFamilyHousehold_2021;
    private Integer populationInFamilyHousehold_2026;
    private Integer populationInNonFamilyHousehold_2010;
    private Integer populationInNonFamilyHousehold_2021;
    private Integer populationInNonFamilyHousehold_2026;
    private Integer populationInGroupQuarters_2010;
    private Integer populationInGroupQuarters_2021;
    private Integer populationInGroupQuarters_2026;
    private Double populationInFamilyHousehold_2010_Percent;
    private Double populationInFamilyHousehold_2021_Percent;
    private Double populationInFamilyHousehold_2026_Percent;
    private Double populationInNonFamilyHousehold_2010_Percent;
    private Double populationInNonFamilyHousehold_2021_Percent;
    private Double populationInNonFamilyHousehold_2026_Percent;
    private Double populationInGroupQuarters_2010_Percent;
    private Double populationInGroupQuarters_2021_Percent;
    private Double populationInGroupQuarters_2026_Percent;

    public SummaryPopulationByHouseholdType(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Summary: Population by Household Type");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Population in Family Households":
                    populationInFamilyHousehold_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    populationInFamilyHousehold_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    populationInFamilyHousehold_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    populationInFamilyHousehold_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    populationInFamilyHousehold_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    populationInFamilyHousehold_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Population in Non-Family Households":
                    populationInNonFamilyHousehold_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    populationInNonFamilyHousehold_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    populationInNonFamilyHousehold_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    populationInNonFamilyHousehold_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    populationInNonFamilyHousehold_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    populationInNonFamilyHousehold_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Population in Group Quarters":
                    populationInGroupQuarters_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    populationInGroupQuarters_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    populationInGroupQuarters_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    populationInGroupQuarters_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    populationInGroupQuarters_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    populationInGroupQuarters_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
            }

        }

    }


    @Override
    public String toString() {
        return "SummaryPopulationByHouseholdType{" +
                "populationInFamilyHousehold_2010=" + populationInFamilyHousehold_2010 +
                "\n populationInFamilyHousehold_2021=" + populationInFamilyHousehold_2021 +
                "\n populationInFamilyHousehold_2026=" + populationInFamilyHousehold_2026 +
                "\n populationInNonFamilyHousehold_2010=" + populationInNonFamilyHousehold_2010 +
                "\n populationInNonFamilyHousehold_2021=" + populationInNonFamilyHousehold_2021 +
                "\n populationInNonFamilyHousehold_2026=" + populationInNonFamilyHousehold_2026 +
                "\n populationInGroupQuarters_2010=" + populationInGroupQuarters_2010 +
                "\n populationInGroupQuarters_2021=" + populationInGroupQuarters_2021 +
                "\n populationInGroupQuarters_2026=" + populationInGroupQuarters_2026 +
                "\n populationInFamilyHousehold_2010_Percent=" + populationInFamilyHousehold_2010_Percent +
                "\n populationInFamilyHousehold_2021_Percent=" + populationInFamilyHousehold_2021_Percent +
                "\n populationInFamilyHousehold_2026_Percent=" + populationInFamilyHousehold_2026_Percent +
                "\n populationInNonFamilyHousehold_2010_Percent=" + populationInNonFamilyHousehold_2010_Percent +
                "\n populationInNonFamilyHousehold_2021_Percent=" + populationInNonFamilyHousehold_2021_Percent +
                "\n populationInNonFamilyHousehold_2026_Percent=" + populationInNonFamilyHousehold_2026_Percent +
                "\n populationInGroupQuarters_2010_Percent=" + populationInGroupQuarters_2010_Percent +
                "\n populationInGroupQuarters_2021_Percent=" + populationInGroupQuarters_2021_Percent +
                "\n populationInGroupQuarters_2026_Percent=" + populationInGroupQuarters_2026_Percent +
                '}';
    }
}
