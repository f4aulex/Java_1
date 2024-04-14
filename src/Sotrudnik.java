import java.nio.channels.FileLock;

public abstract class Sotrudnik {
    private String FIO;
    private Otdel otdel;

    private String job_title;

    private int salary;

    public Sotrudnik(String FIO, String job_title, int salary) {
        set_Values(FIO, job_title, salary);
    }

    protected void set_Values(String FIO, String job_title, int salary){
        this.FIO = FIO;
        this.job_title = job_title;
        this.salary = salary;
    }

    protected String get_Values(){
        return "Имя сотрудника: " + FIO  + "\n Должность: " + job_title;
    }

    public String get_FIO() {
        return FIO;
    }

    public String get_job_title(){
        return job_title;
    }

    public int get_Salary(){
        return salary;
    }

    protected abstract int count_Salary(int salary);

    public Otdel get_Otdel() {
        return otdel;
    }

    public void set_Otdel(Otdel otdel) {
        this.otdel = otdel;
    }
}
