package com.restassured.enzo.app2;

import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TodolyApiTest {
    String mail = RandomString.getAlphaNumericString(5)+"@gmail.com";

    @Test
    @Order(1)
    public void createUser(){
        System.out.println("===== POST =====");
        User usuario = new User(mail,"12345","Enzo Lks");

        given()
            .baseUri("https://todo.ly/api")
            .contentType("application/json")
            .body(usuario)
            .log().all()
        .when()
            .post("/user.json")
        .then()
            .assertThat()
            .statusCode(200)
            .log().all();
        System.out.println("=================\n");
    }
    
    @Test
    @Order(2)
    public void getUser(){
        System.out.println("===== GET =====");
        given()
            .baseUri("https://todo.ly/api")
            .auth().preemptive().basic("enzoenzo@gmail.com", "enzoenzo")
            .log().all()
        .when()
            .get("/user.json")
        .then()
            .assertThat()
            .statusCode(200)
            .log().all();
        System.out.println("=================\n");
    }

    /*@Test
    @Order(3)
    public void updateUser(){
        System.out.println("===== PUT =====");
        given()
            .baseUri("https://todo.ly/api")
            .auth().preemptive().basic(mail, "12345")
            .contentType("application/json")

            .param("UserObject",new User(mail, "12345", "Enzo Lakes"))
            .log().all()
        .when()
            .put("/0.json")
        .then()
            .assertThat()
            .statusCode(200)
            .log().all();
        System.out.println("=================\n");
    }

    @Test
    @Order(4)
    public void deleteUser(){
        System.out.println("===== DELETE =====");
        User usuario = new User(mail,"12345","Enzo Lks");

        given()
            .baseUri("https://todo.ly/api")
            .auth().preemptive().basic(usuario.getEmail(), usuario.getPassword())
            .log().all()
        .delete("/0.json")
        .then()
            .assertThat()
            .statusCode(200)
            .log().all();
    System.out.println("=================\n");
    }*/
}
