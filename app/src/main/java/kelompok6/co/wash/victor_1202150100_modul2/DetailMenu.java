package kelompok6.co.wash.victor_1202150100_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_menu);

        Intent intent = getIntent();
        //ambil nilai dari tiap value
        int foto = intent.getExtras().getInt("foodpic");
        String jenis = intent.getStringExtra("type");
        String nominal = intent.getStringExtra("nominal");
        int komposisimenu = intent.getExtras().getInt("komposisi");
        //ambil nilai dari id textview dan imageview
        ImageView fotoDetail = (ImageView) findViewById(R.id.detailpic);
        TextView jenisMenu = (TextView) findViewById(R.id.jenis);
        TextView nominalMenu = (TextView) findViewById(R.id.harga);
        TextView komposisi = (TextView) findViewById(R.id.komposisi);

        //nampilkan hasil get
        fotoDetail.setImageResource(foto);
        jenisMenu.setText(jenis);
        nominalMenu.setText(nominal);
        komposisi.setText(komposisimenu);
    }
}
