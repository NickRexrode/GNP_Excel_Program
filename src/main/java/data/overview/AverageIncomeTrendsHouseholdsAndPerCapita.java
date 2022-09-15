package data.overview;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class AverageIncomeTrendsHouseholdsAndPerCapita {
    Integer averageHouseholdIncome_2010;
    Integer averageHouseholdIncome_2021;
    Integer averageHouseholdIncome_2026;
    Integer perCapitaIncome_2010;
    Integer perCapitaIncome_2021;
    Integer perCapitaIncome_2026;
    Integer averageHouseholdIncome_2010_2021_Change;
    Integer averageHouseholdIncome_2021_2026_Change;
    Double averageHouseholdIncome_2010_2021_Change_Percent;
    Double averageHouseholdIncome_2021_2026_Change_Percent;
    Integer perCapitaIncome_2010_2021_Change;
    Integer perCapitaIncome_2021_2026_Change;
    Double perCapitaIncome_2010_2021_Change_Percent;
    Double perCapitaIncome_2021_2026_Change_Percent;
    public AverageIncomeTrendsHouseholdsAndPerCapita(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Average Income Trends: Households and Per Capita");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Average Household Income":
                    averageHouseholdIncome_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    averageHouseholdIncome_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    averageHouseholdIncome_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    break;
                case "Average Household Income Change":
                    averageHouseholdIncome_2010_2021_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    averageHouseholdIncome_2021_2026_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    averageHouseholdIncome_2010_2021_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "C");
                    averageHouseholdIncome_2021_2026_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "D");
                    break;
                case "Per Capita Income":
                    perCapitaIncome_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    perCapitaIncome_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    perCapitaIncome_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    break;
                case "Per Capita Income Change":
                    perCapitaIncome_2010_2021_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    perCapitaIncome_2021_2026_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    perCapitaIncome_2010_2021_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "C");
                    perCapitaIncome_2021_2026_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "D");
                    break;

            }

        }

    }


    @Override
    public String toString() {
        return "AverageIncomeTrendsHouseholdsAndPerCapita{" +
                "averageHouseholdIncome_2010=" + averageHouseholdIncome_2010 +
                "\n averageHouseholdIncome_2021=" + averageHouseholdIncome_2021 +
                "\n averageHouseholdIncome_2026=" + averageHouseholdIncome_2026 +
                "\n perCapitaIncome_2010=" + perCapitaIncome_2010 +
                "\n perCapitaIncome_2021=" + perCapitaIncome_2021 +
                "\n perCapitaIncome_2026=" + perCapitaIncome_2026 +
                "\n averageHouseholdIncome_2010_2021_Change=" + averageHouseholdIncome_2010_2021_Change +
                "\n averageHouseholdIncome_2021_2026_Change=" + averageHouseholdIncome_2021_2026_Change +
                "\n averageHouseholdIncome_2010_2021_Change_Percent=" + averageHouseholdIncome_2010_2021_Change_Percent +
                "\n averageHouseholdIncome_2021_2026_Change_Percent=" + averageHouseholdIncome_2021_2026_Change_Percent +
                "\n perCapitaIncome_2010_2021_Change=" + perCapitaIncome_2010_2021_Change +
                "\n perCapitaIncome_2021_2026_Change=" + perCapitaIncome_2021_2026_Change +
                "\n perCapitaIncome_2010_2021_Change_Percent=" + perCapitaIncome_2010_2021_Change_Percent +
                "\n perCapitaIncome_2021_2026_Change_Percent=" + perCapitaIncome_2021_2026_Change_Percent +
                '}';
    }
}
