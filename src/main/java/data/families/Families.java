package data.families;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class Families {

    private Integer familyHouseholds_2010;
    private Integer familyHouseholds_2021;
    private Integer familyHouseholds_2026;
    private Integer familyHouseholdsChange_2010_2021;
    private Integer familyHouseholdsChange_2021_2026;
    private Double familyHouseholdsChangePercent_2010_2021;
    private Double familyHouseholdsChangePercent_2021_2026;

    public Families(XSSFSheet sheet) {


        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Families");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Family Households":
                    this.familyHouseholds_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.familyHouseholds_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.familyHouseholds_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    break;
                case "Family Households Change":
                    this.familyHouseholdsChange_2010_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.familyHouseholdsChange_2021_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    break;
                case "Percent Change":
                    this.familyHouseholdsChangePercent_2010_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    this.familyHouseholdsChangePercent_2021_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "D");
                    break;
            }

        }


    }


    @Override
    public String toString() {
        return "Families{" +
                "familyHouseholds_2010=" + familyHouseholds_2010 +
                "\n familyHouseholds_2021=" + familyHouseholds_2021 +
                "\n familyHouseholds_2026=" + familyHouseholds_2026 +
                "\n familyHouseholdsChange_2010_2021=" + familyHouseholdsChange_2010_2021 +
                "\n familyHouseholdsChange_2021_2026=" + familyHouseholdsChange_2021_2026 +
                "\n familyHouseholdsChangePercent_2010_2021=" + familyHouseholdsChangePercent_2010_2021 +
                "\n familyHouseholdsChangePercent_2021_2026=" + familyHouseholdsChangePercent_2021_2026 +
                '}';
    }
}
