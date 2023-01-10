# restassured-enzo
This is a example of RestAssured using docker and make a simple test to https://petstore.swagger.io/#/

## Dependencies:
- Maven 3.6.3
- Docker 20.10.13

## Instalation:
- Use the next command to install dependencies :

        mvn install -Dmaven.test.skip

## Run:
- Use the next command to run the tests:

        mvn test


## Docker:
- Build the project and run it:

        docker build . -t restassured

        docker run restassured


# Create tests:
- The test are created in the folder "test/java/com.../", for example:


        given().log().all().
            // Accion a donde va a ir el REQUEST
            when().get("https://petstore.swagger.io/v2/pet/12").
            // Validaciones que debemos tener en cuenta del RESPONSE
            then().log().all().assertThat().statusCode(200);
