import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GNPExcelProgram {


    public static List<File> getAllExcelFilesInRecursiveDirectory(File parent) {
        List<File> files = new ArrayList<>();

        File[] children = parent.listFiles();

        for (int i = 0; i < children.length; i++) {
            File file = children[i];

            if (file.isDirectory()) {
                files.addAll(getAllExcelFilesInRecursiveDirectory(file));
            } else if (file.getName().endsWith(".xlsx")) {
                files.add(file);
            }
        }
        return files;
    }
    public static void main(String[] args) throws IOException {

        if (args.length < 1) {
            System.err.println("Error: Invalid arguments, supply file or directory");
            return;
        }

        String fileDirectory = args[0];

        File file = new File(fileDirectory);

        if (!file.exists()) {
            System.err.println("Error: Invalid File: "+file.getAbsolutePath());
            return;
        }

        List<File> files = getAllExcelFilesInRecursiveDirectory(file);

        Iterator<File> iterator = files.iterator();
        while(iterator.hasNext()) {
            File reportFile = iterator.next();
            FileInputStream inputStream = new FileInputStream(reportFile);

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);

            UMCReport report = new UMCReport(sheet);

            File outputFile = new File(fileDirectory + "\\" + report.getDistrict()+".json");
            if (!outputFile.createNewFile()) {
                System.err.println("Could not create output file: "+ outputFile.getAbsolutePath());
            }

            String outputJSON;
            try {
                outputJSON = report.toJSON();
            } catch (IllegalAccessException e) {
                System.err.println("Could not create JSON output");
                outputJSON = "{}";
            }
            PrintWriter printWriter = new PrintWriter(outputFile);
            printWriter.write(outputJSON);
            printWriter.flush();
            printWriter.close();
            System.out.println("Successfully wrote JSON output for: "+report.getDistrict()+ " | to "+outputFile.getAbsolutePath());
        }


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
