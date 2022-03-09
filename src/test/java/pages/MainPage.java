package pages;

import control.Button;
import control.ProjectName;
import org.openqa.selenium.By;

public class MainPage {
    public Button buttonNewProject = new Button(By.xpath("//button[@data-track='navigation|projects_quick_add']"));
    public ProjectName projectName = new ProjectName(By.xpath("//h1[@role='header']"));
    public Button buttonMenuProjectCreated = new Button(By.xpath("//li[last()]//div[@class='bwinE4g8Ubo+bdRFBhZqsg==']//div[@class='_7DCqR7o3BYjme7edphDp8A==']//button[@type='button']"));

    public void clickNameProject(String name){
        ProjectName nameProjectLabel = new ProjectName(By.xpath("//li[last()]//span[text()='"+name+"']"));
        nameProjectLabel.click();
    }
}
