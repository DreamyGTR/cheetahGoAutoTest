package util;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class KeyBoardUtil {
    //按Tab键封装的方法
    public static void pressTabKey(){
        Robot robot=null;
        try{
            robot=new Robot();
        }catch (AWTException e){
            e.printStackTrace();
        }
    //调用keyPress方法来实现按下Tab键
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress((KeyEvent.VK_TAB));
    //调用keyRelease方法来实现释放Tab键
        robot.keyRelease(KeyEvent.VK_TAB);
}
    //按Enter键的封装方法
    public static void pressEnterKey(){
        Robot robot=null;
        try{
            robot=new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //调用keyPress方法来实现按下Enter键
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    /**
     * 将制定字符串设为剪切板的内容,然后执行粘贴操作.
     * 将页面交点切换到输入框后,调用此函数可以将制定字符串粘贴到输入框中
     */
    public static void setAndctrlVClipboarData(String string){
        StringSelection stringSelection=new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard()
                .setContents(stringSelection,null);
        Robot robot=null;
        try{
            robot=new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //以下4行代码实现按下和释放Ctrl+V组合键
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
}
