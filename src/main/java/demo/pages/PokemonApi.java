package demo.pages;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class PokemonApi {

    String pokename;
    int pokeid;
    public void getPokemonByName(String name) {
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api/v2/pokemon/")
                .header("Content-type", "application/json")
                .get(name);
        this.pokename = response.path("name");
        System.out.println(this.pokename);
        this.pokeid = response.path("id");
        System.out.println(this.pokeid);
    }

    public String getPokemonName(){
        return this.pokename;
    }

    public int getPokeid(){
        return this.pokeid;
    }
}
