package com.alex.realm.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yang_gao on 2017/3/27.
 */

@Component
public class PoiExcelUtil {

    private List<Sheet> sheets = new ArrayList<Sheet>();


    public List<Sheet> getSheetsFromPath(String fileName) {
        return getSheets(fileName,null);
    }

    public List<Sheet> getSheetsFromFile(File file) {
        return getSheets(null,file);
    }

    public List<Sheet> getSheets(String fileName, File xlsFile) {
        if (null == xlsFile) {
            xlsFile = new File(fileName);
        }
        try {
            Workbook workbook = WorkbookFactory.create(xlsFile);
            int sheetCount = workbook.getNumberOfSheets();
            for (int i = 0; i < sheetCount; i++) {
                Sheet tempSheet = workbook.getSheetAt(i);
                sheets.add(tempSheet);
            }
            workbook.close();
            return sheets;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getContent(String fileName) {
        List<Sheet> sheets = getSheetsFromPath(fileName);
        String content = "";
        for (Sheet sheet : sheets) {
            int rowNum = sheet.getLastRowNum() + 1;
            if (null == sheet.getRow(0)) {
                break;
            }
            int cellNum = sheet.getRow(0).getPhysicalNumberOfCells();
            for (int i = 0; i < rowNum; i++) {
                Row row = sheet.getRow(i);
                String rowString = "";
                for (int j = 0; j < cellNum; j++) {
                    Cell cell = row.getCell(j);
                    if (null == cell) {
                        break;
                    }
                    rowString = rowString + cell.toString() + " | ";
                }
                System.out.println(rowString);
                content = content + rowString + "\n";
            }
        }
        return content;
    }

}
