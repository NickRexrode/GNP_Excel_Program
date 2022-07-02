package data.people;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class PopulationTrends {

    private Integer population_2000;
    private Integer population_2010;
    private Integer population_2021;
    private Integer population_2026;
    private Integer population_2031;

    private Integer populationChange_2000_2010;
    private Integer populationChange_2010_2021;
    private Integer populationChange_2021_2026;
    private Integer populationChange_2026_2031;

    private Double populationChangePercent_2000_2010;
    private Double populationChangePercent_2010_2021;
    private Double populationChangePercent_2021_2026;
    private Double populationChangePercent_2026_2031;

    public PopulationTrends(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Population Trends");



        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch(rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Population":
                    this.population_2000 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.population_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.population_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.population_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "E");
                    this.population_2031 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "F");
                    break;
                case "Population Change":
                    this.populationChange_2000_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationChange_2010_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.populationChange_2021_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "E");
                    this.populationChange_2026_2031 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "F");
                    break;
                case "Percent Change":
                    this.populationChangePercent_2000_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    this.populationChangePercent_2010_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "D");
                    this.populationChangePercent_2021_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    this.populationChangePercent_2026_2031 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    break;
            }

        }


    }
}
