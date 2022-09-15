package data.housing;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class HousingUnitsByOccupancy {
    private Integer housingUnitsOccupied_2010;
    private Integer housingUnitsOccupied_2021;
    private Integer housingUnitsOccupied_2026;
    private Integer housingUnitsVacant_2010;
    private Integer housingUnitsVacant_2021;
    private Integer housingUnitsVacant_2026;
    private Double housingUnitsOccupied_2010_Percent;
    private Double housingUnitsOccupied_2021_Percent;
    private Double housingUnitsOccupied_2026_Percent;
    private Double housingUnitsVacant_2010_Percent;
    private Double housingUnitsVacant_2021_Percent;
    private Double housingUnitsVacant_2026_Percent;

    public HousingUnitsByOccupancy(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Housing Units by Occupancy");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Occupied":
                    housingUnitsOccupied_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingUnitsOccupied_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    housingUnitsOccupied_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    housingUnitsOccupied_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    housingUnitsOccupied_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    housingUnitsOccupied_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Vacant":
                    housingUnitsVacant_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingUnitsVacant_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    housingUnitsVacant_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    housingUnitsVacant_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    housingUnitsVacant_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    housingUnitsVacant_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
            }

        }
    }


    @Override
    public String toString() {
        return "HousingUnitsByOccupancy{" +
                "housingUnitsOccupied_2010=" + housingUnitsOccupied_2010 +
                "\n housingUnitsOccupied_2021=" + housingUnitsOccupied_2021 +
                "\n housingUnitsOccupied_2026=" + housingUnitsOccupied_2026 +
                "\n housingUnitsVacant_2010=" + housingUnitsVacant_2010 +
                "\n housingUnitsVacant_2021=" + housingUnitsVacant_2021 +
                "\n housingUnitsVacant_2026=" + housingUnitsVacant_2026 +
                "\n housingUnitsOccupied_2010_Percent=" + housingUnitsOccupied_2010_Percent +
                "\n housingUnitsOccupied_2021_Percent=" + housingUnitsOccupied_2021_Percent +
                "\n housingUnitsOccupied_2026_Percent=" + housingUnitsOccupied_2026_Percent +
                "\n housingUnitsVacant_2010_Percent=" + housingUnitsVacant_2010_Percent +
                "\n housingUnitsVacant_2021_Percent=" + housingUnitsVacant_2021_Percent +
                "\n housingUnitsVacant_2026_Percent=" + housingUnitsVacant_2026_Percent +
                '}';
    }
}
