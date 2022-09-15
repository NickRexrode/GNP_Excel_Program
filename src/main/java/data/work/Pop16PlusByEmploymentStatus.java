package data.work;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class Pop16PlusByEmploymentStatus {

    private Integer inLaborForceCivilianEmployed_2021;
    private Integer notInLaborForce_2021;
    private Integer inLaborForceCivilianUnemployed_2021;
    private Integer inLaborForceInArmedForces_2021;
    private Double inLaborForceCivilianEmployed_2021_Percent;
    private Double notInLaborForce_2021_Percent;
    private Double inLaborForceCivilianUnemployed_2021_Percent;
    private Double inLaborForceInArmedForces_2021_Percent;

    public Pop16PlusByEmploymentStatus(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Pop 16+ by Employment Status");


        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch (rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "In labor force: Civilian: Employed":
                    inLaborForceCivilianEmployed_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    inLaborForceCivilianEmployed_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Not in labor force":
                    notInLaborForce_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    notInLaborForce_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "In labor force: Civilian: Unemployed":
                    inLaborForceCivilianUnemployed_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    inLaborForceCivilianUnemployed_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "In labor force: In Armed Forces":
                    inLaborForceInArmedForces_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    inLaborForceInArmedForces_2021_Percent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
            }

        }
    }


    @Override
    public String toString() {
        return "Pop16PlusByEmploymentStatus{" +
                "inLaborForceCivilianEmployed_2021=" + inLaborForceCivilianEmployed_2021 +
                "\n notInLaborForce_2021=" + notInLaborForce_2021 +
                "\n inLaborForceCivilianUnemployed_2021=" + inLaborForceCivilianUnemployed_2021 +
                "\n inLaborForceInArmedForces_2021=" + inLaborForceInArmedForces_2021 +
                "\n inLaborForceCivilianEmployed_2021_Percent=" + inLaborForceCivilianEmployed_2021_Percent +
                "\n notInLaborForce_2021_Percent=" + notInLaborForce_2021_Percent +
                "\n inLaborForceCivilianUnemployed_2021_Percent=" + inLaborForceCivilianUnemployed_2021_Percent +
                "\n inLaborForceInArmedForces_2021_Percent=" + inLaborForceInArmedForces_2021_Percent +
                '}';
    }
}
