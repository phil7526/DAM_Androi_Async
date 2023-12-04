package com.example.dam_androi_async;

import android.os.Handler;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executor;
public class Connexion_Nasa {
    private final Handler resultHandler;
private Executor executor;
    private final String connectUrl = "https://example.com/login";
    private final DataResponseParser dataResponseParser;

    public Connexion_Nasa(DataResponseParser dataResponseParser) {
        this.dataResponseParser = dataResponseParser;
    }
    public Connexion_Nasa(DataResponseParser responseParser, Executor executor, Handler handler) {
        this.dataResponseParser= responseParser;
        this.executor = executor;
        this.resultHandler=handler;

    }
    public Result<Connexion_Response> makeHttpsRequest() {
        try {
            URL url = new URL(connectUrl);
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            httpConnection.setRequestMethod("GET");
            httpConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpConnection.setRequestProperty("Accept", "application/json");
            //httpConnection.setDoOutput(true);
            if (httpConnection.getResponseCode() == 404){
                System.out.println("erreur de connexion");
            }


           // httpConnection.getOutputStream().write(jsonBody.getBytes("utf-8"));

            Connexion_Response connexion_response = dataResponseParser.parse(httpConnection.getInputStream());
            return new Result.Success<Connexion_Response>(connexion_response);
        } catch (Exception e) {
            return new Result.Error<Connexion_Response>(e);
        }
    }
}

