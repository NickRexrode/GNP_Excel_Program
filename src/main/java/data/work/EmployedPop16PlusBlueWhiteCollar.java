package data.work;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class EmployedPop16PlusBlueWhiteCollar {
    private Integer employmentBlueCollar_2021;
    private Integer employmentWhiteCollar_2021;
    private Double employmentBlueCollar_2021_Percent;
    private Double employmentWhiteCollar_2021_Percent;

    public EmployedPop16PlusBlueWhiteCollar(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Employed Pop 16+ Blue/White Collar");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "White Collar":
                    employmentWhiteCollar_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    employmentWhiteCollar_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Blue Collar":
                    employmentBlueCollar_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    employmentBlueCollar_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
            }

        }
    }


    @Override
    public String toString() {
        return "EmployedPop16PlusBlueWhiteCollar{" +
                "employmentBlueCollar_2021=" + employmentBlueCollar_2021 +
                "\n employmentWhiteCollar_2021=" + employmentWhiteCollar_2021 +
                "\n employmentBlueCollar_2021_Percent=" + employmentBlueCollar_2021_Percent +
                "\n employmentWhiteCollar_2021_Percent=" + employmentWhiteCollar_2021_Percent +
                '}';
    }
}
