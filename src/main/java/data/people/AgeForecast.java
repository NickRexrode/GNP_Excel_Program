package data.people;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class AgeForecast {
    private Integer ageForecast_2021_0To4;
    private Integer ageForecast_2021_5To13;
    private Integer ageForecast_2021_14To17;
    private Integer ageForecast_2021_18To21;
    private Integer ageForecast_2021_22To24;
    private Integer ageForecast_2021_25To29;
    private Integer ageForecast_2021_30To34;
    private Integer ageForecast_2021_35To39;
    private Integer ageForecast_2021_40To44;
    private Integer ageForecast_2021_45To49;
    private Integer ageForecast_2021_50To54;
    private Integer ageForecast_2021_55To64;
    private Integer ageForecast_2021_65To74;
    private Integer ageForecast_2021_75To84;
    private Integer ageForecast_2021_85Plus;

    private Integer ageForecast_2026_0To4;
    private Integer ageForecast_2026_5To13;
    private Integer ageForecast_2026_14To17;
    private Integer ageForecast_2026_18To21;
    private Integer ageForecast_2026_22To24;
    private Integer ageForecast_2026_25To29;
    private Integer ageForecast_2026_30To34;
    private Integer ageForecast_2026_35To39;
    private Integer ageForecast_2026_40To44;
    private Integer ageForecast_2026_45To49;
    private Integer ageForecast_2026_50To54;
    private Integer ageForecast_2026_55To64;
    private Integer ageForecast_2026_65To74;
    private Integer ageForecast_2026_75To84;
    private Integer ageForecast_2026_85Plus;

    private Integer ageForecast_2031_0To4;
    private Integer ageForecast_2031_5To13;
    private Integer ageForecast_2031_14To17;
    private Integer ageForecast_2031_18To21;
    private Integer ageForecast_2031_22To24;
    private Integer ageForecast_2031_25To29;
    private Integer ageForecast_2031_30To34;
    private Integer ageForecast_2031_35To39;
    private Integer ageForecast_2031_40To44;
    private Integer ageForecast_2031_45To49;
    private Integer ageForecast_2031_50To54;
    private Integer ageForecast_2031_55To64;
    private Integer ageForecast_2031_65To74;
    private Integer ageForecast_2031_75To84;
    private Integer ageForecast_2031_85Plus;

    private Double ageForecastPercentChange_2021_2026_0To4;
    private Double ageForecastPercentChange_2021_2026_5To13;
    private Double ageForecastPercentChange_2021_2026_14To17;
    private Double ageForecastPercentChange_2021_2026_18To21;
    private Double ageForecastPercentChange_2021_2026_22To24;
    private Double ageForecastPercentChange_2021_2026_25To29;
    private Double ageForecastPercentChange_2021_2026_30To34;
    private Double ageForecastPercentChange_2021_2026_35To39;
    private Double ageForecastPercentChange_2021_2026_40To44;
    private Double ageForecastPercentChange_2021_2026_45To49;
    private Double ageForecastPercentChange_2021_2026_50To54;
    private Double ageForecastPercentChange_2021_2026_55To64;
    private Double ageForecastPercentChange_2021_2026_65To74;
    private Double ageForecastPercentChange_2021_2026_75To84;
    private Double ageForecastPercentChange_2021_2026_85Plus;

    private Double ageForecastPercentChange_2026_2031_0To4;
    private Double ageForecastPercentChange_2026_2031_5To13;
    private Double ageForecastPercentChange_2026_2031_14To17;
    private Double ageForecastPercentChange_2026_2031_18To21;
    private Double ageForecastPercentChange_2026_2031_22To24;
    private Double ageForecastPercentChange_2026_2031_25To29;
    private Double ageForecastPercentChange_2026_2031_30To34;
    private Double ageForecastPercentChange_2026_2031_35To39;
    private Double ageForecastPercentChange_2026_2031_40To44;
    private Double ageForecastPercentChange_2026_2031_45To49;
    private Double ageForecastPercentChange_2026_2031_50To54;
    private Double ageForecastPercentChange_2026_2031_55To64;
    private Double ageForecastPercentChange_2026_2031_65To74;
    private Double ageForecastPercentChange_2026_2031_75To84;
    private Double ageForecastPercentChange_2026_2031_85Plus;
    public AgeForecast(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Age Forecast");


        for (int i = 0; i < rows.size(); i=i+2) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch(rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "0 to 4":
                    this.ageForecast_2021_0To4 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.ageForecast_2026_0To4 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.ageForecast_2031_0To4 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.ageForecastPercentChange_2021_2026_0To4 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    this.ageForecastPercentChange_2026_2031_0To4 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "5  to 13":
                    ageForecast_2021_5To13 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_5To13 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_5To13 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_5To13 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_5To13 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "14  to 17":
                    ageForecast_2021_14To17 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_14To17 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_14To17 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_14To17 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_14To17 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "18  to 21":
                    ageForecast_2021_18To21 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_18To21 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_18To21 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_18To21 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_18To21 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "22  to 24":
                    ageForecast_2021_22To24 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_22To24 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_22To24 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_22To24 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_22To24 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "25  to 29":
                    ageForecast_2021_25To29 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_25To29 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_25To29 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_25To29 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_25To29 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "30  to 34":
                    ageForecast_2021_30To34 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_30To34 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_30To34 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_30To34 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_30To34 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "35  to 39":
                    ageForecast_2021_35To39 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_35To39 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_35To39 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_35To39 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_35To39 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "40  to 44":
                    ageForecast_2021_40To44 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_40To44 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_40To44 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_40To44 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_40To44 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "45  to 49":
                    ageForecast_2021_45To49 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_45To49 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_45To49 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_45To49 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_45To49 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "50  to 54":
                    ageForecast_2021_50To54 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_50To54 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_50To54 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_50To54 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_50To54 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "55  to 64":
                    ageForecast_2021_55To64 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_55To64 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_55To64 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_55To64 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_55To64 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "65  to 74":
                    ageForecast_2021_65To74 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_65To74 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_65To74 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_65To74 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_65To74 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "75  to 84":
                    ageForecast_2021_75To84 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_75To84 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_75To84 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_75To84 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_75To84 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
                case "85plus":
                    ageForecast_2021_85Plus = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    ageForecast_2026_85Plus = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    ageForecast_2031_85Plus = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    ageForecastPercentChange_2021_2026_85Plus = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "C");
                    ageForecastPercentChange_2026_2031_85Plus = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum()+1, "D");
                    break;
            }

        }
    }

    @Override
    public String toString() {
        return "AgeForecast{" +
                "ageForecast_2021_0To4=" + ageForecast_2021_0To4 +
                "\n ageForecast_2021_5To13=" + ageForecast_2021_5To13 +
                "\n ageForecast_2021_14To17=" + ageForecast_2021_14To17 +
                "\n ageForecast_2021_18To21=" + ageForecast_2021_18To21 +
                "\n ageForecast_2021_22To24=" + ageForecast_2021_22To24 +
                "\n ageForecast_2021_25To29=" + ageForecast_2021_25To29 +
                "\n ageForecast_2021_30To34=" + ageForecast_2021_30To34 +
                "\n ageForecast_2021_35To39=" + ageForecast_2021_35To39 +
                "\n ageForecast_2021_40To44=" + ageForecast_2021_40To44 +
                "\n ageForecast_2021_45To49=" + ageForecast_2021_45To49 +
                "\n ageForecast_2021_50To54=" + ageForecast_2021_50To54 +
                "\n ageForecast_2021_55To64=" + ageForecast_2021_55To64 +
                "\n ageForecast_2021_65To74=" + ageForecast_2021_65To74 +
                "\n ageForecast_2021_75To84=" + ageForecast_2021_75To84 +
                "\n ageForecast_2021_85Plus=" + ageForecast_2021_85Plus +
                "\n ageForecast_2026_0To4=" + ageForecast_2026_0To4 +
                "\n ageForecast_2026_5To13=" + ageForecast_2026_5To13 +
                "\n ageForecast_2026_14To17=" + ageForecast_2026_14To17 +
                "\n ageForecast_2026_18To21=" + ageForecast_2026_18To21 +
                "\n ageForecast_2026_22To24=" + ageForecast_2026_22To24 +
                "\n ageForecast_2026_25To29=" + ageForecast_2026_25To29 +
                "\n ageForecast_2026_30To34=" + ageForecast_2026_30To34 +
                "\n ageForecast_2026_35To39=" + ageForecast_2026_35To39 +
                "\n ageForecast_2026_40To44=" + ageForecast_2026_40To44 +
                "\n ageForecast_2026_45To49=" + ageForecast_2026_45To49 +
                "\n ageForecast_2026_50To54=" + ageForecast_2026_50To54 +
                "\n ageForecast_2026_55To64=" + ageForecast_2026_55To64 +
                "\n ageForecast_2026_65To74=" + ageForecast_2026_65To74 +
                "\n ageForecast_2026_75To84=" + ageForecast_2026_75To84 +
                "\n ageForecast_2026_85Plus=" + ageForecast_2026_85Plus +
                "\n ageForecast_2031_0To4=" + ageForecast_2031_0To4 +
                "\n ageForecast_2031_5To13=" + ageForecast_2031_5To13 +
                "\n ageForecast_2031_14To17=" + ageForecast_2031_14To17 +
                "\n ageForecast_2031_18To21=" + ageForecast_2031_18To21 +
                "\n ageForecast_2031_22To24=" + ageForecast_2031_22To24 +
                "\n ageForecast_2031_25To29=" + ageForecast_2031_25To29 +
                "\n ageForecast_2031_30To34=" + ageForecast_2031_30To34 +
                "\n ageForecast_2031_35To39=" + ageForecast_2031_35To39 +
                "\n ageForecast_2031_40To44=" + ageForecast_2031_40To44 +
                "\n ageForecast_2031_45To49=" + ageForecast_2031_45To49 +
                "\n ageForecast_2031_50To54=" + ageForecast_2031_50To54 +
                "\n ageForecast_2031_55To64=" + ageForecast_2031_55To64 +
                "\n ageForecast_2031_65To74=" + ageForecast_2031_65To74 +
                "\n ageForecast_2031_75To84=" + ageForecast_2031_75To84 +
                "\n ageForecast_2031_85Plus=" + ageForecast_2031_85Plus +
                "\n ageForecastPercentChange_2021_2026_0To4=" + ageForecastPercentChange_2021_2026_0To4 +
                "\n ageForecastPercentChange_2021_2026_5To13=" + ageForecastPercentChange_2021_2026_5To13 +
                "\n ageForecastPercentChange_2021_2026_14To17=" + ageForecastPercentChange_2021_2026_14To17 +
                "\n ageForecastPercentChange_2021_2026_18To21=" + ageForecastPercentChange_2021_2026_18To21 +
                "\n ageForecastPercentChange_2021_2026_22To24=" + ageForecastPercentChange_2021_2026_22To24 +
                "\n ageForecastPercentChange_2021_2026_25To29=" + ageForecastPercentChange_2021_2026_25To29 +
                "\n ageForecastPercentChange_2021_2026_30To34=" + ageForecastPercentChange_2021_2026_30To34 +
                "\n ageForecastPercentChange_2021_2026_35To39=" + ageForecastPercentChange_2021_2026_35To39 +
                "\n ageForecastPercentChange_2021_2026_40To44=" + ageForecastPercentChange_2021_2026_40To44 +
                "\n ageForecastPercentChange_2021_2026_45To49=" + ageForecastPercentChange_2021_2026_45To49 +
                "\n ageForecastPercentChange_2021_2026_50To54=" + ageForecastPercentChange_2021_2026_50To54 +
                "\n ageForecastPercentChange_2021_2026_55To64=" + ageForecastPercentChange_2021_2026_55To64 +
                "\n ageForecastPercentChange_2021_2026_65To74=" + ageForecastPercentChange_2021_2026_65To74 +
                "\n ageForecastPercentChange_2021_2026_75To84=" + ageForecastPercentChange_2021_2026_75To84 +
                "\n ageForecastPercentChange_2021_2026_85Plus=" + ageForecastPercentChange_2021_2026_85Plus +
                "\n ageForecastPercentChange_2026_2031_0To4=" + ageForecastPercentChange_2026_2031_0To4 +
                "\n ageForecastPercentChange_2026_2031_5To13=" + ageForecastPercentChange_2026_2031_5To13 +
                "\n ageForecastPercentChange_2026_2031_14To17=" + ageForecastPercentChange_2026_2031_14To17 +
                "\n ageForecastPercentChange_2026_2031_18To21=" + ageForecastPercentChange_2026_2031_18To21 +
                "\n ageForecastPercentChange_2026_2031_22To24=" + ageForecastPercentChange_2026_2031_22To24 +
                "\n ageForecastPercentChange_2026_2031_25To29=" + ageForecastPercentChange_2026_2031_25To29 +
                "\n ageForecastPercentChange_2026_2031_30To34=" + ageForecastPercentChange_2026_2031_30To34 +
                "\n ageForecastPercentChange_2026_2031_35To39=" + ageForecastPercentChange_2026_2031_35To39 +
                "\n ageForecastPercentChange_2026_2031_40To44=" + ageForecastPercentChange_2026_2031_40To44 +
                "\n ageForecastPercentChange_2026_2031_45To49=" + ageForecastPercentChange_2026_2031_45To49 +
                "\n ageForecastPercentChange_2026_2031_50To54=" + ageForecastPercentChange_2026_2031_50To54 +
                "\n ageForecastPercentChange_2026_2031_55To64=" + ageForecastPercentChange_2026_2031_55To64 +
                "\n ageForecastPercentChange_2026_2031_65To74=" + ageForecastPercentChange_2026_2031_65To74 +
                "\n ageForecastPercentChange_2026_2031_75To84=" + ageForecastPercentChange_2026_2031_75To84 +
                "\n ageForecastPercentChange_2026_2031_85Plus=" + ageForecastPercentChange_2026_2031_85Plus +
                '}';
    }
}
