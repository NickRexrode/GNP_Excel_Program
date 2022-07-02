package data.people;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class PopulationCurrentlyEnrolledInEducation {

    private Integer populationEnrolledInElementarySchool;
    private Integer populationEnrolledInHighSchool;
    private Integer populationEnrolledInPreschool;

    private Double populationEnrolledInElementarySchoolPercent;
    private Double populationEnrolledInHighSchoolPercent;
    private Double populationEnrolledInPreschoolPercent;

    @Override
    public String toString() {
        return "PopulationCurrentlyEnrolledInEducation{" +
                "populationEnrolledInElementarySchool=" + populationEnrolledInElementarySchool +
                ", populationEnrolledInHighSchool=" + populationEnrolledInHighSchool +
                ", populationEnrolledInPreschool=" + populationEnrolledInPreschool +
                ", populationEnrolledInElementarySchoolPercent=" + populationEnrolledInElementarySchoolPercent +
                ", populationEnrolledInHighSchoolPercent=" + populationEnrolledInHighSchoolPercent +
                ", populationEnrolledInPreschoolPercent=" + populationEnrolledInPreschoolPercent +
                '}';
    }

    public PopulationCurrentlyEnrolledInEducation(XSSFSheet sheet) {


        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Population: Currently Enrolled in Education");



        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch(rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Kindergarten/Elementary School":
                    populationEnrolledInElementarySchool = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    populationEnrolledInElementarySchoolPercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "High School":
                    this.populationEnrolledInHighSchool = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.populationEnrolledInHighSchoolPercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");

                    break;
                case "Nursery School/Preschool":
                    this.populationEnrolledInPreschool = readCellRawFromSheetAsInteger(sheet ,rows.get(i).getRowNum(), "B");
                    this.populationEnrolledInPreschoolPercent = readCellRawFromSheetAsDouble(sheet ,rows.get(i).getRowNum(), "C");
                    break;
            }

        }

    }
}
