public class Main {
    public static void main(String[] args) {
        int balance = 100; //Rub
        int refill = 1800; //Rub
        int percent;
        if (refill > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int account = balance + refill;
        System.out.println("Баланс счета: " + account);
        int bonus = refill * 1 / 100;
        System.out.println("Начислено бонусных рублей: " + bonus);
    }

}

