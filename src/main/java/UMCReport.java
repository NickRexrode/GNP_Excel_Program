import org.apache.poi.xssf.usermodel.XSSFSheet;

import data.diversity.*;
import data.families.*;
import data.households.*;
import data.housing.*;
import data.overview.*;
import data.people.*;
import data.work.*;

import java.lang.reflect.Field;

import static old.helper.SheetHelper.parseSheetName;
import static old.helper.SheetHelper.readCellRawFromSheetAsString;


public class UMCReport {
    public String getDistrict() {
        return this.district;
    }
    private String district;
    private PopulationTrends populationTrends;
    private PopulationRecent8QuarterHistory populationRecent8QuarterHistory;
    private PopulationCurrentlyEnrolledInEducation populationCurrentlyEnrolledInEducation;
    private PopulationByEducationalAttainment25Plus populationByEducationalAttainment25Plus;
    private PopulationByMaritalStatusAge15Plus populationByMaritalStatusAge15Plus;
    private OutreachOpportunitiesChildren outreachOpportunitiesChildren;
    private OutreachOpportunitiesYouthAndYoungAdults outreachOpportunitiesYouthAndYoungAdults;
    private AgeForecast ageForecast;
    private Households households;
    private HouseholdIncomeForecast householdIncomeForecast;
    private HouseHoldsPovertyDetail houseHoldsPovertyDetail;
    private HouseholdsWealth householdsWealth;
    private Families families;
    private FamiliesWithChildren familiesWithChildren;
    private FamiliesNoChildren familiesNoChildren;
    private DiversityIndex diversityIndex;
    private RacialEthnicTrendsDetail racialEthnicTrendsDetail;
    private ReligiousAffiliation religiousAffiliation;
    private Housing housing;
    private HousingTrendsByDwellingType housingTrendsByDwellingType;
    private HousingTrendsOccupiedUnitsByOwnOrRent housingTrendsOccupiedUnitsByOwnOrRent;
    private HousingTrendsValueOwnerOccupied housingTrendsValueOwnerOccupied;
    private HousingUnitsByOccupancy housingUnitsByOccupancy;
    private EmployedPop16PlusBlueWhiteCollar employedPop16PlusBlueWhiteCollar;
    private Pop16PlusByEmploymentStatus pop16PlusByEmploymentStatus;
    private Unemployment unemployment;
    private AverageIncomeTrendsHouseholdsAndPerCapita averageIncomeTrendsHouseholdsAndPerCapita;
    private SummaryFamiliesInPoverty summaryFamiliesInPoverty;
    private SummaryPopulationByHouseholdType summaryPopulationByHouseholdType;
    private SummaryHousingUnits summaryHousingUnits;

    public UMCReport(XSSFSheet sheet) {
        this.district = parseSheetName(readCellRawFromSheetAsString(sheet, 4, "A"));
        this.populationTrends= new PopulationTrends(sheet);
        this.populationRecent8QuarterHistory= new PopulationRecent8QuarterHistory(sheet);
        this.populationCurrentlyEnrolledInEducation= new PopulationCurrentlyEnrolledInEducation(sheet);
        this.populationByEducationalAttainment25Plus= new PopulationByEducationalAttainment25Plus(sheet);
        this.populationByMaritalStatusAge15Plus= new PopulationByMaritalStatusAge15Plus(sheet);
        this.outreachOpportunitiesChildren= new OutreachOpportunitiesChildren(sheet);
        this.outreachOpportunitiesYouthAndYoungAdults= new OutreachOpportunitiesYouthAndYoungAdults(sheet);
        this.ageForecast= new AgeForecast(sheet);
        this.households= new Households(sheet);
        this.householdIncomeForecast= new HouseholdIncomeForecast(sheet);
        this.houseHoldsPovertyDetail= new HouseHoldsPovertyDetail(sheet);
        this.householdsWealth= new HouseholdsWealth(sheet);
        this.families= new Families(sheet);
        this.familiesWithChildren= new FamiliesWithChildren(sheet);
        this.familiesNoChildren= new FamiliesNoChildren(sheet);
        this.diversityIndex= new DiversityIndex(sheet);
        this.racialEthnicTrendsDetail= new RacialEthnicTrendsDetail(sheet);
        this.religiousAffiliation= new ReligiousAffiliation(sheet);
        this.housing= new Housing(sheet);
        this.housingTrendsByDwellingType= new HousingTrendsByDwellingType(sheet);
        this.housingTrendsOccupiedUnitsByOwnOrRent= new HousingTrendsOccupiedUnitsByOwnOrRent(sheet);
        this.housingTrendsValueOwnerOccupied= new HousingTrendsValueOwnerOccupied(sheet);
        this.housingUnitsByOccupancy= new HousingUnitsByOccupancy(sheet);
        this.employedPop16PlusBlueWhiteCollar= new EmployedPop16PlusBlueWhiteCollar(sheet);
        this.pop16PlusByEmploymentStatus= new Pop16PlusByEmploymentStatus(sheet);
        this.unemployment= new Unemployment(sheet);
        this.averageIncomeTrendsHouseholdsAndPerCapita= new AverageIncomeTrendsHouseholdsAndPerCapita(sheet);
        this.summaryFamiliesInPoverty= new SummaryFamiliesInPoverty(sheet);
        this.summaryPopulationByHouseholdType= new SummaryPopulationByHouseholdType(sheet);
        this.summaryHousingUnits= new SummaryHousingUnits(sheet);
    }


    public String toJSON() throws IllegalAccessException {
        StringBuilder sb =  new StringBuilder();

        Field[] UMCFields = this.getClass().getDeclaredFields();
        sb.append("{");
        for (int i = 0; i < UMCFields.length; i++) {

            Field field = UMCFields[i];
            field.setAccessible(true);

            if (field.getType().equals(String.class)) {

                      sb.append("\"")
                        .append(field.getName())
                        .append("\"")
                        .append(":")
                        .append("\"")
                        .append(field.get(this).toString())
                        .append("\"")
                              .append(",");
            } else {
                Field[] individualFields =field.get(this).getClass().getDeclaredFields();

                for (int j = 0; j < individualFields.length; j++ ) {
                    Field individualField_j = individualFields[j];
                    individualField_j.setAccessible(true);
                    if (individualField_j.getType().equals(Integer.class)) {
                        if (individualField_j.get(field.get(this)) == null) {
                            individualField_j.set(field.get(this), 0);
                        }
                        sb.append("\"")
                                .append(individualField_j.getName())
                                .append("\"")
                                .append(":")
                                .append(individualField_j.get(field.get(this)).toString()).append(",");

                    } else if (individualField_j.getType().equals(Double.class)) {
                        if (individualField_j.get(field.get(this)) == null) {
                            individualField_j.set(field.get(this), 0.0);
                        }
                        sb.append("\"")
                                .append(individualField_j.getName())
                                .append("\"")
                                .append(":")
                                .append(individualField_j.get(field.get(this)).toString()).append(",");
                    } else if (individualField_j.getType().equals(String.class)) {
                        sb.append("\"")
                                .append(individualField_j.getName())
                                .append("\"")
                                .append(":")
                                .append("\"")
                                .append(individualField_j.get(field.get(this)).toString())
                                .append("\"")
                                .append(",");
                    }
                    individualField_j.setAccessible(false);
                }
            }

            field.setAccessible(false);
        }
        sb.append("}");

        String str = sb.toString();
        int lastIndex = str.lastIndexOf(",");

        String end = str.substring(0, lastIndex)+ str.substring(lastIndex+1, str.length());
        return end;
    }

}
