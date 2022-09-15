//package old;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//
//import static old.helper.SheetHelper.*;
//
//@Deprecated
//public class UMCReport {
//
//    public static UMCReport from(XSSFSheet sheet) {
//         String district = parseSheetName(readCellFromSheetAsString(sheet, 5, "A"));
//        //Population Trends
//         Integer population_2000 = readCellFromSheetAsInteger(sheet, 33, "B");
//         Integer population_2010 = readCellFromSheetAsInteger(sheet, 33, "C");
//         Integer population_2021 = readCellFromSheetAsInteger(sheet, 33, "D");
//         Integer population_2026 = readCellFromSheetAsInteger(sheet, 33, "E");
//         Integer population_2031 = readCellFromSheetAsInteger(sheet, 33, "F");
//
//         Integer populationChange_2000_2010  = readCellFromSheetAsInteger(sheet, 34, "C");
//         Integer populationChange_2010_2021 = readCellFromSheetAsInteger(sheet, 34, "D");
//         Integer populationChange_2021_2026 = readCellFromSheetAsInteger(sheet, 34, "E");
//         Integer populationChange_2026_2031 = readCellFromSheetAsInteger(sheet, 34, "F");
//
//         Double populationPercentChange_2000_2010 = readCellFromSheetAsDouble(sheet, 35, "C");
//         Double populationPercentChange_2010_2021= readCellFromSheetAsDouble(sheet, 35, "D");
//         Double populationPercentChange_2021_2026= readCellFromSheetAsDouble(sheet, 35, "E");
//         Double populationPercentChange_2026_2031= readCellFromSheetAsDouble(sheet, 35, "F");
//
//        //Population: Recent 8 Quarter History
//
//         Integer populationRecent8QuarterHistory_2019_1st_Qtr = readCellFromSheetAsInteger(sheet,41, "B");
//         Integer populationRecent8QuarterHistory_2019_2nd_Qtr= readCellFromSheetAsInteger(sheet,41, "C");
//         Integer populationRecent8QuarterHistory_2019_3rd_Qtr= readCellFromSheetAsInteger(sheet,41, "D");
//         Integer populationRecent8QuarterHistory_2019_4th_Qtr= readCellFromSheetAsInteger(sheet,41, "E");
//         Integer populationRecent8QuarterHistory_2020_1st_Qtr= readCellFromSheetAsInteger(sheet,41, "F");
//         Integer populationRecent8QuarterHistory_2020_2nd_Qtr= readCellFromSheetAsInteger(sheet,41, "G");
//         Integer populationRecent8QuarterHistory_2020_3rd_Qtr= readCellFromSheetAsInteger(sheet,41, "H");
//         Integer populationRecent8QuarterHistory_2020_4th_Qtr= readCellFromSheetAsInteger(sheet,41, "I");
//
//         Integer populationRecent8QuarterHistoryChange_2019_2nd_2019_3rd= readCellFromSheetAsInteger(sheet,42, "C");
//         Integer populationRecent8QuarterHistoryChange_2019_3rd_2019_4th= readCellFromSheetAsInteger(sheet,42, "D");
//         Integer populationRecent8QuarterHistoryChange_2019_4th_2020_1st= readCellFromSheetAsInteger(sheet,42, "E");
//         Integer populationRecent8QuarterHistoryChange_2019_1st_2019_2nd= readCellFromSheetAsInteger(sheet,42, "F");
//         Integer populationRecent8QuarterHistoryChange_2020_1st_2020_2nd= readCellFromSheetAsInteger(sheet,42, "G");
//         Integer populationRecent8QuarterHistoryChange_2020_2nd_2020_3rd= readCellFromSheetAsInteger(sheet,42, "H");
//         Integer populationRecent8QuarterHistoryChange_2020_3rd_2020_4th= readCellFromSheetAsInteger(sheet,42, "I");
//
//         Double populationRecent8QuarterHistoryChangePercent_2019_2nd_2019_3rd=readCellFromSheetAsDouble(sheet,43, "C");
//         Double populationRecent8QuarterHistoryChangePercent_2019_3rd_2019_4th=readCellFromSheetAsDouble(sheet,43, "D");
//         Double populationRecent8QuarterHistoryChangePercent_2019_4th_2020_1st=readCellFromSheetAsDouble(sheet,43, "E");
//         Double populationRecent8QuarterHistoryChangePercent_2019_1st_2019_2nd=readCellFromSheetAsDouble(sheet,43, "F");
//         Double populationRecent8QuarterHistoryChangePercent_2020_1st_2020_2nd=readCellFromSheetAsDouble(sheet,43, "G");
//         Double populationRecent8QuarterHistoryChangePercent_2020_2nd_2020_3rd=readCellFromSheetAsDouble(sheet,43, "H");
//         Double populationRecent8QuarterHistoryChangePercent_2020_3rd_2020_4th=readCellFromSheetAsDouble(sheet,43, "I");
//
//        //Population: Currently Enrolled in Education
//
//         Integer populationEnrolledInElementarySchool = readCellFromSheetAsInteger(sheet,48, "B");
//         Integer populationEnrolledInHighSchool= readCellFromSheetAsInteger(sheet,49, "B");
//         Integer populationEnrolledInPreschool= readCellFromSheetAsInteger(sheet,50, "B");
//
//         Double populationEnrolledInElementarySchoolPercent = readCellFromSheetAsDouble(sheet, 48, "C");
//         Double populationEnrolledInHighSchoolPercent= readCellFromSheetAsDouble(sheet, 49, "C");
//         Double populationEnrolledInPreschoolPercent= readCellFromSheetAsDouble(sheet, 50, "C");
//
//        //Population by Educational Attainment: 25+
//
//         Integer populationAttainmentLessThan9th_2010 = readCellFromSheetAsInteger(sheet, 56, "B");
//         Integer populationAttainmentLessThan9th_2021 = readCellFromSheetAsInteger(sheet, 56, "C");
//         Integer populationAttainmentLessThan9th_2026 = readCellFromSheetAsInteger(sheet, 56, "D");
//
//         Integer populationAttainmentSomeHighSchool_2010 = readCellFromSheetAsInteger(sheet, 57, "B");
//         Integer populationAttainmentSomeHighSchool_2021 = readCellFromSheetAsInteger(sheet, 57, "C");
//         Integer populationAttainmentSomeHighSchool_2026 = readCellFromSheetAsInteger(sheet, 57, "D");
//
//         Integer populationAttainmentHighSchoolGraduate_2010 = readCellFromSheetAsInteger(sheet, 58, "B");
//         Integer populationAttainmentHighSchoolGraduate_2021 = readCellFromSheetAsInteger(sheet, 58, "C");
//         Integer populationAttainmentHighSchoolGraduate_2026 = readCellFromSheetAsInteger(sheet, 58, "D");
//
//         Integer populationAttainmentSomeCollege_2010 = readCellFromSheetAsInteger(sheet, 59, "B");
//         Integer populationAttainmentSomeCollege_2021 = readCellFromSheetAsInteger(sheet, 59, "C");
//         Integer populationAttainmentSomeCollege_2026 = readCellFromSheetAsInteger(sheet, 59, "D");
//
//         Integer populationAttainmentAssociatesDegree_2010 = readCellFromSheetAsInteger(sheet, 60, "B");
//         Integer populationAttainmentAssociatesDegree_2021 = readCellFromSheetAsInteger(sheet, 60, "C");
//         Integer populationAttainmentAssociatesDegree_2026 = readCellFromSheetAsInteger(sheet, 60, "D");
//
//         Integer populationAttainmentBachelorsDegree_2010 = readCellFromSheetAsInteger(sheet, 61, "B");
//         Integer populationAttainmentBachelorsDegree_2021 = readCellFromSheetAsInteger(sheet, 61, "C");
//         Integer populationAttainmentBachelorsDegree_2026 = readCellFromSheetAsInteger(sheet, 61, "D");
//
//         Integer populationAttainmentGraduateOrProfessional_2010 = readCellFromSheetAsInteger(sheet, 62, "B");
//         Integer populationAttainmentGraduateOrProfessional_2021 = readCellFromSheetAsInteger(sheet, 62, "C");
//         Integer populationAttainmentGraduateOrProfessional_2026 = readCellFromSheetAsInteger(sheet, 62, "D");
//
//         Double populationAttainmentLessThan9thPercent_2010= readCellFromSheetAsDouble(sheet, 56,"E");
//         Double populationAttainmentLessThan9thPercent_2021= readCellFromSheetAsDouble(sheet, 56,"F");
//         Double populationAttainmentLessThan9thPercent_2026= readCellFromSheetAsDouble(sheet, 56,"G");
//
//         Double populationAttainmentSomeHighSchoolPercent_2010= readCellFromSheetAsDouble(sheet, 57,"E");
//         Double populationAttainmentSomeHighSchoolPercent_2021= readCellFromSheetAsDouble(sheet, 57,"F");
//         Double populationAttainmentSomeHighSchoolPercent_2026= readCellFromSheetAsDouble(sheet, 57,"G");
//
//         Double populationAttainmentHighSchoolGraduatePercent_2010= readCellFromSheetAsDouble(sheet, 58,"E");
//         Double populationAttainmentHighSchoolGraduatePercent_2021= readCellFromSheetAsDouble(sheet, 58,"F");
//         Double populationAttainmentHighSchoolGraduatePercent_2026= readCellFromSheetAsDouble(sheet, 58,"G");
//
//         Double populationAttainmentSomeCollegePercent_2010= readCellFromSheetAsDouble(sheet, 59,"E");
//         Double populationAttainmentSomeCollegePercent_2021= readCellFromSheetAsDouble(sheet, 59,"F");
//         Double populationAttainmentSomeCollegePercent_2026= readCellFromSheetAsDouble(sheet, 59,"G");
//
//         Double populationAttainmentAssociatesDegreePercent_2010= readCellFromSheetAsDouble(sheet, 60,"E");
//         Double populationAttainmentAssociatesDegreePercent_2021= readCellFromSheetAsDouble(sheet, 60,"F");
//         Double populationAttainmentAssociatesDegreePercent_2026= readCellFromSheetAsDouble(sheet, 60,"G");
//
//         Double populationAttainmentBachelorsDegreePercent_2010= readCellFromSheetAsDouble(sheet, 61,"E");
//         Double populationAttainmentBachelorsDegreePercent_2021= readCellFromSheetAsDouble(sheet, 61,"F");
//         Double populationAttainmentBachelorsDegreePercent_2026= readCellFromSheetAsDouble(sheet, 61,"G");
//
//         Double populationAttainmentGraduateOrProfessionalPercent_2010= readCellFromSheetAsDouble(sheet, 62,"E");
//         Double populationAttainmentGraduateOrProfessionalPercent_2021= readCellFromSheetAsDouble(sheet, 62,"F");
//         Double populationAttainmentGraduateOrProfessionalPercent_2026= readCellFromSheetAsDouble(sheet, 62,"G");
//
//        //Age Forecast
//
//         Integer ageForecast_2021_0To4   = readCellFromSheetAsInteger(sheet,68 , "B");
//         Integer ageForecast_2021_5To13  = readCellFromSheetAsInteger(sheet, 70, "B");
//         Integer ageForecast_2021_14To17 = readCellFromSheetAsInteger(sheet, 72, "B");
//         Integer ageForecast_2021_18To21 = readCellFromSheetAsInteger(sheet, 74, "B");
//         Integer ageForecast_2021_22To24 = readCellFromSheetAsInteger(sheet, 76, "B");
//         Integer ageForecast_2021_25To29 = readCellFromSheetAsInteger(sheet, 78, "B");
//         Integer ageForecast_2021_30To34 = readCellFromSheetAsInteger(sheet, 80, "B");
//         Integer ageForecast_2021_35To39 = readCellFromSheetAsInteger(sheet, 82, "B");
//         Integer ageForecast_2021_40To44 = readCellFromSheetAsInteger(sheet, 84, "B");
//         Integer ageForecast_2021_45To49 = readCellFromSheetAsInteger(sheet, 86, "B");
//         Integer ageForecast_2021_50To54 = readCellFromSheetAsInteger(sheet, 88, "B");
//         Integer ageForecast_2021_55To64 = readCellFromSheetAsInteger(sheet, 90, "B");
//         Integer ageForecast_2021_65To74 = readCellFromSheetAsInteger(sheet, 92, "B");
//         Integer ageForecast_2021_75To84 = readCellFromSheetAsInteger(sheet, 94, "B");
//         Integer ageForecast_2021_85Plus = readCellFromSheetAsInteger(sheet, 96, "B");
//
//         Integer ageForecast_2026_0To4  = readCellFromSheetAsInteger(sheet,68 , "C");
//         Integer ageForecast_2026_5To13 = readCellFromSheetAsInteger(sheet, 70, "C");
//         Integer ageForecast_2026_14To17= readCellFromSheetAsInteger(sheet, 72, "C");
//         Integer ageForecast_2026_18To21= readCellFromSheetAsInteger(sheet, 74, "C");
//         Integer ageForecast_2026_22To24= readCellFromSheetAsInteger(sheet, 76, "C");
//         Integer ageForecast_2026_25To29= readCellFromSheetAsInteger(sheet, 78, "C");
//         Integer ageForecast_2026_30To34= readCellFromSheetAsInteger(sheet, 80, "C");
//         Integer ageForecast_2026_35To39= readCellFromSheetAsInteger(sheet, 82, "C");
//         Integer ageForecast_2026_40To44= readCellFromSheetAsInteger(sheet, 84, "C");
//         Integer ageForecast_2026_45To49= readCellFromSheetAsInteger(sheet, 86, "C");
//         Integer ageForecast_2026_50To54= readCellFromSheetAsInteger(sheet, 88, "C");
//         Integer ageForecast_2026_55To64= readCellFromSheetAsInteger(sheet, 90, "C");
//         Integer ageForecast_2026_65To74= readCellFromSheetAsInteger(sheet, 92, "C");
//         Integer ageForecast_2026_75To84= readCellFromSheetAsInteger(sheet, 94, "C");
//         Integer ageForecast_2026_85Plus= readCellFromSheetAsInteger(sheet, 96, "C");
//
//         Integer ageForecast_2031_0To4  = readCellFromSheetAsInteger(sheet,68 , "D");
//         Integer ageForecast_2031_5To13 = readCellFromSheetAsInteger(sheet, 70, "D");
//         Integer ageForecast_2031_14To17= readCellFromSheetAsInteger(sheet, 72, "D");
//         Integer ageForecast_2031_18To21= readCellFromSheetAsInteger(sheet, 74, "D");
//         Integer ageForecast_2031_22To24= readCellFromSheetAsInteger(sheet, 76, "D");
//         Integer ageForecast_2031_25To29= readCellFromSheetAsInteger(sheet, 78, "D");
//         Integer ageForecast_2031_30To34= readCellFromSheetAsInteger(sheet, 80, "D");
//         Integer ageForecast_2031_35To39= readCellFromSheetAsInteger(sheet, 82, "D");
//         Integer ageForecast_2031_40To44= readCellFromSheetAsInteger(sheet, 84, "D");
//         Integer ageForecast_2031_45To49= readCellFromSheetAsInteger(sheet, 86, "D");
//         Integer ageForecast_2031_50To54= readCellFromSheetAsInteger(sheet, 88, "D");
//         Integer ageForecast_2031_55To64= readCellFromSheetAsInteger(sheet, 90, "D");
//         Integer ageForecast_2031_65To74= readCellFromSheetAsInteger(sheet, 92, "D");
//         Integer ageForecast_2031_75To84= readCellFromSheetAsInteger(sheet, 94, "D");
//         Integer ageForecast_2031_85Plus= readCellFromSheetAsInteger(sheet, 96, "D");
//
//
//         Double ageForecastPercentChange_2021_2026_0To4  = readCellFromSheetAsDouble(sheet, 69, "C");
//         Double ageForecastPercentChange_2021_2026_5To13 = readCellFromSheetAsDouble(sheet, 71, "C");
//         Double ageForecastPercentChange_2021_2026_14To17= readCellFromSheetAsDouble(sheet, 73, "C");
//         Double ageForecastPercentChange_2021_2026_18To21= readCellFromSheetAsDouble(sheet, 75, "C");
//         Double ageForecastPercentChange_2021_2026_22To24= readCellFromSheetAsDouble(sheet, 77, "C");
//         Double ageForecastPercentChange_2021_2026_25To29= readCellFromSheetAsDouble(sheet, 79, "C");
//         Double ageForecastPercentChange_2021_2026_30To34= readCellFromSheetAsDouble(sheet, 81, "C");
//         Double ageForecastPercentChange_2021_2026_35To39= readCellFromSheetAsDouble(sheet, 83, "C");
//         Double ageForecastPercentChange_2021_2026_40To44= readCellFromSheetAsDouble(sheet, 85, "C");
//         Double ageForecastPercentChange_2021_2026_45To49= readCellFromSheetAsDouble(sheet, 87, "C");
//         Double ageForecastPercentChange_2021_2026_50To54= readCellFromSheetAsDouble(sheet, 89, "C");
//         Double ageForecastPercentChange_2021_2026_55To64= readCellFromSheetAsDouble(sheet, 91, "C");
//         Double ageForecastPercentChange_2021_2026_65To74= readCellFromSheetAsDouble(sheet, 93, "C");
//         Double ageForecastPercentChange_2021_2026_75To84= readCellFromSheetAsDouble(sheet, 95, "C");
//         Double ageForecastPercentChange_2021_2026_85Plus= readCellFromSheetAsDouble(sheet, 97, "C");
//
//         Double ageForecastPercentChange_2026_2031_0To4  = readCellFromSheetAsDouble(sheet,69, "D");
//         Double ageForecastPercentChange_2026_2031_5To13 = readCellFromSheetAsDouble(sheet,71, "D");
//         Double ageForecastPercentChange_2026_2031_14To17= readCellFromSheetAsDouble(sheet,73, "D");
//         Double ageForecastPercentChange_2026_2031_18To21= readCellFromSheetAsDouble(sheet,75, "D");
//         Double ageForecastPercentChange_2026_2031_22To24= readCellFromSheetAsDouble(sheet,77, "D");
//         Double ageForecastPercentChange_2026_2031_25To29= readCellFromSheetAsDouble(sheet,79, "D");
//         Double ageForecastPercentChange_2026_2031_30To34= readCellFromSheetAsDouble(sheet,81, "D");
//         Double ageForecastPercentChange_2026_2031_35To39= readCellFromSheetAsDouble(sheet,83, "D");
//         Double ageForecastPercentChange_2026_2031_40To44= readCellFromSheetAsDouble(sheet,85, "D");
//         Double ageForecastPercentChange_2026_2031_45To49= readCellFromSheetAsDouble(sheet,87, "D");
//         Double ageForecastPercentChange_2026_2031_50To54= readCellFromSheetAsDouble(sheet,89, "D");
//         Double ageForecastPercentChange_2026_2031_55To64= readCellFromSheetAsDouble(sheet,91, "D");
//         Double ageForecastPercentChange_2026_2031_65To74= readCellFromSheetAsDouble(sheet,93, "D");
//         Double ageForecastPercentChange_2026_2031_75To84= readCellFromSheetAsDouble(sheet,95, "D");
//         Double ageForecastPercentChange_2026_2031_85Plus= readCellFromSheetAsDouble(sheet,97, "D");
//
//        //Population by Marital Status Age 15+
//
//         Integer neverMarried_2010=readCellFromSheetAsInteger(sheet, 103, "B");
//         Integer married_2010     =readCellFromSheetAsInteger(sheet, 104, "B");
//         Integer divorced_2010    =readCellFromSheetAsInteger(sheet, 105, "B");
//         Integer separated_2010   =readCellFromSheetAsInteger(sheet, 106, "B");
//         Integer widowed_2010     =readCellFromSheetAsInteger(sheet, 107, "B");
//
//         Integer neverMarried_2021=readCellFromSheetAsInteger(sheet, 103, "C");
//         Integer married_2021=readCellFromSheetAsInteger(sheet, 104, "C");
//         Integer divorced_2021=readCellFromSheetAsInteger(sheet, 105, "C");
//         Integer separated_2021=readCellFromSheetAsInteger(sheet, 106, "C");
//         Integer widowed_2021=readCellFromSheetAsInteger(sheet, 107, "C");
//
//         Integer neverMarried_2026=readCellFromSheetAsInteger(sheet, 103, "D");
//         Integer married_2026=readCellFromSheetAsInteger(sheet, 104, "D");
//         Integer divorced_2026=readCellFromSheetAsInteger(sheet, 105, "D");
//         Integer separated_2026=readCellFromSheetAsInteger(sheet, 106, "D");
//         Integer widowed_2026=readCellFromSheetAsInteger(sheet, 107, "D");
//
//         Double neverMarriedPercent_2010= readCellFromSheetAsDouble(sheet,103 , "E");
//         Double marriedPercent_2010     = readCellFromSheetAsDouble(sheet,104 , "E");
//         Double divorcedPercent_2010    = readCellFromSheetAsDouble(sheet,105 , "E");
//         Double separatedPercent_2010   = readCellFromSheetAsDouble(sheet,106 , "E");
//         Double widowedPercent_2010     = readCellFromSheetAsDouble(sheet,107 , "E");
//
//         Double neverMarriedPercent_2021= readCellFromSheetAsDouble(sheet,103 , "F");
//         Double marriedPercent_2021     = readCellFromSheetAsDouble(sheet,104 , "F");
//         Double divorcedPercent_2021    = readCellFromSheetAsDouble(sheet,105 , "F");
//         Double separatedPercent_2021   = readCellFromSheetAsDouble(sheet,106 , "F");
//         Double widowedPercent_2021     = readCellFromSheetAsDouble(sheet,107 , "F");
//
//         Double neverMarriedPercent_2026= readCellFromSheetAsDouble(sheet,103 , "G");
//         Double marriedPercent_2026     = readCellFromSheetAsDouble(sheet,104 , "G");
//         Double divorcedPercent_2026    = readCellFromSheetAsDouble(sheet,105 , "G");
//         Double separatedPercent_2026   = readCellFromSheetAsDouble(sheet,106 , "G");
//         Double widowedPercent_2026     = readCellFromSheetAsDouble(sheet,107 , "G");
//
//        //Outreach Opportunities: Children
//
//         Integer outreachOpportunitiesEarlyAdolescent = readCellFromSheetAsInteger(sheet, 113, "B");
//         Integer outreachOpportunitiesPreschool= readCellFromSheetAsInteger(sheet, 114, "B");
//
//         Double outreachOpportunitiesEarlyAdolescentPercent =readCellFromSheetAsDouble(sheet, 113, "C");
//         Double outreachOpportunitiesPreschoolPercent=readCellFromSheetAsDouble(sheet, 114, "C");
//
//        //Outreach Opportunities: Youth and Young Adult
//
//         Integer outreachOpportunitiesAges_20To24 = readCellFromSheetAsInteger(sheet, 120, "B");
//
//        //Households
//
//         Integer households_2000 = readCellFromSheetAsInteger(sheet, 126, "B");
//         Integer households_2010 = readCellFromSheetAsInteger(sheet, 126, "C");
//         Integer households_2021 = readCellFromSheetAsInteger(sheet, 126, "D");
//         Integer households_2026 = readCellFromSheetAsInteger(sheet, 126, "E");
//         Integer households_2031 = readCellFromSheetAsInteger(sheet, 126, "F");
//
//         Integer householdsChange_2000_2010 = readCellFromSheetAsInteger(sheet, 127, "C");
//         Integer householdsChange_2010_2021 = readCellFromSheetAsInteger(sheet, 127, "D");
//         Integer householdsChange_2021_2026 = readCellFromSheetAsInteger(sheet, 127, "E");
//         Integer householdsChange_2026_2031 = readCellFromSheetAsInteger(sheet, 127, "F");
//
//         Double householdsChangePercent_2000_2010 = readCellFromSheetAsDouble(sheet, 128, "C");
//         Double householdsChangePercent_2010_2021 = readCellFromSheetAsDouble(sheet, 128, "D");
//         Double householdsChangePercent_2021_2026 = readCellFromSheetAsDouble(sheet, 128, "E");
//         Double householdsChangePercent_2026_2031 = readCellFromSheetAsDouble(sheet, 128, "F");
//
//        //Household Income Forecast
//
//
//
//         Integer householdIncomeForecast_LessThan10_000_2010     = readCellFromSheetAsInteger(sheet, 134, "B");
//         Integer householdIncomeForecast_10_000_To_14_999_2010   = readCellFromSheetAsInteger(sheet, 135, "B");
//         Integer householdIncomeForecast_15_000_To_24_999_2010   = readCellFromSheetAsInteger(sheet, 136, "B");
//         Integer householdIncomeForecast_25_000_To_34_999_2010   = readCellFromSheetAsInteger(sheet, 137, "B");
//         Integer householdIncomeForecast_35_000_To_49_999_2010   = readCellFromSheetAsInteger(sheet, 138, "B");
//         Integer householdIncomeForecast_50_000_To_74_999_2010   = readCellFromSheetAsInteger(sheet, 139, "B");
//         Integer householdIncomeForecast_75_000_To_99_999_2010   = readCellFromSheetAsInteger(sheet, 140, "B");
//         Integer householdIncomeForecast_100_000_To_149_999_2010 = readCellFromSheetAsInteger(sheet, 141, "B");
//         Integer householdIncomeForecast_150_000_To_199_999_2010 = readCellFromSheetAsInteger(sheet, 142, "B");
//         Integer householdIncomeForecast_200_000Plus_2010        = readCellFromSheetAsInteger(sheet, 143, "B");
//
//         Integer householdIncomeForecast_LessThan10_000_2021= readCellFromSheetAsInteger(sheet, 134, "C");
//         Integer householdIncomeForecast_10_000_To_14_999_2021= readCellFromSheetAsInteger(sheet, 135, "C");
//         Integer householdIncomeForecast_15_000_To_24_999_2021= readCellFromSheetAsInteger(sheet, 136, "C");
//         Integer householdIncomeForecast_25_000_To_34_999_2021= readCellFromSheetAsInteger(sheet, 137, "C");
//         Integer householdIncomeForecast_35_000_To_49_999_2021= readCellFromSheetAsInteger(sheet, 138, "C");
//         Integer householdIncomeForecast_50_000_To_74_999_2021= readCellFromSheetAsInteger(sheet, 139, "C");
//         Integer householdIncomeForecast_75_000_To_99_999_2021= readCellFromSheetAsInteger(sheet, 140, "C");
//         Integer householdIncomeForecast_100_000_To_149_999_2021= readCellFromSheetAsInteger(sheet, 141, "C");
//         Integer householdIncomeForecast_150_000_To_199_999_2021= readCellFromSheetAsInteger(sheet, 142, "C");
//         Integer householdIncomeForecast_200_000Plus_2021= readCellFromSheetAsInteger(sheet, 143, "C");
//
//         Integer householdIncomeForecast_LessThan10_000_2026= readCellFromSheetAsInteger(sheet, 134, "D");
//         Integer householdIncomeForecast_10_000_To_14_999_2026= readCellFromSheetAsInteger(sheet, 135, "D");
//         Integer householdIncomeForecast_15_000_To_24_999_2026= readCellFromSheetAsInteger(sheet, 136, "D");
//         Integer householdIncomeForecast_25_000_To_34_999_2026= readCellFromSheetAsInteger(sheet, 137, "D");
//         Integer householdIncomeForecast_35_000_To_49_999_2026= readCellFromSheetAsInteger(sheet, 138, "D");
//         Integer householdIncomeForecast_50_000_To_74_999_2026= readCellFromSheetAsInteger(sheet, 139, "D");
//         Integer householdIncomeForecast_75_000_To_99_999_2026= readCellFromSheetAsInteger(sheet, 140, "D");
//         Integer householdIncomeForecast_100_000_To_149_999_2026= readCellFromSheetAsInteger(sheet, 141, "D");
//         Integer householdIncomeForecast_150_000_To_199_999_2026= readCellFromSheetAsInteger(sheet, 142, "D");
//         Integer householdIncomeForecast_200_000Plus_2026= readCellFromSheetAsInteger(sheet, 143, "D");
//
//         Double householdIncomeForecast_LessThan10_000_2010_Percent= readCellFromSheetAsDouble(sheet, 134, "E");
//         Double householdIncomeForecast_10_000_To_14_999_2010_Percent= readCellFromSheetAsDouble(sheet, 135, "E");
//         Double householdIncomeForecast_15_000_To_24_999_2010_Percent= readCellFromSheetAsDouble(sheet, 136, "E");
//         Double householdIncomeForecast_25_000_To_34_999_2010_Percent= readCellFromSheetAsDouble(sheet, 137, "E");
//         Double householdIncomeForecast_35_000_To_49_999_2010_Percent= readCellFromSheetAsDouble(sheet, 138, "E");
//         Double householdIncomeForecast_50_000_To_74_999_2010_Percent= readCellFromSheetAsDouble(sheet, 139, "E");
//         Double householdIncomeForecast_75_000_To_99_999_2010_Percent= readCellFromSheetAsDouble(sheet, 140, "E");
//         Double householdIncomeForecast_100_000_To_149_999_2010_Percent= readCellFromSheetAsDouble(sheet, 141, "E");
//         Double householdIncomeForecast_150_000_To_199_999_2010_Percent= readCellFromSheetAsDouble(sheet, 142, "E");
//         Double householdIncomeForecast_200_000Plus_2010_Percent= readCellFromSheetAsDouble(sheet, 143, "E");
//
//         Double householdIncomeForecast_LessThan10_000_2021_Percent= readCellFromSheetAsDouble(sheet, 134, "F");
//         Double householdIncomeForecast_10_000_To_14_999_2021_Percent= readCellFromSheetAsDouble(sheet, 135, "F");
//         Double householdIncomeForecast_15_000_To_24_999_2021_Percent= readCellFromSheetAsDouble(sheet, 136, "F");
//         Double householdIncomeForecast_25_000_To_34_999_2021_Percent= readCellFromSheetAsDouble(sheet, 137, "F");
//         Double householdIncomeForecast_35_000_To_49_999_2021_Percent= readCellFromSheetAsDouble(sheet, 138, "F");
//         Double householdIncomeForecast_50_000_To_74_999_2021_Percent= readCellFromSheetAsDouble(sheet, 139, "F");
//         Double householdIncomeForecast_75_000_To_99_999_2021_Percent= readCellFromSheetAsDouble(sheet, 140, "F");
//         Double householdIncomeForecast_100_000_To_149_999_2021_Percent= readCellFromSheetAsDouble(sheet, 141, "F");
//         Double householdIncomeForecast_150_000_To_199_999_2021_Percent= readCellFromSheetAsDouble(sheet, 142, "F");
//         Double householdIncomeForecast_200_000Plus_2021_Percent= readCellFromSheetAsDouble(sheet, 143, "F");
//
//         Double householdIncomeForecast_LessThan10_000_2026_Percent= readCellFromSheetAsDouble(sheet, 134, "G");
//         Double householdIncomeForecast_10_000_To_14_999_2026_Percent= readCellFromSheetAsDouble(sheet, 135, "G");
//         Double householdIncomeForecast_15_000_To_24_999_2026_Percent= readCellFromSheetAsDouble(sheet, 136, "G");
//         Double householdIncomeForecast_25_000_To_34_999_2026_Percent= readCellFromSheetAsDouble(sheet, 137, "G");
//         Double householdIncomeForecast_35_000_To_49_999_2026_Percent= readCellFromSheetAsDouble(sheet, 138, "G");
//         Double householdIncomeForecast_50_000_To_74_999_2026_Percent= readCellFromSheetAsDouble(sheet, 139, "G");
//         Double householdIncomeForecast_75_000_To_99_999_2026_Percent= readCellFromSheetAsDouble(sheet, 140, "G");
//         Double householdIncomeForecast_100_000_To_149_999_2026_Percent= readCellFromSheetAsDouble(sheet, 141, "G");
//         Double householdIncomeForecast_150_000_To_199_999_2026_Percent= readCellFromSheetAsDouble(sheet, 142, "G");
//         Double householdIncomeForecast_200_000Plus_2026_Percent= readCellFromSheetAsDouble(sheet, 143, "G");
//
//
//        //Households: Poverty Detail
//
//         Integer abovePovertyLevel_2021 = readCellFromSheetAsInteger(sheet, 150, "B");
//         Integer belowPovertyLevelNon_Family_2021 = readCellFromSheetAsInteger(sheet, 151, "B");
//         Integer belowPovertyLevelMarried_2021 = readCellFromSheetAsInteger(sheet, 152, "B");
//         Integer belowPovertyLevelFemaleHouseholder_2021 = readCellFromSheetAsInteger(sheet, 153, "B");
//         Integer belowPovertyLevelMaleHouseholder_2021 = readCellFromSheetAsInteger(sheet, 154, "B");
//         Integer belowPovertyLevelNon_FamilyStudent_2021 = readCellFromSheetAsInteger(sheet, 155, "B");
//
//         Double abovePovertyLevel_2021_Percent = readCellFromSheetAsDouble(sheet, 150, "C");
//         Double belowPovertyLevelNon_Family_2021_Percent = readCellFromSheetAsDouble(sheet, 151, "C");
//         Double belowPovertyLevelMarried_2021_Percent = readCellFromSheetAsDouble(sheet, 152, "C");
//         Double belowPovertyLevelFemaleHouseholder_2021_Percent = readCellFromSheetAsDouble(sheet, 153, "C");
//         Double belowPovertyLevelMaleHouseholder_2021_Percent = readCellFromSheetAsDouble(sheet, 154, "C");
//         Double belowPovertyLevelNon_FamilyStudent_2021_Percent = readCellFromSheetAsDouble(sheet, 155, "C");
//
//        //Households: Wealth
//
//         Integer householdWealth_2021_100_000_To_249_999 = readCellFromSheetAsInteger(sheet, 161, "B");
//         Integer householdWealth_2021_0andUnder = readCellFromSheetAsInteger(sheet, 162, "B");
//         Integer householdWealth_2021_500_000OrMore = readCellFromSheetAsInteger(sheet, 163, "B");
//         Integer householdWealth_2021_250_000_To_499_999 = readCellFromSheetAsInteger(sheet, 164, "B");
//         Integer householdWealth_2021_50_000_To_99_999 = readCellFromSheetAsInteger(sheet, 165, "B");
//         Integer householdWealth_2021_1_To_4_999 = readCellFromSheetAsInteger(sheet, 166, "B");
//         Integer householdWealth_2021_25_000_To_49_999 = readCellFromSheetAsInteger(sheet, 167, "B");
//         Integer householdWealth_2021_10_000_To_24_999 = readCellFromSheetAsInteger(sheet, 168, "B");
//         Integer householdWealth_2021_5_000_To_9_999 = readCellFromSheetAsInteger(sheet, 169, "B");
//
//         Double householdWealthPercent_2021_100_000_To_249_999 = readCellFromSheetAsDouble(sheet, 161, "C");
//         Double householdWealthPercent_2021_0andUnder = readCellFromSheetAsDouble(sheet, 162, "C");
//         Double householdWealthPercent_2021_500_000OrMore = readCellFromSheetAsDouble(sheet, 163, "C");
//         Double householdWealthPercent_2021_250_000_To_499_999 = readCellFromSheetAsDouble(sheet, 164, "C");
//         Double householdWealthPercent_2021_50_000_To_99_999 = readCellFromSheetAsDouble(sheet, 165, "C");
//         Double householdWealthPercent_2021_1_To_4_999 = readCellFromSheetAsDouble(sheet, 166, "C");
//         Double householdWealthPercent_2021_25_000_To_49_999 = readCellFromSheetAsDouble(sheet, 167, "C");
//         Double householdWealthPercent_2021_10_000_To_24_999 = readCellFromSheetAsDouble(sheet, 168, "C");
//         Double householdWealthPercent_2021_5_000_To_9_999 = readCellFromSheetAsDouble(sheet, 169, "C");
//
//        //Families
//
//         Integer familyHouseholds_2010 = readCellFromSheetAsInteger(sheet, 175, "B");
//         Integer familyHouseholds_2021 = readCellFromSheetAsInteger(sheet, 175, "C");
//         Integer familyHouseholds_2026 = readCellFromSheetAsInteger(sheet, 175, "D");
//
//         Integer familyHouseholdsChange_2010_2021 = readCellFromSheetAsInteger(sheet, 176, "C");
//         Integer familyHouseholdsChange_2021_2026 = readCellFromSheetAsInteger(sheet, 176, "D");
//
//         Double familyHouseholdsChangePercent_2010_2021 = readCellFromSheetAsDouble(sheet, 177, "C");
//         Double familyHouseholdsChangePercent_2021_2026 = readCellFromSheetAsDouble(sheet, 177, "D");
//
//        //Families: With Children
//
//         Integer familyMarriedCouple_WithChildren_2010 = readCellFromSheetAsInteger(sheet, 182, "B");
//         Integer familyMarriedCouple_WithChildren_2021 = readCellFromSheetAsInteger(sheet, 182, "C");
//         Integer familyMarriedCouple_WithChildren_2026 = readCellFromSheetAsInteger(sheet, 182, "D");
//
//         Integer otherFamilyFemaleNoHusbandPresent_WithChildren_2010= readCellFromSheetAsInteger(sheet, 183, "B");
//         Integer otherFamilyFemaleNoHusbandPresent_WithChildren_2021= readCellFromSheetAsInteger(sheet, 183, "C");
//         Integer otherFamilyFemaleNoHusbandPresent_WithChildren_2026= readCellFromSheetAsInteger(sheet, 183, "D");
//
//         Integer otherFamilyMaleNoFemalePresent_WithChildren_2010= readCellFromSheetAsInteger(sheet, 184, "B");
//         Integer otherFamilyMaleNoFemalePresent_WithChildren_2021= readCellFromSheetAsInteger(sheet, 184, "C");
//         Integer otherFamilyMaleNoFemalePresent_WithChildren_2026= readCellFromSheetAsInteger(sheet, 184, "D");
//
//         Double familyMarriedCouple_WithChildren_Percent_2010 = readCellFromSheetAsDouble(sheet, 182, "E");
//         Double familyMarriedCouple_WithChildren_Percent_2021 = readCellFromSheetAsDouble(sheet, 182, "F");
//         Double familyMarriedCouple_WithChildren_Percent_2026 = readCellFromSheetAsDouble(sheet, 182, "G");
//
//         Double otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2010 = readCellFromSheetAsDouble(sheet, 183, "E");
//         Double otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2021 = readCellFromSheetAsDouble(sheet, 183, "F");
//         Double otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2026 = readCellFromSheetAsDouble(sheet, 183, "G");
//
//         Double otherFamilyMaleNoFemalePresent_WithChildren_Percent_2010 = readCellFromSheetAsDouble(sheet, 184, "E");
//         Double otherFamilyMaleNoFemalePresent_WithChildren_Percent_2021 = readCellFromSheetAsDouble(sheet, 184, "F");
//         Double otherFamilyMaleNoFemalePresent_WithChildren_Percent_2026 = readCellFromSheetAsDouble(sheet, 184, "G");
//
//        //Families: No Children
//
//         Integer familyMarriedCouple_NoChildren_2010 = readCellFromSheetAsInteger(sheet, 190, "B");
//         Integer familyMarriedCouple_NoChildren_2021 = readCellFromSheetAsInteger(sheet, 190, "C");
//         Integer familyMarriedCouple_NoChildren_2026 = readCellFromSheetAsInteger(sheet, 190, "D");
//
//         Integer otherFamilyFemaleNoHusbandPresent_NoChildren_2010 = readCellFromSheetAsInteger(sheet, 191, "B");
//         Integer otherFamilyFemaleNoHusbandPresent_NoChildren_2021 = readCellFromSheetAsInteger(sheet, 191, "C");
//         Integer otherFamilyFemaleNoHusbandPresent_NoChildren_2026 = readCellFromSheetAsInteger(sheet, 191, "D");
//
//         Integer otherFamilyMaleNoFemalePresent_NoChildren_2010 = readCellFromSheetAsInteger(sheet, 192, "B");
//         Integer otherFamilyMaleNoFemalePresent_NoChildren_2021 = readCellFromSheetAsInteger(sheet, 192, "C");
//         Integer otherFamilyMaleNoFemalePresent_NoChildren_2026 = readCellFromSheetAsInteger(sheet, 192, "D");
//
//         Double familyMarriedCouple_NoChildren_Percent_2010 = readCellFromSheetAsDouble(sheet, 190, "E");
//         Double familyMarriedCouple_NoChildren_Percent_2021 = readCellFromSheetAsDouble(sheet, 190, "F");
//         Double familyMarriedCouple_NoChildren_Percent_2026 = readCellFromSheetAsDouble(sheet, 190, "G");
//
//         Double otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2010 = readCellFromSheetAsDouble(sheet, 191, "E");
//         Double otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2021 = readCellFromSheetAsDouble(sheet, 191, "F");
//         Double otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2026 = readCellFromSheetAsDouble(sheet, 191, "G");
//
//         Double otherFamilyMaleNoFemalePresent_NoChildren_Percent_2010 = readCellFromSheetAsDouble(sheet, 192, "E");
//         Double otherFamilyMaleNoFemalePresent_NoChildren_Percent_2021 = readCellFromSheetAsDouble(sheet, 192, "F");
//         Double otherFamilyMaleNoFemalePresent_NoChildren_Percent_2026 = readCellFromSheetAsDouble(sheet, 192, "G");
//
//        //Diversity Index
//
//         Double diversityIndexScore_2021 = readCellFromSheetAsDouble(sheet, 198, "B");
//
//        //Racial/Ethnic Trends: Detail
//
//         Integer asian_2010 = readCellFromSheetAsInteger(sheet,203 , "B");
//         Integer black_2010 = readCellFromSheetAsInteger(sheet, 206, "B");
//         Integer white_2010 = readCellFromSheetAsInteger(sheet, 209, "B");
//         Integer hispanic_2010 = readCellFromSheetAsInteger(sheet, 212, "B");
//         Integer other_2010 = readCellFromSheetAsInteger(sheet, 215, "B");
//
//         Integer asian_2021 = readCellFromSheetAsInteger(sheet, 203, "C");
//         Integer black_2021 = readCellFromSheetAsInteger(sheet, 206, "C");
//         Integer white_2021 = readCellFromSheetAsInteger(sheet, 209, "C");
//         Integer hispanic_2021 = readCellFromSheetAsInteger(sheet, 212, "C");
//         Integer other_2021 = readCellFromSheetAsInteger(sheet, 215, "C");
//
//         Integer asian_2026 = readCellFromSheetAsInteger(sheet,203 , "D");
//         Integer black_2026 = readCellFromSheetAsInteger(sheet, 206, "D");
//         Integer white_2026 = readCellFromSheetAsInteger(sheet, 209, "D");
//         Integer hispanic_2026 = readCellFromSheetAsInteger(sheet, 212, "D");
//         Integer other_2026 = readCellFromSheetAsInteger(sheet, 215, "D");
//
//         Double asian_2010_Percent = readCellFromSheetAsDouble(sheet,203 , "E");
//         Double black_2010_Percent = readCellFromSheetAsDouble(sheet,206 , "E");
//         Double white_2010_Percent = readCellFromSheetAsDouble(sheet, 209, "E");
//         Double hispanic_2010_Percent = readCellFromSheetAsDouble(sheet,212 , "E");
//         Double other_2010_Percent = readCellFromSheetAsDouble(sheet,215 , "E");
//
//         Double asian_2021_Percent = readCellFromSheetAsDouble(sheet,203 , "F");
//         Double black_2021_Percent = readCellFromSheetAsDouble(sheet, 206, "F");
//         Double white_2021_Percent = readCellFromSheetAsDouble(sheet,209 , "F");
//         Double hispanic_2021_Percent = readCellFromSheetAsDouble(sheet,212 , "F");
//         Double other_2021_Percent = readCellFromSheetAsDouble(sheet,215 , "F");
//
//         Double asian_2026_Percent = readCellFromSheetAsDouble(sheet,203 , "G");
//         Double black_2026_Percent = readCellFromSheetAsDouble(sheet,206 , "G");
//         Double white_2026_Percent = readCellFromSheetAsDouble(sheet,209 , "G");
//         Double hispanic_2026_Percent = readCellFromSheetAsDouble(sheet,212 , "G");
//         Double other_2026_Percent = readCellFromSheetAsDouble(sheet,215 , "G");
//
//         Integer asian_2010_2021_Change = readCellFromSheetAsInteger(sheet, 204, "C");
//         Integer black_2010_2021_Change = readCellFromSheetAsInteger(sheet, 207, "C");
//         Integer white_2010_2021_Change = readCellFromSheetAsInteger(sheet, 210, "C");
//         Integer hispanic_2010_2021_Change = readCellFromSheetAsInteger(sheet, 213, "C");
//         Integer other_2010_2021_Change = readCellFromSheetAsInteger(sheet, 216, "C");
//
//         Integer asian_2021_2026_Change = readCellFromSheetAsInteger(sheet,204 , "D");
//         Integer black_2021_2026_Change = readCellFromSheetAsInteger(sheet,207 , "D");
//         Integer white_2021_2026_Change = readCellFromSheetAsInteger(sheet,210 , "D");
//         Integer hispanic_2021_2026_Change = readCellFromSheetAsInteger(sheet,213 , "D");
//         Integer other_2021_2026_Change = readCellFromSheetAsInteger(sheet,216 , "D");
//
//
//
//         Double asian_2010_2021_Change_Percent = readCellFromSheetAsDouble(sheet,205 , "C");
//         Double black_2010_2021_Change_Percent = readCellFromSheetAsDouble(sheet, 208, "C");
//         Double white_2010_2021_Change_Percent = readCellFromSheetAsDouble(sheet, 211, "C");
//         Double hispanic_2010_2021_Change_Percent = readCellFromSheetAsDouble(sheet, 214, "C");
//         Double other_2010_2021_Change_Percent = readCellFromSheetAsDouble(sheet, 217, "C");
//
//         Double asian_2021_2026_Change_Percent = readCellFromSheetAsDouble(sheet,205 , "D");
//         Double black_2021_2026_Change_Percent = readCellFromSheetAsDouble(sheet,208 , "D");
//         Double white_2021_2026_Change_Percent = readCellFromSheetAsDouble(sheet,211 , "D");
//         Double hispanic_2021_2026_Change_Percent = readCellFromSheetAsDouble(sheet,214 , "D");
//         Double other_2021_2026_Change_Percent = readCellFromSheetAsDouble(sheet,217 , "D");
//
//
//
//        //Religious Affiliation
//
//         Integer religiousAffiliation_Unknown_2021 = readCellFromSheetAsInteger(sheet, 223, "B");
//         Integer religiousAffiliation_Mainline_2021 = readCellFromSheetAsInteger(sheet,224 , "B");
//         Integer religiousAffiliation_Catholic_2021 = readCellFromSheetAsInteger(sheet, 225, "B");
//         Integer religiousAffiliation_Evangelical_2021 = readCellFromSheetAsInteger(sheet, 226, "B");
//         Integer religiousAffiliation_Mormon_2021 = readCellFromSheetAsInteger(sheet, 227, "B");
//
//         Double religiousAffiliation_Unknown_2021_Percent = readCellFromSheetAsDouble(sheet,223 , "C");
//         Double religiousAffiliation_Mainline_2021_Percent = readCellFromSheetAsDouble(sheet,224 , "C");
//         Double religiousAffiliation_Catholic_2021_Percent = readCellFromSheetAsDouble(sheet,225 , "C");
//         Double religiousAffiliation_Evangelical_2021_Percent = readCellFromSheetAsDouble(sheet,226 , "C");
//         Double religiousAffiliation_Mormon_2021_Percent = readCellFromSheetAsDouble(sheet,227 , "C");
//
//        //Housing                           (Units)
//          Integer housingUnits_2010;
//          int HOUSING_OFFSET;
//         try {
//              housingUnits_2010 = readCellFromSheetAsInteger(sheet, 233, "B");
//              HOUSING_OFFSET = 0;
//         } catch (NullPointerException exception) {
//              HOUSING_OFFSET = 4;
//              housingUnits_2010 = readCellFromSheetAsInteger(sheet, 233+HOUSING_OFFSET, "B");
//         }
//
//         Integer housingUnits_2021 = 0;
//         try {
//              housingUnits_2010 = readCellFromSheetAsInteger(sheet, 233+HOUSING_OFFSET, "C");
//         } catch (NumberFormatException e) {
//              HOUSING_OFFSET--;
//              housingUnits_2010 = readCellFromSheetAsInteger(sheet, 233+HOUSING_OFFSET, "C");
//         }
//         Integer housingUnits_2026 = readCellFromSheetAsInteger(sheet, 233+HOUSING_OFFSET, "D");
//
//         Double housingUnits_PercentChange_2010_2021 = readCellFromSheetAsDouble(sheet, 234+HOUSING_OFFSET, "C");
//         Double housingUnits_PercentChange_2021_2026 = readCellFromSheetAsDouble(sheet, 234+HOUSING_OFFSET, "D");
//
//        //Housing Units by Occupancy
//
//         Integer housingUnitsOccupied_2010 = readCellFromSheetAsInteger(sheet, 239+HOUSING_OFFSET, "B");
//         Integer housingUnitsOccupied_2021 = readCellFromSheetAsInteger(sheet, 239+HOUSING_OFFSET, "C");
//         Integer housingUnitsOccupied_2026 = readCellFromSheetAsInteger(sheet, 239+HOUSING_OFFSET, "D");
//
//         Integer housingUnitsVacant_2010 = readCellFromSheetAsInteger(sheet, 240+HOUSING_OFFSET, "B");
//         Integer housingUnitsVacant_2021 = readCellFromSheetAsInteger(sheet, 240+HOUSING_OFFSET, "C");
//         Integer housingUnitsVacant_2026 = readCellFromSheetAsInteger(sheet, 240+HOUSING_OFFSET, "D");
//
//         Double housingUnitsOccupied_2010_Percent = readCellFromSheetAsDouble(sheet, 239+HOUSING_OFFSET, "E");
//         Double housingUnitsOccupied_2021_Percent = readCellFromSheetAsDouble(sheet, 239+HOUSING_OFFSET, "F");
//         Double housingUnitsOccupied_2026_Percent = readCellFromSheetAsDouble(sheet, 239+HOUSING_OFFSET, "G");
//
//         Double housingUnitsVacant_2010_Percent = readCellFromSheetAsDouble(sheet, 240+HOUSING_OFFSET, "E");
//         Double housingUnitsVacant_2021_Percent = readCellFromSheetAsDouble(sheet, 240+HOUSING_OFFSET, "F");
//         Double housingUnitsVacant_2026_Percent = readCellFromSheetAsDouble(sheet, 240+HOUSING_OFFSET, "G");
//
//        //Housing Trends: By Dwelling Type
//
//         Integer dwellingType_1UnitDetached_2021 = readCellFromSheetAsInteger(sheet,246+HOUSING_OFFSET , "B");
//         Integer dwellingType_2Units_2021 = readCellFromSheetAsInteger(sheet,247+HOUSING_OFFSET , "B");
//         Integer dwellingType_MobileHomeOrTrailer_2021 = readCellFromSheetAsInteger(sheet,248+HOUSING_OFFSET , "B");
//         Integer dwellingType_3to19Units_2021 = readCellFromSheetAsInteger(sheet,249+HOUSING_OFFSET , "B");
//         Integer dwellingType_1UnitAttached_2021 = readCellFromSheetAsInteger(sheet, 250+HOUSING_OFFSET, "B");
//         Integer dwellingType_50orMoreUnits_2021 = readCellFromSheetAsInteger(sheet, 251+HOUSING_OFFSET, "B");
//         Integer dwellingType_20to49Units_2021 = readCellFromSheetAsInteger(sheet, 252+HOUSING_OFFSET, "B");
//
//         Double dwellingType_1UnitDetached_2021_Percent = readCellFromSheetAsDouble(sheet,246+HOUSING_OFFSET , "C");
//         Double dwellingType_2Units_2021_Percent = readCellFromSheetAsDouble(sheet,247+HOUSING_OFFSET , "C");
//         Double dwellingType_MobileHomeOrTrailer_2021_Percent = readCellFromSheetAsDouble(sheet,248+HOUSING_OFFSET , "C");
//         Double dwellingType_3to19Units_2021_Percent = readCellFromSheetAsDouble(sheet,249+HOUSING_OFFSET , "C");
//         Double dwellingType_1UnitAttached_2021_Percent = readCellFromSheetAsDouble(sheet,250+HOUSING_OFFSET , "C");
//         Double dwellingType_50orMoreUnits_2021_Percent = readCellFromSheetAsDouble(sheet,251+HOUSING_OFFSET , "C");
//         Double dwellingType_20to49Units_2021_Percent = readCellFromSheetAsDouble(sheet,252+HOUSING_OFFSET , "C");
//
//        //Housing Trends: Value Owner-Occupied
//
//         Integer housingValue_100_000_To_149_999_2021;
//         try {
//              housingValue_100_000_To_149_999_2021 = readCellFromSheetAsInteger(sheet, 258+HOUSING_OFFSET, "B");
//         } catch (NumberFormatException exception) {
//              HOUSING_OFFSET++;
//              housingValue_100_000_To_149_999_2021 = readCellFromSheetAsInteger(sheet, 258+HOUSING_OFFSET, "B");
//         }
//
//         Integer housingValue_200_000_To_299_999_2021 = readCellFromSheetAsInteger(sheet, 259+HOUSING_OFFSET, "B");
//         Integer housingValue_150_000_To_199_999_2021 = readCellFromSheetAsInteger(sheet, 260+HOUSING_OFFSET, "B");
//         Integer housingValue_80_000_To_99_999_2021 = readCellFromSheetAsInteger(sheet,261+HOUSING_OFFSET , "B");
//         Integer housingValue_300_000_To_399_999_2021 = readCellFromSheetAsInteger(sheet, 262+HOUSING_OFFSET, "B");
//         Integer housingValue_60_000_To_79_999_2021 = readCellFromSheetAsInteger(sheet, 263+HOUSING_OFFSET, "B");
//         Integer housingValue_40_000_To_59_999_2021 = readCellFromSheetAsInteger(sheet, 264+HOUSING_OFFSET, "B");
//         Integer housingValue_400_000_To_499_999_2021 = readCellFromSheetAsInteger(sheet, 265+HOUSING_OFFSET, "B");
//         Integer housingValue_20_000_To_39_999_2021 = readCellFromSheetAsInteger(sheet, 266+HOUSING_OFFSET, "B");
//         Integer housingValue_500_000_To_749_999_2021 = readCellFromSheetAsInteger(sheet, 267+HOUSING_OFFSET, "B");
//         Integer housingValue_750_000_To_999_999_2021 = readCellFromSheetAsInteger(sheet, 268+HOUSING_OFFSET, "B");
//         Integer housingValue_1_000_000_Or_More_2021 = readCellFromSheetAsInteger(sheet, 269+HOUSING_OFFSET, "B");
//         Integer housingValue_LessThan_20_000_2021 = readCellFromSheetAsInteger(sheet, 270+HOUSING_OFFSET, "B");
//
//         Double housingValue_100_000_To_149_999_2021_Percent = readCellFromSheetAsDouble(sheet,258+HOUSING_OFFSET , "C");
//         Double housingValue_200_000_To_299_999_2021_Percent = readCellFromSheetAsDouble(sheet,259+HOUSING_OFFSET , "C");
//         Double housingValue_150_000_To_199_999_2021_Percent = readCellFromSheetAsDouble(sheet,260+HOUSING_OFFSET , "C");
//         Double housingValue_80_000_To_99_999_2021_Percent = readCellFromSheetAsDouble(sheet,261 +HOUSING_OFFSET, "C");
//         Double housingValue_300_000_To_399_999_2021_Percent = readCellFromSheetAsDouble(sheet,262+HOUSING_OFFSET , "C");
//         Double housingValue_60_000_To_79_999_2021_Percent = readCellFromSheetAsDouble(sheet,263+HOUSING_OFFSET , "C");
//         Double housingValue_40_000_To_59_999_2021_Percent = readCellFromSheetAsDouble(sheet,264+HOUSING_OFFSET , "C");
//         Double housingValue_400_000_To_499_999_2021_Percent = readCellFromSheetAsDouble(sheet,265+HOUSING_OFFSET , "C");
//         Double housingValue_20_000_To_39_999_2021_Percent = readCellFromSheetAsDouble(sheet,266+HOUSING_OFFSET , "C");
//         Double housingValue_500_000_To_749_999_2021_Percent = readCellFromSheetAsDouble(sheet,267+HOUSING_OFFSET , "C");
//         Double housingValue_750_000_To_999_999_2021_Percent = readCellFromSheetAsDouble(sheet,268+HOUSING_OFFSET , "C");
//         Double housingValue_1_000_000_Or_More_2021_Percent = readCellFromSheetAsDouble(sheet,269+HOUSING_OFFSET , "C");
//         Double housingValue_LessThan_20_000_2021_Percent = readCellFromSheetAsDouble(sheet,270+HOUSING_OFFSET , "C");
//
//        //Housing Trends: Occupied Units by Own or Rent
//
//         Integer housingOwnerOccupied_2010 = readCellFromSheetAsInteger(sheet, 276+HOUSING_OFFSET, "B");
//         Integer housingOwnerOccupied_2021 = readCellFromSheetAsInteger(sheet, 276+HOUSING_OFFSET, "C");
//         Integer housingOwnerOccupied_2026 = readCellFromSheetAsInteger(sheet,276+HOUSING_OFFSET , "D");
//
//         Integer housingRenterOccupied_2010 = readCellFromSheetAsInteger(sheet, 278+HOUSING_OFFSET, "B");
//         Integer housingRenterOccupied_2021 = readCellFromSheetAsInteger(sheet, 278+HOUSING_OFFSET, "C");
//         Integer housingRenterOccupied_2026 = readCellFromSheetAsInteger(sheet, 278+HOUSING_OFFSET, "D");
//
//         Double housingOwnerOccupied_2010_Percent = readCellFromSheetAsDouble(sheet,276+HOUSING_OFFSET , "E");
//         Double housingOwnerOccupied_2021_Percent = readCellFromSheetAsDouble(sheet,276 +HOUSING_OFFSET, "F");
//         Double housingOwnerOccupied_2026_Percent = readCellFromSheetAsDouble(sheet,276+HOUSING_OFFSET , "G");
//
//         Double housingRenterOccupied_2010_Percent = readCellFromSheetAsDouble(sheet,278+HOUSING_OFFSET , "E");
//         Double housingRenterOccupied_2021_Percent = readCellFromSheetAsDouble(sheet,278 +HOUSING_OFFSET, "F");
//         Double housingRenterOccupied_2026_Percent = readCellFromSheetAsDouble(sheet,278+HOUSING_OFFSET , "G");
//
//         Double housingOwnerOccupied_2010_2021_Percent_Change = readCellFromSheetAsDouble(sheet, 277+HOUSING_OFFSET, "C");
//         Double housingOwnerOccupied_2021_2026_Percent_Change = readCellFromSheetAsDouble(sheet, 277+HOUSING_OFFSET, "D");
//
//         Double housingRenterOccupied_2010_2021_Percent_Change = readCellFromSheetAsDouble(sheet, 279+HOUSING_OFFSET, "C");
//         Double housingRenterOccupied_2021_2026_Percent_Change = readCellFromSheetAsDouble(sheet, 279+HOUSING_OFFSET, "D");
//
//        //Pop 16+ by Employment Status
//
//         Integer inLaborForceCivilianEmployed_2021 = readCellFromSheetAsInteger(sheet,285+HOUSING_OFFSET , "B");
//         Integer notInLaborForce_2021 = readCellFromSheetAsInteger(sheet, 286+HOUSING_OFFSET, "B");
//         Integer inLaborForceCivilianUnemployed_2021 = readCellFromSheetAsInteger(sheet, 287+HOUSING_OFFSET, "B");
//         Integer inLaborForceInArmedForces_2021 = readCellFromSheetAsInteger(sheet, 288+HOUSING_OFFSET, "B");
//
//         Double inLaborForceCivilianEmployed_2021_Percent = readCellFromSheetAsDouble(sheet,285+HOUSING_OFFSET , "C");
//         Double notInLaborForce_2021_Percent = readCellFromSheetAsDouble(sheet,286+HOUSING_OFFSET , "C");
//         Double inLaborForceCivilianUnemployed_2021_Percent = readCellFromSheetAsDouble(sheet,287+HOUSING_OFFSET , "C");
//         Double inLaborForceInArmedForces_2021_Percent = readCellFromSheetAsDouble(sheet,288+HOUSING_OFFSET , "C");
//
//         if (readCellFromSheetAsString(sheet, 291, "A").equals("Unemployment")) {
//              inLaborForceInArmedForces_2021 = 0;
//              inLaborForceInArmedForces_2021_Percent = 0.0;
//              HOUSING_OFFSET--;
//         }
//
//        //Unemployment
//
//         Integer unemployment_2019_1st_Qtr = readCellFromSheetAsInteger(sheet, 294+HOUSING_OFFSET, "B");
//         Integer unemployment_2019_2nd_Qtr = readCellFromSheetAsInteger(sheet, 294+HOUSING_OFFSET, "C");
//         Integer unemployment_2019_3rd_Qtr = readCellFromSheetAsInteger(sheet, 294+HOUSING_OFFSET, "D");
//         Integer unemployment_2019_4th_Qtr = readCellFromSheetAsInteger(sheet, 294+HOUSING_OFFSET, "E");
//         Integer unemployment_2020_1st_Qtr = readCellFromSheetAsInteger(sheet, 294+HOUSING_OFFSET, "F");
//         Integer unemployment_2020_2nd_Qtr = readCellFromSheetAsInteger(sheet, 294+HOUSING_OFFSET, "G");
//         Integer unemployment_2020_3rd_Qtr = readCellFromSheetAsInteger(sheet, 294+HOUSING_OFFSET, "H");
//         Integer unemployment_2020_4th_Qtr = readCellFromSheetAsInteger(sheet, 294+HOUSING_OFFSET, "I");
//
//         Integer unemployment_2019_1st_Qtr_2019_2nd_Qtr_Change = readCellFromSheetAsInteger(sheet, 295+HOUSING_OFFSET, "C");
//         Integer unemployment_2019_2nd_Qtr_2019_3rd_Qtr_Change = readCellFromSheetAsInteger(sheet, 295+HOUSING_OFFSET, "D");
//         Integer unemployment_2019_3rd_Qtr_2019_4th_Qtr_Change = readCellFromSheetAsInteger(sheet, 295+HOUSING_OFFSET, "E");
//         Integer unemployment_2019_4th_Qtr_2020_1st_Qtr_Change = readCellFromSheetAsInteger(sheet, 295+HOUSING_OFFSET, "F");
//         Integer unemployment_2020_1st_Qtr_2020_2nd_Qtr_Change = readCellFromSheetAsInteger(sheet, 295+HOUSING_OFFSET, "G");
//         Integer unemployment_2020_2nd_Qtr_2020_3rd_Qtr_Change = readCellFromSheetAsInteger(sheet, 295+HOUSING_OFFSET, "H");
//         Integer unemployment_2020_3rd_Qtr_2020_4th_Qtr_Change = readCellFromSheetAsInteger(sheet, 295+HOUSING_OFFSET, "I");
//
//         Double unemployment_2019_1st_Qtr_2019_2nd_Qtr_ChangePercent = readCellFromSheetAsDouble(sheet, 296+HOUSING_OFFSET, "C");
//         Double unemployment_2019_2nd_Qtr_2019_3rd_Qtr_ChangePercent = readCellFromSheetAsDouble(sheet, 296+HOUSING_OFFSET, "D");
//         Double unemployment_2019_3rd_Qtr_2019_4th_Qtr_ChangePercent = readCellFromSheetAsDouble(sheet, 296+HOUSING_OFFSET, "E");
//         Double unemployment_2019_4th_Qtr_2020_1st_Qtr_ChangePercent = readCellFromSheetAsDouble(sheet, 296+HOUSING_OFFSET, "F");
//         Double unemployment_2020_1st_Qtr_2020_2nd_Qtr_ChangePercent = readCellFromSheetAsDouble(sheet, 296+HOUSING_OFFSET, "G");
//         Double unemployment_2020_2nd_Qtr_2020_3rd_Qtr_ChangePercent = readCellFromSheetAsDouble(sheet, 296+HOUSING_OFFSET, "H");
//         Double unemployment_2020_3rd_Qtr_2020_4th_Qtr_ChangePercent = readCellFromSheetAsDouble(sheet, 296+HOUSING_OFFSET, "I");
//
//        //Employed Pop 16+ Blue/White Collar
//
//         Integer employmentBlueCollar_2021 = readCellFromSheetAsInteger(sheet, 301+HOUSING_OFFSET, "B");
//         Integer employmentWhiteCollar_2021 = readCellFromSheetAsInteger(sheet, 302+HOUSING_OFFSET, "B");
//
//         Double employmentBlueCollar_2021_Percent = readCellFromSheetAsDouble(sheet, 301+HOUSING_OFFSET, "C");
//         Double employmentWhiteCollar_2021_Percent = readCellFromSheetAsDouble(sheet, 302+HOUSING_OFFSET, "C");
//
//
//        //Average Income Trends: Households and Per Capita
//
//         Integer averageHouseholdIncome_2010 = readCellFromSheetAsInteger(sheet, 308+HOUSING_OFFSET, "B");
//         Integer averageHouseholdIncome_2021 = readCellFromSheetAsInteger(sheet, 308+HOUSING_OFFSET, "C");
//         Integer averageHouseholdIncome_2026 = readCellFromSheetAsInteger(sheet, 308+HOUSING_OFFSET, "D");
//
//         Integer perCapitaIncome_2010 = readCellFromSheetAsInteger(sheet, 311+HOUSING_OFFSET, "B");
//         Integer perCapitaIncome_2021 = readCellFromSheetAsInteger(sheet, 311+HOUSING_OFFSET, "C");
//         Integer perCapitaIncome_2026 = readCellFromSheetAsInteger(sheet, 311+HOUSING_OFFSET, "D");
//
//         Integer averageHouseholdIncome_2010_2021_Change = readCellFromSheetAsInteger(sheet, 309+HOUSING_OFFSET, "C");
//         Integer averageHouseholdIncome_2021_2026_Change = readCellFromSheetAsInteger(sheet, 309+HOUSING_OFFSET, "D");
//
//         Double averageHouseholdIncome_2010_2021_Change_Percent = readCellFromSheetAsDouble(sheet, 310+HOUSING_OFFSET, "C");
//         Double averageHouseholdIncome_2021_2026_Change_Percent = readCellFromSheetAsDouble(sheet, 310+HOUSING_OFFSET, "D");
//
//         Integer perCapitaIncome_2010_2021_Change = readCellFromSheetAsInteger(sheet, 312+HOUSING_OFFSET, "C");
//         Integer perCapitaIncome_2021_2026_Change = readCellFromSheetAsInteger(sheet, 312+HOUSING_OFFSET, "D");
//
//         Double perCapitaIncome_2010_2021_Change_Percent = readCellFromSheetAsDouble(sheet, 313+HOUSING_OFFSET, "C");
//         Double perCapitaIncome_2021_2026_Change_Percent = readCellFromSheetAsDouble(sheet, 313+HOUSING_OFFSET, "D");
//
//        //Summary: Population by Household Type
//
//         Integer populationInFamilyHousehold_2010 = readCellFromSheetAsInteger(sheet, 318+HOUSING_OFFSET, "B");
//         Integer populationInFamilyHousehold_2021 = readCellFromSheetAsInteger(sheet, 318+HOUSING_OFFSET, "C");
//         Integer populationInFamilyHousehold_2026 = readCellFromSheetAsInteger(sheet, 318+HOUSING_OFFSET, "D");
//
//         Integer populationInNonFamilyHousehold_2010 = readCellFromSheetAsInteger(sheet, 319+HOUSING_OFFSET, "B");
//         Integer populationInNonFamilyHousehold_2021 = readCellFromSheetAsInteger(sheet, 319+HOUSING_OFFSET, "C");
//         Integer populationInNonFamilyHousehold_2026 = readCellFromSheetAsInteger(sheet, 319+HOUSING_OFFSET, "D");
//
//         Integer populationInGroupQuarters_2010 = readCellFromSheetAsInteger(sheet, 320+HOUSING_OFFSET, "B");
//         Integer populationInGroupQuarters_2021 = readCellFromSheetAsInteger(sheet, 320+HOUSING_OFFSET, "C");
//         Integer populationInGroupQuarters_2026 = readCellFromSheetAsInteger(sheet, 320+HOUSING_OFFSET, "D");
//
//         Double populationInFamilyHousehold_2010_Percent = readCellFromSheetAsDouble(sheet, 318+HOUSING_OFFSET, "E");
//         Double populationInFamilyHousehold_2021_Percent = readCellFromSheetAsDouble(sheet, 318+HOUSING_OFFSET, "F");
//         Double populationInFamilyHousehold_2026_Percent = readCellFromSheetAsDouble(sheet, 318+HOUSING_OFFSET, "G");
//
//         Double populationInNonFamilyHousehold_2010_Percent = readCellFromSheetAsDouble(sheet, 319+HOUSING_OFFSET, "E");
//         Double populationInNonFamilyHousehold_2021_Percent = readCellFromSheetAsDouble(sheet, 319+HOUSING_OFFSET, "F");
//         Double populationInNonFamilyHousehold_2026_Percent = readCellFromSheetAsDouble(sheet, 319+HOUSING_OFFSET, "G");
//
//         Double populationInGroupQuarters_2010_Percent = readCellFromSheetAsDouble(sheet, 320+HOUSING_OFFSET, "E");
//         Double populationInGroupQuarters_2021_Percent = readCellFromSheetAsDouble(sheet, 320+HOUSING_OFFSET, "F");
//         Double populationInGroupQuarters_2026_Percent = readCellFromSheetAsDouble(sheet, 320+HOUSING_OFFSET, "G");
//
//        //Summary: Families in Poverty
//
//         Integer familiesAbovePovertyLevel_2021 = readCellFromSheetAsInteger(sheet, 326+HOUSING_OFFSET, "B");
//         Integer familiesBelowPovertyLevel_2021 = readCellFromSheetAsInteger(sheet, 327+HOUSING_OFFSET, "B");
//
//         Double familiesAbovePovertyLevel_2021_Percent = readCellFromSheetAsDouble(sheet, 326+HOUSING_OFFSET, "C");
//         Double familiesBelowPovertyLevel_2021_Percent = readCellFromSheetAsDouble(sheet, 327+HOUSING_OFFSET, "C");
//
//        //Summary: Housing Units
//
//         Integer summaryHousingUnits_2010 = readCellFromSheetAsInteger(sheet, 333+HOUSING_OFFSET, "B");
//         Integer summaryHousingUnits_2021 = readCellFromSheetAsInteger(sheet, 333+HOUSING_OFFSET, "C");
//         Integer summaryHousingUnits_2026 = readCellFromSheetAsInteger(sheet, 333+HOUSING_OFFSET, "D");
//
//         Integer summaryHousingUnitsChange_2010_2021 = readCellFromSheetAsInteger(sheet, 334+HOUSING_OFFSET, "C");
//         Integer summaryHousingUnitsChange_2021_2026 = readCellFromSheetAsInteger(sheet, 334+HOUSING_OFFSET, "D");
//
//         Double summaryHousingUnitsChange_2010_2021_Percent = readCellFromSheetAsDouble(sheet, 335+HOUSING_OFFSET, "C");
//         Double summaryHousingUnitsChange_2021_2026_Percent = readCellFromSheetAsDouble(sheet, 335+HOUSING_OFFSET, "D");
//
//
//          UMCReport report = new UMCReport();
//
//         report.district=district;
//         report.population_2000=population_2000;
//         report.population_2010=population_2010;
//         report.population_2021=population_2021;
//         report.population_2026=population_2026;
//         report.population_2031=population_2031;
//         report.populationChange_2000_2010=populationChange_2000_2010;
//         report.populationChange_2010_2021=populationChange_2010_2021;
//         report.populationChange_2021_2026=populationChange_2021_2026;
//         report.populationChange_2026_2031=populationChange_2026_2031;
//         report.populationPercentChange_2000_2010=populationPercentChange_2000_2010;
//         report.populationPercentChange_2010_2021=populationPercentChange_2010_2021;
//         report.populationPercentChange_2021_2026=populationPercentChange_2021_2026;
//         report.populationPercentChange_2026_2031=populationPercentChange_2026_2031;
//         report.populationRecent8QuarterHistory_2019_1st_Qtr=populationRecent8QuarterHistory_2019_1st_Qtr;
//         report.populationRecent8QuarterHistory_2019_2nd_Qtr=populationRecent8QuarterHistory_2019_2nd_Qtr;
//         report.populationRecent8QuarterHistory_2019_3rd_Qtr=populationRecent8QuarterHistory_2019_3rd_Qtr;
//         report.populationRecent8QuarterHistory_2019_4th_Qtr=populationRecent8QuarterHistory_2019_4th_Qtr;
//         report.populationRecent8QuarterHistory_2020_1st_Qtr=populationRecent8QuarterHistory_2020_1st_Qtr;
//         report.populationRecent8QuarterHistory_2020_2nd_Qtr=populationRecent8QuarterHistory_2020_2nd_Qtr;
//         report.populationRecent8QuarterHistory_2020_3rd_Qtr=populationRecent8QuarterHistory_2020_3rd_Qtr;
//         report.populationRecent8QuarterHistory_2020_4th_Qtr=populationRecent8QuarterHistory_2020_4th_Qtr;
//         report.populationRecent8QuarterHistoryChange_2019_2nd_2019_3rd=populationRecent8QuarterHistoryChange_2019_2nd_2019_3rd;
//         report.populationRecent8QuarterHistoryChange_2019_3rd_2019_4th=populationRecent8QuarterHistoryChange_2019_3rd_2019_4th;
//         report.populationRecent8QuarterHistoryChange_2019_4th_2020_1st=populationRecent8QuarterHistoryChange_2019_4th_2020_1st;
//         report.populationRecent8QuarterHistoryChange_2019_1st_2019_2nd=populationRecent8QuarterHistoryChange_2019_1st_2019_2nd;
//         report.populationRecent8QuarterHistoryChange_2020_1st_2020_2nd=populationRecent8QuarterHistoryChange_2020_1st_2020_2nd;
//         report.populationRecent8QuarterHistoryChange_2020_2nd_2020_3rd=populationRecent8QuarterHistoryChange_2020_2nd_2020_3rd;
//         report.populationRecent8QuarterHistoryChange_2020_3rd_2020_4th=populationRecent8QuarterHistoryChange_2020_3rd_2020_4th;
//         report.populationRecent8QuarterHistoryChangePercent_2019_2nd_2019_3rd=populationRecent8QuarterHistoryChangePercent_2019_2nd_2019_3rd;
//         report.populationRecent8QuarterHistoryChangePercent_2019_3rd_2019_4th=populationRecent8QuarterHistoryChangePercent_2019_3rd_2019_4th;
//         report.populationRecent8QuarterHistoryChangePercent_2019_4th_2020_1st=populationRecent8QuarterHistoryChangePercent_2019_4th_2020_1st;
//         report.populationRecent8QuarterHistoryChangePercent_2019_1st_2019_2nd=populationRecent8QuarterHistoryChangePercent_2019_1st_2019_2nd;
//         report.populationRecent8QuarterHistoryChangePercent_2020_1st_2020_2nd=populationRecent8QuarterHistoryChangePercent_2020_1st_2020_2nd;
//         report.populationRecent8QuarterHistoryChangePercent_2020_2nd_2020_3rd=populationRecent8QuarterHistoryChangePercent_2020_2nd_2020_3rd;
//         report.populationRecent8QuarterHistoryChangePercent_2020_3rd_2020_4th=populationRecent8QuarterHistoryChangePercent_2020_3rd_2020_4th;
//         report.populationEnrolledInElementarySchool=populationEnrolledInElementarySchool;
//         report.populationEnrolledInHighSchool=populationEnrolledInHighSchool;
//         report.populationEnrolledInPreschool=populationEnrolledInPreschool;
//         report.populationEnrolledInElementarySchoolPercent=populationEnrolledInElementarySchoolPercent;
//         report.populationEnrolledInHighSchoolPercent=populationEnrolledInHighSchoolPercent;
//         report.populationEnrolledInPreschoolPercent=populationEnrolledInPreschoolPercent;
//         report.populationAttainmentLessThan9th_2010=populationAttainmentLessThan9th_2010;
//         report.populationAttainmentLessThan9th_2021=populationAttainmentLessThan9th_2021;
//         report.populationAttainmentLessThan9th_2026=populationAttainmentLessThan9th_2026;
//         report.populationAttainmentSomeHighSchool_2010=populationAttainmentSomeHighSchool_2010;
//         report.populationAttainmentSomeHighSchool_2021=populationAttainmentSomeHighSchool_2021;
//         report.populationAttainmentSomeHighSchool_2026=populationAttainmentSomeHighSchool_2026;
//         report.populationAttainmentHighSchoolGraduate_2010=populationAttainmentHighSchoolGraduate_2010;
//         report.populationAttainmentHighSchoolGraduate_2021=populationAttainmentHighSchoolGraduate_2021;
//         report.populationAttainmentHighSchoolGraduate_2026=populationAttainmentHighSchoolGraduate_2026;
//         report.populationAttainmentSomeCollege_2010=populationAttainmentSomeCollege_2010;
//         report.populationAttainmentSomeCollege_2021=populationAttainmentSomeCollege_2021;
//         report.populationAttainmentSomeCollege_2026=populationAttainmentSomeCollege_2026;
//         report.populationAttainmentAssociatesDegree_2010=populationAttainmentAssociatesDegree_2010;
//         report.populationAttainmentAssociatesDegree_2021=populationAttainmentAssociatesDegree_2021;
//         report.populationAttainmentAssociatesDegree_2026=populationAttainmentAssociatesDegree_2026;
//         report.populationAttainmentBachelorsDegree_2010=populationAttainmentBachelorsDegree_2010;
//         report.populationAttainmentBachelorsDegree_2021=populationAttainmentBachelorsDegree_2021;
//         report.populationAttainmentBachelorsDegree_2026=populationAttainmentBachelorsDegree_2026;
//         report.populationAttainmentGraduateOrProfessional_2010=populationAttainmentGraduateOrProfessional_2010;
//         report.populationAttainmentGraduateOrProfessional_2021=populationAttainmentGraduateOrProfessional_2021;
//         report.populationAttainmentGraduateOrProfessional_2026=populationAttainmentGraduateOrProfessional_2026;
//         report.populationAttainmentLessThan9thPercent_2010=populationAttainmentLessThan9thPercent_2010;
//         report.populationAttainmentLessThan9thPercent_2021=populationAttainmentLessThan9thPercent_2021;
//         report.populationAttainmentLessThan9thPercent_2026=populationAttainmentLessThan9thPercent_2026;
//         report.populationAttainmentSomeHighSchoolPercent_2010=populationAttainmentSomeHighSchoolPercent_2010;
//         report.populationAttainmentSomeHighSchoolPercent_2021=populationAttainmentSomeHighSchoolPercent_2021;
//         report.populationAttainmentSomeHighSchoolPercent_2026=populationAttainmentSomeHighSchoolPercent_2026;
//         report.populationAttainmentHighSchoolGraduatePercent_2010=populationAttainmentHighSchoolGraduatePercent_2010;
//         report.populationAttainmentHighSchoolGraduatePercent_2021=populationAttainmentHighSchoolGraduatePercent_2021;
//         report.populationAttainmentHighSchoolGraduatePercent_2026=populationAttainmentHighSchoolGraduatePercent_2026;
//         report.populationAttainmentSomeCollegePercent_2010=populationAttainmentSomeCollegePercent_2010;
//         report.populationAttainmentSomeCollegePercent_2021=populationAttainmentSomeCollegePercent_2021;
//         report.populationAttainmentSomeCollegePercent_2026=populationAttainmentSomeCollegePercent_2026;
//         report.populationAttainmentAssociatesDegreePercent_2010=populationAttainmentAssociatesDegreePercent_2010;
//         report.populationAttainmentAssociatesDegreePercent_2021=populationAttainmentAssociatesDegreePercent_2021;
//         report.populationAttainmentAssociatesDegreePercent_2026=populationAttainmentAssociatesDegreePercent_2026;
//         report.populationAttainmentBachelorsDegreePercent_2010=populationAttainmentBachelorsDegreePercent_2010;
//         report.populationAttainmentBachelorsDegreePercent_2021=populationAttainmentBachelorsDegreePercent_2021;
//         report.populationAttainmentBachelorsDegreePercent_2026=populationAttainmentBachelorsDegreePercent_2026;
//         report.populationAttainmentGraduateOrProfessionalPercent_2010=populationAttainmentGraduateOrProfessionalPercent_2010;
//         report.populationAttainmentGraduateOrProfessionalPercent_2021=populationAttainmentGraduateOrProfessionalPercent_2021;
//         report.populationAttainmentGraduateOrProfessionalPercent_2026=populationAttainmentGraduateOrProfessionalPercent_2026;
//         report.ageForecast_2021_0To4=ageForecast_2021_0To4;
//         report.ageForecast_2021_5To13=ageForecast_2021_5To13;
//         report.ageForecast_2021_14To17=ageForecast_2021_14To17;
//         report.ageForecast_2021_18To21=ageForecast_2021_18To21;
//         report.ageForecast_2021_22To24=ageForecast_2021_22To24;
//         report.ageForecast_2021_25To29=ageForecast_2021_25To29;
//         report.ageForecast_2021_30To34=ageForecast_2021_30To34;
//         report.ageForecast_2021_35To39=ageForecast_2021_35To39;
//         report.ageForecast_2021_40To44=ageForecast_2021_40To44;
//         report.ageForecast_2021_45To49=ageForecast_2021_45To49;
//         report.ageForecast_2021_50To54=ageForecast_2021_50To54;
//         report.ageForecast_2021_55To64=ageForecast_2021_55To64;
//         report.ageForecast_2021_65To74=ageForecast_2021_65To74;
//         report.ageForecast_2021_75To84=ageForecast_2021_75To84;
//         report.ageForecast_2021_85Plus=ageForecast_2021_85Plus;
//         report.ageForecast_2026_0To4=ageForecast_2026_0To4;
//         report.ageForecast_2026_5To13=ageForecast_2026_5To13;
//         report.ageForecast_2026_14To17=ageForecast_2026_14To17;
//         report.ageForecast_2026_18To21=ageForecast_2026_18To21;
//         report.ageForecast_2026_22To24=ageForecast_2026_22To24;
//         report.ageForecast_2026_25To29=ageForecast_2026_25To29;
//         report.ageForecast_2026_30To34=ageForecast_2026_30To34;
//         report.ageForecast_2026_35To39=ageForecast_2026_35To39;
//         report.ageForecast_2026_40To44=ageForecast_2026_40To44;
//         report.ageForecast_2026_45To49=ageForecast_2026_45To49;
//         report.ageForecast_2026_50To54=ageForecast_2026_50To54;
//         report.ageForecast_2026_55To64=ageForecast_2026_55To64;
//         report.ageForecast_2026_65To74=ageForecast_2026_65To74;
//         report.ageForecast_2026_75To84=ageForecast_2026_75To84;
//         report.ageForecast_2026_85Plus=ageForecast_2026_85Plus;
//         report.ageForecast_2031_0To4=ageForecast_2031_0To4;
//         report.ageForecast_2031_5To13=ageForecast_2031_5To13;
//         report.ageForecast_2031_14To17=ageForecast_2031_14To17;
//         report.ageForecast_2031_18To21=ageForecast_2031_18To21;
//         report.ageForecast_2031_22To24=ageForecast_2031_22To24;
//         report.ageForecast_2031_25To29=ageForecast_2031_25To29;
//         report.ageForecast_2031_30To34=ageForecast_2031_30To34;
//         report.ageForecast_2031_35To39=ageForecast_2031_35To39;
//         report.ageForecast_2031_40To44=ageForecast_2031_40To44;
//         report.ageForecast_2031_45To49=ageForecast_2031_45To49;
//         report.ageForecast_2031_50To54=ageForecast_2031_50To54;
//         report.ageForecast_2031_55To64=ageForecast_2031_55To64;
//         report.ageForecast_2031_65To74=ageForecast_2031_65To74;
//         report.ageForecast_2031_75To84=ageForecast_2031_75To84;
//         report.ageForecast_2031_85Plus=ageForecast_2031_85Plus;
//         report.ageForecastPercentChange_2021_2026_0To4=ageForecastPercentChange_2021_2026_0To4;
//         report.ageForecastPercentChange_2021_2026_5To13=ageForecastPercentChange_2021_2026_5To13;
//         report.ageForecastPercentChange_2021_2026_14To17=ageForecastPercentChange_2021_2026_14To17;
//         report.ageForecastPercentChange_2021_2026_18To21=ageForecastPercentChange_2021_2026_18To21;
//         report.ageForecastPercentChange_2021_2026_22To24=ageForecastPercentChange_2021_2026_22To24;
//         report.ageForecastPercentChange_2021_2026_25To29=ageForecastPercentChange_2021_2026_25To29;
//         report.ageForecastPercentChange_2021_2026_30To34=ageForecastPercentChange_2021_2026_30To34;
//         report.ageForecastPercentChange_2021_2026_35To39=ageForecastPercentChange_2021_2026_35To39;
//         report.ageForecastPercentChange_2021_2026_40To44=ageForecastPercentChange_2021_2026_40To44;
//         report.ageForecastPercentChange_2021_2026_45To49=ageForecastPercentChange_2021_2026_45To49;
//         report.ageForecastPercentChange_2021_2026_50To54=ageForecastPercentChange_2021_2026_50To54;
//         report.ageForecastPercentChange_2021_2026_55To64=ageForecastPercentChange_2021_2026_55To64;
//         report.ageForecastPercentChange_2021_2026_65To74=ageForecastPercentChange_2021_2026_65To74;
//         report.ageForecastPercentChange_2021_2026_75To84=ageForecastPercentChange_2021_2026_75To84;
//         report.ageForecastPercentChange_2021_2026_85Plus=ageForecastPercentChange_2021_2026_85Plus;
//         report.ageForecastPercentChange_2026_2031_0To4=ageForecastPercentChange_2026_2031_0To4;
//         report.ageForecastPercentChange_2026_2031_5To13=ageForecastPercentChange_2026_2031_5To13;
//         report.ageForecastPercentChange_2026_2031_14To17=ageForecastPercentChange_2026_2031_14To17;
//         report.ageForecastPercentChange_2026_2031_18To21=ageForecastPercentChange_2026_2031_18To21;
//         report.ageForecastPercentChange_2026_2031_22To24=ageForecastPercentChange_2026_2031_22To24;
//         report.ageForecastPercentChange_2026_2031_25To29=ageForecastPercentChange_2026_2031_25To29;
//         report.ageForecastPercentChange_2026_2031_30To34=ageForecastPercentChange_2026_2031_30To34;
//         report.ageForecastPercentChange_2026_2031_35To39=ageForecastPercentChange_2026_2031_35To39;
//         report.ageForecastPercentChange_2026_2031_40To44=ageForecastPercentChange_2026_2031_40To44;
//         report.ageForecastPercentChange_2026_2031_45To49=ageForecastPercentChange_2026_2031_45To49;
//         report.ageForecastPercentChange_2026_2031_50To54=ageForecastPercentChange_2026_2031_50To54;
//         report.ageForecastPercentChange_2026_2031_55To64=ageForecastPercentChange_2026_2031_55To64;
//         report.ageForecastPercentChange_2026_2031_65To74=ageForecastPercentChange_2026_2031_65To74;
//         report.ageForecastPercentChange_2026_2031_75To84=ageForecastPercentChange_2026_2031_75To84;
//         report.ageForecastPercentChange_2026_2031_85Plus=ageForecastPercentChange_2026_2031_85Plus;
//         report.neverMarried_2010=neverMarried_2010;
//         report.married_2010=married_2010;
//         report.divorced_2010=divorced_2010;
//         report.separated_2010=separated_2010;
//         report.widowed_2010=widowed_2010;
//         report.neverMarried_2021=neverMarried_2021;
//         report.married_2021=married_2021;
//         report.divorced_2021=divorced_2021;
//         report.separated_2021=separated_2021;
//         report.widowed_2021=widowed_2021;
//         report.neverMarried_2026=neverMarried_2026;
//         report.married_2026=married_2026;
//         report.divorced_2026=divorced_2026;
//         report.separated_2026=separated_2026;
//         report.widowed_2026=widowed_2026;
//         report.neverMarriedPercent_2010=neverMarriedPercent_2010;
//         report.marriedPercent_2010=marriedPercent_2010;
//         report.divorcedPercent_2010=divorcedPercent_2010;
//         report.separatedPercent_2010=separatedPercent_2010;
//         report.widowedPercent_2010=widowedPercent_2010;
//         report.neverMarriedPercent_2021=neverMarriedPercent_2021;
//         report.marriedPercent_2021=marriedPercent_2021;
//         report.divorcedPercent_2021=divorcedPercent_2021;
//         report.separatedPercent_2021=separatedPercent_2021;
//         report.widowedPercent_2021=widowedPercent_2021;
//         report.neverMarriedPercent_2026=neverMarriedPercent_2026;
//         report.marriedPercent_2026=marriedPercent_2026;
//         report.divorcedPercent_2026=divorcedPercent_2026;
//         report.separatedPercent_2026=separatedPercent_2026;
//         report.widowedPercent_2026=widowedPercent_2026;
//         report.outreachOpportunitiesEarlyAdolescent=outreachOpportunitiesEarlyAdolescent;
//         report.outreachOpportunitiesPreschool=outreachOpportunitiesPreschool;
//         report.outreachOpportunitiesEarlyAdolescentPercent=outreachOpportunitiesEarlyAdolescentPercent;
//         report.outreachOpportunitiesPreschoolPercent=outreachOpportunitiesPreschoolPercent;
//         report.outreachOpportunitiesAges_20To24=outreachOpportunitiesAges_20To24;
//         report.households_2000=households_2000;
//         report.households_2010=households_2010;
//         report.households_2021=households_2021;
//         report.households_2026=households_2026;
//         report.households_2031=households_2031;
//         report.householdsChange_2000_2010=householdsChange_2000_2010;
//         report.householdsChange_2010_2021=householdsChange_2010_2021;
//         report.householdsChange_2021_2026=householdsChange_2021_2026;
//         report.householdsChange_2026_2031=householdsChange_2026_2031;
//         report.householdsChangePercent_2000_2010=householdsChangePercent_2000_2010;
//         report.householdsChangePercent_2010_2021=householdsChangePercent_2010_2021;
//         report.householdsChangePercent_2021_2026=householdsChangePercent_2021_2026;
//         report.householdsChangePercent_2026_2031=householdsChangePercent_2026_2031;
//         report.householdIncomeForecast_LessThan10_000_2010=householdIncomeForecast_LessThan10_000_2010;
//         report.householdIncomeForecast_10_000_To_14_999_2010=householdIncomeForecast_10_000_To_14_999_2010;
//         report.householdIncomeForecast_15_000_To_24_999_2010=householdIncomeForecast_15_000_To_24_999_2010;
//         report.householdIncomeForecast_25_000_To_34_999_2010=householdIncomeForecast_25_000_To_34_999_2010;
//         report.householdIncomeForecast_35_000_To_49_999_2010=householdIncomeForecast_35_000_To_49_999_2010;
//         report.householdIncomeForecast_50_000_To_74_999_2010=householdIncomeForecast_50_000_To_74_999_2010;
//         report.householdIncomeForecast_75_000_To_99_999_2010=householdIncomeForecast_75_000_To_99_999_2010;
//         report.householdIncomeForecast_100_000_To_149_999_2010=householdIncomeForecast_100_000_To_149_999_2010;
//         report.householdIncomeForecast_150_000_To_199_999_2010=householdIncomeForecast_150_000_To_199_999_2010;
//         report.householdIncomeForecast_200_000Plus_2010=householdIncomeForecast_200_000Plus_2010;
//         report.householdIncomeForecast_LessThan10_000_2021=householdIncomeForecast_LessThan10_000_2021;
//         report.householdIncomeForecast_10_000_To_14_999_2021=householdIncomeForecast_10_000_To_14_999_2021;
//         report.householdIncomeForecast_15_000_To_24_999_2021=householdIncomeForecast_15_000_To_24_999_2021;
//         report.householdIncomeForecast_25_000_To_34_999_2021=householdIncomeForecast_25_000_To_34_999_2021;
//         report.householdIncomeForecast_35_000_To_49_999_2021=householdIncomeForecast_35_000_To_49_999_2021;
//         report.householdIncomeForecast_50_000_To_74_999_2021=householdIncomeForecast_50_000_To_74_999_2021;
//         report.householdIncomeForecast_75_000_To_99_999_2021=householdIncomeForecast_75_000_To_99_999_2021;
//         report.householdIncomeForecast_100_000_To_149_999_2021=householdIncomeForecast_100_000_To_149_999_2021;
//         report.householdIncomeForecast_150_000_To_199_999_2021=householdIncomeForecast_150_000_To_199_999_2021;
//         report.householdIncomeForecast_200_000Plus_2021=householdIncomeForecast_200_000Plus_2021;
//         report.householdIncomeForecast_LessThan10_000_2026=householdIncomeForecast_LessThan10_000_2026;
//         report.householdIncomeForecast_10_000_To_14_999_2026=householdIncomeForecast_10_000_To_14_999_2026;
//         report.householdIncomeForecast_15_000_To_24_999_2026=householdIncomeForecast_15_000_To_24_999_2026;
//         report.householdIncomeForecast_25_000_To_34_999_2026=householdIncomeForecast_25_000_To_34_999_2026;
//         report.householdIncomeForecast_35_000_To_49_999_2026=householdIncomeForecast_35_000_To_49_999_2026;
//         report.householdIncomeForecast_50_000_To_74_999_2026=householdIncomeForecast_50_000_To_74_999_2026;
//         report.householdIncomeForecast_75_000_To_99_999_2026=householdIncomeForecast_75_000_To_99_999_2026;
//         report.householdIncomeForecast_100_000_To_149_999_2026=householdIncomeForecast_100_000_To_149_999_2026;
//         report.householdIncomeForecast_150_000_To_199_999_2026=householdIncomeForecast_150_000_To_199_999_2026;
//         report.householdIncomeForecast_200_000Plus_2026=householdIncomeForecast_200_000Plus_2026;
//         report.householdIncomeForecast_LessThan10_000_2010_Percent=householdIncomeForecast_LessThan10_000_2010_Percent;
//         report.householdIncomeForecast_10_000_To_14_999_2010_Percent=householdIncomeForecast_10_000_To_14_999_2010_Percent;
//         report.householdIncomeForecast_15_000_To_24_999_2010_Percent=householdIncomeForecast_15_000_To_24_999_2010_Percent;
//         report.householdIncomeForecast_25_000_To_34_999_2010_Percent=householdIncomeForecast_25_000_To_34_999_2010_Percent;
//         report.householdIncomeForecast_35_000_To_49_999_2010_Percent=householdIncomeForecast_35_000_To_49_999_2010_Percent;
//         report.householdIncomeForecast_50_000_To_74_999_2010_Percent=householdIncomeForecast_50_000_To_74_999_2010_Percent;
//         report.householdIncomeForecast_75_000_To_99_999_2010_Percent=householdIncomeForecast_75_000_To_99_999_2010_Percent;
//         report.householdIncomeForecast_100_000_To_149_999_2010_Percent=householdIncomeForecast_100_000_To_149_999_2010_Percent;
//         report.householdIncomeForecast_150_000_To_199_999_2010_Percent=householdIncomeForecast_150_000_To_199_999_2010_Percent;
//         report.householdIncomeForecast_200_000Plus_2010_Percent=householdIncomeForecast_200_000Plus_2010_Percent;
//         report.householdIncomeForecast_LessThan10_000_2021_Percent=householdIncomeForecast_LessThan10_000_2021_Percent;
//         report.householdIncomeForecast_10_000_To_14_999_2021_Percent=householdIncomeForecast_10_000_To_14_999_2021_Percent;
//         report.householdIncomeForecast_15_000_To_24_999_2021_Percent=householdIncomeForecast_15_000_To_24_999_2021_Percent;
//         report.householdIncomeForecast_25_000_To_34_999_2021_Percent=householdIncomeForecast_25_000_To_34_999_2021_Percent;
//         report.householdIncomeForecast_35_000_To_49_999_2021_Percent=householdIncomeForecast_35_000_To_49_999_2021_Percent;
//         report.householdIncomeForecast_50_000_To_74_999_2021_Percent=householdIncomeForecast_50_000_To_74_999_2021_Percent;
//         report.householdIncomeForecast_75_000_To_99_999_2021_Percent=householdIncomeForecast_75_000_To_99_999_2021_Percent;
//         report.householdIncomeForecast_100_000_To_149_999_2021_Percent=householdIncomeForecast_100_000_To_149_999_2021_Percent;
//         report.householdIncomeForecast_150_000_To_199_999_2021_Percent=householdIncomeForecast_150_000_To_199_999_2021_Percent;
//         report.householdIncomeForecast_200_000Plus_2021_Percent=householdIncomeForecast_200_000Plus_2021_Percent;
//         report.householdIncomeForecast_LessThan10_000_2026_Percent=householdIncomeForecast_LessThan10_000_2026_Percent;
//         report.householdIncomeForecast_10_000_To_14_999_2026_Percent=householdIncomeForecast_10_000_To_14_999_2026_Percent;
//         report.householdIncomeForecast_15_000_To_24_999_2026_Percent=householdIncomeForecast_15_000_To_24_999_2026_Percent;
//         report.householdIncomeForecast_25_000_To_34_999_2026_Percent=householdIncomeForecast_25_000_To_34_999_2026_Percent;
//         report.householdIncomeForecast_35_000_To_49_999_2026_Percent=householdIncomeForecast_35_000_To_49_999_2026_Percent;
//         report.householdIncomeForecast_50_000_To_74_999_2026_Percent=householdIncomeForecast_50_000_To_74_999_2026_Percent;
//         report.householdIncomeForecast_75_000_To_99_999_2026_Percent=householdIncomeForecast_75_000_To_99_999_2026_Percent;
//         report.householdIncomeForecast_100_000_To_149_999_2026_Percent=householdIncomeForecast_100_000_To_149_999_2026_Percent;
//         report.householdIncomeForecast_150_000_To_199_999_2026_Percent=householdIncomeForecast_150_000_To_199_999_2026_Percent;
//         report.householdIncomeForecast_200_000Plus_2026_Percent=householdIncomeForecast_200_000Plus_2026_Percent;
//         report.abovePovertyLevel_2021=abovePovertyLevel_2021;
//         report.belowPovertyLevelNon_Family_2021=belowPovertyLevelNon_Family_2021;
//         report.belowPovertyLevelMarried_2021=belowPovertyLevelMarried_2021;
//         report.belowPovertyLevelFemaleHouseholder_2021=belowPovertyLevelFemaleHouseholder_2021;
//         report.belowPovertyLevelMaleHouseholder_2021=belowPovertyLevelMaleHouseholder_2021;
//         report.belowPovertyLevelNon_FamilyStudent_2021=belowPovertyLevelNon_FamilyStudent_2021;
//         report.abovePovertyLevel_2021_Percent=abovePovertyLevel_2021_Percent;
//         report.belowPovertyLevelNon_Family_2021_Percent=belowPovertyLevelNon_Family_2021_Percent;
//         report.belowPovertyLevelMarried_2021_Percent=belowPovertyLevelMarried_2021_Percent;
//         report.belowPovertyLevelFemaleHouseholder_2021_Percent=belowPovertyLevelFemaleHouseholder_2021_Percent;
//         report.belowPovertyLevelMaleHouseholder_2021_Percent=belowPovertyLevelMaleHouseholder_2021_Percent;
//         report.belowPovertyLevelNon_FamilyStudent_2021_Percent=belowPovertyLevelNon_FamilyStudent_2021_Percent;
//         report.householdWealth_2021_100_000_To_249_999=householdWealth_2021_100_000_To_249_999;
//         report.householdWealth_2021_0andUnder=householdWealth_2021_0andUnder;
//         report.householdWealth_2021_500_000OrMore=householdWealth_2021_500_000OrMore;
//         report.householdWealth_2021_250_000_To_499_999=householdWealth_2021_250_000_To_499_999;
//         report.householdWealth_2021_50_000_To_99_999=householdWealth_2021_50_000_To_99_999;
//         report.householdWealth_2021_1_To_4_999=householdWealth_2021_1_To_4_999;
//         report.householdWealth_2021_25_000_To_49_999=householdWealth_2021_25_000_To_49_999;
//         report.householdWealth_2021_10_000_To_24_999=householdWealth_2021_10_000_To_24_999;
//         report.householdWealth_2021_5_000_To_9_999=householdWealth_2021_5_000_To_9_999;
//         report.householdWealthPercent_2021_100_000_To_249_999=householdWealthPercent_2021_100_000_To_249_999;
//         report.householdWealthPercent_2021_0andUnder=householdWealthPercent_2021_0andUnder;
//         report.householdWealthPercent_2021_500_000OrMore=householdWealthPercent_2021_500_000OrMore;
//         report.householdWealthPercent_2021_250_000_To_499_999=householdWealthPercent_2021_250_000_To_499_999;
//         report.householdWealthPercent_2021_50_000_To_99_999=householdWealthPercent_2021_50_000_To_99_999;
//         report.householdWealthPercent_2021_1_To_4_999=householdWealthPercent_2021_1_To_4_999;
//         report.householdWealthPercent_2021_25_000_To_49_999=householdWealthPercent_2021_25_000_To_49_999;
//         report.householdWealthPercent_2021_10_000_To_24_999=householdWealthPercent_2021_10_000_To_24_999;
//         report.householdWealthPercent_2021_5_000_To_9_999=householdWealthPercent_2021_5_000_To_9_999;
//         report.familyHouseholds_2010=familyHouseholds_2010;
//         report.familyHouseholds_2021=familyHouseholds_2021;
//         report.familyHouseholds_2026=familyHouseholds_2026;
//         report.familyHouseholdsChange_2010_2021=familyHouseholdsChange_2010_2021;
//         report.familyHouseholdsChange_2021_2026=familyHouseholdsChange_2021_2026;
//         report.familyHouseholdsChangePercent_2010_2021=familyHouseholdsChangePercent_2010_2021;
//         report.familyHouseholdsChangePercent_2021_2026=familyHouseholdsChangePercent_2021_2026;
//         report.familyMarriedCouple_WithChildren_2010=familyMarriedCouple_WithChildren_2010;
//         report.familyMarriedCouple_WithChildren_2021=familyMarriedCouple_WithChildren_2021;
//         report.familyMarriedCouple_WithChildren_2026=familyMarriedCouple_WithChildren_2026;
//         report.otherFamilyFemaleNoHusbandPresent_WithChildren_2010=otherFamilyFemaleNoHusbandPresent_WithChildren_2010;
//         report.otherFamilyFemaleNoHusbandPresent_WithChildren_2021=otherFamilyFemaleNoHusbandPresent_WithChildren_2021;
//         report.otherFamilyFemaleNoHusbandPresent_WithChildren_2026=otherFamilyFemaleNoHusbandPresent_WithChildren_2026;
//         report.otherFamilyMaleNoFemalePresent_WithChildren_2010=otherFamilyMaleNoFemalePresent_WithChildren_2010;
//         report.otherFamilyMaleNoFemalePresent_WithChildren_2021=otherFamilyMaleNoFemalePresent_WithChildren_2021;
//         report.otherFamilyMaleNoFemalePresent_WithChildren_2026=otherFamilyMaleNoFemalePresent_WithChildren_2026;
//         report.familyMarriedCouple_WithChildren_Percent_2010=familyMarriedCouple_WithChildren_Percent_2010;
//         report.familyMarriedCouple_WithChildren_Percent_2021=familyMarriedCouple_WithChildren_Percent_2021;
//         report.familyMarriedCouple_WithChildren_Percent_2026=familyMarriedCouple_WithChildren_Percent_2026;
//         report.otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2010=otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2010;
//         report.otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2021=otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2021;
//         report.otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2026=otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2026;
//         report.otherFamilyMaleNoFemalePresent_WithChildren_Percent_2010=otherFamilyMaleNoFemalePresent_WithChildren_Percent_2010;
//         report.otherFamilyMaleNoFemalePresent_WithChildren_Percent_2021=otherFamilyMaleNoFemalePresent_WithChildren_Percent_2021;
//         report.otherFamilyMaleNoFemalePresent_WithChildren_Percent_2026=otherFamilyMaleNoFemalePresent_WithChildren_Percent_2026;
//         report.familyMarriedCouple_NoChildren_2010=familyMarriedCouple_NoChildren_2010;
//         report.familyMarriedCouple_NoChildren_2021=familyMarriedCouple_NoChildren_2021;
//         report.familyMarriedCouple_NoChildren_2026=familyMarriedCouple_NoChildren_2026;
//         report.otherFamilyFemaleNoHusbandPresent_NoChildren_2010=otherFamilyFemaleNoHusbandPresent_NoChildren_2010;
//         report.otherFamilyFemaleNoHusbandPresent_NoChildren_2021=otherFamilyFemaleNoHusbandPresent_NoChildren_2021;
//         report.otherFamilyFemaleNoHusbandPresent_NoChildren_2026=otherFamilyFemaleNoHusbandPresent_NoChildren_2026;
//         report.otherFamilyMaleNoFemalePresent_NoChildren_2010=otherFamilyMaleNoFemalePresent_NoChildren_2010;
//         report.otherFamilyMaleNoFemalePresent_NoChildren_2021=otherFamilyMaleNoFemalePresent_NoChildren_2021;
//         report.otherFamilyMaleNoFemalePresent_NoChildren_2026=otherFamilyMaleNoFemalePresent_NoChildren_2026;
//         report.familyMarriedCouple_NoChildren_Percent_2010=familyMarriedCouple_NoChildren_Percent_2010;
//         report.familyMarriedCouple_NoChildren_Percent_2021=familyMarriedCouple_NoChildren_Percent_2021;
//         report.familyMarriedCouple_NoChildren_Percent_2026=familyMarriedCouple_NoChildren_Percent_2026;
//         report.otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2010=otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2010;
//         report.otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2021=otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2021;
//         report.otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2026=otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2026;
//         report.otherFamilyMaleNoFemalePresent_NoChildren_Percent_2010=otherFamilyMaleNoFemalePresent_NoChildren_Percent_2010;
//         report.otherFamilyMaleNoFemalePresent_NoChildren_Percent_2021=otherFamilyMaleNoFemalePresent_NoChildren_Percent_2021;
//         report.otherFamilyMaleNoFemalePresent_NoChildren_Percent_2026=otherFamilyMaleNoFemalePresent_NoChildren_Percent_2026;
//         report.diversityIndexScore_2021=diversityIndexScore_2021;
//         report.asian_2010=asian_2010;
//         report.black_2010=black_2010;
//         report.white_2010=white_2010;
//         report.hispanic_2010=hispanic_2010;
//         report.other_2010=other_2010;
//         report.asian_2021=asian_2021;
//         report.black_2021=black_2021;
//         report.white_2021=white_2021;
//         report.hispanic_2021=hispanic_2021;
//         report.other_2021=other_2021;
//         report.asian_2026=asian_2026;
//         report.black_2026=black_2026;
//         report.white_2026=white_2026;
//         report.hispanic_2026=hispanic_2026;
//         report.other_2026=other_2026;
//         report.asian_2010_Percent=asian_2010_Percent;
//         report.black_2010_Percent=black_2010_Percent;
//         report.white_2010_Percent=white_2010_Percent;
//         report.hispanic_2010_Percent=hispanic_2010_Percent;
//         report.other_2010_Percent=other_2010_Percent;
//         report.asian_2021_Percent=asian_2021_Percent;
//         report.black_2021_Percent=black_2021_Percent;
//         report.white_2021_Percent=white_2021_Percent;
//         report.hispanic_2021_Percent=hispanic_2021_Percent;
//         report.other_2021_Percent=other_2021_Percent;
//         report.asian_2026_Percent=asian_2026_Percent;
//         report.black_2026_Percent=black_2026_Percent;
//         report.white_2026_Percent=white_2026_Percent;
//         report.hispanic_2026_Percent=hispanic_2026_Percent;
//         report.other_2026_Percent=other_2026_Percent;
//         report.asian_2010_2021_Change=asian_2010_2021_Change;
//         report.black_2010_2021_Change=black_2010_2021_Change;
//         report.white_2010_2021_Change=white_2010_2021_Change;
//         report.hispanic_2010_2021_Change=hispanic_2010_2021_Change;
//         report.other_2010_2021_Change=other_2010_2021_Change;
//         report.asian_2021_2026_Change=asian_2021_2026_Change;
//         report.black_2021_2026_Change=black_2021_2026_Change;
//         report.white_2021_2026_Change=white_2021_2026_Change;
//         report.hispanic_2021_2026_Change=hispanic_2021_2026_Change;
//         report.other_2021_2026_Change=other_2021_2026_Change;
//         report.asian_2010_2021_Change_Percent=asian_2010_2021_Change_Percent;
//         report.black_2010_2021_Change_Percent=black_2010_2021_Change_Percent;
//         report.white_2010_2021_Change_Percent=white_2010_2021_Change_Percent;
//         report.hispanic_2010_2021_Change_Percent=hispanic_2010_2021_Change_Percent;
//         report.other_2010_2021_Change_Percent=other_2010_2021_Change_Percent;
//         report.asian_2021_2026_Change_Percent=asian_2021_2026_Change_Percent;
//         report.black_2021_2026_Change_Percent=black_2021_2026_Change_Percent;
//         report.white_2021_2026_Change_Percent=white_2021_2026_Change_Percent;
//         report.hispanic_2021_2026_Change_Percent=hispanic_2021_2026_Change_Percent;
//         report.other_2021_2026_Change_Percent=other_2021_2026_Change_Percent;
//         report.religiousAffiliation_Unknown_2021=religiousAffiliation_Unknown_2021;
//         report.religiousAffiliation_Mainline_2021=religiousAffiliation_Mainline_2021;
//         report.religiousAffiliation_Catholic_2021=religiousAffiliation_Catholic_2021;
//         report.religiousAffiliation_Evangelical_2021=religiousAffiliation_Evangelical_2021;
//         report.religiousAffiliation_Mormon_2021=religiousAffiliation_Mormon_2021;
//         report.religiousAffiliation_Unknown_2021_Percent=religiousAffiliation_Unknown_2021_Percent;
//         report.religiousAffiliation_Mainline_2021_Percent=religiousAffiliation_Mainline_2021_Percent;
//         report.religiousAffiliation_Catholic_2021_Percent=religiousAffiliation_Catholic_2021_Percent;
//         report.religiousAffiliation_Evangelical_2021_Percent=religiousAffiliation_Evangelical_2021_Percent;
//         report.religiousAffiliation_Mormon_2021_Percent=religiousAffiliation_Mormon_2021_Percent;
//         report.housingUnits_2010=housingUnits_2010;
//         report.housingUnits_2021=housingUnits_2021;
//         report.housingUnits_2026=housingUnits_2026;
//         report.housingUnits_PercentChange_2010_2021=housingUnits_PercentChange_2010_2021;
//         report.housingUnits_PercentChange_2021_2026=housingUnits_PercentChange_2021_2026;
//         report.housingUnitsOccupied_2010=housingUnitsOccupied_2010;
//         report.housingUnitsOccupied_2021=housingUnitsOccupied_2021;
//         report.housingUnitsOccupied_2026=housingUnitsOccupied_2026;
//         report.housingUnitsVacant_2010=housingUnitsVacant_2010;
//         report.housingUnitsVacant_2021=housingUnitsVacant_2021;
//         report.housingUnitsVacant_2026=housingUnitsVacant_2026;
//         report.housingUnitsOccupied_2010_Percent=housingUnitsOccupied_2010_Percent;
//         report.housingUnitsOccupied_2021_Percent=housingUnitsOccupied_2021_Percent;
//         report.housingUnitsOccupied_2026_Percent=housingUnitsOccupied_2026_Percent;
//         report.housingUnitsVacant_2010_Percent=housingUnitsVacant_2010_Percent;
//         report.housingUnitsVacant_2021_Percent=housingUnitsVacant_2021_Percent;
//         report.housingUnitsVacant_2026_Percent=housingUnitsVacant_2026_Percent;
//         report.dwellingType_1UnitDetached_2021=dwellingType_1UnitDetached_2021;
//         report.dwellingType_2Units_2021=dwellingType_2Units_2021;
//         report.dwellingType_MobileHomeOrTrailer_2021=dwellingType_MobileHomeOrTrailer_2021;
//         report.dwellingType_3to19Units_2021=dwellingType_3to19Units_2021;
//         report.dwellingType_1UnitAttached_2021=dwellingType_1UnitAttached_2021;
//         report.dwellingType_50orMoreUnits_2021=dwellingType_50orMoreUnits_2021;
//         report.dwellingType_20to49Units_2021=dwellingType_20to49Units_2021;
//         report.dwellingType_1UnitDetached_2021_Percent=dwellingType_1UnitDetached_2021_Percent;
//         report.dwellingType_2Units_2021_Percent=dwellingType_2Units_2021_Percent;
//         report.dwellingType_MobileHomeOrTrailer_2021_Percent=dwellingType_MobileHomeOrTrailer_2021_Percent;
//         report.dwellingType_3to19Units_2021_Percent=dwellingType_3to19Units_2021_Percent;
//         report.dwellingType_1UnitAttached_2021_Percent=dwellingType_1UnitAttached_2021_Percent;
//         report.dwellingType_50orMoreUnits_2021_Percent=dwellingType_50orMoreUnits_2021_Percent;
//         report.dwellingType_20to49Units_2021_Percent=dwellingType_20to49Units_2021_Percent;
//         report.housingValue_100_000_To_149_999_2021=housingValue_100_000_To_149_999_2021;
//         report.housingValue_200_000_To_299_999_2021=housingValue_200_000_To_299_999_2021;
//         report.housingValue_150_000_To_199_999_2021=housingValue_150_000_To_199_999_2021;
//         report.housingValue_80_000_To_99_999_2021=housingValue_80_000_To_99_999_2021;
//         report.housingValue_300_000_To_399_999_2021=housingValue_300_000_To_399_999_2021;
//         report.housingValue_60_000_To_79_999_2021=housingValue_60_000_To_79_999_2021;
//         report.housingValue_40_000_To_59_999_2021=housingValue_40_000_To_59_999_2021;
//         report.housingValue_400_000_To_499_999_2021=housingValue_400_000_To_499_999_2021;
//         report.housingValue_20_000_To_39_999_2021=housingValue_20_000_To_39_999_2021;
//         report.housingValue_500_000_To_749_999_2021=housingValue_500_000_To_749_999_2021;
//         report.housingValue_750_000_To_999_999_2021=housingValue_750_000_To_999_999_2021;
//         report.housingValue_1_000_000_Or_More_2021=housingValue_1_000_000_Or_More_2021;
//         report.housingValue_LessThan_20_000_2021=housingValue_LessThan_20_000_2021;
//         report.housingValue_100_000_To_149_999_2021_Percent=housingValue_100_000_To_149_999_2021_Percent;
//         report.housingValue_200_000_To_299_999_2021_Percent=housingValue_200_000_To_299_999_2021_Percent;
//         report.housingValue_150_000_To_199_999_2021_Percent=housingValue_150_000_To_199_999_2021_Percent;
//         report.housingValue_80_000_To_99_999_2021_Percent=housingValue_80_000_To_99_999_2021_Percent;
//         report.housingValue_300_000_To_399_999_2021_Percent=housingValue_300_000_To_399_999_2021_Percent;
//         report.housingValue_60_000_To_79_999_2021_Percent=housingValue_60_000_To_79_999_2021_Percent;
//         report.housingValue_40_000_To_59_999_2021_Percent=housingValue_40_000_To_59_999_2021_Percent;
//         report.housingValue_400_000_To_499_999_2021_Percent=housingValue_400_000_To_499_999_2021_Percent;
//         report.housingValue_20_000_To_39_999_2021_Percent=housingValue_20_000_To_39_999_2021_Percent;
//         report.housingValue_500_000_To_749_999_2021_Percent=housingValue_500_000_To_749_999_2021_Percent;
//         report.housingValue_750_000_To_999_999_2021_Percent=housingValue_750_000_To_999_999_2021_Percent;
//         report.housingValue_1_000_000_Or_More_2021_Percent=housingValue_1_000_000_Or_More_2021_Percent;
//         report.housingValue_LessThan_20_000_2021_Percent=housingValue_LessThan_20_000_2021_Percent;
//         report.housingOwnerOccupied_2010=housingOwnerOccupied_2010;
//         report.housingOwnerOccupied_2021=housingOwnerOccupied_2021;
//         report.housingOwnerOccupied_2026=housingOwnerOccupied_2026;
//         report.housingRenterOccupied_2010=housingRenterOccupied_2010;
//         report.housingRenterOccupied_2021=housingRenterOccupied_2021;
//         report.housingRenterOccupied_2026=housingRenterOccupied_2026;
//         report.housingOwnerOccupied_2010_Percent=housingOwnerOccupied_2010_Percent;
//         report.housingOwnerOccupied_2021_Percent=housingOwnerOccupied_2021_Percent;
//         report.housingOwnerOccupied_2026_Percent=housingOwnerOccupied_2026_Percent;
//         report.housingRenterOccupied_2010_Percent=housingRenterOccupied_2010_Percent;
//         report.housingRenterOccupied_2021_Percent=housingRenterOccupied_2021_Percent;
//         report.housingRenterOccupied_2026_Percent=housingRenterOccupied_2026_Percent;
//         report.housingOwnerOccupied_2010_2021_Percent_Change=housingOwnerOccupied_2010_2021_Percent_Change;
//         report.housingOwnerOccupied_2021_2026_Percent_Change=housingOwnerOccupied_2021_2026_Percent_Change;
//         report.housingRenterOccupied_2010_2021_Percent_Change=housingRenterOccupied_2010_2021_Percent_Change;
//         report.housingRenterOccupied_2021_2026_Percent_Change=housingRenterOccupied_2021_2026_Percent_Change;
//         report.inLaborForceCivilianEmployed_2021=inLaborForceCivilianEmployed_2021;
//         report.notInLaborForce_2021=notInLaborForce_2021;
//         report.inLaborForceCivilianUnemployed_2021=inLaborForceCivilianUnemployed_2021;
//         report.inLaborForceInArmedForces_2021=inLaborForceInArmedForces_2021;
//         report.inLaborForceCivilianEmployed_2021_Percent=inLaborForceCivilianEmployed_2021_Percent;
//         report.notInLaborForce_2021_Percent=notInLaborForce_2021_Percent;
//         report.inLaborForceCivilianUnemployed_2021_Percent=inLaborForceCivilianUnemployed_2021_Percent;
//         report.inLaborForceInArmedForces_2021_Percent=inLaborForceInArmedForces_2021_Percent;
//         report.unemployment_2019_1st_Qtr=unemployment_2019_1st_Qtr;
//         report.unemployment_2019_2nd_Qtr=unemployment_2019_2nd_Qtr;
//         report.unemployment_2019_3rd_Qtr=unemployment_2019_3rd_Qtr;
//         report.unemployment_2019_4th_Qtr=unemployment_2019_4th_Qtr;
//         report.unemployment_2020_1st_Qtr=unemployment_2020_1st_Qtr;
//         report.unemployment_2020_2nd_Qtr=unemployment_2020_2nd_Qtr;
//         report.unemployment_2020_3rd_Qtr=unemployment_2020_3rd_Qtr;
//         report.unemployment_2020_4th_Qtr=unemployment_2020_4th_Qtr;
//         report.unemployment_2019_1st_Qtr_2019_2nd_Qtr_Change=unemployment_2019_1st_Qtr_2019_2nd_Qtr_Change;
//         report.unemployment_2019_2nd_Qtr_2019_3rd_Qtr_Change=unemployment_2019_2nd_Qtr_2019_3rd_Qtr_Change;
//         report.unemployment_2019_3rd_Qtr_2019_4th_Qtr_Change=unemployment_2019_3rd_Qtr_2019_4th_Qtr_Change;
//         report.unemployment_2019_4th_Qtr_2020_1st_Qtr_Change=unemployment_2019_4th_Qtr_2020_1st_Qtr_Change;
//         report.unemployment_2020_1st_Qtr_2020_2nd_Qtr_Change=unemployment_2020_1st_Qtr_2020_2nd_Qtr_Change;
//         report.unemployment_2020_2nd_Qtr_2020_3rd_Qtr_Change=unemployment_2020_2nd_Qtr_2020_3rd_Qtr_Change;
//         report.unemployment_2020_3rd_Qtr_2020_4th_Qtr_Change=unemployment_2020_3rd_Qtr_2020_4th_Qtr_Change;
//         report.unemployment_2019_1st_Qtr_2019_2nd_Qtr_ChangePercent=unemployment_2019_1st_Qtr_2019_2nd_Qtr_ChangePercent;
//         report.unemployment_2019_2nd_Qtr_2019_3rd_Qtr_ChangePercent=unemployment_2019_2nd_Qtr_2019_3rd_Qtr_ChangePercent;
//         report.unemployment_2019_3rd_Qtr_2019_4th_Qtr_ChangePercent=unemployment_2019_3rd_Qtr_2019_4th_Qtr_ChangePercent;
//         report.unemployment_2019_4th_Qtr_2020_1st_Qtr_ChangePercent=unemployment_2019_4th_Qtr_2020_1st_Qtr_ChangePercent;
//         report.unemployment_2020_1st_Qtr_2020_2nd_Qtr_ChangePercent=unemployment_2020_1st_Qtr_2020_2nd_Qtr_ChangePercent;
//         report.unemployment_2020_2nd_Qtr_2020_3rd_Qtr_ChangePercent=unemployment_2020_2nd_Qtr_2020_3rd_Qtr_ChangePercent;
//         report.unemployment_2020_3rd_Qtr_2020_4th_Qtr_ChangePercent=unemployment_2020_3rd_Qtr_2020_4th_Qtr_ChangePercent;
//         report.employmentBlueCollar_2021=employmentBlueCollar_2021;
//         report.employmentWhiteCollar_2021=employmentWhiteCollar_2021;
//         report.employmentBlueCollar_2021_Percent=employmentBlueCollar_2021_Percent;
//         report.employmentWhiteCollar_2021_Percent=employmentWhiteCollar_2021_Percent;
//         report.averageHouseholdIncome_2010=averageHouseholdIncome_2010;
//         report.averageHouseholdIncome_2021=averageHouseholdIncome_2021;
//         report.averageHouseholdIncome_2026=averageHouseholdIncome_2026;
//         report.perCapitaIncome_2010=perCapitaIncome_2010;
//         report.perCapitaIncome_2021=perCapitaIncome_2021;
//         report.perCapitaIncome_2026=perCapitaIncome_2026;
//         report.averageHouseholdIncome_2010_2021_Change=averageHouseholdIncome_2010_2021_Change;
//         report.averageHouseholdIncome_2021_2026_Change=averageHouseholdIncome_2021_2026_Change;
//         report.averageHouseholdIncome_2010_2021_Change_Percent=averageHouseholdIncome_2010_2021_Change_Percent;
//         report.averageHouseholdIncome_2021_2026_Change_Percent=averageHouseholdIncome_2021_2026_Change_Percent;
//         report.perCapitaIncome_2010_2021_Change=perCapitaIncome_2010_2021_Change;
//         report.perCapitaIncome_2021_2026_Change=perCapitaIncome_2021_2026_Change;
//         report.perCapitaIncome_2010_2021_Change_Percent=perCapitaIncome_2010_2021_Change_Percent;
//         report.perCapitaIncome_2021_2026_Change_Percent=perCapitaIncome_2021_2026_Change_Percent;
//         report.populationInFamilyHousehold_2010=populationInFamilyHousehold_2010;
//         report.populationInFamilyHousehold_2021=populationInFamilyHousehold_2021;
//         report.populationInFamilyHousehold_2026=populationInFamilyHousehold_2026;
//         report.populationInNonFamilyHousehold_2010=populationInNonFamilyHousehold_2010;
//         report.populationInNonFamilyHousehold_2021=populationInNonFamilyHousehold_2021;
//         report.populationInNonFamilyHousehold_2026=populationInNonFamilyHousehold_2026;
//         report.populationInGroupQuarters_2010=populationInGroupQuarters_2010;
//         report.populationInGroupQuarters_2021=populationInGroupQuarters_2021;
//         report.populationInGroupQuarters_2026=populationInGroupQuarters_2026;
//         report.populationInFamilyHousehold_2010_Percent=populationInFamilyHousehold_2010_Percent;
//         report.populationInFamilyHousehold_2021_Percent=populationInFamilyHousehold_2021_Percent;
//         report.populationInFamilyHousehold_2026_Percent=populationInFamilyHousehold_2026_Percent;
//         report.populationInNonFamilyHousehold_2010_Percent=populationInNonFamilyHousehold_2010_Percent;
//         report.populationInNonFamilyHousehold_2021_Percent=populationInNonFamilyHousehold_2021_Percent;
//         report.populationInNonFamilyHousehold_2026_Percent=populationInNonFamilyHousehold_2026_Percent;
//         report.populationInGroupQuarters_2010_Percent=populationInGroupQuarters_2010_Percent;
//         report.populationInGroupQuarters_2021_Percent=populationInGroupQuarters_2021_Percent;
//         report.populationInGroupQuarters_2026_Percent=populationInGroupQuarters_2026_Percent;
//         report.familiesAbovePovertyLevel_2021=familiesAbovePovertyLevel_2021;
//         report.familiesBelowPovertyLevel_2021=familiesBelowPovertyLevel_2021;
//         report.familiesAbovePovertyLevel_2021_Percent=familiesAbovePovertyLevel_2021_Percent;
//         report.familiesBelowPovertyLevel_2021_Percent=familiesBelowPovertyLevel_2021_Percent;
//         report.summaryHousingUnits_2010=summaryHousingUnits_2010;
//         report.summaryHousingUnits_2021=summaryHousingUnits_2021;
//         report.summaryHousingUnits_2026=summaryHousingUnits_2026;
//         report.summaryHousingUnitsChange_2010_2021=summaryHousingUnitsChange_2010_2021;
//         report.summaryHousingUnitsChange_2021_2026=summaryHousingUnitsChange_2021_2026;
//         report.summaryHousingUnitsChange_2010_2021_Percent=summaryHousingUnitsChange_2010_2021_Percent;
//         report.summaryHousingUnitsChange_2021_2026_Percent=summaryHousingUnitsChange_2021_2026_Percent;
//
//         return report;
//         }
//
//    public String district;
//
//    //Population Trends
//    public Integer population_2000;
//    public Integer population_2010;
//    public Integer population_2021;
//    public Integer population_2026;
//    public Integer population_2031;
//
//    public Integer populationChange_2000_2010;
//    public Integer populationChange_2010_2021;
//    public Integer populationChange_2021_2026;
//    public Integer populationChange_2026_2031;
//
//    public Double populationPercentChange_2000_2010;
//    public Double populationPercentChange_2010_2021;
//    public Double populationPercentChange_2021_2026;
//    public Double populationPercentChange_2026_2031;
//
//    //Population: Recent 8 Quarter History
//
//    public Integer populationRecent8QuarterHistory_2019_1st_Qtr;
//    public Integer populationRecent8QuarterHistory_2019_2nd_Qtr;
//    public Integer populationRecent8QuarterHistory_2019_3rd_Qtr;
//    public Integer populationRecent8QuarterHistory_2019_4th_Qtr;
//    public Integer populationRecent8QuarterHistory_2020_1st_Qtr;
//    public Integer populationRecent8QuarterHistory_2020_2nd_Qtr;
//    public Integer populationRecent8QuarterHistory_2020_3rd_Qtr;
//    public Integer populationRecent8QuarterHistory_2020_4th_Qtr;
//
//    public Integer populationRecent8QuarterHistoryChange_2019_2nd_2019_3rd;
//    public Integer populationRecent8QuarterHistoryChange_2019_3rd_2019_4th;
//    public Integer populationRecent8QuarterHistoryChange_2019_4th_2020_1st;
//    public Integer populationRecent8QuarterHistoryChange_2019_1st_2019_2nd;
//    public Integer populationRecent8QuarterHistoryChange_2020_1st_2020_2nd;
//    public Integer populationRecent8QuarterHistoryChange_2020_2nd_2020_3rd;
//    public Integer populationRecent8QuarterHistoryChange_2020_3rd_2020_4th;
//
//    public Double populationRecent8QuarterHistoryChangePercent_2019_2nd_2019_3rd;
//    public Double populationRecent8QuarterHistoryChangePercent_2019_3rd_2019_4th;
//    public Double populationRecent8QuarterHistoryChangePercent_2019_4th_2020_1st;
//    public Double populationRecent8QuarterHistoryChangePercent_2019_1st_2019_2nd;
//    public Double populationRecent8QuarterHistoryChangePercent_2020_1st_2020_2nd;
//    public Double populationRecent8QuarterHistoryChangePercent_2020_2nd_2020_3rd;
//    public Double populationRecent8QuarterHistoryChangePercent_2020_3rd_2020_4th;
//
//    //Population: Currently Enrolled in Education
//
//    public Integer populationEnrolledInElementarySchool;
//    public Integer populationEnrolledInHighSchool;
//    public Integer populationEnrolledInPreschool;
//
//    public Double populationEnrolledInElementarySchoolPercent;
//    public Double populationEnrolledInHighSchoolPercent;
//    public Double populationEnrolledInPreschoolPercent;
//
//    //Population by Educational Attainment: 25+
//
//    public Integer populationAttainmentLessThan9th_2010;
//    public Integer populationAttainmentLessThan9th_2021;
//    public Integer populationAttainmentLessThan9th_2026;
//
//    public Integer populationAttainmentSomeHighSchool_2010;
//    public Integer populationAttainmentSomeHighSchool_2021;
//    public Integer populationAttainmentSomeHighSchool_2026;
//
//    public Integer populationAttainmentHighSchoolGraduate_2010;
//    public Integer populationAttainmentHighSchoolGraduate_2021;
//    public Integer populationAttainmentHighSchoolGraduate_2026;
//
//    public Integer populationAttainmentSomeCollege_2010;
//    public Integer populationAttainmentSomeCollege_2021;
//    public Integer populationAttainmentSomeCollege_2026;
//
//    public Integer populationAttainmentAssociatesDegree_2010;
//    public Integer populationAttainmentAssociatesDegree_2021;
//    public Integer populationAttainmentAssociatesDegree_2026;
//
//    public Integer populationAttainmentBachelorsDegree_2010;
//    public Integer populationAttainmentBachelorsDegree_2021;
//    public Integer populationAttainmentBachelorsDegree_2026;
//
//    public Integer populationAttainmentGraduateOrProfessional_2010;
//    public Integer populationAttainmentGraduateOrProfessional_2021;
//    public Integer populationAttainmentGraduateOrProfessional_2026;
//
//    public Double populationAttainmentLessThan9thPercent_2010;
//    public Double populationAttainmentLessThan9thPercent_2021;
//    public Double populationAttainmentLessThan9thPercent_2026;
//
//    public Double populationAttainmentSomeHighSchoolPercent_2010;
//    public Double populationAttainmentSomeHighSchoolPercent_2021;
//    public Double populationAttainmentSomeHighSchoolPercent_2026;
//
//    public Double populationAttainmentHighSchoolGraduatePercent_2010;
//    public Double populationAttainmentHighSchoolGraduatePercent_2021;
//    public Double populationAttainmentHighSchoolGraduatePercent_2026;
//
//    public Double populationAttainmentSomeCollegePercent_2010;
//    public Double populationAttainmentSomeCollegePercent_2021;
//    public Double populationAttainmentSomeCollegePercent_2026;
//
//    public Double populationAttainmentAssociatesDegreePercent_2010;
//    public Double populationAttainmentAssociatesDegreePercent_2021;
//    public Double populationAttainmentAssociatesDegreePercent_2026;
//
//    public Double populationAttainmentBachelorsDegreePercent_2010;
//    public Double populationAttainmentBachelorsDegreePercent_2021;
//    public Double populationAttainmentBachelorsDegreePercent_2026;
//
//    public Double populationAttainmentGraduateOrProfessionalPercent_2010;
//    public Double populationAttainmentGraduateOrProfessionalPercent_2021;
//    public Double populationAttainmentGraduateOrProfessionalPercent_2026;
//
//    //Age Forecast
//
//    public Integer ageForecast_2021_0To4;
//    public Integer ageForecast_2021_5To13;
//    public Integer ageForecast_2021_14To17;
//    public Integer ageForecast_2021_18To21;
//    public Integer ageForecast_2021_22To24;
//    public Integer ageForecast_2021_25To29;
//    public Integer ageForecast_2021_30To34;
//    public Integer ageForecast_2021_35To39;
//    public Integer ageForecast_2021_40To44;
//    public Integer ageForecast_2021_45To49;
//    public Integer ageForecast_2021_50To54;
//    public Integer ageForecast_2021_55To64;
//    public Integer ageForecast_2021_65To74;
//    public Integer ageForecast_2021_75To84;
//    public Integer ageForecast_2021_85Plus;
//
//    public Integer ageForecast_2026_0To4;
//    public Integer ageForecast_2026_5To13;
//    public Integer ageForecast_2026_14To17;
//    public Integer ageForecast_2026_18To21;
//    public Integer ageForecast_2026_22To24;
//    public Integer ageForecast_2026_25To29;
//    public Integer ageForecast_2026_30To34;
//    public Integer ageForecast_2026_35To39;
//    public Integer ageForecast_2026_40To44;
//    public Integer ageForecast_2026_45To49;
//    public Integer ageForecast_2026_50To54;
//    public Integer ageForecast_2026_55To64;
//    public Integer ageForecast_2026_65To74;
//    public Integer ageForecast_2026_75To84;
//    public Integer ageForecast_2026_85Plus;
//
//    public Integer ageForecast_2031_0To4;
//    public Integer ageForecast_2031_5To13;
//    public Integer ageForecast_2031_14To17;
//    public Integer ageForecast_2031_18To21;
//    public Integer ageForecast_2031_22To24;
//    public Integer ageForecast_2031_25To29;
//    public Integer ageForecast_2031_30To34;
//    public Integer ageForecast_2031_35To39;
//    public Integer ageForecast_2031_40To44;
//    public Integer ageForecast_2031_45To49;
//    public Integer ageForecast_2031_50To54;
//    public Integer ageForecast_2031_55To64;
//    public Integer ageForecast_2031_65To74;
//    public Integer ageForecast_2031_75To84;
//    public Integer ageForecast_2031_85Plus;
//
//
//    public Double ageForecastPercentChange_2021_2026_0To4;
//    public Double ageForecastPercentChange_2021_2026_5To13;
//    public Double ageForecastPercentChange_2021_2026_14To17;
//    public Double ageForecastPercentChange_2021_2026_18To21;
//    public Double ageForecastPercentChange_2021_2026_22To24;
//    public Double ageForecastPercentChange_2021_2026_25To29;
//    public Double ageForecastPercentChange_2021_2026_30To34;
//    public Double ageForecastPercentChange_2021_2026_35To39;
//    public Double ageForecastPercentChange_2021_2026_40To44;
//    public Double ageForecastPercentChange_2021_2026_45To49;
//    public Double ageForecastPercentChange_2021_2026_50To54;
//    public Double ageForecastPercentChange_2021_2026_55To64;
//    public Double ageForecastPercentChange_2021_2026_65To74;
//    public Double ageForecastPercentChange_2021_2026_75To84;
//    public Double ageForecastPercentChange_2021_2026_85Plus;
//
//    public Double ageForecastPercentChange_2026_2031_0To4;
//    public Double ageForecastPercentChange_2026_2031_5To13;
//    public Double ageForecastPercentChange_2026_2031_14To17;
//    public Double ageForecastPercentChange_2026_2031_18To21;
//    public Double ageForecastPercentChange_2026_2031_22To24;
//    public Double ageForecastPercentChange_2026_2031_25To29;
//    public Double ageForecastPercentChange_2026_2031_30To34;
//    public Double ageForecastPercentChange_2026_2031_35To39;
//    public Double ageForecastPercentChange_2026_2031_40To44;
//    public Double ageForecastPercentChange_2026_2031_45To49;
//    public Double ageForecastPercentChange_2026_2031_50To54;
//    public Double ageForecastPercentChange_2026_2031_55To64;
//    public Double ageForecastPercentChange_2026_2031_65To74;
//    public Double ageForecastPercentChange_2026_2031_75To84;
//    public Double ageForecastPercentChange_2026_2031_85Plus;
//
//    //Population by Marital Status Age 15+
//
//    public Integer neverMarried_2010;
//    public Integer married_2010;
//    public Integer divorced_2010;
//    public Integer separated_2010;
//    public Integer widowed_2010;
//
//    public Integer neverMarried_2021;
//    public Integer married_2021;
//    public Integer divorced_2021;
//    public Integer separated_2021;
//    public Integer widowed_2021;
//
//    public Integer neverMarried_2026;
//    public Integer married_2026;
//    public Integer divorced_2026;
//    public Integer separated_2026;
//    public Integer widowed_2026;
//
//    public Double neverMarriedPercent_2010;
//    public Double marriedPercent_2010;
//    public Double divorcedPercent_2010;
//    public Double separatedPercent_2010;
//    public Double widowedPercent_2010;
//
//    public Double neverMarriedPercent_2021;
//    public Double marriedPercent_2021;
//    public Double divorcedPercent_2021;
//    public Double separatedPercent_2021;
//    public Double widowedPercent_2021;
//
//    public Double neverMarriedPercent_2026;
//    public Double marriedPercent_2026;
//    public Double divorcedPercent_2026;
//    public Double separatedPercent_2026;
//    public Double widowedPercent_2026;
//
//    //Outreach Opportunities: Children
//
//    public Integer outreachOpportunitiesEarlyAdolescent;
//    public Integer outreachOpportunitiesPreschool;
//
//    public Double outreachOpportunitiesEarlyAdolescentPercent;
//    public Double outreachOpportunitiesPreschoolPercent;
//
//    //Outreach Opportunities: Youth and Young Adult
//
//    public Integer outreachOpportunitiesAges_20To24;
//
//    //Households
//    public Integer households_2000;
//    public Integer households_2010;
//    public Integer households_2021;
//    public Integer households_2026;
//    public Integer households_2031;
//
//    public Integer householdsChange_2000_2010;
//    public Integer householdsChange_2010_2021;
//    public Integer householdsChange_2021_2026;
//    public Integer householdsChange_2026_2031;
//
//    public Double householdsChangePercent_2000_2010;
//    public Double householdsChangePercent_2010_2021;
//    public Double householdsChangePercent_2021_2026;
//    public Double householdsChangePercent_2026_2031;
//
//
//    //Household Income Forecast
//
//
//
//    public Integer householdIncomeForecast_LessThan10_000_2010;
//    public Integer householdIncomeForecast_10_000_To_14_999_2010;
//    public Integer householdIncomeForecast_15_000_To_24_999_2010;
//    public Integer householdIncomeForecast_25_000_To_34_999_2010;
//    public Integer householdIncomeForecast_35_000_To_49_999_2010;
//    public Integer householdIncomeForecast_50_000_To_74_999_2010;
//    public Integer householdIncomeForecast_75_000_To_99_999_2010;
//    public Integer householdIncomeForecast_100_000_To_149_999_2010;
//    public Integer householdIncomeForecast_150_000_To_199_999_2010;
//    public Integer householdIncomeForecast_200_000Plus_2010;
//
//    public Integer householdIncomeForecast_LessThan10_000_2021;
//    public Integer householdIncomeForecast_10_000_To_14_999_2021;
//    public Integer householdIncomeForecast_15_000_To_24_999_2021;
//    public Integer householdIncomeForecast_25_000_To_34_999_2021;
//    public Integer householdIncomeForecast_35_000_To_49_999_2021;
//    public Integer householdIncomeForecast_50_000_To_74_999_2021;
//    public Integer householdIncomeForecast_75_000_To_99_999_2021;
//    public Integer householdIncomeForecast_100_000_To_149_999_2021;
//    public Integer householdIncomeForecast_150_000_To_199_999_2021;
//    public Integer householdIncomeForecast_200_000Plus_2021;
//
//    public Integer householdIncomeForecast_LessThan10_000_2026;
//    public Integer householdIncomeForecast_10_000_To_14_999_2026;
//    public Integer householdIncomeForecast_15_000_To_24_999_2026;
//    public Integer householdIncomeForecast_25_000_To_34_999_2026;
//    public Integer householdIncomeForecast_35_000_To_49_999_2026;
//    public Integer householdIncomeForecast_50_000_To_74_999_2026;
//    public Integer householdIncomeForecast_75_000_To_99_999_2026;
//    public Integer householdIncomeForecast_100_000_To_149_999_2026;
//    public Integer householdIncomeForecast_150_000_To_199_999_2026;
//    public Integer householdIncomeForecast_200_000Plus_2026;
//
//    public Double householdIncomeForecast_LessThan10_000_2010_Percent;
//    public Double householdIncomeForecast_10_000_To_14_999_2010_Percent;
//    public Double householdIncomeForecast_15_000_To_24_999_2010_Percent;
//    public Double householdIncomeForecast_25_000_To_34_999_2010_Percent;
//    public Double householdIncomeForecast_35_000_To_49_999_2010_Percent;
//    public Double householdIncomeForecast_50_000_To_74_999_2010_Percent;
//    public Double householdIncomeForecast_75_000_To_99_999_2010_Percent;
//    public Double householdIncomeForecast_100_000_To_149_999_2010_Percent;
//    public Double householdIncomeForecast_150_000_To_199_999_2010_Percent;
//    public Double householdIncomeForecast_200_000Plus_2010_Percent;
//
//    public Double householdIncomeForecast_LessThan10_000_2021_Percent;
//    public Double householdIncomeForecast_10_000_To_14_999_2021_Percent;
//    public Double householdIncomeForecast_15_000_To_24_999_2021_Percent;
//    public Double householdIncomeForecast_25_000_To_34_999_2021_Percent;
//    public Double householdIncomeForecast_35_000_To_49_999_2021_Percent;
//    public Double householdIncomeForecast_50_000_To_74_999_2021_Percent;
//    public Double householdIncomeForecast_75_000_To_99_999_2021_Percent;
//    public Double householdIncomeForecast_100_000_To_149_999_2021_Percent;
//    public Double householdIncomeForecast_150_000_To_199_999_2021_Percent;
//    public Double householdIncomeForecast_200_000Plus_2021_Percent;
//
//    public Double householdIncomeForecast_LessThan10_000_2026_Percent;
//    public Double householdIncomeForecast_10_000_To_14_999_2026_Percent;
//    public Double householdIncomeForecast_15_000_To_24_999_2026_Percent;
//    public Double householdIncomeForecast_25_000_To_34_999_2026_Percent;
//    public Double householdIncomeForecast_35_000_To_49_999_2026_Percent;
//    public Double householdIncomeForecast_50_000_To_74_999_2026_Percent;
//    public Double householdIncomeForecast_75_000_To_99_999_2026_Percent;
//    public Double householdIncomeForecast_100_000_To_149_999_2026_Percent;
//    public Double householdIncomeForecast_150_000_To_199_999_2026_Percent;
//    public Double householdIncomeForecast_200_000Plus_2026_Percent;
//
//
//    //Households: Poverty Detail
//
//    public Integer abovePovertyLevel_2021;
//    public Integer belowPovertyLevelNon_Family_2021;
//    public Integer belowPovertyLevelMarried_2021;
//    public Integer belowPovertyLevelFemaleHouseholder_2021;
//    public Integer belowPovertyLevelMaleHouseholder_2021;
//    public Integer belowPovertyLevelNon_FamilyStudent_2021;
//
//    public Double abovePovertyLevel_2021_Percent;
//    public Double belowPovertyLevelNon_Family_2021_Percent;
//    public Double belowPovertyLevelMarried_2021_Percent;
//    public Double belowPovertyLevelFemaleHouseholder_2021_Percent;
//    public Double belowPovertyLevelMaleHouseholder_2021_Percent;
//    public Double belowPovertyLevelNon_FamilyStudent_2021_Percent;
//
//    //Households: Wealth
//
//    public Integer householdWealth_2021_100_000_To_249_999;
//    public Integer householdWealth_2021_0andUnder;
//    public Integer householdWealth_2021_500_000OrMore;
//    public Integer householdWealth_2021_250_000_To_499_999;
//    public Integer householdWealth_2021_50_000_To_99_999;
//    public Integer householdWealth_2021_1_To_4_999;
//    public Integer householdWealth_2021_25_000_To_49_999;
//    public Integer householdWealth_2021_10_000_To_24_999;
//    public Integer householdWealth_2021_5_000_To_9_999;
//
//    public Double householdWealthPercent_2021_100_000_To_249_999;
//    public Double householdWealthPercent_2021_0andUnder;
//    public Double householdWealthPercent_2021_500_000OrMore;
//    public Double householdWealthPercent_2021_250_000_To_499_999;
//    public Double householdWealthPercent_2021_50_000_To_99_999;
//    public Double householdWealthPercent_2021_1_To_4_999;
//    public Double householdWealthPercent_2021_25_000_To_49_999;
//    public Double householdWealthPercent_2021_10_000_To_24_999;
//    public Double householdWealthPercent_2021_5_000_To_9_999;
//
//    //Families
//
//    public Integer familyHouseholds_2010;
//    public Integer familyHouseholds_2021;
//    public Integer familyHouseholds_2026;
//
//    public Integer familyHouseholdsChange_2010_2021;
//    public Integer familyHouseholdsChange_2021_2026;
//
//    public Double familyHouseholdsChangePercent_2010_2021;
//    public Double familyHouseholdsChangePercent_2021_2026;
//
//    //Families: With Children
//
//    public Integer familyMarriedCouple_WithChildren_2010;
//    public Integer familyMarriedCouple_WithChildren_2021;
//    public Integer familyMarriedCouple_WithChildren_2026;
//
//    public Integer otherFamilyFemaleNoHusbandPresent_WithChildren_2010;
//    public Integer otherFamilyFemaleNoHusbandPresent_WithChildren_2021;
//    public Integer otherFamilyFemaleNoHusbandPresent_WithChildren_2026;
//
//    public Integer otherFamilyMaleNoFemalePresent_WithChildren_2010;
//    public Integer otherFamilyMaleNoFemalePresent_WithChildren_2021;
//    public Integer otherFamilyMaleNoFemalePresent_WithChildren_2026;
//
//    public Double familyMarriedCouple_WithChildren_Percent_2010;
//    public Double familyMarriedCouple_WithChildren_Percent_2021;
//    public Double familyMarriedCouple_WithChildren_Percent_2026;
//
//    public Double otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2010;
//    public Double otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2021;
//    public Double otherFamilyFemaleNoHusbandPresent_WithChildren_Percent_2026;
//
//    public Double otherFamilyMaleNoFemalePresent_WithChildren_Percent_2010;
//    public Double otherFamilyMaleNoFemalePresent_WithChildren_Percent_2021;
//    public Double otherFamilyMaleNoFemalePresent_WithChildren_Percent_2026;
//
//    //Families: No Children
//
//    public Integer familyMarriedCouple_NoChildren_2010;
//    public Integer familyMarriedCouple_NoChildren_2021;
//    public Integer familyMarriedCouple_NoChildren_2026;
//
//    public Integer otherFamilyFemaleNoHusbandPresent_NoChildren_2010;
//    public Integer otherFamilyFemaleNoHusbandPresent_NoChildren_2021;
//    public Integer otherFamilyFemaleNoHusbandPresent_NoChildren_2026;
//
//    public Integer otherFamilyMaleNoFemalePresent_NoChildren_2010;
//    public Integer otherFamilyMaleNoFemalePresent_NoChildren_2021;
//    public Integer otherFamilyMaleNoFemalePresent_NoChildren_2026;
//
//    public Double familyMarriedCouple_NoChildren_Percent_2010;
//    public Double familyMarriedCouple_NoChildren_Percent_2021;
//    public Double familyMarriedCouple_NoChildren_Percent_2026;
//
//    public Double otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2010;
//    public Double otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2021;
//    public Double otherFamilyFemaleNoHusbandPresent_NoChildren_Percent_2026;
//
//    public Double otherFamilyMaleNoFemalePresent_NoChildren_Percent_2010;
//    public Double otherFamilyMaleNoFemalePresent_NoChildren_Percent_2021;
//    public Double otherFamilyMaleNoFemalePresent_NoChildren_Percent_2026;
//
//    //Diversity Index
//
//    public Double diversityIndexScore_2021;
//
//    //Racial/Ethnic Trends: Detail
//
//    public Integer asian_2010;
//    public Integer black_2010;
//    public Integer white_2010;
//    public Integer hispanic_2010;
//    public Integer other_2010;
//
//    public Integer asian_2021;
//    public Integer black_2021;
//    public Integer white_2021;
//    public Integer hispanic_2021;
//    public Integer other_2021;
//
//    public Integer asian_2026;
//    public Integer black_2026;
//    public Integer white_2026;
//    public Integer hispanic_2026;
//    public Integer other_2026;
//
//    public Double asian_2010_Percent;
//    public Double black_2010_Percent;
//    public Double white_2010_Percent;
//    public Double hispanic_2010_Percent;
//    public Double other_2010_Percent;
//
//    public Double asian_2021_Percent;
//    public Double black_2021_Percent;
//    public Double white_2021_Percent;
//    public Double hispanic_2021_Percent;
//    public Double other_2021_Percent;
//
//    public Double asian_2026_Percent;
//    public Double black_2026_Percent;
//    public Double white_2026_Percent;
//    public Double hispanic_2026_Percent;
//    public Double other_2026_Percent;
//
//    public Integer asian_2010_2021_Change;
//    public Integer black_2010_2021_Change;
//    public Integer white_2010_2021_Change;
//    public Integer hispanic_2010_2021_Change;
//    public Integer other_2010_2021_Change;
//
//    public Integer asian_2021_2026_Change;
//    public Integer black_2021_2026_Change;
//    public Integer white_2021_2026_Change;
//    public Integer hispanic_2021_2026_Change;
//    public Integer other_2021_2026_Change;
//
//    public Double asian_2010_2021_Change_Percent;
//    public Double black_2010_2021_Change_Percent;
//    public Double white_2010_2021_Change_Percent;
//    public Double hispanic_2010_2021_Change_Percent;
//    public Double other_2010_2021_Change_Percent;
//
//    public Double asian_2021_2026_Change_Percent;
//    public Double black_2021_2026_Change_Percent;
//    public Double white_2021_2026_Change_Percent;
//    public Double hispanic_2021_2026_Change_Percent;
//    public Double other_2021_2026_Change_Percent;
//
//    //Religious Affiliation
//
//    public Integer religiousAffiliation_Unknown_2021;
//    public Integer religiousAffiliation_Mainline_2021;
//    public Integer religiousAffiliation_Catholic_2021;
//    public Integer religiousAffiliation_Evangelical_2021;
//    public Integer religiousAffiliation_Mormon_2021;
//
//    public Double religiousAffiliation_Unknown_2021_Percent;
//    public Double religiousAffiliation_Mainline_2021_Percent;
//    public Double religiousAffiliation_Catholic_2021_Percent;
//    public Double religiousAffiliation_Evangelical_2021_Percent;
//    public Double religiousAffiliation_Mormon_2021_Percent;
//
//    //Housing                           (Units)
//
//    public Integer housingUnits_2010;
//    public Integer housingUnits_2021;
//    public Integer housingUnits_2026;
//
//    public Double housingUnits_PercentChange_2010_2021;
//    public Double housingUnits_PercentChange_2021_2026;
//
//    //Housing Units by Occupancy
//
//    public Integer housingUnitsOccupied_2010;
//    public Integer housingUnitsOccupied_2021;
//    public Integer housingUnitsOccupied_2026;
//
//    public Integer housingUnitsVacant_2010;
//    public Integer housingUnitsVacant_2021;
//    public Integer housingUnitsVacant_2026;
//
//    public Double housingUnitsOccupied_2010_Percent;
//    public Double housingUnitsOccupied_2021_Percent;
//    public Double housingUnitsOccupied_2026_Percent;
//
//    public Double housingUnitsVacant_2010_Percent;
//    public Double housingUnitsVacant_2021_Percent;
//    public Double housingUnitsVacant_2026_Percent;
//
//    //Housing Trends: By Dwelling Type
//
//    public Integer dwellingType_1UnitDetached_2021;
//    public Integer dwellingType_2Units_2021;
//    public Integer dwellingType_MobileHomeOrTrailer_2021;
//    public Integer dwellingType_3to19Units_2021;
//    public Integer dwellingType_1UnitAttached_2021;
//    public Integer dwellingType_50orMoreUnits_2021;
//    public Integer dwellingType_20to49Units_2021;
//
//    public Double dwellingType_1UnitDetached_2021_Percent;
//    public Double dwellingType_2Units_2021_Percent;
//    public Double dwellingType_MobileHomeOrTrailer_2021_Percent;
//    public Double dwellingType_3to19Units_2021_Percent;
//    public Double dwellingType_1UnitAttached_2021_Percent;
//    public Double dwellingType_50orMoreUnits_2021_Percent;
//    public Double dwellingType_20to49Units_2021_Percent;
//
//    //Housing Trends: Value Owner-Occupied
//
//
//    public Integer housingValue_100_000_To_149_999_2021;
//    public Integer housingValue_200_000_To_299_999_2021;
//    public Integer housingValue_150_000_To_199_999_2021;
//    public Integer housingValue_80_000_To_99_999_2021;
//    public Integer housingValue_300_000_To_399_999_2021;
//    public Integer housingValue_60_000_To_79_999_2021;
//    public Integer housingValue_40_000_To_59_999_2021;
//    public Integer housingValue_400_000_To_499_999_2021;
//    public Integer housingValue_20_000_To_39_999_2021;
//    public Integer housingValue_500_000_To_749_999_2021;
//    public Integer housingValue_750_000_To_999_999_2021;
//    public Integer housingValue_1_000_000_Or_More_2021;
//    public Integer housingValue_LessThan_20_000_2021;
//
//    public Double housingValue_100_000_To_149_999_2021_Percent;
//    public Double housingValue_200_000_To_299_999_2021_Percent;
//    public Double housingValue_150_000_To_199_999_2021_Percent;
//    public Double housingValue_80_000_To_99_999_2021_Percent;
//    public Double housingValue_300_000_To_399_999_2021_Percent;
//    public Double housingValue_60_000_To_79_999_2021_Percent;
//    public Double housingValue_40_000_To_59_999_2021_Percent;
//    public Double housingValue_400_000_To_499_999_2021_Percent;
//    public Double housingValue_20_000_To_39_999_2021_Percent;
//    public Double housingValue_500_000_To_749_999_2021_Percent;
//    public Double housingValue_750_000_To_999_999_2021_Percent;
//    public Double housingValue_1_000_000_Or_More_2021_Percent;
//    public Double housingValue_LessThan_20_000_2021_Percent;
//
//    //Housing Trends: Occupied Units by Own or Rent
//
//    public Integer housingOwnerOccupied_2010;
//    public Integer housingOwnerOccupied_2021;
//    public Integer housingOwnerOccupied_2026;
//
//    public Integer housingRenterOccupied_2010;
//    public Integer housingRenterOccupied_2021;
//    public Integer housingRenterOccupied_2026;
//
//    public Double housingOwnerOccupied_2010_Percent;
//    public Double housingOwnerOccupied_2021_Percent;
//    public Double housingOwnerOccupied_2026_Percent;
//
//    public Double housingRenterOccupied_2010_Percent;
//    public Double housingRenterOccupied_2021_Percent;
//    public Double housingRenterOccupied_2026_Percent;
//
//    public Double housingOwnerOccupied_2010_2021_Percent_Change;
//    public Double housingOwnerOccupied_2021_2026_Percent_Change;
//
//    public Double housingRenterOccupied_2010_2021_Percent_Change;
//    public Double housingRenterOccupied_2021_2026_Percent_Change;
//
//    //Pop 16+ by Employment Status
//
//    public Integer inLaborForceCivilianEmployed_2021;
//    public Integer notInLaborForce_2021;
//    public Integer inLaborForceCivilianUnemployed_2021;
//    public Integer inLaborForceInArmedForces_2021;
//
//    public Double inLaborForceCivilianEmployed_2021_Percent;
//    public Double notInLaborForce_2021_Percent;
//    public Double inLaborForceCivilianUnemployed_2021_Percent;
//    public Double inLaborForceInArmedForces_2021_Percent;
//
//    //Unemployment
//
//    public Integer unemployment_2019_1st_Qtr;
//    public Integer unemployment_2019_2nd_Qtr;
//    public Integer unemployment_2019_3rd_Qtr;
//    public Integer unemployment_2019_4th_Qtr;
//    public Integer unemployment_2020_1st_Qtr;
//    public Integer unemployment_2020_2nd_Qtr;
//    public Integer unemployment_2020_3rd_Qtr;
//    public Integer unemployment_2020_4th_Qtr;
//
//    public Integer unemployment_2019_1st_Qtr_2019_2nd_Qtr_Change;
//    public Integer unemployment_2019_2nd_Qtr_2019_3rd_Qtr_Change;
//    public Integer unemployment_2019_3rd_Qtr_2019_4th_Qtr_Change;
//    public Integer unemployment_2019_4th_Qtr_2020_1st_Qtr_Change;
//    public Integer unemployment_2020_1st_Qtr_2020_2nd_Qtr_Change;
//    public Integer unemployment_2020_2nd_Qtr_2020_3rd_Qtr_Change;
//    public Integer unemployment_2020_3rd_Qtr_2020_4th_Qtr_Change;
//
//    public Double unemployment_2019_1st_Qtr_2019_2nd_Qtr_ChangePercent;
//    public Double unemployment_2019_2nd_Qtr_2019_3rd_Qtr_ChangePercent;
//    public Double unemployment_2019_3rd_Qtr_2019_4th_Qtr_ChangePercent;
//    public Double unemployment_2019_4th_Qtr_2020_1st_Qtr_ChangePercent;
//    public Double unemployment_2020_1st_Qtr_2020_2nd_Qtr_ChangePercent;
//    public Double unemployment_2020_2nd_Qtr_2020_3rd_Qtr_ChangePercent;
//    public Double unemployment_2020_3rd_Qtr_2020_4th_Qtr_ChangePercent;
//
//    //Employed Pop 16+ Blue/White Collar
//
//    public Integer employmentBlueCollar_2021;
//    public Integer employmentWhiteCollar_2021;
//
//    public Double employmentBlueCollar_2021_Percent;
//    public Double employmentWhiteCollar_2021_Percent;
//
//
//    //Average Income Trends: Households and Per Capita
//
//    public Integer averageHouseholdIncome_2010;
//    public Integer averageHouseholdIncome_2021;
//    public Integer averageHouseholdIncome_2026;
//
//    public Integer perCapitaIncome_2010;
//    public Integer perCapitaIncome_2021;
//    public Integer perCapitaIncome_2026;
//
//    public Integer averageHouseholdIncome_2010_2021_Change;
//    public Integer averageHouseholdIncome_2021_2026_Change;
//
//    public Double averageHouseholdIncome_2010_2021_Change_Percent;
//    public Double averageHouseholdIncome_2021_2026_Change_Percent;
//
//    public Integer perCapitaIncome_2010_2021_Change;
//    public Integer perCapitaIncome_2021_2026_Change;
//
//    public Double perCapitaIncome_2010_2021_Change_Percent;
//    public Double perCapitaIncome_2021_2026_Change_Percent;
//
//    //Summary: Population by Household Type
//
//    public Integer populationInFamilyHousehold_2010;
//    public Integer populationInFamilyHousehold_2021;
//    public Integer populationInFamilyHousehold_2026;
//
//    public Integer populationInNonFamilyHousehold_2010;
//    public Integer populationInNonFamilyHousehold_2021;
//    public Integer populationInNonFamilyHousehold_2026;
//
//    public Integer populationInGroupQuarters_2010;
//    public Integer populationInGroupQuarters_2021;
//    public Integer populationInGroupQuarters_2026;
//
//    public Double populationInFamilyHousehold_2010_Percent;
//    public Double populationInFamilyHousehold_2021_Percent;
//    public Double populationInFamilyHousehold_2026_Percent;
//
//    public Double populationInNonFamilyHousehold_2010_Percent;
//    public Double populationInNonFamilyHousehold_2021_Percent;
//    public Double populationInNonFamilyHousehold_2026_Percent;
//
//    public Double populationInGroupQuarters_2010_Percent;
//    public Double populationInGroupQuarters_2021_Percent;
//    public Double populationInGroupQuarters_2026_Percent;
//
//    //Summary: Families in Poverty
//
//    public Integer familiesAbovePovertyLevel_2021;
//
//    public Integer familiesBelowPovertyLevel_2021;
//
//    public Double familiesAbovePovertyLevel_2021_Percent;
//
//    public Double familiesBelowPovertyLevel_2021_Percent;
//
//    //Summary: Housing Units
//
//    public Integer summaryHousingUnits_2010;
//    public Integer summaryHousingUnits_2021;
//    public Integer summaryHousingUnits_2026;
//
//    public Integer summaryHousingUnitsChange_2010_2021;
//    public Integer summaryHousingUnitsChange_2021_2026;
//
//    public Double summaryHousingUnitsChange_2010_2021_Percent;
//    public Double summaryHousingUnitsChange_2021_2026_Percent;
//
//}
