package data.housing;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class HousingTrendsValueOwnerOccupied {

    Integer housingValue_100_000_To_149_999_2021;
    Integer housingValue_200_000_To_299_999_2021;
    Integer housingValue_150_000_To_199_999_2021;
    Integer housingValue_80_000_To_99_999_2021;
    Integer housingValue_300_000_To_399_999_2021;
    Integer housingValue_60_000_To_79_999_2021;
    Integer housingValue_40_000_To_59_999_2021;
    Integer housingValue_400_000_To_499_999_2021;
    Integer housingValue_20_000_To_39_999_2021;
    Integer housingValue_500_000_To_749_999_2021;
    Integer housingValue_750_000_To_999_999_2021;
    Integer housingValue_1_000_000_Or_More_2021;
    Integer housingValue_LessThan_20_000_2021;
    Double housingValue_100_000_To_149_999_2021_Percent;
    Double housingValue_200_000_To_299_999_2021_Percent;
    Double housingValue_150_000_To_199_999_2021_Percent;
    Double housingValue_80_000_To_99_999_2021_Percent;
    Double housingValue_300_000_To_399_999_2021_Percent;
    Double housingValue_60_000_To_79_999_2021_Percent;
    Double housingValue_40_000_To_59_999_2021_Percent;
    Double housingValue_400_000_To_499_999_2021_Percent;
    Double housingValue_20_000_To_39_999_2021_Percent;
    Double housingValue_500_000_To_749_999_2021_Percent;
    Double housingValue_750_000_To_999_999_2021_Percent;
    Double housingValue_1_000_000_Or_More_2021_Percent;
    Double housingValue_LessThan_20_000_2021_Percent;
    
    
    public HousingTrendsValueOwnerOccupied(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Housing Trends: Value Owner-Occupied");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {

                case "$100,000 to $149,999":
                    housingValue_100_000_To_149_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_100_000_To_149_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$200,000 to $299,999":
                    housingValue_200_000_To_299_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_200_000_To_299_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$150,000 to $199,999":
                    housingValue_150_000_To_199_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_150_000_To_199_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$80,000 to $99,999":
                    housingValue_80_000_To_99_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_80_000_To_99_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$300,000 to $399,999":
                    housingValue_300_000_To_399_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_300_000_To_399_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$60,000 to $79,999":
                    housingValue_60_000_To_79_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_60_000_To_79_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$40,000 to $59,999":
                    housingValue_40_000_To_59_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_40_000_To_59_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$400,000 to $499,999":
                    housingValue_400_000_To_499_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_400_000_To_499_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$20,000 to $39,999":
                    housingValue_20_000_To_39_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_20_000_To_39_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$500,000 to $749,999":
                    housingValue_500_000_To_749_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_500_000_To_749_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$750,000 to $999,999":
                    housingValue_750_000_To_999_999_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_750_000_To_999_999_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "$1,000,000 or more":
                    housingValue_1_000_000_Or_More_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_1_000_000_Or_More_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Less than $20,000":
                    housingValue_LessThan_20_000_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingValue_LessThan_20_000_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
            
            
            }

        }
    }

    @Override
    public String toString() {
        return "HousingTrendsValueOwnerOccupied{" +
                "housingValue_100_000_To_149_999_2021=" + housingValue_100_000_To_149_999_2021 +
                "\n housingValue_200_000_To_299_999_2021=" + housingValue_200_000_To_299_999_2021 +
                "\n housingValue_150_000_To_199_999_2021=" + housingValue_150_000_To_199_999_2021 +
                "\n housingValue_80_000_To_99_999_2021=" + housingValue_80_000_To_99_999_2021 +
                "\n housingValue_300_000_To_399_999_2021=" + housingValue_300_000_To_399_999_2021 +
                "\n housingValue_60_000_To_79_999_2021=" + housingValue_60_000_To_79_999_2021 +
                "\n housingValue_40_000_To_59_999_2021=" + housingValue_40_000_To_59_999_2021 +
                "\n housingValue_400_000_To_499_999_2021=" + housingValue_400_000_To_499_999_2021 +
                "\n housingValue_20_000_To_39_999_2021=" + housingValue_20_000_To_39_999_2021 +
                "\n housingValue_500_000_To_749_999_2021=" + housingValue_500_000_To_749_999_2021 +
                "\n housingValue_750_000_To_999_999_2021=" + housingValue_750_000_To_999_999_2021 +
                "\n housingValue_1_000_000_Or_More_2021=" + housingValue_1_000_000_Or_More_2021 +
                "\n housingValue_LessThan_20_000_2021=" + housingValue_LessThan_20_000_2021 +
                "\n housingValue_100_000_To_149_999_2021_Percent=" + housingValue_100_000_To_149_999_2021_Percent +
                "\n housingValue_200_000_To_299_999_2021_Percent=" + housingValue_200_000_To_299_999_2021_Percent +
                "\n housingValue_150_000_To_199_999_2021_Percent=" + housingValue_150_000_To_199_999_2021_Percent +
                "\n housingValue_80_000_To_99_999_2021_Percent=" + housingValue_80_000_To_99_999_2021_Percent +
                "\n housingValue_300_000_To_399_999_2021_Percent=" + housingValue_300_000_To_399_999_2021_Percent +
                "\n housingValue_60_000_To_79_999_2021_Percent=" + housingValue_60_000_To_79_999_2021_Percent +
                "\n housingValue_40_000_To_59_999_2021_Percent=" + housingValue_40_000_To_59_999_2021_Percent +
                "\n housingValue_400_000_To_499_999_2021_Percent=" + housingValue_400_000_To_499_999_2021_Percent +
                "\n housingValue_20_000_To_39_999_2021_Percent=" + housingValue_20_000_To_39_999_2021_Percent +
                "\n housingValue_500_000_To_749_999_2021_Percent=" + housingValue_500_000_To_749_999_2021_Percent +
                "\n housingValue_750_000_To_999_999_2021_Percent=" + housingValue_750_000_To_999_999_2021_Percent +
                "\n housingValue_1_000_000_Or_More_2021_Percent=" + housingValue_1_000_000_Or_More_2021_Percent +
                "\n housingValue_LessThan_20_000_2021_Percent=" + housingValue_LessThan_20_000_2021_Percent +
                '}';
    }
}
