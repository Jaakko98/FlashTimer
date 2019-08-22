package com.example.jaakko.ekaprojekti;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS = 300000;
    private TextView TextTop;
    private TextView TextJungle;
    private TextView TextMid;
    private TextView TextAdc;
    private TextView TextSupp;
    private Button ButtonTop;
    private Button ButtonJungle;
    private Button ButtonMid;
    private Button ButtonAdc;
    private Button ButtonSupp;
    private CountDownTimer CountDownTimer1;
    private CountDownTimer CountDownTimer2;
    private CountDownTimer CountDownTimer3;
    private CountDownTimer CountDownTimer4;
    private CountDownTimer CountDownTimer5;
    private long TimeLeftInMillis1 = START_TIME_IN_MILLIS;
    private long TimeLeftInMillis2 = START_TIME_IN_MILLIS;
    private long TimeLeftInMillis3 = START_TIME_IN_MILLIS;
    private long TimeLeftInMillis4 = START_TIME_IN_MILLIS;
    private long TimeLeftInMillis5 = START_TIME_IN_MILLIS;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextTop = findViewById(R.id.text_view_countdown_top);
        ButtonTop = findViewById(R.id.button_top);
        TextJungle = findViewById(R.id.text_view_countdown_jungle);
        ButtonJungle = findViewById(R.id.button_jungle);
        TextMid = findViewById(R.id.text_view_countdown_mid);
        ButtonMid = findViewById(R.id.button_mid);
        TextAdc = findViewById(R.id.text_view_countdown_adc);
        ButtonAdc = findViewById(R.id.button_adc);
        TextSupp = findViewById(R.id.text_view_countdown_supp);
        ButtonSupp = findViewById(R.id.button_supp);

        ButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer1();
            }
        });

        ButtonJungle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer2();
            }
        });

        ButtonMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer3();
            }
        });

        ButtonAdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer4();
            }
        });

        ButtonSupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer5();
            }
        });
    }

    private void startTimer1() {
        CountDownTimer1 = new CountDownTimer(TimeLeftInMillis1, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeftInMillis1 = millisUntilFinished;
                updateCountDownText1();

            }

            @Override
            public void onFinish() {
                CountDownTimer1.cancel();
                TimeLeftInMillis1 = 300000;
                updateCountDownText1();
            }
        }.start();
    }

    private void updateCountDownText1() {
        int minutes = (int) TimeLeftInMillis1 / 1000 /60;
        int seconds = (int) TimeLeftInMillis1 / 1000 % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        TextTop.setText(timeLeftFormatted);
    }

    private void startTimer2() {
        CountDownTimer2 = new CountDownTimer(TimeLeftInMillis2, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeftInMillis2 = millisUntilFinished;
                updateCountDownText2();

            }

            @Override
            public void onFinish() {
                CountDownTimer2.cancel();
                TimeLeftInMillis2 = 300000;
                updateCountDownText2();
            }
        }.start();
    }

    private void updateCountDownText2() {
        int minutes = (int) TimeLeftInMillis2 / 1000 /60;
        int seconds = (int) TimeLeftInMillis2 / 1000 % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        TextJungle.setText(timeLeftFormatted);
    }

    private void startTimer3() {
        CountDownTimer3 = new CountDownTimer(TimeLeftInMillis3, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeftInMillis3 = millisUntilFinished;
                updateCountDownText3();

            }

            @Override
            public void onFinish() {
                CountDownTimer3.cancel();
                TimeLeftInMillis3 = 300000;
                updateCountDownText3();
            }
        }.start();
    }

    private void updateCountDownText3() {
        int minutes = (int) TimeLeftInMillis3 / 1000 /60;
        int seconds = (int) TimeLeftInMillis3 / 1000 % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        TextMid.setText(timeLeftFormatted);
    }

    private void startTimer4() {
        CountDownTimer4 = new CountDownTimer(TimeLeftInMillis4, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeftInMillis4 = millisUntilFinished;
                updateCountDownText4();

            }

            @Override
            public void onFinish() {
                CountDownTimer4.cancel();
                TimeLeftInMillis4 = 300000;
                updateCountDownText4();
            }
        }.start();
    }

    private void updateCountDownText4() {
        int minutes = (int) TimeLeftInMillis4 / 1000 /60;
        int seconds = (int) TimeLeftInMillis4 / 1000 % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        TextAdc.setText(timeLeftFormatted);
    }

    private void startTimer5() {
        CountDownTimer5 = new CountDownTimer(TimeLeftInMillis5, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeftInMillis5 = millisUntilFinished;
                updateCountDownText5();

            }

            @Override
            public void onFinish() {
                CountDownTimer5.cancel();
                TimeLeftInMillis5 = 300000;
                updateCountDownText5();
            }
        }.start();
    }

    private void updateCountDownText5() {
        int minutes = (int) TimeLeftInMillis5 / 1000 /60;
        int seconds = (int) TimeLeftInMillis5 / 1000 % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        TextSupp.setText(timeLeftFormatted);
    }
}