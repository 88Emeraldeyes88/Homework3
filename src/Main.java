// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            // Задача 1
            int a = -1000888000;
            System.out.println("Значение переменной " + a + " с типом int ");
            byte b = 88;
            System.out.println("Значение переменной " + b + " с типом byte ");
            short c = 8383;
            System.out.println("Значение переменной " + c + " с типом short ");
            long d = 8777333888687123456L;
            System.out.println("Значение пременной " + d + " с типом long ");
            float e = 8.77f;
            System.out.println("Значение переменной " + e + " с типом float ");
            double f = 88.35678;
            System.out.println("Значение переменной " + f + " с типом double ");
            // Задача 2
            float g = 27.12f;
            System.out.println(g);
            long j = 987678965549L;
            System.out.println(j);
            double k = 2.786;
            System.out.println(k);
            short l = 569;
            System.out.println(l);
            short m = -159;
            System.out.println(m);
            short n = 27897;
            System.out.println(n);
            byte h = 67;
            System.out.println(h);
            // Задача 3
            byte ludaClass = 23;
            byte annaClass = 27;
            byte kateClass = 30;
            short paper = 480;
            int totalKids = ludaClass + annaClass + kateClass;
            int sheet1Kid = paper/totalKids;
            System.out.println("На каждого ученика расчитано " + sheet1Kid + " листов бумаги ");
            // Задача 4
            byte bottles1Minute = 8;
            int bottles20Minutes = bottles1Minute * 20;
            System.out.println("За 20 минут машина произвела " + bottles20Minutes + " штук бутылок ");
            int bottlesDay = bottles1Minute * 1440;
            System.out.println("За сутки машина произвела " + bottlesDay + " штук бутылок ");
            int bottles3Day = bottlesDay * 3;
            System.out.println("За 3 дня машина произвела " + bottles3Day + " штук бутылок ");
            int bottlesMonth = bottles3Day * 10;
            System.out.println("За месяц, в котором 30 дней, машина произвела " + bottlesMonth + " штук бутылок ");
            // Задача 5
            byte paints = 120;
            byte whitePaintsClass = 2;
            byte brounPaintsClass =4;
            int allClass = paints / (whitePaintsClass + brounPaintsClass);
            int whiteJars = allClass * whitePaintsClass;
            int brownJars = allClass * brounPaintsClass;
            System.out.println("В школе, где " + allClass + " классов, нужно " + whiteJars + " банок белой краски и " + brownJars + " банок коричневой краски ");
            // Задача 6
            short bananaGr = 5 * 80;
            System.out.println(bananaGr);
            short milkGr = 2 * 105;
            System.out.println(milkGr);
            short iceCreamGr = 2 * 100;
            System.out.println(iceCreamGr);
            short eggsGr = 4 * 70;
            System.out.println(eggsGr);
            int breakfastGr = bananaGr + milkGr + iceCreamGr +eggsGr;
            System.out.println("Общее количество продуктов в завтраке составляет " + breakfastGr + " грамм ");
            float breakfastKg = breakfastGr / 1000f;
            System.out.println("Общее количество продуктов в завтраке составляет " + breakfastKg + " килограмм ");
            // Задача 7
            int totalWeightGr = 7 * 1000;
            System.out.println(totalWeightGr);
            int day250Gr = totalWeightGr / 250;
            System.out.println("Для похудения на " + totalWeightGr + " грамм, сбрасывая 250 гр в день, спортсмену понадобится " + day250Gr + " дней ");
            int day500Gr = totalWeightGr / 500;
            System.out.println("Для похудения на " + totalWeightGr + " грамм, сбрасывая 500 гр в день, спортсмену понадобится " + day500Gr + " дней ");
            int averageDays = (day250Gr + day500Gr) / 2;
            System.out.println("Для похудения на 7000 гр, в среднем, спортсмену понадобится " + averageDays + " день ");
            // Задача 8
            float masha = 67760;
            float denis = 83690;
            float kris = 76230;
            float mashaUp = (masha / 100) * 10;
            System.out.println(mashaUp);
            float denisUp = (denis / 100) * 10;
            float krisUp = (kris / 100) * 10;
            float mashaNew = masha + mashaUp;
            float denisNew = denis + denisUp;
            float krisNew = kris + krisUp;
            float mashaYearUp = mashaUp * 12;
            float denisYearUp = denisUp * 12;
            float krisYearUp = krisUp * 12;
            System.out.println("Маша теперь получает " + mashaNew + " рублей в месяц. годовой доход вырос на " + mashaYearUp + " рублей");
            System.out.println("Денис теперь получает " + denisNew + " рублей в месяц. Годовой доход вырос на " + denisYearUp + " рублей ");
            System.out.println("Кристина теперь получает " + krisNew + " рублей в месяц. Годовой доход вырос на " + krisYearUp + " рублей ");



        }
    }
}