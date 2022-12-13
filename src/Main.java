public class Main {
    public static void main(String[] args) {
//видеоурок
        System.out.println("видеоурок");

        for (int i = 0; i < 10; i++) {
            System.out.println("Иттерация цикла " + i);
        }
        System.out.println();

        for (int year = 2020; year < 2070; year += 4) {
            System.out.println("Високосный год " + year);
        }
        System.out.println();

        int salary = 65_535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
        }
        System.out.println(total);

        System.out.println();
        int totalPlusPercentage = 0;
        for (int i = 0; i < 12; i++) {
            totalPlusPercentage = totalPlusPercentage + totalPlusPercentage / 100;
            totalPlusPercentage = totalPlusPercentage + salary;
            System.out.println("Месяц " + i + " итого " + totalPlusPercentage);
        }

        System.out.println();
//Задача 1.1
        System.out.println("Задача 1.1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//Задача 1.2
        System.out.println("Задача 1.2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

//Задача 1.3
        System.out.println("Задача 1.3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

//Задача 1.4
        System.out.println("Задача 1.4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

//Задача 2.1
        System.out.println("Задача 2.1");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным.");
            }
        }

//Задача 2.2
        System.out.println("Задача 2.2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

//Задача 2.3
        System.out.println("Задача 2.3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();

//Задача 2.3: исправление после видеоразбора
        System.out.println("Задача 2.3: исправление после видеоразбора");
        int namber = 1;
        System.out.print(namber + " ");
        for (int i = 0; i < 9; i++) {
            namber = namber * 2;
            System.out.print(namber + " ");
        }
        System.out.println();

//Задача 3.1
        System.out.println("Задача 3.1");
        int saving = 29_000;
        int totalSav = 0;
        for (int i = 1; i <= 12; i++) {
            totalSav = totalSav + saving;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSav + " рублей.");
        }

//Задача 3.2
        System.out.println("Задача 3.2");
        int deposit = 29_000;
        int totalDep = 0;
        for (int i = 0; i <= 12; i++) {
            totalDep = totalDep + totalDep / 100;
            totalDep = totalDep + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalDep + " рублей.");
        }


    }
}