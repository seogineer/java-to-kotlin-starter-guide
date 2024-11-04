package lec12;

public class Lec12Main {

    public static void main(String[] args) {
        // companion object example
        Person.Factory.newBaby("ABC");
//        Person.Companion.newBaby("ABC");    // 이름이 없는 경우, 생략된 Companion을 붙여서 호출
        Person.newBaby("ABC");  // @JvmStatic을 붙인 경우

        // Anonymous function
        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("무브 무브");
            }

            @Override
            public void fly() {
                System.out.println("날다 날다");
            }
        });
    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }

}
