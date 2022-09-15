package data.diversity;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class RacialEthnicTrendsDetail {
    private Integer asian_2010;
    private Integer black_2010;
    private Integer white_2010;
    private Integer hispanic_2010 ;
    private Integer other_2010;
    private Integer asian_2021;
    private Integer black_2021;
    private Integer white_2021;
    private Integer hispanic_2021;
    private Integer other_2021;
    private Integer asian_2026;
    private Integer black_2026;
    private Integer white_2026;
    private Integer hispanic_2026;
    private Integer other_2026;
    private Double asian_2010_Percent;
    private Double black_2010_Percent;
    private Double white_2010_Percent;
    private Double hispanic_2010_Percent;
    private Double other_2010_Percent;
    private Double asian_2021_Percent;
    private Double black_2021_Percent;
    private Double white_2021_Percent;
    private Double hispanic_2021_Percent;
    private Double other_2021_Percent;
    private Double asian_2026_Percent;
    private Double black_2026_Percent;
    private Double white_2026_Percent;
    private Double hispanic_2026_Percent;
    private Double other_2026_Percent;
    private Integer asian_2010_2021_Change;
    private Integer black_2010_2021_Change;
    private Integer white_2010_2021_Change;
    private Integer hispanic_2010_2021_Change;
    private Integer other_2010_2021_Change;
    private Integer asian_2021_2026_Change;
    private Integer black_2021_2026_Change;
    private Integer white_2021_2026_Change;
    private Integer hispanic_2021_2026_Change;
    private Integer other_2021_2026_Change;
    private Double asian_2010_2021_Change_Percent;
    private Double black_2010_2021_Change_Percent;
    private Double white_2010_2021_Change_Percent;
    private Double hispanic_2010_2021_Change_Percent;
    private Double other_2010_2021_Change_Percent;
    private Double asian_2021_2026_Change_Percent;
    private Double black_2021_2026_Change_Percent;
    private Double white_2021_2026_Change_Percent;
    private Double hispanic_2021_2026_Change_Percent;
    private Double other_2021_2026_Change_Percent;

    public RacialEthnicTrendsDetail(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Racial/Ethnic Trends: Detail");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Asian (Non-Hisp)":
                    asian_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    asian_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    asian_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    asian_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    asian_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    asian_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "Asian (Non-Hisp) Change":
                    asian_2010_2021_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    asian_2021_2026_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    asian_2010_2021_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "C");
                    asian_2021_2026_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "D");
                    break;

                case "Black (Non-Hisp)":
                    black_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    black_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    black_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    black_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    black_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    black_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "Black (Non-Hisp) Change":
                    black_2010_2021_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    black_2021_2026_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    black_2010_2021_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "C");
                    black_2021_2026_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "D");
                    break;

                case "White (Non-Hisp)":
                    white_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    white_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    white_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    white_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    white_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    white_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "White (Non-Hisp) Change":
                    white_2010_2021_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    white_2021_2026_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    white_2010_2021_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "C");
                    white_2021_2026_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "D");
                    break;

                case "Hispanic or Latino":
                    hispanic_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    hispanic_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    hispanic_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    hispanic_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    hispanic_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    hispanic_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "Hispanic or Latino Change":
                    hispanic_2010_2021_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    hispanic_2021_2026_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    hispanic_2010_2021_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "C");
                    hispanic_2021_2026_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "D");
                    break;

                case "Other Race (Non-Hisp)":
                    other_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    other_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    other_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    other_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    other_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    other_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");

                    break;
                case "Other Race (Non-Hisp) Change":
                    other_2010_2021_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    other_2021_2026_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    other_2010_2021_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "C");
                    other_2021_2026_Change_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "D");
                    break;

            }

        }

    }

    @Override
    public String toString() {
        return "RacialEthnicTrendsDetail{" +
                "asian_2010=" + asian_2010 +
                "\n black_2010=" + black_2010 +
                "\n white_2010=" + white_2010 +
                "\n hispanic_2010=" + hispanic_2010 +
                "\n other_2010=" + other_2010 +
                "\n asian_2021=" + asian_2021 +
                "\n black_2021=" + black_2021 +
                "\n white_2021=" + white_2021 +
                "\n hispanic_2021=" + hispanic_2021 +
                "\n other_2021=" + other_2021 +
                "\n asian_2026=" + asian_2026 +
                "\n black_2026=" + black_2026 +
                "\n white_2026=" + white_2026 +
                "\n hispanic_2026=" + hispanic_2026 +
                "\n other_2026=" + other_2026 +
                "\n asian_2010_Percent=" + asian_2010_Percent +
                "\n black_2010_Percent=" + black_2010_Percent +
                "\n white_2010_Percent=" + white_2010_Percent +
                "\n hispanic_2010_Percent=" + hispanic_2010_Percent +
                "\n other_2010_Percent=" + other_2010_Percent +
                "\n asian_2021_Percent=" + asian_2021_Percent +
                "\n black_2021_Percent=" + black_2021_Percent +
                "\n white_2021_Percent=" + white_2021_Percent +
                "\n hispanic_2021_Percent=" + hispanic_2021_Percent +
                "\n other_2021_Percent=" + other_2021_Percent +
                "\n asian_2026_Percent=" + asian_2026_Percent +
                "\n black_2026_Percent=" + black_2026_Percent +
                "\n white_2026_Percent=" + white_2026_Percent +
                "\n hispanic_2026_Percent=" + hispanic_2026_Percent +
                "\n other_2026_Percent=" + other_2026_Percent +
                "\n asian_2010_2021_Change=" + asian_2010_2021_Change +
                "\n black_2010_2021_Change=" + black_2010_2021_Change +
                "\n white_2010_2021_Change=" + white_2010_2021_Change +
                "\n hispanic_2010_2021_Change=" + hispanic_2010_2021_Change +
                "\n other_2010_2021_Change=" + other_2010_2021_Change +
                "\n asian_2021_2026_Change=" + asian_2021_2026_Change +
                "\n black_2021_2026_Change=" + black_2021_2026_Change +
                "\n white_2021_2026_Change=" + white_2021_2026_Change +
                "\n hispanic_2021_2026_Change=" + hispanic_2021_2026_Change +
                "\n other_2021_2026_Change=" + other_2021_2026_Change +
                "\n asian_2010_2021_Change_Percent=" + asian_2010_2021_Change_Percent +
                "\n black_2010_2021_Change_Percent=" + black_2010_2021_Change_Percent +
                "\n white_2010_2021_Change_Percent=" + white_2010_2021_Change_Percent +
                "\n hispanic_2010_2021_Change_Percent=" + hispanic_2010_2021_Change_Percent +
                "\n other_2010_2021_Change_Percent=" + other_2010_2021_Change_Percent +
                "\n asian_2021_2026_Change_Percent=" + asian_2021_2026_Change_Percent +
                "\n black_2021_2026_Change_Percent=" + black_2021_2026_Change_Percent +
                "\n white_2021_2026_Change_Percent=" + white_2021_2026_Change_Percent +
                "\n hispanic_2021_2026_Change_Percent=" + hispanic_2021_2026_Change_Percent +
                "\n other_2021_2026_Change_Percent=" + other_2021_2026_Change_Percent +
                '}';
    }
}
