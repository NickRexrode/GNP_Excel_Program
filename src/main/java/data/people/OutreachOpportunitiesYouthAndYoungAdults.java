package data.people;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.List;

import static old.helper.SheetHelper.*;

public class OutreachOpportunitiesYouthAndYoungAdults {
    private Integer outreachOpportunitiesAges_20To24;
    public OutreachOpportunitiesYouthAndYoungAdults(XSSFSheet sheet) {
        List<Row> rows = getRowsFromTopLeftHeader(sheet, "Outreach Opportunities: Youth and Young Adult");



        for (int i = 0; i < rows.size(); i++) {
            //Replace all removes all nonascii chars (random ? square thing)
            switch(rows.get(i).getCell(0).getStringCellValue().replaceAll("[^\\x00-\\x7F]", "").trim()) {
                case "Population Age 20-24":
                    this.outreachOpportunitiesAges_20To24 = readCellRawFromSheetAsInteger(sheet, rows.get(i).getRowNum(), "B");
                    break;
            }

        }

    }

    @Override
    public String toString() {
        return "OutreachOpportunitiesYouthAndYoungAdults{" +
                "\noutreachOpportunitiesAges_20To24=" + outreachOpportunitiesAges_20To24 +
                '}';
    }
}
