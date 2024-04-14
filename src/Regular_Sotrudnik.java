public class Regular_Sotrudnik extends Sotrudnik {

    private int bonus;


    public Regular_Sotrudnik(String FIO, String job_title, int salary, int bonus) {
        super(FIO, job_title, salary);
        this.bonus = bonus;
    }


    public void set_Values(String FIO, String job_title, int salary, int bonus){
        super.set_Values(FIO, job_title, salary);
        this.bonus = bonus;
    }

    protected String get_Values(){
        System.out.println(super.get_Values());
        return " зп: " + count_Salary(get_Salary());
    }


    public int get_Bonus(){
        return bonus;
    }

    @Override
    protected int count_Salary(int salary) {
        return salary + this.bonus;
    }
}
