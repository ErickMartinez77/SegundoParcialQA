package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class LoginTestTodoist extends BaseTodoist{
    TopFirstPage topFirstPage = new TopFirstPage();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    NewProjectModal newProjectModal = new NewProjectModal();
    String email = "erickmartinezcrypto123@gmail.com";
    String pass = "Erickmartinezcrypto123#";
    String projectName = "Project 1";
    ProjectOptions projectOptions = new ProjectOptions();
    EditProjectModal editProjectModal = new EditProjectModal();
    String projectNameUpdate = "Project 1 Update";
    ConfirmDeletePage confirmDeletePage = new ConfirmDeletePage();

    @Test
    public void login() throws InterruptedException {
        topFirstPage.buttonLogin.click();

        loginPage.textBoxEmail.setText(email);
        loginPage.textBoxPass.setText(pass);
        loginPage.buttonLogin.click();
        //create project
        mainPage.buttonNewProject.click();
        newProjectModal.textBoxProjectName.setText(projectName);
        newProjectModal.buttonAddProject.click();
        Thread.sleep(3000);
        Assertions.assertEquals(projectName,mainPage.projectName.getTextControl(),"ERROR");
        //update project
        mainPage.clickNameProject(projectName);
        mainPage.buttonMenuProjectCreated.click();
        projectOptions.editOptionButton.click();
        editProjectModal.textBoxEditProjectName.clearSetText("");
        editProjectModal.textBoxEditProjectName.setText(projectNameUpdate);
        editProjectModal.buttonSaveNewProjectName.click();
        Thread.sleep(3000);
        Assertions.assertEquals(projectNameUpdate,mainPage.projectName.getTextControl(),"ERROR");
        //delete project
        mainPage.clickNameProject(projectNameUpdate);
        mainPage.buttonMenuProjectCreated.click();
        projectOptions.deleteOptionButton.click();
        confirmDeletePage.buttonDeleteProject.click();
        Assertions.assertNotEquals("",projectNameUpdate,"Error");
    }
}
