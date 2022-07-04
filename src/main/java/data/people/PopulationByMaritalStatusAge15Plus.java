package data.people;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;


public class PopulationByMaritalStatusAge15Plus {

    private Integer neverMarried_2010;
    private Integer married_2010;
    private Integer divorced_2010;
    private Integer separated_2010;
    private Integer widowed_2010;
    private Integer neverMarried_2021;
    private Integer married_2021;
    private Integer divorced_2021;
    private Integer separated_2021;
    private Integer widowed_2021;
    private Integer neverMarried_2026;
    private Integer married_2026;
    private Integer divorced_2026;
    private Integer separated_2026;
    private Integer widowed_2026;
    private Double neverMarriedPercent_2010;
    private Double marriedPercent_2010;
    private Double divorcedPercent_2010;
    private Double separatedPercent_2010;
    private Double widowedPercent_2010;
    private Double neverMarriedPercent_2021;
    private Double marriedPercent_2021;
    private Double divorcedPercent_2021;
    private Double separatedPercent_2021;
    private Double widowedPercent_2021;
    private Double neverMarriedPercent_2026;
    private Double marriedPercent_2026;
    private Double divorcedPercent_2026;
    private Double separatedPercent_2026;
    private Double widowedPercent_2026;

    public PopulationByMaritalStatusAge15Plus(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Population by Marital Status Age 15+");

        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch(rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Never Married":
                    neverMarried_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    neverMarried_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    neverMarried_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    neverMarriedPercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    neverMarriedPercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    neverMarriedPercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Married":
                    married_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    married_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    married_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    marriedPercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    marriedPercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    marriedPercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Divorced":
                    divorced_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    divorced_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    divorced_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    divorcedPercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    divorcedPercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    divorcedPercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Separated":
                    separated_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    separated_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    separated_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    separatedPercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    separatedPercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    separatedPercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Widowed":
                    widowed_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    widowed_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    widowed_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    widowedPercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    widowedPercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    widowedPercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;

            }

        }

    }

    @Override
    public String toString() {
        return "PopulationByMaritalStatusAge15Plus{" +
                "neverMarried_2010=" + neverMarried_2010 +
                "\n married_2010=" + married_2010 +
                "\n divorced_2010=" + divorced_2010 +
                "\n separated_2010=" + separated_2010 +
                "\n widowed_2010=" + widowed_2010 +
                "\n neverMarried_2021=" + neverMarried_2021 +
                "\n married_2021=" + married_2021 +
                "\n divorced_2021=" + divorced_2021 +
                "\n separated_2021=" + separated_2021 +
                "\n widowed_2021=" + widowed_2021 +
                "\n neverMarried_2026=" + neverMarried_2026 +
                "\n married_2026=" + married_2026 +
                "\n divorced_2026=" + divorced_2026 +
                "\n separated_2026=" + separated_2026 +
                "\n widowed_2026=" + widowed_2026 +
                "\n neverMarriedPercent_2010=" + neverMarriedPercent_2010 +
                "\n marriedPercent_2010=" + marriedPercent_2010 +
                "\n divorcedPercent_2010=" + divorcedPercent_2010 +
                "\n separatedPercent_2010=" + separatedPercent_2010 +
                "\n widowedPercent_2010=" + widowedPercent_2010 +
                "\n neverMarriedPercent_2021=" + neverMarriedPercent_2021 +
                "\n marriedPercent_2021=" + marriedPercent_2021 +
                "\n divorcedPercent_2021=" + divorcedPercent_2021 +
                "\n separatedPercent_2021=" + separatedPercent_2021 +
                "\n widowedPercent_2021=" + widowedPercent_2021 +
                "\n neverMarriedPercent_2026=" + neverMarriedPercent_2026 +
                "\n marriedPercent_2026=" + marriedPercent_2026 +
                "\n divorcedPercent_2026=" + divorcedPercent_2026 +
                "\n separatedPercent_2026=" + separatedPercent_2026 +
                "\n widowedPercent_2026=" + widowedPercent_2026 +
                '}';
    }
}
