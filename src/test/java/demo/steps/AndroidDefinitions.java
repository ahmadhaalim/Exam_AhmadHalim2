package demo.steps;

import demo.pages.AddPage;
import demo.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AndroidDefinitions {
    private MainPage mainPage = new MainPage();
    private AddPage addPage = new AddPage();
    @Given("User in the main page")
    public void userInTheMainPage() {
        mainPage.isOnMainPage();

    }

    @When("User click the add button")
    public void userClickTheAddButton() {
        mainPage.clickAddButton();
    }

        @And("User go to add page")
    public void userGoToAddPage() {
        addPage.isOnAddPage();
    }
    @Given("User in the add page")
    public void userInTheAddPage() {
        mainPage.isOnMainPage();
        mainPage.clickAddButton();
        addPage.isOnAddPage();
    }

    @When("User input the title {string} to the input title")
    public void userInputTheTitleToTheInputTitle(String title) {
        addPage.insertTitle(title);
    }

    @And("User input the desc {string} to the description")
    public void userInputTheDescToTheDescription(String desc) {
        addPage.insertDescription(desc);
    }

    @And("User click the checkmark button")
    public void userClickTheCheckmarkButton() {
        addPage.clickCheckmark();
    }

    @Then("User back to the main page")
    public void userBackToTheMainPage() {
        boolean result = mainPage.isOnMainPage();
        Assert.assertTrue(result);
    }

    @Then("User can see the new todolist {string}")
    public void userCanSeeTheNewTodolist(String title) {
        String result = mainPage.checkNewAddedToDo(title);
        Assert.assertEquals(title,result);
    }

    @When("User check the the to do")
    public void userCheckTheTheToDo() {
        mainPage.clickCheckToDo();
    }

    @Then("To do is checked")
    public void toDoIsChecked() {
        String result = mainPage.getCheck();
        Assert.assertEquals("true", result);
    }


    @And("User have one to do unchecked with title {string}")
    public void userHaveOneToDoUnchecked(String title) {
        mainPage.clickAddButton();
        addPage.isOnAddPage();
        userInputTheTitleToTheInputTitle(title);
        userClickTheCheckmarkButton();
        String result = mainPage.getCheck();
        Assert.assertEquals("false", result);
    }

    @And("User have one to do checked with title {string}")
    public void userHaveOneToDoCheckedWithTitle(String title) {
        mainPage.clickAddButton();
        addPage.isOnAddPage();
        userInputTheTitleToTheInputTitle(title);
        userClickTheCheckmarkButton();
        userCheckTheTheToDo();
        String result = mainPage.getCheck();
        Assert.assertEquals("true", result);
    }

    @Then("To do is unchecked")
    public void toDoIsUnchecked() {
        String result = mainPage.getCheck();
        Assert.assertEquals("false", result);
    }

    @When("User uncheck the the to do")
    public void userUncheckTheTheToDo() {
        mainPage.clickCheckToDo();
    }

    @When("User click the filter menu")
    public void userClickTheFilterMenu() {
        mainPage.clickFilter();
    }

    @And("User click the Active tab")
    public void userClickTheActiveTab() {
        mainPage.clickFilterActive();
    }

    @Then("User see only {string} active todo")
    public void userSeeOnlyActiveTodo(String title) {
        String result = mainPage.checkTitleOnOneToDoList();
        Assert.assertEquals(title ,result);
    }

    @Then("User see the Active to do label")
    public void userSeeTheActiveToDoLabel() {
        String active = "Active TO-DOs";
        String result = mainPage.filterLabel();
        Assert.assertEquals(active,result);
    }

    @And("User see its unchecked")
    public void userSeeItsUnchecked() {
        String result = mainPage.getCheck();
        Assert.assertEquals("false", result);
    }

    @And("User click the Complete tab")
    public void userClickTheCompleteTab() {
        mainPage.clickfilterComplete();;
    }

    @Then("User see the Complete to do label")
    public void userSeeTheCompleteToDoLabel() {
        String complete = "Completed TO-DOs";
        String result = mainPage.filterLabel();
        Assert.assertEquals(complete,result);
    }

    @And("User see only {string} complete todo")
    public void userSeeOnlyCompleteTodo(String title) {
        String result = mainPage.checkTitleOnOneToDoList();
        Assert.assertEquals(title ,result);
    }

    @And("User see its checked")
    public void userSeeItsChecked() {
        String result = mainPage.getCheck();
        Assert.assertEquals("true", result);
    }

    @When("User click the three dot menu")
    public void userClickTheThreeDotMenu() {
        mainPage.clickThreeDotMenu();
    }

    @And("User click the clear menu")
    public void userClickTheClearMenu() {
        mainPage.clickClearMenu();
    }

    @Then("User completed to do is gone")
    public void userCompletedToDoIsGone() {
        String result = mainPage.clearedCompleteToDo();
        Assert.assertEquals("You have no TO-DOs!", result);
    }

    @When("User click the three bar menu")
    public void userClickTheThreeBarMenu() {
        mainPage.clickMenuNavigate();
    }

    @And("User click statistic menu")
    public void userClickStatisticMenu() {
        mainPage.clickStatistic();
    }

    @Then("User can see the amount of active task")
    public void userCanSeeTheAmountOfActiveTask() {
        String result = mainPage.getTextStat();
        Assert.assertEquals("Active tasks: 1\nCompleted tasks: 0",result);
    }
}
