package demo.pages;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class PokemonApi {

    public String pokename;
    public int pokeid;

    public void getPokemonByName(String name) {
        Response response = RestAssured
                .given()
                .baseUri("https://pokeapi.co")
                .basePath("/api")
                .header("Content-type", "application/json")
                .get("/v2/pokemon/"+name);
        this.pokename = response.path("name");
        System.out.println(this.pokename);
        this.pokeid = response.path("id");
        System.out.println(this.pokeid);
    }

    public String getPokeName(){
        System.out.println("aku disini"+this.pokename);
        return this.pokename;
    }

    public int getPokeid(){
        System.out.println("aku disini"+this.pokeid);
        return this.pokeid;
    }
}
