package data.overview;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class SummaryFamiliesInPoverty {

    private Integer familiesAbovePovertyLevel_2021;
    private Integer familiesBelowPovertyLevel_2021;
    private Double familiesAbovePovertyLevel_2021_Percent;
    private Double familiesBelowPovertyLevel_2021_Percent;

    public SummaryFamiliesInPoverty(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Summary: Families in Poverty");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Above poverty level":
                    familiesAbovePovertyLevel_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    familiesAbovePovertyLevel_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Below poverty level":
                    familiesBelowPovertyLevel_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    familiesBelowPovertyLevel_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
            }

        }

    }


    @Override
    public String toString() {
        return "SummaryFamiliesInPoverty{" +
                "familiesAbovePovertyLevel_2021=" + familiesAbovePovertyLevel_2021 +
                "\n familiesBelowPovertyLevel_2021=" + familiesBelowPovertyLevel_2021 +
                "\n familiesAbovePovertyLevel_2021_Percent=" + familiesAbovePovertyLevel_2021_Percent +
                "\n familiesBelowPovertyLevel_2021_Percent=" + familiesBelowPovertyLevel_2021_Percent +
                '}';
    }
}
