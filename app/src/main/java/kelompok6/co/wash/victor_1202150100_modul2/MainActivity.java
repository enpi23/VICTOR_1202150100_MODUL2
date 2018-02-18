package kelompok6.co.wash.victor_1202150100_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton RadDine, RadTake;
    private Button pesanbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "VICTOR_1202150100",Toast.LENGTH_LONG).show();

        final RadioButton RadDine = (RadioButton) findViewById(R.id.RadDine);
        final RadioButton RadTake = (RadioButton) findViewById(R.id.RadTake);
        final Button pesanbtn = (Button) findViewById(R.id.pesanbtn);

        pesanbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (RadDine.isChecked()){
                    Intent intentDine = new Intent(MainActivity.this, DineInActivity.class);
                    startActivityForResult(intentDine,0);
                }
                else if (RadTake.isChecked()){
                    Intent intentTake = new Intent(MainActivity.this, TakeAwayActivity.class);
                    startActivityForResult(intentTake,0);
                }
            }
        });
    }
}
