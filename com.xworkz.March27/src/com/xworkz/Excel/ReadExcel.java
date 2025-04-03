package com.xworkz.Excel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    
    private int cell;
    
    public static void main(String[] args) {
        String filePath = "C:/Users/khush/Downloads/students.xlsx"; // Path to the Excel file

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Read first sheet

            for (Row row : sheet) {
                int id = (int) row.getCell(0).getNumericCellValue();
                String name = row.getCell(1).getStringCellValue();
                double marks = row.getCell(2).getNumericCellValue();

                System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

