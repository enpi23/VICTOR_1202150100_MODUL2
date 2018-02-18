package kelompok6.co.wash.victor_1202150100_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class DaftarMenu extends AppCompatActivity {

    private List<FoodList> MenuList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private DaftarMenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_menu);

        mRecyclerView = (RecyclerView) findViewById(R.id.rvmenu); //ngambil layout recycler view
        mAdapter = new DaftarMenuAdapter(this, MenuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
        FoodData();
    }

        private void FoodData() {
            FoodList list = new FoodList(R.drawable.nasigoreng, "Nasi Goreng", "Rp. 12.000", R.string.nasgor);
                MenuList.add(list);
            list = new FoodList(R.drawable.miegoreng, "Mie Goreng", "Rp. 12.000", R.string.miegor);
                MenuList.add(list);
            list = new FoodList(R.drawable.miekuah, "Mie Kuah", "Rp. 12.000", R.string.mieku);
                MenuList.add(list);
            list = new FoodList(R.drawable.miekuahupn, "Mie Kuah Upnormal", "Rp. 15.000", R.string.miekuupn);
                MenuList.add(list);
            list = new FoodList(R.drawable.kwetiau, "Kwetiau", "Rp. 12.000", R.string.kwetiau);
                MenuList.add(list);
            list = new FoodList(R.drawable.satemadura, "Sate Madura", "Rp. 15.000", R.string.satemad);
                MenuList.add(list);
            list = new FoodList(R.drawable.satetaichan, "Sate Taichan", "Rp. 20.000", R.string.satetaic);
                MenuList.add(list);
            list = new FoodList(R.drawable.cimin, "Cimin", "Rp. 5.000", R.string.cimin);
                MenuList.add(list);

        }

    }

