import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //
        //задача 1
        System.out.println("\nЗадача 1");
        int deposit = 15000;//переменная "вклад" с заданным значением
        double sum = 0;//сумма накопленя
        double increaseOnePercent = 1.01;//коэффициент роста на 1% - из прошлой домашки
        int month = 0;
        while (sum < 2459000){
            sum = (sum + deposit) * increaseOnePercent;
            month ++;
            System.out.printf(Locale.US, "Месяц " + month + ", сумма накоплений равна %.2f рублей\n", sum);
        }
        //
        //задача 2
        System.out.println("\nЗадача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i ++;
        }
        System.out.println();
        for (i = 10; i >= 1; i --) {//используется переменная, объявленная в предыдущем блоке
            System.out.print(i + " ");
        }
        //
        //задача 3
        System.out.println("\n\nЗадача 3");
        int population = 12000000;
        int birthRate = 17;//показатель рождаемости на 1000 чел.
        int deathRate = 8;//показатель смертности на 1000 чел.
        int increaseRate = birthRate - deathRate;//прирост населения на 1000 чел.
        for (int year =1; year <= 10; year ++) {
            population = population + (population/1000*increaseRate);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //
        //задача 4
        System.out.println("\nЗадача 4");
        sum = 15000;//переменная была инициализирована в задаче 1, задатся новое значение
        increaseOnePercent = 1.07;//коэффициент роста на 7%
        month = 0;//переменная была инициализирована в задача 1
        while (sum < 12000000) {
            sum = sum * increaseOnePercent;
            month ++;
            System.out.printf(Locale.US, "Месяц " + month + ", сумма накоплений равна %.2f рублей\n", sum);
        }
        //
        //задача 5
        System.out.println("\nЗадача 5");
        sum = 15000;//переменная была инициализирована в задаче 1, задатся новое значение
        month = 0;//переменная была инициализирована в задача 1
        while (sum < 12000000) {
            sum = sum * increaseOnePercent;
            month ++;
            if (month % 6 == 0) {
                System.out.printf(Locale.US, "Месяц " + month + ", сумма накоплений равна %.2f рублей\n", sum);
            }
        }
        //
        //задача 6
        System.out.println("\nЗадача 6");
        sum = 15000;//переменная была инициализирована в задаче 1, задатся новое значение
        for (month = 1; month <= 108; month ++) {
            sum = sum * increaseOnePercent;//в 9 годах 108 месяцев
            //System.out.printf(Locale.US, "Месяц " + month + ", сумма накоплений равна %.2f рублей\n", sum);
            if (month % 6 == 0) {
                System.out.printf(Locale.US, "Месяц " + month + ", сумма накоплений равна %.2f рублей\n", sum);
            }
        }
        //
        //задача 7
        System.out.println("\nЗадача 7");
        int firstFriday = 3;//первая пятница - 3-е число
        for (int day = 1; day <= 31; day ++) {
            if ((day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
        //
        //задача 8
        System.out.println("\nЗадача 8");
        int startYear = 1823;//год начала расчётного периода
        int endYear = 2123;//год завершения расчётного периода
        int year = startYear;
        while (year <= endYear){
            if (year % 79 == 0) {
                System.out.println(year);
            }
            year ++;
        }
    }
}