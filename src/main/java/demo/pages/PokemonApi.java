package demo.pages;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class PokemonApi {

    String pokename;
    String pokeid;
    public void getPokemonByName(String name) {
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api/v2/pokemon/")
                .header("Content-type", "application/json")
                .get(name);
        String pokename = response.path("name");
        System.out.println(pokename);
        int pokeid = response.path("id");
        System.out.println(pokeid);
    }

    public String getPokemonName(){
        return this.pokename;
    }

    public String getPokeid(){
        return this.pokeid;
    }
}
