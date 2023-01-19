package practiceLMS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P05_Actions extends TestBase {
    /*
    - http://szimek.github.io/signature_pad/ sayfasına gidiniz
    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
    - Çizimden sonra clear butonuna basalım
    - Son olarak sayfayı temizleyiniz
     */

    @Test
    public void name() throws InterruptedException {
        driver.get("http://szimek.github.io/signature_pad/");
        WebElement yaziTahtasi = driver.findElement(By.xpath("//canvas"));
        Actions actions = new Actions(driver);
        actions.moveToElement(yaziTahtasi).clickAndHold();

        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5,-5);
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(0,15);
        }
        actions.release();
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(10,-2);
        }
        actions.clickAndHold();
        int y=0;
        int x=-10;
        for (int i = 0; i < 11; i++) {
            actions.moveByOffset(x,y);
            y--;
            x++;
        }
        for (int i = 0; i < 4; i++) {
            actions.moveByOffset(x,y);
            y++;
            x++;
        }
        for (int i = 0; i < 8; i++) {
            actions.moveByOffset(5,-5);
        }
        actions.release();
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(0,8);
        }
        actions.clickAndHold();
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(-3,-1);
        }
        for (int i = 0; i < 12; i++) {
            actions.moveByOffset(-2,1);
        }
        actions.release();
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(6,0);
        }
        actions.clickAndHold();
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(1,3);
        }
        for (int i = 0; i < 12; i++) {
            actions.moveByOffset(-1,2);
        }

//        for (int i = 0; i < 10; i++) {
//            actions.moveByOffset(x,y);
//            y--;
//            x++;
//        }



//        for (int i = 0; i < 10; i++) {
//            actions.moveByOffset(-5,-5);
//        }
//        for (int i = 0; i < 10; i++) {
//            actions.moveByOffset(5,-5);
//        }
//        for (int i = 0; i < 10; i++) {
//            actions.moveByOffset(5,5);
//        }
//        for (int i = 0; i < 10; i++) {
//            actions.moveByOffset(-5,5);
//        }

//        int y=0;
//        int x=-5;
//        for (int i = 0; i < 6; i++) {
//            actions.moveByOffset(x,y);
//            y--;
//            x++;
//        }
//        for (int i = 0; i <6; i++) {
//            actions.moveByOffset(x,y);
//            y++;
//            x++;
//        }
//        for (int i = 0; i < 6; i++) {
//            actions.moveByOffset(x,y);
//            y++;
//            x--;
//        }
//        for (int i = 0; i < 9; i++) {
//            actions.moveByOffset(x,y);
//            y--;
//            x--;
//        }



        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[text()='Clear']")).click();
        actions.release().build().perform();
    }
}