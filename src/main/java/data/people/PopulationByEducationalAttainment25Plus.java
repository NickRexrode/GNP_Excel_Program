package data.people;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class PopulationByEducationalAttainment25Plus {

    private Integer populationAttainmentLessThan9th_2010;
    private Integer populationAttainmentLessThan9th_2021;
    private Integer populationAttainmentLessThan9th_2026;

    private Integer populationAttainmentSomeHighSchool_2010;
    private Integer populationAttainmentSomeHighSchool_2021;
    private Integer populationAttainmentSomeHighSchool_2026;

    private Integer populationAttainmentHighSchoolGraduate_2010;
    private Integer populationAttainmentHighSchoolGraduate_2021;
    private Integer populationAttainmentHighSchoolGraduate_2026;

    private Integer populationAttainmentSomeCollege_2010;
    private Integer populationAttainmentSomeCollege_2021;
    private Integer populationAttainmentSomeCollege_2026;

    private Integer populationAttainmentAssociatesDegree_2010;
    private Integer populationAttainmentAssociatesDegree_2021;
    private Integer populationAttainmentAssociatesDegree_2026;

    private Integer populationAttainmentBachelorsDegree_2010;
    private Integer populationAttainmentBachelorsDegree_2021;
    private Integer populationAttainmentBachelorsDegree_2026;

    private Integer populationAttainmentGraduateOrProfessional_2010;
    private Integer populationAttainmentGraduateOrProfessional_2021;
    private Integer populationAttainmentGraduateOrProfessional_2026;

    private Double populationAttainmentLessThan9thPercent_2010;
    private Double populationAttainmentLessThan9thPercent_2021;
    private Double populationAttainmentLessThan9thPercent_2026;

    private Double populationAttainmentSomeHighSchoolPercent_2010;
    private Double populationAttainmentSomeHighSchoolPercent_2021;
    private Double populationAttainmentSomeHighSchoolPercent_2026;

    private Double populationAttainmentHighSchoolGraduatePercent_2010;
    private Double populationAttainmentHighSchoolGraduatePercent_2021;
    private Double populationAttainmentHighSchoolGraduatePercent_2026;

    private Double populationAttainmentSomeCollegePercent_2010;
    private Double populationAttainmentSomeCollegePercent_2021;
    private Double populationAttainmentSomeCollegePercent_2026;

    private Double populationAttainmentAssociatesDegreePercent_2010;
    private Double populationAttainmentAssociatesDegreePercent_2021;
    private Double populationAttainmentAssociatesDegreePercent_2026;

    private Double populationAttainmentBachelorsDegreePercent_2010;
    private Double populationAttainmentBachelorsDegreePercent_2021;
    private Double populationAttainmentBachelorsDegreePercent_2026;

    private Double populationAttainmentGraduateOrProfessionalPercent_2010;
    private Double populationAttainmentGraduateOrProfessionalPercent_2021;
    private Double populationAttainmentGraduateOrProfessionalPercent_2026;

    public PopulationByEducationalAttainment25Plus(XSSFSheet sheet) {


        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Population by Educational Attainment: 25+ ");

        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch(rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Less than 9th Grade":
                    this.populationAttainmentLessThan9th_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.populationAttainmentLessThan9th_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationAttainmentLessThan9th_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.populationAttainmentLessThan9thPercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    this.populationAttainmentLessThan9thPercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    this.populationAttainmentLessThan9thPercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Some High School, No diploma":
                    this.populationAttainmentSomeHighSchool_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.populationAttainmentSomeHighSchool_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationAttainmentSomeHighSchool_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");

                    this.populationAttainmentSomeHighSchoolPercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    this.populationAttainmentSomeHighSchoolPercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    this.populationAttainmentSomeHighSchoolPercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "High School Graduate (or GED)":
                    this.populationAttainmentHighSchoolGraduate_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.populationAttainmentHighSchoolGraduate_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationAttainmentHighSchoolGraduate_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.populationAttainmentHighSchoolGraduatePercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    this.populationAttainmentHighSchoolGraduatePercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    this.populationAttainmentHighSchoolGraduatePercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Some College, No degree":
                    this.populationAttainmentSomeCollege_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.populationAttainmentSomeCollege_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationAttainmentSomeCollege_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.populationAttainmentSomeCollegePercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    this.populationAttainmentSomeCollegePercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    this.populationAttainmentSomeCollegePercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Associate Degree":
                    this.populationAttainmentAssociatesDegree_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.populationAttainmentAssociatesDegree_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationAttainmentAssociatesDegree_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.populationAttainmentAssociatesDegreePercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    this.populationAttainmentAssociatesDegreePercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    this.populationAttainmentAssociatesDegreePercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;
                case "Bachelor's Degree":
                    this.populationAttainmentBachelorsDegree_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.populationAttainmentBachelorsDegree_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationAttainmentBachelorsDegree_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.populationAttainmentBachelorsDegreePercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    this.populationAttainmentBachelorsDegreePercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    this.populationAttainmentBachelorsDegreePercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;

                case "Graduate or Professional school degree":

                    this.populationAttainmentGraduateOrProfessional_2010 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.populationAttainmentGraduateOrProfessional_2021 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "C");
                    this.populationAttainmentGraduateOrProfessional_2026 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "D");
                    this.populationAttainmentGraduateOrProfessionalPercent_2010 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "E");
                    this.populationAttainmentGraduateOrProfessionalPercent_2021 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "F");
                    this.populationAttainmentGraduateOrProfessionalPercent_2026 = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "G");
                    break;

            }

        }


    }

    @Override
    public String toString() {
        return "PopulationByEducationalAttainment25Plus{" +
                "populationAttainmentLessThan9th_2010=" + populationAttainmentLessThan9th_2010 +
                "\npopulationAttainmentLessThan9th_2021=" + populationAttainmentLessThan9th_2021 +
                "\npopulationAttainmentLessThan9th_2026=" + populationAttainmentLessThan9th_2026 +
                "\npopulationAttainmentSomeHighSchool_2010=" + populationAttainmentSomeHighSchool_2010 +
                "\npopulationAttainmentSomeHighSchool_2021=" + populationAttainmentSomeHighSchool_2021 +
                "\npopulationAttainmentSomeHighSchool_2026=" + populationAttainmentSomeHighSchool_2026 +
                "\npopulationAttainmentHighSchoolGraduate_2010=" + populationAttainmentHighSchoolGraduate_2010 +
                "\npopulationAttainmentHighSchoolGraduate_2021=" + populationAttainmentHighSchoolGraduate_2021 +
                "\npopulationAttainmentHighSchoolGraduate_2026=" + populationAttainmentHighSchoolGraduate_2026 +
                "\npopulationAttainmentSomeCollege_2010=" + populationAttainmentSomeCollege_2010 +
                "\npopulationAttainmentSomeCollege_2021=" + populationAttainmentSomeCollege_2021 +
                "\npopulationAttainmentSomeCollege_2026=" + populationAttainmentSomeCollege_2026 +
                "\npopulationAttainmentAssociatesDegree_2010=" + populationAttainmentAssociatesDegree_2010 +
                "\npopulationAttainmentAssociatesDegree_2021=" + populationAttainmentAssociatesDegree_2021 +
                "\npopulationAttainmentAssociatesDegree_2026=" + populationAttainmentAssociatesDegree_2026 +
                "\npopulationAttainmentBachelorsDegree_2010=" + populationAttainmentBachelorsDegree_2010 +
                "\npopulationAttainmentBachelorsDegree_2021=" + populationAttainmentBachelorsDegree_2021 +
                "\npopulationAttainmentBachelorsDegree_2026=" + populationAttainmentBachelorsDegree_2026 +
                "\npopulationAttainmentGraduateOrProfessional_2010=" + populationAttainmentGraduateOrProfessional_2010 +
                "\npopulationAttainmentGraduateOrProfessional_2021=" + populationAttainmentGraduateOrProfessional_2021 +
                "\npopulationAttainmentGraduateOrProfessional_2026=" + populationAttainmentGraduateOrProfessional_2026 +
                "\npopulationAttainmentLessThan9thPercent_2010=" + populationAttainmentLessThan9thPercent_2010 +
                "\npopulationAttainmentLessThan9thPercent_2021=" + populationAttainmentLessThan9thPercent_2021 +
                "\npopulationAttainmentLessThan9thPercent_2026=" + populationAttainmentLessThan9thPercent_2026 +
                "\npopulationAttainmentSomeHighSchoolPercent_2010=" + populationAttainmentSomeHighSchoolPercent_2010 +
                "\npopulationAttainmentSomeHighSchoolPercent_2021=" + populationAttainmentSomeHighSchoolPercent_2021 +
                "\npopulationAttainmentSomeHighSchoolPercent_2026=" + populationAttainmentSomeHighSchoolPercent_2026 +
                "\npopulationAttainmentHighSchoolGraduatePercent_2010=" + populationAttainmentHighSchoolGraduatePercent_2010 +
                "\npopulationAttainmentHighSchoolGraduatePercent_2021=" + populationAttainmentHighSchoolGraduatePercent_2021 +
                "\npopulationAttainmentHighSchoolGraduatePercent_2026=" + populationAttainmentHighSchoolGraduatePercent_2026 +
                "\npopulationAttainmentSomeCollegePercent_2010=" + populationAttainmentSomeCollegePercent_2010 +
                "\npopulationAttainmentSomeCollegePercent_2021=" + populationAttainmentSomeCollegePercent_2021 +
                "\npopulationAttainmentSomeCollegePercent_2026=" + populationAttainmentSomeCollegePercent_2026 +
                "\npopulationAttainmentAssociatesDegreePercent_2010=" + populationAttainmentAssociatesDegreePercent_2010 +
                "\npopulationAttainmentAssociatesDegreePercent_2021=" + populationAttainmentAssociatesDegreePercent_2021 +
                "\npopulationAttainmentAssociatesDegreePercent_2026=" + populationAttainmentAssociatesDegreePercent_2026 +
                "\npopulationAttainmentBachelorsDegreePercent_2010=" + populationAttainmentBachelorsDegreePercent_2010 +
                "\npopulationAttainmentBachelorsDegreePercent_2021=" + populationAttainmentBachelorsDegreePercent_2021 +
                "\npopulationAttainmentBachelorsDegreePercent_2026=" + populationAttainmentBachelorsDegreePercent_2026 +
                "\npopulationAttainmentGraduateOrProfessionalPercent_2010=" + populationAttainmentGraduateOrProfessionalPercent_2010 +
                "\npopulationAttainmentGraduateOrProfessionalPercent_2021=" + populationAttainmentGraduateOrProfessionalPercent_2021 +
                "\npopulationAttainmentGraduateOrProfessionalPercent_2026=" + populationAttainmentGraduateOrProfessionalPercent_2026 +
                '}';
    }
}
