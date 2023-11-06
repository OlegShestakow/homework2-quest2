public class Main {
    public static void main(String[] args) {
        int balance = 100; //Rub
        int refill = 1300; //Rub
        int percent;
        if (refill > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = refill * percent / 100 + balance + refill;
        System.out.println("Баланс счета: " + bonus);
    }

}

