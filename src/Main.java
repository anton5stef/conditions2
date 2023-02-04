public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию Андроид по ссылке ...");
        } else if (clientOS == 0) {
            System.out.println("Установите версию иОС по ссылке ...");
        } else {
            System.out.println("К сожалению мы не поддерживаем данные версии");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 2;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ...");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите современную версию Андроид по ссылке ... ");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ...");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите современную версию iOS по ссылке ...");
        } else {
            System.out.println("Мы не поддерживаем, то что у вас");

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        boolean verification = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (verification) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год невисокосный");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 120;
        if (deliveryDistance <= 100) {
            int daysToTake = 1;
            if (deliveryDistance > 20) {
                daysToTake++;
            }
            if (deliveryDistance > 60) {
                daysToTake++;
            }
            System.out.println("Потребуется дней: " + daysToTake);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь относится к зиме");
                break;
            case 2:
                System.out.println("Февраль относится к зиме");
                break;
            case 3:
                System.out.println("Март к зиме");
                break;
            case 4:
                System.out.println("Апрель к весне");
                break;
            case 5:
                System.out.println("Май к весне");
                break;
            case 6:
                System.out.println("Июнь к лету");
                break;
            case 7:
                System.out.println("Июль к лету");
                break;
            case 8:
                System.out.println("Август к лету");
                break;
            case 9:
                System.out.println("Сентябрь к осени");
                break;
            case 10:
                System.out.println("Октябрь к зиме");
                break;
            case 11:
                System.out.println("Ноябрь к зиме");
                break;
            case 12:
                System.out.println("Декабрь к зиме");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}

