package controllers;

import io.javalin.http.*;
import modules.Kurs;

public class loginController {
    public login(Context ctx){
        try {
            String brukernavn = ctx.pathParam("brukernavn");
            String password = ctx.pathParam("password");
            verifyUser(brukernavn, password);

        }catch (Exception e){
            ctx.status(400).result("Invalid input: " + e.getMessage());
        }
    }
}
