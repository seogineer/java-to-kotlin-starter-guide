package lec04;

public class Lec04Main {
    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = new JavaMoney(2_000L);
        System.out.println(money1.plus(money2));

        JavaMoney money3 = new JavaMoney(1_000L);
        JavaMoney money4 = money3;
        JavaMoney money5 = new JavaMoney(1_000L);

        System.out.println(money3 == money4);   // true
        System.out.println(money3 == money5);   // false
        System.out.println(money3.equals(money5));   // true

        JavaMoney money6 = new JavaMoney(1_000L);
        JavaMoney money7 = new JavaMoney(2_000L);
        System.out.println(money6.plus(money7));
    }
}
