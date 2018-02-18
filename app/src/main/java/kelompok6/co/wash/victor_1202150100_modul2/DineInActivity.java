package kelompok6.co.wash.victor_1202150100_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    int check;
    String nomeja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        Toast.makeText(this, "Jenis Pesanan Dine In", Toast.LENGTH_LONG).show();
        showSpinner();
    }
    private void showSpinner() {
        // Create the spinner.
        Spinner spinner = (Spinner) findViewById(R.id.nomejaspin);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinnerItem, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int a, long b) {
        this.nomeja = adapterView.getItemAtPosition(a).toString(); //nempatin nilai dari spinner
        String showToast = this.nomeja + " telah terpilih"; // buat variabel untuk nampilin toast
        this.check = a;
        if (a != 0) { // nampilin toast
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, showToast, Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void PesanDineIn(View view){
        if (check !=0){
            Intent intent = new Intent(this, DaftarMenu.class);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(this, "Pilih Nomor Meja Dahulu", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}

