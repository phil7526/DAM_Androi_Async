package com.example.dam_androi_async;

public class Connect_ViewModel {

    private final Connexion_Nasa connexion_nasa;

    public Connect_ViewModel(Connexion_Nasa connexion_nasa) {
        this.connexion_nasa = connexion_nasa;
    }

    public Result<Connexion_Response> makeHttpsRequest() {
        // String jsonBody = "{ username: \"" + username + "\", token: \"" + token + "\" }";


       return  connexion_nasa.makeHttpsRequest();
    }
}
