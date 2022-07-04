package data.households;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class HouseholdIncomeForecast {

    private Integer householdIncomeForecast_LessThan10_000_2010;
    private Integer householdIncomeForecast_10_000_To_14_999_2010;
    private Integer householdIncomeForecast_15_000_To_24_999_2010;
    private Integer householdIncomeForecast_25_000_To_34_999_2010;
    private Integer householdIncomeForecast_35_000_To_49_999_2010;
    private Integer householdIncomeForecast_50_000_To_74_999_2010;
    private Integer householdIncomeForecast_75_000_To_99_999_2010;
    private Integer householdIncomeForecast_100_000_To_149_999_2010;
    private Integer householdIncomeForecast_150_000_To_199_999_2010;
    private Integer householdIncomeForecast_200_000Plus_2010;

    private Integer householdIncomeForecast_LessThan10_000_2021;
    private Integer householdIncomeForecast_10_000_To_14_999_2021;
    private Integer householdIncomeForecast_15_000_To_24_999_2021;
    private Integer householdIncomeForecast_25_000_To_34_999_2021;
    private Integer householdIncomeForecast_35_000_To_49_999_2021;
    private Integer householdIncomeForecast_50_000_To_74_999_2021;
    private Integer householdIncomeForecast_75_000_To_99_999_2021;
    private Integer householdIncomeForecast_100_000_To_149_999_2021;
    private Integer householdIncomeForecast_150_000_To_199_999_2021;
    private Integer householdIncomeForecast_200_000Plus_2021;

    private Integer householdIncomeForecast_LessThan10_000_2026;
    private Integer householdIncomeForecast_10_000_To_14_999_2026;
    private Integer householdIncomeForecast_15_000_To_24_999_2026;
    private Integer householdIncomeForecast_25_000_To_34_999_2026;
    private Integer householdIncomeForecast_35_000_To_49_999_2026;
    private Integer householdIncomeForecast_50_000_To_74_999_2026;
    private Integer householdIncomeForecast_75_000_To_99_999_2026;
    private Integer householdIncomeForecast_100_000_To_149_999_2026;
    private Integer householdIncomeForecast_150_000_To_199_999_2026;
    private Integer householdIncomeForecast_200_000Plus_2026;

    private Double householdIncomeForecast_LessThan10_000_2010_Percent;
    private Double householdIncomeForecast_10_000_To_14_999_2010_Percent;
    private Double householdIncomeForecast_15_000_To_24_999_2010_Percent;
    private Double householdIncomeForecast_25_000_To_34_999_2010_Percent;
    private Double householdIncomeForecast_35_000_To_49_999_2010_Percent;
    private Double householdIncomeForecast_50_000_To_74_999_2010_Percent;
    private Double householdIncomeForecast_75_000_To_99_999_2010_Percent;
    private Double householdIncomeForecast_100_000_To_149_999_2010_Percent;
    private Double householdIncomeForecast_150_000_To_199_999_2010_Percent;
    private Double householdIncomeForecast_200_000Plus_2010_Percent;

    private Double householdIncomeForecast_LessThan10_000_2021_Percent;
    private Double householdIncomeForecast_10_000_To_14_999_2021_Percent;
    private Double householdIncomeForecast_15_000_To_24_999_2021_Percent;
    private Double householdIncomeForecast_25_000_To_34_999_2021_Percent;
    private Double householdIncomeForecast_35_000_To_49_999_2021_Percent;
    private Double householdIncomeForecast_50_000_To_74_999_2021_Percent;
    private Double householdIncomeForecast_75_000_To_99_999_2021_Percent;
    private Double householdIncomeForecast_100_000_To_149_999_2021_Percent;
    private Double householdIncomeForecast_150_000_To_199_999_2021_Percent;
    private Double householdIncomeForecast_200_000Plus_2021_Percent;

    private Double householdIncomeForecast_LessThan10_000_2026_Percent;
    private Double householdIncomeForecast_10_000_To_14_999_2026_Percent;
    private Double householdIncomeForecast_15_000_To_24_999_2026_Percent;
    private Double householdIncomeForecast_25_000_To_34_999_2026_Percent;
    private Double householdIncomeForecast_35_000_To_49_999_2026_Percent;
    private Double householdIncomeForecast_50_000_To_74_999_2026_Percent;
    private Double householdIncomeForecast_75_000_To_99_999_2026_Percent;
    private Double householdIncomeForecast_100_000_To_149_999_2026_Percent;
    private Double householdIncomeForecast_150_000_To_199_999_2026_Percent;
    private Double householdIncomeForecast_200_000Plus_2026_Percent;

    public HouseholdIncomeForecast(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Household Income Forecast");



        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch(rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Less than $10,000":
                    householdIncomeForecast_LessThan10_000_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_LessThan10_000_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_LessThan10_000_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_LessThan10_000_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_LessThan10_000_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_LessThan10_000_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "$10,000 to $14,999":
                    householdIncomeForecast_10_000_To_14_999_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_10_000_To_14_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_10_000_To_14_999_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_10_000_To_14_999_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_10_000_To_14_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_10_000_To_14_999_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "$15,000 to $24,999":
                    householdIncomeForecast_15_000_To_24_999_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_15_000_To_24_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_15_000_To_24_999_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_15_000_To_24_999_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_15_000_To_24_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_15_000_To_24_999_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "$25,000 to $34,999":

                    householdIncomeForecast_25_000_To_34_999_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_25_000_To_34_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_25_000_To_34_999_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_25_000_To_34_999_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_25_000_To_34_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_25_000_To_34_999_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "$35,000 to $49,999":
                    householdIncomeForecast_35_000_To_49_999_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_35_000_To_49_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_35_000_To_49_999_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_35_000_To_49_999_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_35_000_To_49_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_35_000_To_49_999_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "$50,000 to $74,999":

                    householdIncomeForecast_50_000_To_74_999_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_50_000_To_74_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_50_000_To_74_999_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_50_000_To_74_999_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_50_000_To_74_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_50_000_To_74_999_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "$75,000 to $99,999":
                    householdIncomeForecast_75_000_To_99_999_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_75_000_To_99_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_75_000_To_99_999_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_75_000_To_99_999_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_75_000_To_99_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_75_000_To_99_999_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "$100,000 to $149,999":
                    householdIncomeForecast_100_000_To_149_999_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_100_000_To_149_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_100_000_To_149_999_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_100_000_To_149_999_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_100_000_To_149_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_100_000_To_149_999_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "$150,000 to $199,999":

                    householdIncomeForecast_150_000_To_199_999_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_150_000_To_199_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_150_000_To_199_999_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_150_000_To_199_999_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_150_000_To_199_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_150_000_To_199_999_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "$200,000 or more":

                    householdIncomeForecast_200_000Plus_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    householdIncomeForecast_200_000Plus_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdIncomeForecast_200_000Plus_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdIncomeForecast_200_000Plus_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdIncomeForecast_200_000Plus_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    householdIncomeForecast_200_000Plus_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
            }

        }
    }

    @Override
    public String toString() {
        return "HouseholdIncomeForecast{" +
                "householdIncomeForecast_LessThan10_000_2010=" + householdIncomeForecast_LessThan10_000_2010 +
                "\n householdIncomeForecast_10_000_To_14_999_2010=" + householdIncomeForecast_10_000_To_14_999_2010 +
                "\n householdIncomeForecast_15_000_To_24_999_2010=" + householdIncomeForecast_15_000_To_24_999_2010 +
                "\n householdIncomeForecast_25_000_To_34_999_2010=" + householdIncomeForecast_25_000_To_34_999_2010 +
                "\n householdIncomeForecast_35_000_To_49_999_2010=" + householdIncomeForecast_35_000_To_49_999_2010 +
                "\n householdIncomeForecast_50_000_To_74_999_2010=" + householdIncomeForecast_50_000_To_74_999_2010 +
                "\n householdIncomeForecast_75_000_To_99_999_2010=" + householdIncomeForecast_75_000_To_99_999_2010 +
                "\n householdIncomeForecast_100_000_To_149_999_2010=" + householdIncomeForecast_100_000_To_149_999_2010 +
                "\n householdIncomeForecast_150_000_To_199_999_2010=" + householdIncomeForecast_150_000_To_199_999_2010 +
                "\n householdIncomeForecast_200_000Plus_2010=" + householdIncomeForecast_200_000Plus_2010 +
                "\n householdIncomeForecast_LessThan10_000_2021=" + householdIncomeForecast_LessThan10_000_2021 +
                "\n householdIncomeForecast_10_000_To_14_999_2021=" + householdIncomeForecast_10_000_To_14_999_2021 +
                "\n householdIncomeForecast_15_000_To_24_999_2021=" + householdIncomeForecast_15_000_To_24_999_2021 +
                "\n householdIncomeForecast_25_000_To_34_999_2021=" + householdIncomeForecast_25_000_To_34_999_2021 +
                "\n householdIncomeForecast_35_000_To_49_999_2021=" + householdIncomeForecast_35_000_To_49_999_2021 +
                "\n householdIncomeForecast_50_000_To_74_999_2021=" + householdIncomeForecast_50_000_To_74_999_2021 +
                "\n householdIncomeForecast_75_000_To_99_999_2021=" + householdIncomeForecast_75_000_To_99_999_2021 +
                "\n householdIncomeForecast_100_000_To_149_999_2021=" + householdIncomeForecast_100_000_To_149_999_2021 +
                "\n householdIncomeForecast_150_000_To_199_999_2021=" + householdIncomeForecast_150_000_To_199_999_2021 +
                "\n householdIncomeForecast_200_000Plus_2021=" + householdIncomeForecast_200_000Plus_2021 +
                "\n householdIncomeForecast_LessThan10_000_2026=" + householdIncomeForecast_LessThan10_000_2026 +
                "\n householdIncomeForecast_10_000_To_14_999_2026=" + householdIncomeForecast_10_000_To_14_999_2026 +
                "\n householdIncomeForecast_15_000_To_24_999_2026=" + householdIncomeForecast_15_000_To_24_999_2026 +
                "\n householdIncomeForecast_25_000_To_34_999_2026=" + householdIncomeForecast_25_000_To_34_999_2026 +
                "\n householdIncomeForecast_35_000_To_49_999_2026=" + householdIncomeForecast_35_000_To_49_999_2026 +
                "\n householdIncomeForecast_50_000_To_74_999_2026=" + householdIncomeForecast_50_000_To_74_999_2026 +
                "\n householdIncomeForecast_75_000_To_99_999_2026=" + householdIncomeForecast_75_000_To_99_999_2026 +
                "\n householdIncomeForecast_100_000_To_149_999_2026=" + householdIncomeForecast_100_000_To_149_999_2026 +
                "\n householdIncomeForecast_150_000_To_199_999_2026=" + householdIncomeForecast_150_000_To_199_999_2026 +
                "\n householdIncomeForecast_200_000Plus_2026=" + householdIncomeForecast_200_000Plus_2026 +
                "\n householdIncomeForecast_LessThan10_000_2010_Percent=" + householdIncomeForecast_LessThan10_000_2010_Percent +
                "\n householdIncomeForecast_10_000_To_14_999_2010_Percent=" + householdIncomeForecast_10_000_To_14_999_2010_Percent +
                "\n householdIncomeForecast_15_000_To_24_999_2010_Percent=" + householdIncomeForecast_15_000_To_24_999_2010_Percent +
                "\n householdIncomeForecast_25_000_To_34_999_2010_Percent=" + householdIncomeForecast_25_000_To_34_999_2010_Percent +
                "\n householdIncomeForecast_35_000_To_49_999_2010_Percent=" + householdIncomeForecast_35_000_To_49_999_2010_Percent +
                "\n householdIncomeForecast_50_000_To_74_999_2010_Percent=" + householdIncomeForecast_50_000_To_74_999_2010_Percent +
                "\n householdIncomeForecast_75_000_To_99_999_2010_Percent=" + householdIncomeForecast_75_000_To_99_999_2010_Percent +
                "\n householdIncomeForecast_100_000_To_149_999_2010_Percent=" + householdIncomeForecast_100_000_To_149_999_2010_Percent +
                "\n householdIncomeForecast_150_000_To_199_999_2010_Percent=" + householdIncomeForecast_150_000_To_199_999_2010_Percent +
                "\n householdIncomeForecast_200_000Plus_2010_Percent=" + householdIncomeForecast_200_000Plus_2010_Percent +
                "\n householdIncomeForecast_LessThan10_000_2021_Percent=" + householdIncomeForecast_LessThan10_000_2021_Percent +
                "\n householdIncomeForecast_10_000_To_14_999_2021_Percent=" + householdIncomeForecast_10_000_To_14_999_2021_Percent +
                "\n householdIncomeForecast_15_000_To_24_999_2021_Percent=" + householdIncomeForecast_15_000_To_24_999_2021_Percent +
                "\n householdIncomeForecast_25_000_To_34_999_2021_Percent=" + householdIncomeForecast_25_000_To_34_999_2021_Percent +
                "\n householdIncomeForecast_35_000_To_49_999_2021_Percent=" + householdIncomeForecast_35_000_To_49_999_2021_Percent +
                "\n householdIncomeForecast_50_000_To_74_999_2021_Percent=" + householdIncomeForecast_50_000_To_74_999_2021_Percent +
                "\n householdIncomeForecast_75_000_To_99_999_2021_Percent=" + householdIncomeForecast_75_000_To_99_999_2021_Percent +
                "\n householdIncomeForecast_100_000_To_149_999_2021_Percent=" + householdIncomeForecast_100_000_To_149_999_2021_Percent +
                "\n householdIncomeForecast_150_000_To_199_999_2021_Percent=" + householdIncomeForecast_150_000_To_199_999_2021_Percent +
                "\n householdIncomeForecast_200_000Plus_2021_Percent=" + householdIncomeForecast_200_000Plus_2021_Percent +
                "\n householdIncomeForecast_LessThan10_000_2026_Percent=" + householdIncomeForecast_LessThan10_000_2026_Percent +
                "\n householdIncomeForecast_10_000_To_14_999_2026_Percent=" + householdIncomeForecast_10_000_To_14_999_2026_Percent +
                "\n householdIncomeForecast_15_000_To_24_999_2026_Percent=" + householdIncomeForecast_15_000_To_24_999_2026_Percent +
                "\n householdIncomeForecast_25_000_To_34_999_2026_Percent=" + householdIncomeForecast_25_000_To_34_999_2026_Percent +
                "\n householdIncomeForecast_35_000_To_49_999_2026_Percent=" + householdIncomeForecast_35_000_To_49_999_2026_Percent +
                "\n householdIncomeForecast_50_000_To_74_999_2026_Percent=" + householdIncomeForecast_50_000_To_74_999_2026_Percent +
                "\n householdIncomeForecast_75_000_To_99_999_2026_Percent=" + householdIncomeForecast_75_000_To_99_999_2026_Percent +
                "\n householdIncomeForecast_100_000_To_149_999_2026_Percent=" + householdIncomeForecast_100_000_To_149_999_2026_Percent +
                "\n householdIncomeForecast_150_000_To_199_999_2026_Percent=" + householdIncomeForecast_150_000_To_199_999_2026_Percent +
                "\n householdIncomeForecast_200_000Plus_2026_Percent=" + householdIncomeForecast_200_000Plus_2026_Percent +
                '}';
    }
}
