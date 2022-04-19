package com.syntax.workingfiles;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class REadExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "/Users/margaryta/code/TextDocs/Book1.xlsx";

    FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
      XSSFSheet ssheet =xssfWorkbook.getSheet("Sheet1");
       Row row = ssheet.getRow(1);
       Cell cell = row.getCell(1);
        System.out.println(cell);











    }
}
