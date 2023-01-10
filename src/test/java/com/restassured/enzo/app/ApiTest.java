package com.restassured.enzo.app;
import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Test;


/**
 * CRUD de una mascota de la api https://petstore.swagger.io/#
 */
public class ApiTest 
{
    //CREATE (POST)
    @Test
    public void addAPet(){
        System.out.println("=======START TEST=======");
        //Creo el objeto mascota que despues voy a parsear a json
        Pet mascota = Pet.createPet(12345, "marito", "galgo");
        given()
            .baseUri("https://petstore.swagger.io/v2")
            .contentType("application/json")
            .body(mascota)
            .log().all()

        //accion a donde va a ir el REQUEST
        .when()
            .post("/pet")

        //Validaciones del RESPONSE
        .then()
            .log().all()
            .assertThat()
            .statusCode(200)
            ;
        System.out.println("=======END OF TEST=======\n");
        
    }

    //READ (GET)
    @Test
    public void getAPet(){
        System.out.println("=======START TEST=======");
        given()
            .baseUri("https://petstore.swagger.io/v2")
            .log().all()
        .when()
            .get("/pet/12")
        .then()
            .log().all()
            .assertThat()
            .statusCode(200);
        System.out.println("=======END OF TEST=======\n");
        
    }

    //UPDATE (PUT)
    @Test
    public void updatePet(){
        System.out.println("=======START TEST=======");
        //Creo el objeto mascota que despues voy a parsear a json
        Pet mascota = Pet.createPet(12345, "bellota", "rothwailer");
        given()
            .baseUri("https://petstore.swagger.io/v2")
            .contentType("application/json")
            .body(mascota)
            .log().all()
        .when()
            .put("/pet")
        .then()
            .log().all()
            .assertThat()
            .statusCode(200)
            ;
        System.out.println("=======END OF TEST=======\n");
    }

    //DELETE
    @Test
    public void deletePet(){
        System.out.println("=======START TEST=======");

        int petId = 12345;
        given()
            .baseUri("https://petstore.swagger.io/v2")
            .param("petId", petId)
            .log().all()
            .delete("/pet/12345")
        .then()
            .log().all()
            .assertThat()
            .statusCode(200);
            System.out.println("=======END OF TEST=======\n");
        
    }
}
