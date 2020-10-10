package com.shiinfo.kavithatoast;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
/**
 * Created by kavitha on 10.10.2020.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, Myservicenew.class);
        intent.setAction(Myservicenew.ACTION_START_FOREGROUND_SERVICE);
        startService(intent);

    }
}