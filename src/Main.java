
public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS == 0 && clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if(clientOS == 1 && clientDeviceYear > 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if(clientOS == 1 && clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        int year = 2025;
        if (year > 1584 && (year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0 )))){
            System.out.println(year + " год является високосным.");
        }else {
            System.out.println(year + " год не является високосныим.");
        }

    }
}