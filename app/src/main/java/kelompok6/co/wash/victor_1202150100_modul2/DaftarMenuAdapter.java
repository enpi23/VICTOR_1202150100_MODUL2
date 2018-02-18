package kelompok6.co.wash.victor_1202150100_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Enpi23 on 18/02/2018.
 */

public class DaftarMenuAdapter extends RecyclerView.Adapter<DaftarMenuAdapter.MenuViewHolder>  {
    private LayoutInflater mInflater;
    private List<FoodList> MenuList;

    public DaftarMenuAdapter(Context context, List<FoodList> MenuList) {
        mInflater = LayoutInflater.from(context);
        this.MenuList = MenuList;

    }
    public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView type, nominal;
        ImageView foodpic;

        public MenuViewHolder(View view) {
            super(view);
            type = (TextView) view.findViewById(R.id.type);
            nominal = (TextView) view.findViewById(R.id.nominal);
            foodpic = (ImageView) view.findViewById(R.id.foodpic);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            Toast.makeText(view.getContext(), type.getText(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(view.getContext(), DetailMenu.class);
            int foodpic = MenuList.get(mPosition).getFoodpic();
            int komposisi = MenuList.get(mPosition).getKomposisi();
            intent.putExtra("foodpic", foodpic);
            intent.putExtra("type",type.getText());
            intent.putExtra("nominal",nominal.getText());
            intent.putExtra("komposisi",komposisi);
            view.getContext().startActivity(intent);

        }
    }
    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.daftar_menu, parent, false);

        return new MenuViewHolder(mItemView);
    }
    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {

        FoodList FoodList = MenuList.get(position);
        holder.foodpic.setImageResource(FoodList.getFoodpic());
        holder.nominal.setText(FoodList.getNominal());
        holder.type.setText(FoodList.getType());


    }
    @Override
    public int getItemCount() {
        return MenuList.size();
    }


}
