import data.population.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class GNPExcelProgram {

    public static void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream(new File("Wisconsin_Conference_UMC_Report.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheetAt(0);

//        new PopulationTrends(sheet);
//
//        new PopulationRecent8QuarterHistory(sheet);
//
//        new PopulationCurrentlyEnrolledInEducation(sheet);
       // new PopulationByEducationalAttainment25Plus(sheet);
        new PopulationByMaritalStatusAge15Plus(sheet);
    }



//    public static void main(String[] args) throws IOException {
//
//
//        File file = new File("C:\\Users\\nrexr\\Desktop\\Development\\GNP\\Region 1\\Excel");
//
//        if (!file.isDirectory()) {
//
//        FileInputStream inputStream = new FileInputStream(new File("Wisconsin_Conference_UMC_Report.xlsx"));
//        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//
//        XSSFSheet sheet = workbook.getSheetAt(0);
//
//        UMCReport report = UMCReport.from(sheet);
//
//        File output = new File(report.district+".json");
//
//        if (!output.exists()) {
//            output.createNewFile();
//        }
//        FileWriter fileWriter = new FileWriter(output);
//
//
//        fileWriter.write("{\n");
//        int total = report.getClass().getFields().length;
//        Field[] fields = report.getClass().getFields();
//        for (int i = 0; i < fields.length;i++) {
//            try {
//                if (i == fields.length-1) { // no comma
//                    if (fields[i].getType().getName().equals("java.lang.String")) {
//                        fileWriter.write("\"" + fields[i].getName() + "\"" + ": " + "\"" + fields[i].get(report).toString() + "\"\n");
//                    } else {
//                        fileWriter.write("\"" + fields[i].getName() + "\"" + ": " + fields[i].get(report).toString() + "\n");
//                    }
//                } else {
//                    if (fields[i].getType().getName().equals("java.lang.String")) {
//                        fileWriter.write("\"" + fields[i].getName() + "\"" + ": " + "\"" + fields[i].get(report).toString() + "\",\n");
//                    } else {
//                        fileWriter.write("\"" + fields[i].getName() + "\"" + ": " + fields[i].get(report).toString() + ",\n");
//                    }
//                }
//
//
//            } catch (IOException | IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
//        for (Field field : report.getClass().getFields()) {
//
//        }
//        fileWriter.write("}");
//        fileWriter.close();
//        }
//        else {
//            System.out.println("here");
//            List<File> files = Arrays.stream(file.listFiles()).filter(f -> f.getName().endsWith(".xlsx")).collect(Collectors.toList());
//
//
//            files.forEach(f -> {
//                System.out.println(f.getName());
//                FileInputStream inputStream = null;
//                try {
//                    inputStream = new FileInputStream(f);
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                XSSFWorkbook workbook = null;
//                try {
//                    workbook = new XSSFWorkbook(inputStream);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                XSSFSheet sheet = workbook.getSheetAt(0);
//
//                UMCReport report = UMCReport.from(sheet);
//
//                File output = new File(report.district+".json");
//
//                if (!output.exists()) {
//                    try {
//                        output.createNewFile();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                FileWriter fileWriter = null;
//                try {
//                    fileWriter = new FileWriter(output);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//
//                try {
//                    fileWriter.write("{\n");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                int total = report.getClass().getFields().length;
//                Field[] fields = report.getClass().getFields();
//                for (int i = 0; i < fields.length;i++) {
//                    try {
//                        if (i == fields.length-1) { // no comma
//                            if (fields[i].getType().getName().equals("java.lang.String")) {
//                                fileWriter.write("\"" + fields[i].getName() + "\"" + ": " + "\"" + fields[i].get(report).toString() + "\"\n");
//                            } else {
//                                fileWriter.write("\"" + fields[i].getName() + "\"" + ": " + fields[i].get(report).toString() + "\n");
//                            }
//                        } else {
//                            if (fields[i].getType().getName().equals("java.lang.String")) {
//                                fileWriter.write("\"" + fields[i].getName() + "\"" + ": " + "\"" + fields[i].get(report).toString() + "\",\n");
//                            } else {
//                                fileWriter.write("\"" + fields[i].getName() + "\"" + ": " + fields[i].get(report).toString() + ",\n");
//                            }
//                        }
//
//
//                    } catch (IOException | IllegalAccessException e) {
//                        e.printStackTrace();
//                    }
//                }
//                for (Field field : report.getClass().getFields()) {
//
//                }
//                try {
//                    fileWriter.write("}");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    fileWriter.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
//
//    }

}
