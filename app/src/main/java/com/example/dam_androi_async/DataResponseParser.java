package com.example.dam_androi_async;

import java.io.InputStream;

public class DataResponseParser {


    public DataResponseParser() {

    }

 Connexion_Response parse(InputStream inputStream){
  Connexion_Response connexion_response= new com.example.dam_androi_async.Connexion_Response();
  //lire le stream ici et décoder les données Json
        return connexion_response;
    }
}
