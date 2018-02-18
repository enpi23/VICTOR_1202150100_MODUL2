package kelompok6.co.wash.victor_1202150100_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class TakeAwayActivity extends AppCompatActivity {
    int check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        Toast.makeText(this, "Jenis Pesanan Take Away", Toast.LENGTH_LONG).show();
    }

    public void PesanTakeAway(View view) {
        Intent intent = new Intent(this, DaftarMenu.class); //supaya button bisa ke klik dan pindah ke kelas daftar_menu
        startActivity(intent);
    }
}


