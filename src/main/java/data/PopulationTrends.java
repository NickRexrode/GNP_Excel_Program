package data;

import org.apache.poi.ss.usermodel.Sheet;

import static old.helper.SheetHelper.*;

public class PopulationTrends {

    private Integer population_2000;
    private Integer population_2010;
    private Integer population_2021;
    private Integer population_2026;
    private Integer population_2031;

    private Integer populationChange_2000_2010;
    private Integer populationChange_2010_2021;
    private Integer populationChange_2021_2026;
    private Integer populationChange_2026_2031;

    private Double populationChangePercent_2000_2010;
    private Double populationChangePercent_2010_2021;
    private Double populationChangePercent_2021_2026;
    private Double populationChangePercent_2026_2031;

    public PopulationTrends(Sheet sheet) {
        System.out.println(getTopLeftHeaderForTable(sheet, "Population Trends"));


    }


}
