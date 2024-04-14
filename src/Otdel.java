import java.util.ArrayList;
import java.util.List;

public class Otdel {

    private Firma firma;

    private String name;
    private List<Sotrudnik> sotrudniki;

    public Otdel(Firma firma, String name) {
        this.firma = firma;
        this.name = name;
        sotrudniki = new ArrayList<>();
    }


    public void set_name(String name){
        this.name = name;
    }

    public String get_name(){
        return "Название отдела: " + name;
    }
    public Firma get_Firma() {
        return firma;
    }

    public List<Sotrudnik> get_Sotrudnik() {
        return sotrudniki;
    }

    public void add_Sotrudnik(Sotrudnik sotrudnik) {
        sotrudniki.add(sotrudnik);
        sotrudnik.set_Otdel(this);
    }

    public void remove_Sotrudnik(Sotrudnik sotrudnik) {
        sotrudniki.remove(sotrudnik);
    }
}
