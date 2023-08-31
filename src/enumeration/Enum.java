package enumeration;

import java.util.ArrayList;
import java.util.List;

enum Direction {
    EAST(1) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    }, SOUTH(10) {
        int fare(int distance) {
            return distance * BASIC_FARE * 2;
        }
    }, WEST(3) {
        int fare(int distance) {
            return distance * BASIC_FARE * 3;
        }
    }, NORTH(7) {
        int fare(int distance) {
            return distance * BASIC_FARE * 4;
        }
    };

    abstract int fare(int distance);

    protected final int BASIC_FARE;
    private final int value;

    public int getValue() {
        return value;
    }

    Direction(int value) {
        this.value = value;
        BASIC_FARE = 3;
    }
}

//class Unit {
//    int x, y;
//    Direction dir;
//
//    void init() {
//        dir = Direction.EAST;
//    }
//
//    void func() {
//        if (dir == Direction.EAST) {
//            x++;
//        } else if (dir.compareTo(Direction.SOUTH) > 0) {
//            y++;
//        }
//    }
//
//    void useValues() {
//        Direction[] dArr = Direction.values();
//
//        for (Direction d : dArr) {
//            System.out.printf("%s = %d%n", d.name(), d.ordinal());
//        }
//        //EAST = 0
//        //SOUTH = 1
//        //WEST = 2
//        //NORTH = 3
//    }
//}

class Parent{
    static void ParentMethod(){
        System.out.println("11");
    }
}
class Child extends Parent{
    void ParenttMethod() {}
    static void ParentMethod(){
        System.out.println("22");
    }
}

public class Enum {
    @SuppressWarnings("unchecked")
    ArrayList list = new ArrayList();

    @SuppressWarnings("varargs")
    public void function(List list){
        list.addAll(list);
    }
    public static void main(String[] args) {
        Child temp = new Child();
        Child.ParentMethod();
        Parent.ParentMethod();
//        Unit temp = new Unit();
//        temp.useValues();
    }
}