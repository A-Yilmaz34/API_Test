package services;

import io.restassured.response.Response;
import models.CategoryModel;
import models.CreateUserModel;


public class GoRestService extends BaseService {

    public static Response createUser(final CreateUserModel createUserModel){
        return defaultRequestSpecification()
                .body(createUserModel)
                .when()
                .post("/v2/pet");
    }

    /*public static Response updateUser(final UpdateUserModel updateUserModel, int id){
        return defaultRequestSpecification()
                .body(updateUserModel)
                .when()
                .put("/public/v2/users/"+id);
    }*/
    public static Response getUser(){
        return defaultRequestSpecification()
                .when()
                .get("/v2/users");
    }
}
