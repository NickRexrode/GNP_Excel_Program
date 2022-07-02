package data.people;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;
import static old.helper.SheetHelper.readCellRawFromSheetAsDouble;

public class OutreachOpportunitiesChildren {
    private Integer outreachOpportunitiesEarlyAdolescent;
    private Integer outreachOpportunitiesPreschool;

    private Double outreachOpportunitiesEarlyAdolescentPercent;
    private Double outreachOpportunitiesPreschoolPercent;

    public OutreachOpportunitiesChildren(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Outreach Opportunities: Children ");



        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch(rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Early Adolescent Ages 6 to 10":
                    this.outreachOpportunitiesEarlyAdolescent = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.outreachOpportunitiesEarlyAdolescentPercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;
                case "Preschool Ages 3 to 5":
                    this.outreachOpportunitiesPreschool =readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    this.outreachOpportunitiesPreschoolPercent = readCellRawFromSheetAsDouble(sheet, rows.get(i).getRowNum(), "C");
                    break;

            }

        }

        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "OutreachOpportunitiesChildren{" +
                "outreachOpportunitiesEarlyAdolescent=" + outreachOpportunitiesEarlyAdolescent +
                "\n outreachOpportunitiesPreschool=" + outreachOpportunitiesPreschool +
                "\n outreachOpportunitiesEarlyAdolescentPercent=" + outreachOpportunitiesEarlyAdolescentPercent +
                "\n outreachOpportunitiesPreschoolPercent=" + outreachOpportunitiesPreschoolPercent +
                '}';
    }
}
