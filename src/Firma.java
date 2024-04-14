import java.util.ArrayList;
import java.util.List;

public class Firma {


    private String name;
    private List<Otdel> otdely;

    public Firma(String name) {
        set_name(name);
        otdely = new ArrayList<>();
    }


    public void set_name(String name){
        this.name = name;
    }

    public String get_name(){
        return "Название фирмы: " + name;
    }

    public List<Otdel> get_Otdely() {
        return otdely;
    }

    public void add_Otdel(Otdel otdel) {
        otdely.add(otdel);
    }

    public void remove_Otdel(Otdel otdel) {
        otdely.remove(otdel);
    }

    public Sotrudnik search_Sotrudnik_By_FIO(String fio) {
        for (Otdel otdel : otdely) {
            for (Sotrudnik sotrudnik : otdel.get_Sotrudnik()) {
                if (sotrudnik.get_FIO().equals(fio)) {
                    return sotrudnik;
                }
            }
        }
        return null;
    }
}
