package old.helper;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class SheetHelper {
    private static final Integer SHEET_LENGTH = 500; //fix this
    private static final Integer EXCEL_OFFSET = 1;
    private static final Integer ASCII_OFFSET = 96;
    public static Double readCellFromSheetAsDouble(XSSFSheet sheet, int row, String col) {
        int value = col.toLowerCase().charAt(0);
        char column = (char) (value - ASCII_OFFSET);

        Cell cell = sheet.getRow(row-EXCEL_OFFSET).getCell(column-EXCEL_OFFSET);
        if (cell.getCellTypeEnum().equals(CellType.BLANK)) {
            return 0.0;
        }
        if (cell.getCellTypeEnum().equals(CellType._NONE)) {
            return 0.0;
        }
        if (cell.getCellTypeEnum().equals(CellType.NUMERIC)) {
            return cell.getNumericCellValue();
        }
        if (cell.getCellTypeEnum().equals(CellType.STRING)) {
            return Double.parseDouble(cell.getStringCellValue().replaceAll("%","").replaceAll(",",""));
        }
        return 0.0;

    }

    public static Integer readCellFromSheetAsInteger(XSSFSheet sheet, int row, String col) {
        int value = col.toLowerCase().charAt(0);
        char column = (char) (value - ASCII_OFFSET);

        Cell cell = sheet.getRow(row-EXCEL_OFFSET).getCell(column-EXCEL_OFFSET);
        if (cell.getCellTypeEnum().equals(CellType.BLANK)) {
            return 0;
        }
        if (cell.getCellTypeEnum().equals(CellType._NONE)) {
            return 0;
        }
        if (cell.getCellTypeEnum().equals(CellType.NUMERIC)) {
            return (int) cell.getNumericCellValue();
        }
        if (cell.getCellTypeEnum().equals(CellType.STRING)) {
            return Integer.parseInt(cell.getStringCellValue().replaceAll("%","").replaceAll(",",""));
        }
        return 0;
    }

    public static String readCellFromSheetAsString(XSSFSheet sheet, int row, String col) {
        int value = col.toLowerCase().charAt(0);
        char column = (char) (value - ASCII_OFFSET);
        Cell cell = null;
        try {
            cell =sheet.getRow(row-EXCEL_OFFSET).getCell(column-EXCEL_OFFSET);
        } catch (NullPointerException e) {
            return "";
        }
        if (cell ==  null) {
            return "";
        }

        if (cell.getCellTypeEnum().equals(CellType.BLANK)) {
            return "";
        }
        if (cell.getCellTypeEnum().equals(CellType._NONE)) {
            return "";
        }
        if (cell.getCellTypeEnum().equals(CellType.NUMERIC)) {
            return ""+ cell.getNumericCellValue();
        }
        if (cell.getCellTypeEnum().equals(CellType.STRING)) {
            return cell.getStringCellValue();
        }
        return "";
    }

    public static int getTopLeftHeaderForTable(Sheet sheet, String str) {

        for (int i = 0; i < SHEET_LENGTH; i++) {
            try {
                //System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
                if (sheet.getRow(i).getCell(0).getStringCellValue().equals(str)) {
                    return i+1+1;
                }
            } catch (NullPointerException ignored) {

            }

        }

        return -1;
    }


    public static String parseSheetName(String str) {
        if (str.contains("Unified Districts")) {
            return str.replace("Study Area: Geography: Unified Districts - ", "").replace("School District", "").split(" {2}")[0];
        }
        if (str.contains("States")) {
            //Study Area: Geography: States - Wisconsin (WI)
            return str.replace("Study Area: Geography: States - ", "").split(" ")[0];

        }
        return "Could not parse name";
    }

}
