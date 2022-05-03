package com.yolandaoctl.a10119171uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    //deklarasi
    private Timer splashTimer;
    private static final long DELAY =3000;
    private boolean scheduled = false;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        context = this;
        splashTimer = new Timer();

        splashTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(context, WalkthroughScreen.class);
                startActivity(intent);
                finish();

            }
        }, DELAY);
        scheduled = true;
    }
}