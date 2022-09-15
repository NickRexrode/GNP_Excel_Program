package data.households;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class HouseHoldsPovertyDetail {
    private Integer abovePovertyLevel_2021;
    private Integer belowPovertyLevelNon_Family_2021;
    private Integer belowPovertyLevelMarried_2021;
    private Integer belowPovertyLevelFemaleHouseholder_2021;
    private Integer belowPovertyLevelMaleHouseholder_2021;
    private Integer belowPovertyLevelNon_FamilyStudent_2021;
    private Double abovePovertyLevel_2021_Percent;
    private Double belowPovertyLevelNon_Family_2021_Percent;
    private Double belowPovertyLevelMarried_2021_Percent;
    private Double belowPovertyLevelFemaleHouseholder_2021_Percent;
    private Double belowPovertyLevelMaleHouseholder_2021_Percent;
    private Double belowPovertyLevelNon_FamilyStudent_2021_Percent;
    public HouseHoldsPovertyDetail(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Households: Poverty Detail");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Above Poverty Level":
                    abovePovertyLevel_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    abovePovertyLevel_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Below Poverty Level: Non-family":
                    belowPovertyLevelNon_Family_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    belowPovertyLevelNon_Family_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Below Poverty Level: Married":
                    belowPovertyLevelMarried_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    belowPovertyLevelMarried_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Below Poverty Level: Female Householder":
                    belowPovertyLevelFemaleHouseholder_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    belowPovertyLevelFemaleHouseholder_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Below Poverty Level: Male Householder":
                    belowPovertyLevelMaleHouseholder_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    belowPovertyLevelMaleHouseholder_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Below Poverty Level: Non-family Student":
                    belowPovertyLevelNon_FamilyStudent_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    belowPovertyLevelNon_FamilyStudent_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
            }

        }
    }

    @Override
    public String toString() {
        return "HouseHoldsPovertyDetail{" +
                "abovePovertyLevel_2021=" + abovePovertyLevel_2021 +
                "\n belowPovertyLevelNon_Family_2021=" + belowPovertyLevelNon_Family_2021 +
                "\n belowPovertyLevelMarried_2021=" + belowPovertyLevelMarried_2021 +
                "\n belowPovertyLevelFemaleHouseholder_2021=" + belowPovertyLevelFemaleHouseholder_2021 +
                "\n belowPovertyLevelMaleHouseholder_2021=" + belowPovertyLevelMaleHouseholder_2021 +
                "\n belowPovertyLevelNon_FamilyStudent_2021=" + belowPovertyLevelNon_FamilyStudent_2021 +
                "\n abovePovertyLevel_2021_Percent=" + abovePovertyLevel_2021_Percent +
                "\n belowPovertyLevelNon_Family_2021_Percent=" + belowPovertyLevelNon_Family_2021_Percent +
                "\n belowPovertyLevelMarried_2021_Percent=" + belowPovertyLevelMarried_2021_Percent +
                "\n belowPovertyLevelFemaleHouseholder_2021_Percent=" + belowPovertyLevelFemaleHouseholder_2021_Percent +
                "\n belowPovertyLevelMaleHouseholder_2021_Percent=" + belowPovertyLevelMaleHouseholder_2021_Percent +
                "\n belowPovertyLevelNon_FamilyStudent_2021_Percent=" + belowPovertyLevelNon_FamilyStudent_2021_Percent +
                '}';
    }
}
