package com.edu.goffykenni.chloe.infrastructure;

import android.content.Context;

/**
 * Created by Libor on 26. 8. 2016.
 */
public class Authorization {
    // Context gives access to various services inside android API
    // Context stores the current application state so that newly created objects
    // can understand what is going on. Typically, we call it to get some info regarding
    // another part of our app.
    private final Context context;
    private User user;

    public Authorization(Context context) {
        this.context = context;
        user = new User();

    }

    public User getUser() {
        return user;
    }

}
