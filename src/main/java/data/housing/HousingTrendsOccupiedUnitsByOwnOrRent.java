package data.housing;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class HousingTrendsOccupiedUnitsByOwnOrRent {
    
    private Integer housingOwnerOccupied_2010;
    private Integer housingOwnerOccupied_2021;
    private Integer housingOwnerOccupied_2026;
    private Integer housingRenterOccupied_2010;
    private Integer housingRenterOccupied_2021;
    private Integer housingRenterOccupied_2026;
    private Double housingOwnerOccupied_2010_Percent;
    private Double housingOwnerOccupied_2021_Percent;
    private Double housingOwnerOccupied_2026_Percent;
    private Double housingRenterOccupied_2010_Percent;
    private Double housingRenterOccupied_2021_Percent;
    private Double housingRenterOccupied_2026_Percent;
    private Double housingOwnerOccupied_2010_2021_Percent_Change;
    private Double housingOwnerOccupied_2021_2026_Percent_Change;
    private Double housingRenterOccupied_2010_2021_Percent_Change;
    private Double housingRenterOccupied_2021_2026_Percent_Change;
    
    
    public HousingTrendsOccupiedUnitsByOwnOrRent(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Housing Trends: Occupied Units by Own or Rent");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Owner Occupied":
                    housingOwnerOccupied_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingOwnerOccupied_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    housingOwnerOccupied_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    housingOwnerOccupied_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    housingOwnerOccupied_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    housingOwnerOccupied_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    housingOwnerOccupied_2010_2021_Percent_Change = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "C");
                    housingOwnerOccupied_2021_2026_Percent_Change = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "D");
                    break;

                case "Renter Occupied":
                    housingRenterOccupied_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    housingRenterOccupied_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    housingRenterOccupied_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    housingRenterOccupied_2010_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    housingRenterOccupied_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    housingRenterOccupied_2026_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    housingRenterOccupied_2010_2021_Percent_Change = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "C");
                    housingRenterOccupied_2021_2026_Percent_Change = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum() +1, "D");
                    break;

            }

        }
    }

    @Override
    public String toString() {
        return "HousingTrendsOccupiedUnitsByOwnOrRent{" +
                "housingOwnerOccupied_2010=" + housingOwnerOccupied_2010 +
                "\n housingOwnerOccupied_2021=" + housingOwnerOccupied_2021 +
                "\n housingOwnerOccupied_2026=" + housingOwnerOccupied_2026 +
                "\n housingRenterOccupied_2010=" + housingRenterOccupied_2010 +
                "\n housingRenterOccupied_2021=" + housingRenterOccupied_2021 +
                "\n housingRenterOccupied_2026=" + housingRenterOccupied_2026 +
                "\n housingOwnerOccupied_2010_Percent=" + housingOwnerOccupied_2010_Percent +
                "\n housingOwnerOccupied_2021_Percent=" + housingOwnerOccupied_2021_Percent +
                "\n housingOwnerOccupied_2026_Percent=" + housingOwnerOccupied_2026_Percent +
                "\n housingRenterOccupied_2010_Percent=" + housingRenterOccupied_2010_Percent +
                "\n housingRenterOccupied_2021_Percent=" + housingRenterOccupied_2021_Percent +
                "\n housingRenterOccupied_2026_Percent=" + housingRenterOccupied_2026_Percent +
                "\n housingOwnerOccupied_2010_2021_Percent_Change=" + housingOwnerOccupied_2010_2021_Percent_Change +
                "\n housingOwnerOccupied_2021_2026_Percent_Change=" + housingOwnerOccupied_2021_2026_Percent_Change +
                "\n housingRenterOccupied_2010_2021_Percent_Change=" + housingRenterOccupied_2010_2021_Percent_Change +
                "\n housingRenterOccupied_2021_2026_Percent_Change=" + housingRenterOccupied_2021_2026_Percent_Change +
                '}';
    }
}
