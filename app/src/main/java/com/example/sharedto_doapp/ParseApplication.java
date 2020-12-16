package com.example.sharedto_doapp;

import android.app.Application;

import com.example.sharedto_doapp.models.Post;
import com.example.sharedto_doapp.models.Task;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        ParseObject.registerSubclass(Task.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("UNyA2Y41Fx933IbCakVeZqlE9ikqR0hUKGCbaOcR")
                .clientKey("FZA8XxKS8oQS40aYeuAPHTpqFjU48wiDNMGBHyXK")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
