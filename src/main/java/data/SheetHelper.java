package data;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class SheetHelper {
    private static final Integer EXCEL_OFFSET = 1;
    private static final Integer ASCII_OFFSET = 96;
    public static Double readCellFromSheet(XSSFSheet sheet, int row, String col) {
        int value = col.toLowerCase().charAt(0);
        char column = (char) (value - ASCII_OFFSET);

        return Double.parseDouble(sheet.getRow(row-EXCEL_OFFSET).getCell(column-EXCEL_OFFSET).getStringCellValue().replaceAll("%","").replaceAll(",",""));

    }

}
