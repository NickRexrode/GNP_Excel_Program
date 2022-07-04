package data.households;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class Households {
    private Integer households_2000;
    private Integer households_2010;
    private Integer households_2021;
    private Integer households_2026;
    private Integer households_2031;
    private Integer householdsChange_2000_2010;
    private Integer householdsChange_2010_2021;
    private Integer householdsChange_2021_2026;
    private Integer householdsChange_2026_2031;
    private Double householdsChangePercent_2000_2010;
    private Double householdsChangePercent_2010_2021;
    private Double householdsChangePercent_2021_2026;
    private Double householdsChangePercent_2026_2031;

    public Households(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Households");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Households":
                    households_2000 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    households_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    households_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    households_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "E");
                    households_2031 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "F");
                    break;
                case "Households Change":
                    householdsChange_2000_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    householdsChange_2010_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    householdsChange_2021_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "E");
                    householdsChange_2026_2031 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "F");
                    break;

                case "Percent Change":
                    householdsChangePercent_2000_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    householdsChangePercent_2010_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "D");
                    householdsChangePercent_2021_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    householdsChangePercent_2026_2031 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    break;

            }

        }

    }

    @Override
    public String toString() {
        return "Households{" +
                "households_2000=" + households_2000 +
                "\n households_2010=" + households_2010 +
                "\n households_2021=" + households_2021 +
                "\n households_2026=" + households_2026 +
                "\n households_2031=" + households_2031 +
                "\n householdsChange_2000_2010=" + householdsChange_2000_2010 +
                "\n householdsChange_2010_2021=" + householdsChange_2010_2021 +
                "\n householdsChange_2021_2026=" + householdsChange_2021_2026 +
                "\n householdsChange_2026_2031=" + householdsChange_2026_2031 +
                "\n householdsChangePercent_2000_2010=" + householdsChangePercent_2000_2010 +
                "\n householdsChangePercent_2010_2021=" + householdsChangePercent_2010_2021 +
                "\n householdsChangePercent_2021_2026=" + householdsChangePercent_2021_2026 +
                "\n householdsChangePercent_2026_2031=" + householdsChangePercent_2026_2031 +
                '}';
    }
}
