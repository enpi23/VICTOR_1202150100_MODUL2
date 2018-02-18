package kelompok6.co.wash.victor_1202150100_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    private TextView splashtv;
    private ImageView splashiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        splashtv = (TextView) findViewById(R.id.splashtv);
        splashiv = (ImageView) findViewById(R.id.splashiv);
        Animation transanim = AnimationUtils.loadAnimation(this,R.anim.transition);

        splashiv.startAnimation(transanim);
        splashtv.startAnimation(transanim);

        final Intent transintent = new Intent(this,MainActivity.class);
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(transintent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
