package data.work;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class Unemployment {
    private Integer unemployment_2019_1st_Qtr;
    private Integer unemployment_2019_2nd_Qtr;
    private Integer unemployment_2019_3rd_Qtr;
    private Integer unemployment_2019_4th_Qtr;
    private Integer unemployment_2020_1st_Qtr;
    private Integer unemployment_2020_2nd_Qtr;
    private Integer unemployment_2020_3rd_Qtr;
    private Integer unemployment_2020_4th_Qtr;
    private Integer unemployment_2019_1st_Qtr_2019_2nd_Qtr_Change;
    private Integer unemployment_2019_2nd_Qtr_2019_3rd_Qtr_Change;
    private Integer unemployment_2019_3rd_Qtr_2019_4th_Qtr_Change;
    private Integer unemployment_2019_4th_Qtr_2020_1st_Qtr_Change;
    private Integer unemployment_2020_1st_Qtr_2020_2nd_Qtr_Change;
    private Integer unemployment_2020_2nd_Qtr_2020_3rd_Qtr_Change;
    private Integer unemployment_2020_3rd_Qtr_2020_4th_Qtr_Change;
    private Double unemployment_2019_1st_Qtr_2019_2nd_Qtr_ChangePercent;
    private Double unemployment_2019_2nd_Qtr_2019_3rd_Qtr_ChangePercent;
    private Double unemployment_2019_3rd_Qtr_2019_4th_Qtr_ChangePercent;
    private Double unemployment_2019_4th_Qtr_2020_1st_Qtr_ChangePercent;
    private Double unemployment_2020_1st_Qtr_2020_2nd_Qtr_ChangePercent;
    private Double unemployment_2020_2nd_Qtr_2020_3rd_Qtr_ChangePercent;
    private Double unemployment_2020_3rd_Qtr_2020_4th_Qtr_ChangePercent;

    public Unemployment(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Unemployment");

        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "":
                    unemployment_2019_1st_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    unemployment_2019_2nd_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    unemployment_2019_3rd_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    unemployment_2019_4th_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "E");
                    unemployment_2020_1st_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "F");
                    unemployment_2020_2nd_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "G");
                    unemployment_2020_3rd_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "H");
                    unemployment_2020_4th_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "I");
                    break;
                case "Change":
                    unemployment_2019_1st_Qtr_2019_2nd_Qtr_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    unemployment_2019_2nd_Qtr_2019_3rd_Qtr_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    unemployment_2019_3rd_Qtr_2019_4th_Qtr_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "E");
                    unemployment_2019_4th_Qtr_2020_1st_Qtr_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "F");
                    unemployment_2020_1st_Qtr_2020_2nd_Qtr_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "G");
                    unemployment_2020_2nd_Qtr_2020_3rd_Qtr_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "H");
                    unemployment_2020_3rd_Qtr_2020_4th_Qtr_Change = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "I");
                    break;
                case "Percent Change":
                    unemployment_2019_1st_Qtr_2019_2nd_Qtr_ChangePercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    unemployment_2019_2nd_Qtr_2019_3rd_Qtr_ChangePercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "D");
                    unemployment_2019_3rd_Qtr_2019_4th_Qtr_ChangePercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    unemployment_2019_4th_Qtr_2020_1st_Qtr_ChangePercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    unemployment_2020_1st_Qtr_2020_2nd_Qtr_ChangePercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    unemployment_2020_2nd_Qtr_2020_3rd_Qtr_ChangePercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "H");
                    unemployment_2020_3rd_Qtr_2020_4th_Qtr_ChangePercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "I");
                    break;
            }

        }

    }


    @Override
    public String toString() {
        return "Unemployment{" +
                "unemployment_2019_1st_Qtr=" + unemployment_2019_1st_Qtr +
                "\n unemployment_2019_2nd_Qtr=" + unemployment_2019_2nd_Qtr +
                "\n unemployment_2019_3rd_Qtr=" + unemployment_2019_3rd_Qtr +
                "\n unemployment_2019_4th_Qtr=" + unemployment_2019_4th_Qtr +
                "\n unemployment_2020_1st_Qtr=" + unemployment_2020_1st_Qtr +
                "\n unemployment_2020_2nd_Qtr=" + unemployment_2020_2nd_Qtr +
                "\n unemployment_2020_3rd_Qtr=" + unemployment_2020_3rd_Qtr +
                "\n unemployment_2020_4th_Qtr=" + unemployment_2020_4th_Qtr +
                "\n unemployment_2019_1st_Qtr_2019_2nd_Qtr_Change=" + unemployment_2019_1st_Qtr_2019_2nd_Qtr_Change +
                "\n unemployment_2019_2nd_Qtr_2019_3rd_Qtr_Change=" + unemployment_2019_2nd_Qtr_2019_3rd_Qtr_Change +
                "\n unemployment_2019_3rd_Qtr_2019_4th_Qtr_Change=" + unemployment_2019_3rd_Qtr_2019_4th_Qtr_Change +
                "\n unemployment_2019_4th_Qtr_2020_1st_Qtr_Change=" + unemployment_2019_4th_Qtr_2020_1st_Qtr_Change +
                "\n unemployment_2020_1st_Qtr_2020_2nd_Qtr_Change=" + unemployment_2020_1st_Qtr_2020_2nd_Qtr_Change +
                "\n unemployment_2020_2nd_Qtr_2020_3rd_Qtr_Change=" + unemployment_2020_2nd_Qtr_2020_3rd_Qtr_Change +
                "\n unemployment_2020_3rd_Qtr_2020_4th_Qtr_Change=" + unemployment_2020_3rd_Qtr_2020_4th_Qtr_Change +
                "\n unemployment_2019_1st_Qtr_2019_2nd_Qtr_ChangePercent=" + unemployment_2019_1st_Qtr_2019_2nd_Qtr_ChangePercent +
                "\n unemployment_2019_2nd_Qtr_2019_3rd_Qtr_ChangePercent=" + unemployment_2019_2nd_Qtr_2019_3rd_Qtr_ChangePercent +
                "\n unemployment_2019_3rd_Qtr_2019_4th_Qtr_ChangePercent=" + unemployment_2019_3rd_Qtr_2019_4th_Qtr_ChangePercent +
                "\n unemployment_2019_4th_Qtr_2020_1st_Qtr_ChangePercent=" + unemployment_2019_4th_Qtr_2020_1st_Qtr_ChangePercent +
                "\n unemployment_2020_1st_Qtr_2020_2nd_Qtr_ChangePercent=" + unemployment_2020_1st_Qtr_2020_2nd_Qtr_ChangePercent +
                "\n unemployment_2020_2nd_Qtr_2020_3rd_Qtr_ChangePercent=" + unemployment_2020_2nd_Qtr_2020_3rd_Qtr_ChangePercent +
                "\n unemployment_2020_3rd_Qtr_2020_4th_Qtr_ChangePercent=" + unemployment_2020_3rd_Qtr_2020_4th_Qtr_ChangePercent +
                '}';
    }
}
