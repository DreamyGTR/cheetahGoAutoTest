package util;

import cheetahgo.constant.Constants;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 本类主要实现文件拓展名为.xlsx的Excel文件操作
 */
public class ExcelUtil {
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;

    //设定要操作的Excel文件路径和Excel文件中的Sheet名称
    //在读/写Excel文件时,均需先调用此方法,设定要操作的Excel文件路径和要操作的Sheet名称
    public static void setExcelFile(String Path, String SheetName) throws FileNotFoundException {
        FileInputStream ExcelFile;
        try {
            //实例化Excel文件的FileInputStream对象
            ExcelFile = new FileInputStream(Path);
            //实例化Excel文件的XSSFWorkbook对象
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            /*实例化XSSFSheet对象,制定Excel文件中的Sheet名称,
                用于后续Sheet中行、列和单元格的操作
             */
            ExcelWSheet=ExcelWBook.getSheet(SheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //读取Excel文件指定单元格的函数
    public static String getCellData(int RowNum,int ColNum){
        try{
            //通过函数参加指定单元格的行号和列号,获取指定的单元格对象
            Cell=ExcelWSheet.getRow(RowNum).getCell(ColNum);
            /**
             * 如果单元格的内容为字符串类型,则使用getStringCellValue方法获取单元格的内容
             * 如果单元格的内容位数字类型,则使用getNumericCellValue方法获取单元格内容
             * 注意getNumericCellValue方法返回值为double类型,转换字符串类型必须
             * 在Cell.getNumericCellValue前面加"",用于强制转换double类型为String类型
             * 不加则会抛出double类型无法转换为S tring类型的异常
             */
            String CellData=Cell.getCellType()==XSSFCell.CELL_TYPE_STRING?Cell
                    .getStringCellValue()+""
                    :String.valueOf(Math.round((Cell.getNumericCellValue())));
            return CellData;
        }catch (Exception e){
            return "";
        }
    }

    //在Excel文件的执行单元格中写入数据
    public static void setCellData(int RowNum,int ColNum,String Result){
        try{
            //获取Excel文件中的行对象
            Row=ExcelWSheet.getRow(RowNum);
            //如果单元格为空,则返回Null
            Cell=Row.getCell(ColNum, XSSFRow.RETURN_BLANK_AS_NULL);

            if (Cell==null){
                //当单元格对象是Null的时候,则创建单元格
                //当单元格为空,无法直接调用单元格的setCellValue方法设定单元格的值
                Cell= Row.createCell(ColNum);
                //创建单元格后,可以调用单元格对象的setCellValue方法设定单元格的值
                Cell.setCellValue(Result);
            }else {
                //单元格中有内容,则可以直接调用单元格对象的setCellValue方法设定单元格的值
                Cell.setCellValue(Result);
            }
            //实例化写入Excel文件的文件输入流对象
            FileOutputStream fileOut=new FileOutputStream(Constants.TestDataExcelFilePath);
            //将内容写入Excel文件
            ExcelWBook.write(fileOut);
            //调用flush方法强制刷新写入文件
            fileOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
