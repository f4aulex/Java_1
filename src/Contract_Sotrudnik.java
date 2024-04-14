public class Contract_Sotrudnik extends Sotrudnik {


    public Contract_Sotrudnik(String FIO, String job_title, int salary) {
        super(FIO, job_title, salary);
    }

    @Override
    protected int count_Salary(int salary) {
        return salary;
    }

    public void set_Values(String FIO, String job_title, int salary){
        super.set_Values(FIO, job_title, salary);
    }

    protected String get_Values(){
        System.out.println(super.get_Values());
        return " зп: " + count_Salary(get_Salary());
    }
}
