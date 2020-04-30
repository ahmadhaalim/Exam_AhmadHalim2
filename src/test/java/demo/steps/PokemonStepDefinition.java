package demo.steps;

import demo.pages.GoogleMainPage;
import demo.pages.GoogleSearchPage;
import demo.pages.PokemonApi;
import demo.pages.WikiArticle;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PokemonStepDefinition {
    public GoogleMainPage googleMainPage = new GoogleMainPage();
    public GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    public WikiArticle wiki = new WikiArticle();
    public String pokemon;
    public PokemonApi pokeApi = new PokemonApi();
    public String savedPokemonname;
    public int savedPokemonId;

    @Given("User has the name pokemon {string}")
    public void userHasTheNamePokemon(String pokename) {
        this.pokemon = pokename;
    }

    @When("User request to get by {string}")
    public void userRequestToGetBy(String arg0) {
        pokeApi.getPokemonByName(this.pokemon);
    }

    @And("User save the name and id")
    public void userSaveTheNameAndId() {
        this.savedPokemonId = pokeApi.getPokeid();
        System.out.println("aku disana"+this.savedPokemonId);
        this.savedPokemonname = pokeApi.getPokeName();
        System.out.println("aku disana"+this.savedPokemonname);
    }

    @And("User open the google homepage")
    public void userOpenTheGoogleHomepage() {
        googleMainPage.openGooglePage();
    }

    @And("User input with pokemon name added with {string} name on input search")
    public void userInputNameOnInputSearch(String wiki) {
        googleMainPage.inputSearch(this.savedPokemonname+" "+wiki);
    }

    @And("User press enter on the input search")
    public void userPressEnterOnTheInputSearch() {
        googleMainPage.pressEnter();
    }

    @And("User is in the google search page")
    public void userIsInTheGoogleSearchPage() {

    }

    @And("User click the first search result")
    public void userClickTheFirstSearchResult() {
        googleSearchPage.clickFirstResult(this.savedPokemonname);
    }

    @Then("User could see the same name")
    public void userCouldSeeTheSameName() {
        String name = wiki.getName();
        Assert.assertEquals(this.savedPokemonname,name.toLowerCase());
//        Assert.assertEquals("pikachu",name.toLowerCase());
    }

    @And("User could see the same id")
    public void userCouldSeeTheSameId() {
        String id = wiki.getId();
        Assert.assertEquals("0"+Integer.toString(this.savedPokemonId) ,id);
//        Assert.assertEquals("#25" ,id);
    }


}
