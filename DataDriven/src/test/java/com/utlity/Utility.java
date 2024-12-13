package com.utlity;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Utility {
    private XSSFSheet sheet;

    public Utility(String filePath) throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
    }

    public int getRowCount() {
        return sheet.getLastRowNum();
    }

    public int getColumnCount() {
        return sheet.getRow(0).getLastCellNum();
    }

    public String getCellData(int row, int column) {
        XSSFRow rowValue = sheet.getRow(row);
        XSSFCell cellValue = rowValue.getCell(column);
        return cellValue.getStringCellValue();
    }
}
