package data;

import data.timing.Duration;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.HashMap;
import java.util.Map;

import static data.SheetHelper.readCellFromSheet;


public class OverviewData {

    private Map<Integer, Double> averageHouseholdIncome; //year, money
    private Map<Duration, Double> averageHouseholdIncomeChange; //time span, money
    private Map<Duration, Double> averageHouseholdIncomePercentChange; //time span , money

    private Map<Integer, Double> perCapitaIncome; //year, money
    private Map<Duration, Double> perCapitaIncomeChange; // time span, money
    private Map<Duration, Double> perCapitaIncomePercentChange; // time span, money

    public OverviewData(Map<Integer, Double> averageHouseholdIncome,
                        Map<Duration, Double> averageHouseholdIncomeChange,
                        Map<Duration, Double> averageHouseholdIncomePercentChange,
                        Map<Integer, Double> perCapitaIncome,
                        Map<Duration, Double> perCapitaIncomeChange,
                        Map<Duration, Double> perCapitaIncomePercentChange) {
        this.averageHouseholdIncome = averageHouseholdIncome;
        this.averageHouseholdIncomeChange = averageHouseholdIncomeChange;
        this.averageHouseholdIncomePercentChange = averageHouseholdIncomePercentChange;
        this.perCapitaIncome = perCapitaIncome;
        this.perCapitaIncomeChange = perCapitaIncomeChange;
        this.perCapitaIncomePercentChange = perCapitaIncomePercentChange;


    }


    public static OverviewData from(XSSFSheet sheet) {
        Map<Integer, Double> averageHouseholdIncome = new HashMap<>();
        Map<Duration, Double> averageHouseholdIncomeChange = new HashMap<>();
        Map<Duration, Double> averageHouseholdIncomePercentChange = new HashMap<>();

        Map<Integer, Double> perCapitaIncome = new HashMap<>();
        Map<Duration, Double> perCapitaIncomeChange = new HashMap<>();
        Map<Duration, Double> perCapitaIncomePercentChange = new HashMap<>();

        averageHouseholdIncome.put(2010,readCellFromSheet(sheet, 308, "B"));
        averageHouseholdIncome.put(2021,readCellFromSheet(sheet, 308, "C"));
        averageHouseholdIncome.put(2026,readCellFromSheet(sheet, 308, "D"));

        averageHouseholdIncomeChange.put(new Duration(2010, 2021), readCellFromSheet(sheet, 309, "C"));
        averageHouseholdIncomeChange.put(new Duration(2021, 2026), readCellFromSheet(sheet, 309, "D"));

        averageHouseholdIncomePercentChange.put(new Duration(2010, 2021), readCellFromSheet(sheet, 310, "C"));
        averageHouseholdIncomePercentChange.put(new Duration(2021, 2026), readCellFromSheet(sheet, 310, "D"));

        perCapitaIncome.put(2010,readCellFromSheet(sheet, 311, "B"));
        perCapitaIncome.put(2021,readCellFromSheet(sheet, 311, "C"));
        perCapitaIncome.put(2026,readCellFromSheet(sheet, 311, "D"));

        perCapitaIncomeChange.put(new Duration(2010, 2021), readCellFromSheet(sheet, 312, "C"));
        perCapitaIncomeChange.put(new Duration(2021, 2026), readCellFromSheet(sheet, 312, "D"));

        perCapitaIncomePercentChange.put(new Duration(2010, 2021), readCellFromSheet(sheet, 313, "C"));
        perCapitaIncomePercentChange.put(new Duration(2021, 2026), readCellFromSheet(sheet, 313, "D"));

        return new OverviewData(averageHouseholdIncome, averageHouseholdIncomeChange,averageHouseholdIncomePercentChange,perCapitaIncome,perCapitaIncomeChange,perCapitaIncomePercentChange);
    }

    @Override
    public String toString() {
        return ""+averageHouseholdIncome.toString()+"\n"+
                averageHouseholdIncomeChange.toString()+"\n"+
                averageHouseholdIncomePercentChange.toString()+"\n"+
                perCapitaIncome.toString()+"\n"+
                perCapitaIncomeChange.toString()+"\n"+
                perCapitaIncomePercentChange.toString()+"\n";
    }
}
