package data.diversity;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class ReligiousAffiliation {

    private Integer religion_UnknownAffiliation_2021 = 0;
    private Integer religion_Catholic_2021 = 0;
    private Integer religion_Mainline_2021 = 0;
    private Integer religion_Evangelical_2021 = 0;
    private Integer religion_Orthodox_2021 = 0;
    private Integer religion_Mormon_2021 = 0;
    private Integer religion_BlackProtestant_2021 = 0;
    private Integer religion_Jewish_2021 = 0;
    private Integer religion_Muslim_2021 = 0;

    private Double religion_UnknownAffiliation_2021_Percent = 0.0;
    private Double religion_Catholic_2021_Percent = 0.0;
    private Double religion_Mainline_2021_Percent = 0.0;
    private Double religion_Evangelical_2021_Percent = 0.0;
    private Double religion_Orthodox_2021_Percent = 0.0;
    private Double religion_Mormon_2021_Percent = 0.0;
    private Double religion_BlackProtestant_2021_Percent = 0.0;
    private Double religion_Jewish_2021_Percent = 0.0;
    private Double religion_Muslim_2021_Percent = 0.0;
    public ReligiousAffiliation(XSSFSheet sheet) {

        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Religious Affiliation");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Unknown Affiliation":
                    religion_UnknownAffiliation_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    religion_UnknownAffiliation_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Catholic":
                    religion_Catholic_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    religion_Catholic_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Mainline":
                    religion_Mainline_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    religion_Mainline_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Evangelical":
                    religion_Evangelical_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    religion_Evangelical_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Orthodox":
                    religion_Orthodox_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    religion_Orthodox_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Mormon":
                    religion_Mormon_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    religion_Mormon_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Black Protestant":
                    religion_BlackProtestant_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    religion_BlackProtestant_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Jewish":
                    religion_Jewish_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    religion_Jewish_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Muslim":
                    religion_Muslim_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    religion_Muslim_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                    
                
            }

        }

    }

    @Override
    public String toString() {
        return "ReligiousAffiliation{" +
                "religion_UnknownAffiliation_2021=" + religion_UnknownAffiliation_2021 +
                "\n religion_Catholic_2021=" + religion_Catholic_2021 +
                "\n religion_Mainline_2021=" + religion_Mainline_2021 +
                "\n religion_Evangelical_2021=" + religion_Evangelical_2021 +
                "\n religion_Orthodox_2021=" + religion_Orthodox_2021 +
                "\n religion_Mormon_2021=" + religion_Mormon_2021 +
                "\n religion_BlackProtestant_2021=" + religion_BlackProtestant_2021 +
                "\n religion_Jewish_2021=" + religion_Jewish_2021 +
                "\n religion_Muslim_2021=" + religion_Muslim_2021 +
                "\n religion_UnknownAffiliation_2021_Percent=" + religion_UnknownAffiliation_2021_Percent +
                "\n religion_Catholic_2021_Percent=" + religion_Catholic_2021_Percent +
                "\n religion_Mainline_2021_Percent=" + religion_Mainline_2021_Percent +
                "\n religion_Evangelical_2021_Percent=" + religion_Evangelical_2021_Percent +
                "\n religion_Orthodox_2021_Percent=" + religion_Orthodox_2021_Percent +
                "\n religion_Mormon_2021_Percent=" + religion_Mormon_2021_Percent +
                "\n religion_BlackProtestant_2021_Percent=" + religion_BlackProtestant_2021_Percent +
                "\n religion_Jewish_2021_Percent=" + religion_Jewish_2021_Percent +
                "\n religion_Muslim_2021_Percent=" + religion_Muslim_2021_Percent +
                '}';
    }
}
