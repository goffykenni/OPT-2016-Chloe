package com.edu.goffykenni.chloe.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.goffykenni.chloe.R;

/**
 * Created by Libor on 27. 8. 2016.
 */
public class LoginActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
    }

    public void doClick(View view) {
        application.getAuthorization().getUser().setLoggedIn(true);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
