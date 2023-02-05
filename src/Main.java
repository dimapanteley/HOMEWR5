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
        int clientOSi = 1;
        if (clientOSi == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Андроид  по ссылке");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int clientOSi = 1;
        int clientDeviceYear = 2015;
        if (clientOSi == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную  версию приложения для iOS по ссылке");
        } else if (clientOSi == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS  по ссылке");
        } else if (clientOSi == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите  облегченную версию приложения для Андроид  по ссылке");
        } else {
            System.out.println("Установите версию приложения для Андроид  по ссылке");
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");

        }
    }


    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней для доставки " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней для доставки " + (deliveryDay + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней для доставки " + (deliveryDay + 2));
        } else {
            System.out.println("Доставки нет");
        }

    }


    public static void task5() {
        System.out.println("Задача 5");
        int month = 1;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень!");
                break;
            default:
                System.out.println("Укажите правильный месяц!");


        }

    }

}





