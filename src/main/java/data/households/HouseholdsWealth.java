package data.households;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class HouseholdsWealth {

    private Integer householdWealth_2021_100_000_To_249_999;
    private Integer householdWealth_2021_0andUnder;
    private Integer householdWealth_2021_500_000OrMore;
    private Integer householdWealth_2021_250_000_To_499_999;
    private Integer householdWealth_2021_50_000_To_99_999;
    private Integer householdWealth_2021_1_To_4_999;
    private Integer householdWealth_2021_25_000_To_49_999;
    private Integer householdWealth_2021_10_000_To_24_999;
    private Integer householdWealth_2021_5_000_To_9_999;
    
    private Double householdWealthPercent_2021_100_000_To_249_999;
    private Double householdWealthPercent_2021_0andUnder;
    private Double householdWealthPercent_2021_500_000OrMore;
    private Double householdWealthPercent_2021_250_000_To_499_999;
    private Double householdWealthPercent_2021_50_000_To_99_999;
    private Double householdWealthPercent_2021_1_To_4_999;
    private Double householdWealthPercent_2021_25_000_To_49_999;
    private Double householdWealthPercent_2021_10_000_To_24_999;
    private Double householdWealthPercent_2021_5_000_To_9_999;

    public HouseholdsWealth(XSSFSheet sheet) {

        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Households: Wealth");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "$100,000 to $249,999":
                    householdWealth_2021_100_000_To_249_999 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdWealthPercent_2021_100_000_To_249_999 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$0 and Under":
                    householdWealth_2021_0andUnder = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdWealthPercent_2021_0andUnder = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$500,000 or more":
                    householdWealth_2021_500_000OrMore = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdWealthPercent_2021_500_000OrMore = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$250,000 to $499,999":
                    householdWealth_2021_250_000_To_499_999 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdWealthPercent_2021_250_000_To_499_999 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$50,000 to $99,999":
                    householdWealth_2021_50_000_To_99_999 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdWealthPercent_2021_50_000_To_99_999 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$1 to $4,999":
                    householdWealth_2021_1_To_4_999 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdWealthPercent_2021_1_To_4_999 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$25,000 to $49,999":
                    householdWealth_2021_25_000_To_49_999 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdWealthPercent_2021_25_000_To_49_999 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$10,000 to $24,999":
                    householdWealth_2021_10_000_To_24_999 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdWealthPercent_2021_10_000_To_24_999 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$5,000 to $9,999":
                    householdWealth_2021_5_000_To_9_999 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdWealthPercent_2021_5_000_To_9_999 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
            }

        }

    }


    @Override
    public String toString() {
        return "HouseholdsWealth{" +
                "householdWealth_2021_100_000_To_249_999=" + householdWealth_2021_100_000_To_249_999 +
                "\n householdWealth_2021_0andUnder=" + householdWealth_2021_0andUnder +
                "\n householdWealth_2021_500_000OrMore=" + householdWealth_2021_500_000OrMore +
                "\n householdWealth_2021_250_000_To_499_999=" + householdWealth_2021_250_000_To_499_999 +
                "\n householdWealth_2021_50_000_To_99_999=" + householdWealth_2021_50_000_To_99_999 +
                "\n householdWealth_2021_1_To_4_999=" + householdWealth_2021_1_To_4_999 +
                "\n householdWealth_2021_25_000_To_49_999=" + householdWealth_2021_25_000_To_49_999 +
                "\n householdWealth_2021_10_000_To_24_999=" + householdWealth_2021_10_000_To_24_999 +
                "\n householdWealth_2021_5_000_To_9_999=" + householdWealth_2021_5_000_To_9_999 +
                "\n householdWealthPercent_2021_100_000_To_249_999=" + householdWealthPercent_2021_100_000_To_249_999 +
                "\n householdWealthPercent_2021_0andUnder=" + householdWealthPercent_2021_0andUnder +
                "\n householdWealthPercent_2021_500_000OrMore=" + householdWealthPercent_2021_500_000OrMore +
                "\n householdWealthPercent_2021_250_000_To_499_999=" + householdWealthPercent_2021_250_000_To_499_999 +
                "\n householdWealthPercent_2021_50_000_To_99_999=" + householdWealthPercent_2021_50_000_To_99_999 +
                "\n householdWealthPercent_2021_1_To_4_999=" + householdWealthPercent_2021_1_To_4_999 +
                "\n householdWealthPercent_2021_25_000_To_49_999=" + householdWealthPercent_2021_25_000_To_49_999 +
                "\n householdWealthPercent_2021_10_000_To_24_999=" + householdWealthPercent_2021_10_000_To_24_999 +
                "\n householdWealthPercent_2021_5_000_To_9_999=" + householdWealthPercent_2021_5_000_To_9_999 +
                '}';
    }
}
