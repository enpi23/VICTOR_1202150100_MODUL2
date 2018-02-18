package kelompok6.co.wash.victor_1202150100_modul2;

/**
 * Created by Enpi23 on 18/02/2018.
 */
public class FoodList {
    private int foodpic, komposisi;
    private String type, nominal;
    public FoodList(int foodpic, String type, String nominal, int komposisi) {
        this.foodpic = foodpic;
        this.type = type;
        this.nominal = nominal;
        this.komposisi = komposisi;
    }

    public String getNominal() {
        return nominal;
    }

    public String getType() {
        return type;
    }

    public int getFoodpic() {
        return foodpic;
    }

    public int getKomposisi() {
        return komposisi;
    }

    public void setFoodpic(int foodpic) {
        this.foodpic = foodpic;
    }

    public void setKomposisi(String nominal) {
        this.nominal = nominal;
    }

    public void setType(String type) {
        this.type = type;
    }
}
