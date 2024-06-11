public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int add = 500;
        int bonus = 0;

        if (add > 1000) {
            bonus = add/ 100;
        }
        int finalBalance = balance + add + bonus;
        System.out.println("Итоговый счет:" + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
