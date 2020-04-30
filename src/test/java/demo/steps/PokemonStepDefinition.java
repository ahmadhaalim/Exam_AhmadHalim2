package demo.steps;

import demo.pages.GoogleMainPage;
import demo.pages.GoogleSearchPage;
import demo.pages.PokemonApi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PokemonStepDefinition {
    public GoogleMainPage googleMainPage = new GoogleMainPage();
    public GoogleSearchPage googleSearchPage = new GoogleSearchPage();
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
        this.savedPokemonname = pokeApi.getPokemonName();
    }

    @And("User open the google homepage")
    public void userOpenTheGoogleHomepage() {
        googleMainPage.openGooglePage();
    }

    @And("User input with pokemon name added with {string} name on input search")
    public void userInputNameOnInputSearch(String wiki) {
        googleMainPage.inputSearch(savedPokemonname+wiki);
    }

    @And("User click the submit button")
    public void userClickTheSubmitButton() {
        googleMainPage.clickSearch();
    }

    @And("User is in the google search page")
    public void userIsInTheGoogleSearchPage() {

    }

    @And("User click the first search result")
    public void userClickTheFirstSearchResult() {
        googleSearchPage.clickFirstResult();
    }

    @Then("User could see the same name")
    public void userCouldSeeTheSameName() {

    }

    @And("User could see the same id")
    public void userCouldSeeTheSameId() {
    }


}
