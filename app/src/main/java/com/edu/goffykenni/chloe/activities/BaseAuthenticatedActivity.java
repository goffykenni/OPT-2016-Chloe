package com.edu.goffykenni.chloe.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Libor on 27. 8. 2016.
 */
public abstract class BaseAuthenticatedActivity extends BaseActivity {

    @Override
    protected final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!application.getAuthorization().getUser().isLoggedIn()) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

        onAuthenticatedActivityCreate(savedInstanceState);
    }

    protected abstract void onAuthenticatedActivityCreate(Bundle savedInstanceState);
}
