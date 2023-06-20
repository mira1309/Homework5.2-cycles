public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
       }

        public static void task1 () {
            int goal = 2459000;
            int monthSum = 15000;
            int monthCount = 1;
            int sum = monthSum;
            while (sum < goal) {
                System.out.println("Месяц " + monthCount + " сумма накоплений равна " + sum + " рублей");
                sum += monthSum;
                monthCount++;
            }
        }

        public static void task2 () {
            int i = 1;
            while (i <= 10) {
                System.out.println((i + " "));
                i++;
            }
            System.out.println();
            for (int j = 10; j > 8; j--) {
                System.out.println(j + " ");
            }
        }

        public static void task3 () {
            int population = 12000000;
            int birth = 17;
            int dead = 8;
            int yearCount = 10;

            int year = 0;

            while (year < yearCount) {
                population += (population / 1000) * (birth - dead);
                year++;
                System.out.println("Год " + year + " исленность населения составляет " + population);
            }
        }

        public static void task4 () {
            int goal = 12000000;
            double sum = 15000.00;
            int monthPercent = 7;

            int monthCount = 0;

            while (sum <= goal) {
                sum += sum * monthPercent / 100;
                monthCount++;
                System.out.println("Месяц " + monthCount + " сумма накоплений равна  " + sum + " рублей");
            }
            System.out.println("Итоговая сумма: " + sum + ". Потребовалось месяцев: " + monthCount);
        }

        public static void task5 () {
            int goal = 12000000;
            double sum = 15000.00;
            int monthPercent = 7;

            int monthCount = 0;
            while (sum <= goal) {
                sum += sum * monthPercent / 100;
                monthCount++;
                if (monthCount % 6 == 0) {
                    System.out.println("Месяц " + monthCount + " сумма накоплений равна " + sum + " рублей");
                }
            }
        }

        public static void task6 () {
            double sum = 15000.00;
            int monthPercent = 7;
            int yearCount = 9;

            int monthCount = 0;

            while (monthCount < yearCount * 12) {
                sum += sum * monthPercent / 100;
                monthCount++;
                if (monthCount % 6 == 0) {
                    System.out.println("Месяц " + monthCount + "cумма накоплений равна " + sum + " рублей");
                }
                System.out.println("Итоговая сумма: %.2f. Потребовалось месяцев: %s%n", sum, monthCount);
            }
        }

        public static void task7 () {
            int fridayCount = 4;
            int dayMonth = 31;

            while (fridayCount <= dayMonth) {
                System.out.println("Сегодня пятница, %s-е число. Необходимо подготовить отчет%n", fridayCount);
                fridayCount += 7;
            }
        }
        public static void task8 () {
            int currentYear = 2023;
            int yearBefore = 200;
            int yearAfter = 100;
            int cometPeriod = 79;

            for (int i = 0; i < currentYear + yearAfter; i += cometPeriod) {
                if (i > currentYear - yearBefore) {
                    System.out.println(i);
                }
            }
        }
    }
}