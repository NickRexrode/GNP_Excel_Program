package data.population;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class PopulationRecent8QuarterHistory {

    private Integer populationRecent8QuarterHistory_2019_1st_Qtr;
    private Integer populationRecent8QuarterHistory_2019_2nd_Qtr;
    private Integer populationRecent8QuarterHistory_2019_3rd_Qtr;
    private Integer populationRecent8QuarterHistory_2019_4th_Qtr;
    private Integer populationRecent8QuarterHistory_2020_1st_Qtr;
    private Integer populationRecent8QuarterHistory_2020_2nd_Qtr;
    private Integer populationRecent8QuarterHistory_2020_3rd_Qtr;
    private Integer populationRecent8QuarterHistory_2020_4th_Qtr;

    private Integer populationRecent8QuarterHistoryChange_2019_2nd_2019_3rd;
    private Integer populationRecent8QuarterHistoryChange_2019_3rd_2019_4th;
    private Integer populationRecent8QuarterHistoryChange_2019_4th_2020_1st;
    private Integer populationRecent8QuarterHistoryChange_2019_1st_2019_2nd;
    private Integer populationRecent8QuarterHistoryChange_2020_1st_2020_2nd;
    private Integer populationRecent8QuarterHistoryChange_2020_2nd_2020_3rd;
    private Integer populationRecent8QuarterHistoryChange_2020_3rd_2020_4th;

    private Double populationRecent8QuarterHistoryChangePercent_2019_2nd_2019_3rd;
    private Double populationRecent8QuarterHistoryChangePercent_2019_3rd_2019_4th;
    private Double populationRecent8QuarterHistoryChangePercent_2019_4th_2020_1st;
    private Double populationRecent8QuarterHistoryChangePercent_2019_1st_2019_2nd;
    private Double populationRecent8QuarterHistoryChangePercent_2020_1st_2020_2nd;
    private Double populationRecent8QuarterHistoryChangePercent_2020_2nd_2020_3rd;
    private Double populationRecent8QuarterHistoryChangePercent_2020_3rd_2020_4th;


    public PopulationRecent8QuarterHistory(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Population: Recent 8 Quarter History");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch(rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "":

                    this.populationRecent8QuarterHistory_2019_1st_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.populationRecent8QuarterHistory_2019_2nd_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationRecent8QuarterHistory_2019_3rd_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.populationRecent8QuarterHistory_2019_4th_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "E");
                    this.populationRecent8QuarterHistory_2020_1st_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "F");
                    this.populationRecent8QuarterHistory_2020_2nd_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "G");
                    this.populationRecent8QuarterHistory_2020_3rd_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "H");
                    this.populationRecent8QuarterHistory_2020_4th_Qtr = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "I");

                    break;
                case "Change":
                    this.populationRecent8QuarterHistoryChange_2019_2nd_2019_3rd = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationRecent8QuarterHistoryChange_2019_3rd_2019_4th = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.populationRecent8QuarterHistoryChange_2019_4th_2020_1st = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "E");
                    this.populationRecent8QuarterHistoryChange_2019_1st_2019_2nd = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "F");
                    this.populationRecent8QuarterHistoryChange_2020_1st_2020_2nd = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "G");
                    this.populationRecent8QuarterHistoryChange_2020_2nd_2020_3rd = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "H");
                    this.populationRecent8QuarterHistoryChange_2020_3rd_2020_4th = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "I");
                    break;
                case "Percent Change":
                    this.populationRecent8QuarterHistoryChangePercent_2019_2nd_2019_3rd = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    this.populationRecent8QuarterHistoryChangePercent_2019_3rd_2019_4th = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "D");
                    this.populationRecent8QuarterHistoryChangePercent_2019_4th_2020_1st = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    this.populationRecent8QuarterHistoryChangePercent_2019_1st_2019_2nd = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    this.populationRecent8QuarterHistoryChangePercent_2020_1st_2020_2nd = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    this.populationRecent8QuarterHistoryChangePercent_2020_2nd_2020_3rd = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "H");
                    this.populationRecent8QuarterHistoryChangePercent_2020_3rd_2020_4th = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "I");
                    break;
            }

        }


    }

    @Override
    public String toString() {
        return "PopulationRecent8QuarterHistory{" +
                "populationRecent8QuarterHistory_2019_1st_Qtr=" + populationRecent8QuarterHistory_2019_1st_Qtr +
                ", populationRecent8QuarterHistory_2019_2nd_Qtr=" + populationRecent8QuarterHistory_2019_2nd_Qtr +
                ", populationRecent8QuarterHistory_2019_3rd_Qtr=" + populationRecent8QuarterHistory_2019_3rd_Qtr +
                ", populationRecent8QuarterHistory_2019_4th_Qtr=" + populationRecent8QuarterHistory_2019_4th_Qtr +
                ", populationRecent8QuarterHistory_2020_1st_Qtr=" + populationRecent8QuarterHistory_2020_1st_Qtr +
                ", populationRecent8QuarterHistory_2020_2nd_Qtr=" + populationRecent8QuarterHistory_2020_2nd_Qtr +
                ", populationRecent8QuarterHistory_2020_3rd_Qtr=" + populationRecent8QuarterHistory_2020_3rd_Qtr +
                ", populationRecent8QuarterHistory_2020_4th_Qtr=" + populationRecent8QuarterHistory_2020_4th_Qtr +
                ", populationRecent8QuarterHistoryChange_2019_2nd_2019_3rd=" + populationRecent8QuarterHistoryChange_2019_2nd_2019_3rd +
                ", populationRecent8QuarterHistoryChange_2019_3rd_2019_4th=" + populationRecent8QuarterHistoryChange_2019_3rd_2019_4th +
                ", populationRecent8QuarterHistoryChange_2019_4th_2020_1st=" + populationRecent8QuarterHistoryChange_2019_4th_2020_1st +
                ", populationRecent8QuarterHistoryChange_2019_1st_2019_2nd=" + populationRecent8QuarterHistoryChange_2019_1st_2019_2nd +
                ", populationRecent8QuarterHistoryChange_2020_1st_2020_2nd=" + populationRecent8QuarterHistoryChange_2020_1st_2020_2nd +
                ", populationRecent8QuarterHistoryChange_2020_2nd_2020_3rd=" + populationRecent8QuarterHistoryChange_2020_2nd_2020_3rd +
                ", populationRecent8QuarterHistoryChange_2020_3rd_2020_4th=" + populationRecent8QuarterHistoryChange_2020_3rd_2020_4th +
                ", populationRecent8QuarterHistoryChangePercent_2019_2nd_2019_3rd=" + populationRecent8QuarterHistoryChangePercent_2019_2nd_2019_3rd +
                ", populationRecent8QuarterHistoryChangePercent_2019_3rd_2019_4th=" + populationRecent8QuarterHistoryChangePercent_2019_3rd_2019_4th +
                ", populationRecent8QuarterHistoryChangePercent_2019_4th_2020_1st=" + populationRecent8QuarterHistoryChangePercent_2019_4th_2020_1st +
                ", populationRecent8QuarterHistoryChangePercent_2019_1st_2019_2nd=" + populationRecent8QuarterHistoryChangePercent_2019_1st_2019_2nd +
                ", populationRecent8QuarterHistoryChangePercent_2020_1st_2020_2nd=" + populationRecent8QuarterHistoryChangePercent_2020_1st_2020_2nd +
                ", populationRecent8QuarterHistoryChangePercent_2020_2nd_2020_3rd=" + populationRecent8QuarterHistoryChangePercent_2020_2nd_2020_3rd +
                ", populationRecent8QuarterHistoryChangePercent_2020_3rd_2020_4th=" + populationRecent8QuarterHistoryChangePercent_2020_3rd_2020_4th +
                '}';
    }
}
