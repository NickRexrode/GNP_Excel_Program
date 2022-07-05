package data.families;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class FamiliesNoChildren {
    private Integer familyMarriedCouple_NoChildren_2010;
    private Integer familyMarriedCouple_NoChildren_2021;
    private Integer familyMarriedCouple_NoChildren_2026;
    private Integer otherFamilyFemaleNoHusbandPresent_NoChildren_2010;
    private Integer otherFamilyFemaleNoHusbandPresent_NoChildren_2021;
    private Integer otherFamilyFemaleNoHusbandPresent_NoChildren_2026;
    private Integer otherFamilyMaleNoFemalePresent_NoChildren_2010;
    private Integer otherFamilyMaleNoFemalePresent_NoChildren_2021;
    private Integer otherFamilyMaleNoFemalePresent_NoChildren_2026;
    private Double familyMarriedCouple_NoChildren_Percent_2010;
    private Double familyMarriedCouple_NoChildren_Percent_2021;
    private Double familyMarriedCouple_NoChildren_Percent_2026;
    private Double otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2010;
    private Double otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2021;
    private Double otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2026;
    private Double otherFamilyMaleNoFemalePresent_NoChildren_Percent_2010;
    private Double otherFamilyMaleNoFemalePresent_NoChildren_Percent_2021;
    private Double otherFamilyMaleNoFemalePresent_NoChildren_Percent_2026;

    public FamiliesNoChildren(XSSFSheet sheet) {

        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Families: No Children");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Family: Married-couple":
                    familyMarriedCouple_NoChildren_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    otherFamilyFemaleNoHusbandPresent_NoChildren_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    otherFamilyMaleNoFemalePresent_NoChildren_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    familyMarriedCouple_NoChildren_Percent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    otherFamilyMaleNoFemalePresent_NoChildren_Percent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Other Family: Female no husband present":
                    familyMarriedCouple_NoChildren_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    otherFamilyFemaleNoHusbandPresent_NoChildren_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    otherFamilyMaleNoFemalePresent_NoChildren_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    familyMarriedCouple_NoChildren_Percent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    otherFamilyMaleNoFemalePresent_NoChildren_Percent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Other Family: Male no wife present":
                    familyMarriedCouple_NoChildren_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    otherFamilyFemaleNoHusbandPresent_NoChildren_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    otherFamilyMaleNoFemalePresent_NoChildren_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    familyMarriedCouple_NoChildren_Percent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    otherFamilyMaleNoFemalePresent_NoChildren_Percent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
            }

        }

    }

    @Override
    public String toString() {
        return "FamiliesNoChildren{" +
                "familyMarriedCouple_NoChildren_2010=" + familyMarriedCouple_NoChildren_2010 +
                "\n familyMarriedCouple_NoChildren_2021=" + familyMarriedCouple_NoChildren_2021 +
                "\n familyMarriedCouple_NoChildren_2026=" + familyMarriedCouple_NoChildren_2026 +
                "\n otherFamilyFemaleNoHusbandPresent_NoChildren_2010=" + otherFamilyFemaleNoHusbandPresent_NoChildren_2010 +
                "\n otherFamilyFemaleNoHusbandPresent_NoChildren_2021=" + otherFamilyFemaleNoHusbandPresent_NoChildren_2021 +
                "\n otherFamilyFemaleNoHusbandPresent_NoChildren_2026=" + otherFamilyFemaleNoHusbandPresent_NoChildren_2026 +
                "\n otherFamilyMaleNoFemalePresent_NoChildren_2010=" + otherFamilyMaleNoFemalePresent_NoChildren_2010 +
                "\n otherFamilyMaleNoFemalePresent_NoChildren_2021=" + otherFamilyMaleNoFemalePresent_NoChildren_2021 +
                "\n otherFamilyMaleNoFemalePresent_NoChildren_2026=" + otherFamilyMaleNoFemalePresent_NoChildren_2026 +
                "\n familyMarriedCouple_NoChildren_Percent_2010=" + familyMarriedCouple_NoChildren_Percent_2010 +
                "\n familyMarriedCouple_NoChildren_Percent_2021=" + familyMarriedCouple_NoChildren_Percent_2021 +
                "\n familyMarriedCouple_NoChildren_Percent_2026=" + familyMarriedCouple_NoChildren_Percent_2026 +
                "\n otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2010=" + otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2010 +
                "\n otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2021=" + otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2021 +
                "\n otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2026=" + otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2026 +
                "\n otherFamilyMaleNoFemalePresent_NoChildren_Percent_2010=" + otherFamilyMaleNoFemalePresent_NoChildren_Percent_2010 +
                "\n otherFamilyMaleNoFemalePresent_NoChildren_Percent_2021=" + otherFamilyMaleNoFemalePresent_NoChildren_Percent_2021 +
                "\n otherFamilyMaleNoFemalePresent_NoChildren_Percent_2026=" + otherFamilyMaleNoFemalePresent_NoChildren_Percent_2026 +
                '}';
    }
}
