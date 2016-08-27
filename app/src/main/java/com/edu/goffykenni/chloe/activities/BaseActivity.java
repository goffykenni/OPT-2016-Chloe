package com.edu.goffykenni.chloe.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.edu.goffykenni.chloe.infrastructure.ChloeApplication;

/**
 * Created by Libor on 27. 8. 2016.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected ChloeApplication application;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (ChloeApplication) getApplication();
    }
}
