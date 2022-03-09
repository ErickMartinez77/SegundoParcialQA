package pages;

import control.Button;
import control.Option;
import org.openqa.selenium.By;

public class ProjectOptions {
    public Button editOptionButton = new Button(By.xpath("//ul[@role='menu']//li[4]"));
    public Button deleteOptionButton = new Button(By.xpath("//ul[@role='menu']//li[12]"));
}
