public class Main {
    public static void main(String[] args) {

        Firma Naughty_dog = new Firma("Naughty_dog");

        Otdel otdel_1 = new Otdel(Naughty_dog,"Первый отдел");
        Otdel otdel_2 = new Otdel(Naughty_dog,"Второй отдел");

        Naughty_dog.add_Otdel(otdel_1);
        Naughty_dog.add_Otdel(otdel_2);


        Sotrudnik sotrudnik_1 = new Regular_Sotrudnik("Андреев Ибрагим Абдулович",  "Regular Sotrudnik",40000, 15000);
        Sotrudnik sotrudnik_2 = new Regular_Sotrudnik("Коржов Максим Алексеевич", "Regular Sotrudnik", 40000, 10000);
        Sotrudnik sotrudnik_3 = new Contract_Sotrudnik("Сидоров Иван Андреевич",  "Contract Sotrudnik",  40000);
        Sotrudnik sotrudnik_4 = new Contract_Sotrudnik("Сидоров Алексей Андреевич",  "Contract Sotrudnik",  40000);


        otdel_1.add_Sotrudnik(sotrudnik_1);
        otdel_1.add_Sotrudnik(sotrudnik_2);
        otdel_2.add_Sotrudnik(sotrudnik_3);
        otdel_2.add_Sotrudnik(sotrudnik_4);


        System.out.println("Сотрудники в первом отделе:");
        for (Sotrudnik sotrudnik : otdel_1.get_Sotrudnik()) {
            System.out.println("ФИО: " + sotrudnik.get_FIO() + ", Отдел: " + sotrudnik.get_Otdel());
        }

        System.out.println("Количество сотрудников во втором отделе: " + otdel_2.get_Sotrudnik().size());

        String searchFIO = "Коржов Максим Алексеевич";
        Sotrudnik found_Sotrudnik = Naughty_dog.search_Sotrudnik_By_FIO(searchFIO);
        if (found_Sotrudnik != null) {
            System.out.println("Найденный сотрудник: " + found_Sotrudnik.get_FIO());
            System.out.println("Работает в отделе: " + found_Sotrudnik.get_Otdel().toString());
        } else {
            System.out.println("Сотрудник с ФИО " + searchFIO + " не найден.");

        }

        System.out.println(sotrudnik_1.get_Values());
        System.out.println(sotrudnik_2.get_Values());
        System.out.println(sotrudnik_3.get_Values());
        System.out.println(sotrudnik_4.get_Values());
    }
}