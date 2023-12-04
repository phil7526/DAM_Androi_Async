package com.example.dam_androi_async;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.HandlerCompat;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * exemple de connexion asynchrone à un service REST
 * Connexion au site de la NASA
 * Site NASA https://api.nasa.gov/
 *  * site https://api.nasa.gov/EPIC/api/natural/date/2019-05-30?api_key=DEMO_KEY
 *  * S'inscrire sur le site pour obtenir une clÃ© d'accÃ¨s, gratuit
 * Les données lues sont au format Json
 * Un bouton pour se connecter
 * un  ListView pour afficher les objets lus
 *
 * Le problème adressé ici est de réaliser des requetes de lecture
 * en mode asynchrone, de façon à ne pas exécuter de tâche longue dans le Thread UI.
 * Lee données reçues, puis décodées, sont communiquées au Thread UI par un looper
 * ou handler.
 */

public class MainActivity extends AppCompatActivity {

    /*
    Déclaration de l'exécutor qui permettraé l'exécution des tâches de fonds.
     */
    ExecutorService executorService = Executors.newFixedThreadPool(4);

    /*déclarer le Handler qui permettra de passer les résultats de la tâche de fond
    au thread UI

 */
    Handler mainThreadHandler = HandlerCompat.createAsync(Looper.getMainLooper());
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}