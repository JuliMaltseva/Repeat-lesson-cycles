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

//Урок: циклы
        System.out.println("Урок: циклы");
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
//Урок: циклы 2
        System.out.println("Урок: циклы 2");

//Задача 1.1
        System.out.println("Задача 1.1");
        int depositOther = 15_000;
        int totalSum = 0;
        int i = 0;
        while (totalSum <= 2_459_000) {
            totalSum = totalSum + totalSum / 100;
            totalSum = totalSum + depositOther;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSum + " рублей");
        }
        System.out.println("Для того чтобы накопить сумму - 2 459 000 рублей, на понадобиться " + i + " месяцев");

//Задача 1.2
        System.out.println("Задача 1.2");
        int n = 0;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        }
        System.out.println("");

        for (int m = 10; m >= 1; m--) {
            System.out.print(m + " ");
        }
        System.out.println();

//Задача 1.3
        System.out.println("Задача 1.3");
        int initialPopulation = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        int perThousandPeople = 1000;
        for (int y = 1; y <= 10; y++) {
            initialPopulation = initialPopulation + (initialPopulation / perThousandPeople * birthrate) - (initialPopulation / perThousandPeople * mortality);
            System.out.println("Год " + y + " численность населения составляет " + initialPopulation);
        }

//Задача 2.1
        System.out.println("Задача 2.1");
        int depositVasya = 15_000;
        int totalVasya = 0;
        int iVasya = 0;
        int depositInterestVasya = 7;
        while (totalVasya <= 12_000_000) {
            totalVasya = totalVasya + (totalVasya / 100 * depositInterestVasya);
            totalVasya = totalVasya + depositVasya;
            iVasya++;
            System.out.println("Месяц " + iVasya + " сумма накоплений равна " + totalVasya + " рублей");
        }
        System.out.println("Для того чтобы накопить сумму - 12 000 000 рублей, понадобится " + iVasya + " месяцев");

//Задача 2.2
        System.out.println("Задача 2.2");
        totalVasya = 0;
        iVasya = 0;
        while (totalVasya <= 12_000_000) {
            totalVasya = totalVasya + (totalVasya / 100 * depositInterestVasya);
            totalVasya = totalVasya + depositVasya;
            iVasya++;
            if (iVasya % 6 == 0) {
                System.out.println("Месяц " + iVasya + " сумма накоплений равна " + totalVasya + " рублей");
            }
        }
        System.out.println("Для того чтобы накопить сумму - 12 000 000 рублей, понадобится " + iVasya + " месяцев");

//Задача 2.3
        System.out.println("Задача 2.3");
        totalVasya = 0;
        for (iVasya = 1; iVasya <= 9 * 12; iVasya++) {
            totalVasya = totalVasya + (totalVasya / 100 * depositInterestVasya);
            totalVasya = totalVasya + depositVasya;
            if (iVasya % 6 == 0) {
                System.out.println("Месяц " + iVasya + " сумма накоплений равна " + totalVasya + " рублей");
            }
        }
        System.out.println("За 9 лет Вася накопит " + totalVasya + " рублей");

//Задача 2.4
        System.out.println("Задача 2.4");
        for (int friday = 2; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
        }

//Задача 3.1
        System.out.println("Задача 3.1");
        int cometYear = 0;
        int thisYear = 2022;
        int yearsAgo = thisYear - 200;
        int yearsAhead = thisYear + 100;
        int cometPeriodicity = 79;
        for (cometYear = 0; cometYear <= yearsAhead; cometYear = cometYear + cometPeriodicity) {
            if (cometYear >= yearsAgo && cometYear <= yearsAhead) {
                System.out.println(cometYear);
            }
        }

//Задача 3.2
        System.out.println("Задача 3.2"); // таблица умножения на 2
        int x = 0;
        int b = 2;
        for (int a = 1; a <= 10; a++) {
            x = b * a;
            System.out.println(b + " * " + a + " = " + x);
        }
    }
}