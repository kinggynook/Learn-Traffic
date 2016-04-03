package pnu.b.appapinya.apinyaburisri.learntraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
            }
        }, 8000); //หน่วงวินาทีละ 1000 หน่วยเป็น milliSec
        MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),
                R.raw.intro_tata);
        mediaPlayer.start();

    }
}
