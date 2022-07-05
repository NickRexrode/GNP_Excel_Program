package data.families;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class FamiliesWithChildren {
    private Integer familyMarriedCouple_WithChildren_2010;
    private Integer familyMarriedCouple_WithChildren_2021;
    private Integer familyMarriedCouple_WithChildren_2026;
    private Integer otherFamilyFemaleNoHusbandPresent_WithChildren_2010;
    private Integer otherFamilyFemaleNoHusbandPresent_WithChildren_2021;
    private Integer otherFamilyFemaleNoHusbandPresent_WithChildren_2026;
    private Integer otherFamilyMaleNoFemalePresent_WithChildren_2010;
    private Integer otherFamilyMaleNoFemalePresent_WithChildren_2021;
    private Integer otherFamilyMaleNoFemalePresent_WithChildren_2026;
    private Double familyMarriedCouple_WithChildren_Percent_2010;
    private Double familyMarriedCouple_WithChildren_Percent_2021;
    private Double familyMarriedCouple_WithChildren_Percent_2026;
    private Double otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2010;
    private Double otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2021;
    private Double otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2026;
    private Double otherFamilyMaleNoFemalePresent_WithChildren_Percent_2010;
    private Double otherFamilyMaleNoFemalePresent_WithChildren_Percent_2021;
    private Double otherFamilyMaleNoFemalePresent_WithChildren_Percent_2026;


    public FamiliesWithChildren(XSSFSheet sheet) {

        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Families: With Children");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Family: Married-couple":
                    familyMarriedCouple_WithChildren_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    otherFamilyFemaleNoHusbandPresent_WithChildren_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    otherFamilyMaleNoFemalePresent_WithChildren_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    familyMarriedCouple_WithChildren_Percent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    otherFamilyMaleNoFemalePresent_WithChildren_Percent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Other Family: Female no husband present":
                    familyMarriedCouple_WithChildren_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    otherFamilyFemaleNoHusbandPresent_WithChildren_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    otherFamilyMaleNoFemalePresent_WithChildren_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    familyMarriedCouple_WithChildren_Percent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    otherFamilyMaleNoFemalePresent_WithChildren_Percent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Other Family: Male no wife present":
                    familyMarriedCouple_WithChildren_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    otherFamilyFemaleNoHusbandPresent_WithChildren_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    otherFamilyMaleNoFemalePresent_WithChildren_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    familyMarriedCouple_WithChildren_Percent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    otherFamilyMaleNoFemalePresent_WithChildren_Percent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
            }

        }


    }

    @Override
    public String toString() {
        return "FamiliesWithChildren{" +
                "familyMarriedCouple_WithChildren_2010=" + familyMarriedCouple_WithChildren_2010 +
                "\n familyMarriedCouple_WithChildren_2021=" + familyMarriedCouple_WithChildren_2021 +
                "\n familyMarriedCouple_WithChildren_2026=" + familyMarriedCouple_WithChildren_2026 +
                "\n otherFamilyFemaleNoHusbandPresent_WithChildren_2010=" + otherFamilyFemaleNoHusbandPresent_WithChildren_2010 +
                "\n otherFamilyFemaleNoHusbandPresent_WithChildren_2021=" + otherFamilyFemaleNoHusbandPresent_WithChildren_2021 +
                "\n otherFamilyFemaleNoHusbandPresent_WithChildren_2026=" + otherFamilyFemaleNoHusbandPresent_WithChildren_2026 +
                "\n otherFamilyMaleNoFemalePresent_WithChildren_2010=" + otherFamilyMaleNoFemalePresent_WithChildren_2010 +
                "\n otherFamilyMaleNoFemalePresent_WithChildren_2021=" + otherFamilyMaleNoFemalePresent_WithChildren_2021 +
                "\n otherFamilyMaleNoFemalePresent_WithChildren_2026=" + otherFamilyMaleNoFemalePresent_WithChildren_2026 +
                "\n familyMarriedCouple_WithChildren_Percent_2010=" + familyMarriedCouple_WithChildren_Percent_2010 +
                "\n familyMarriedCouple_WithChildren_Percent_2021=" + familyMarriedCouple_WithChildren_Percent_2021 +
                "\n familyMarriedCouple_WithChildren_Percent_2026=" + familyMarriedCouple_WithChildren_Percent_2026 +
                "\n otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2010=" + otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2010 +
                "\n otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2021=" + otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2021 +
                "\n otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2026=" + otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2026 +
                "\n otherFamilyMaleNoFemalePresent_WithChildren_Percent_2010=" + otherFamilyMaleNoFemalePresent_WithChildren_Percent_2010 +
                "\n otherFamilyMaleNoFemalePresent_WithChildren_Percent_2021=" + otherFamilyMaleNoFemalePresent_WithChildren_Percent_2021 +
                "\n otherFamilyMaleNoFemalePresent_WithChildren_Percent_2026=" + otherFamilyMaleNoFemalePresent_WithChildren_Percent_2026 +
                '}';
    }
}
