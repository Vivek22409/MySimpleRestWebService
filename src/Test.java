package com.test.app;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    private static final String FILE_NAME = "C:\\Users\\inyvasg\\Desktop\\KT_Plan.xlsx";

    public static void main(String[] args) {

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();
            List<String> topiclist = new ArrayList<String>();
            List<String> startDateList = new ArrayList<String>();
            int topicIndex=0,startDateindex=0;
            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();                  
                    //getCellTypeEnum shown as deprecated for version 3.15
                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        if(currentCell.getStringCellValue().equalsIgnoreCase("Topic")){
                        	topicIndex = currentCell.getColumnIndex();
                        } else if(currentCell.getStringCellValue().equalsIgnoreCase("Start date")){
                        	startDateindex = currentCell.getColumnIndex();
                        }
                        System.out.println(topicIndex+"\n"+startDateindex);
                    } 
                    if(currentCell.getCellTypeEnum() == CellType.STRING && currentCell.getColumnIndex() == topicIndex && !(currentCell.getStringCellValue().equalsIgnoreCase("Topic")) ){
                    	topiclist.add(currentCell.getStringCellValue());
                    }
                    if(currentCell.getCellTypeEnum() == CellType.STRING && currentCell.getColumnIndex() == startDateindex && !(currentCell.getStringCellValue().equalsIgnoreCase("Start Date")) ){
                    	startDateList.add(currentCell.getStringCellValue());
                    }else if(currentCell.getCellTypeEnum() == CellType.STRING && currentCell.getColumnIndex() == startDateindex && !(currentCell.getStringCellValue().equalsIgnoreCase("Start Date")) ){
                    	startDateList.add(currentCell.getStringCellValue());
                    }

                }
                System.out.println();              
            }
            System.out.println(topiclist+" "+startDateList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}