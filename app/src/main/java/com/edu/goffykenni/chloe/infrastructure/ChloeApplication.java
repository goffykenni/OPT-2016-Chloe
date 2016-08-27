package com.edu.goffykenni.chloe.infrastructure;

import android.app.Application;

/**
 * Represents a bag for static services. it is implemented as a singleton
 * that hosts couple of fields globally accesed throughout our app lifecycle.
 */
public class ChloeApplication extends Application {
    private Authorization authorization;

    // Called before any activity gets created
    @Override
    public void onCreate() {
        super.onCreate();
        authorization = new Authorization(this);
    }

    public Authorization getAuthorization() {
        return this.authorization;
    }
}
