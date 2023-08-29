//package generics;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Objects;
//
//public class Generics {
////    static FruitBox<T> temp = new FruitBox<T>();
//    static FruitBox<?> temp2;
//
//    static FruitBox moveFruitBox(FruitBox<? extends Fruit> box){
//        return new FruitBox();
//    }
//
//    static <T> void sort(List<T> list, Comparator<? super T> c){
//    }
//
//    static void printAll(ArrayList<? extends Box> list1, ArrayList<? extends Box> list2){
//    }
//    static <T extends Box> void printAll2(ArrayList<T> list1, ArrayList<T> list2){
//    }
//
////    static T item;
////    static int compare(T t1, T t2){}
//    public static void main(String[] args) {
////        Box<Apple> appleBox = new Box<Apple>();
//////        Box<Apple> appleBox2 = new Box<Fruit>();
////        Box<Fruit> fruitBox = new Box<Fruit>();
////////        Box<Fruit> fruitBox2 = new Box<Apple>();
//////        Box<Apple> appleBox = new FruitBox<Apple>();
//////        FruitBox<Grape> grapeFruitBox = (FruitBox<Grape>) new Box<Grape>();
////        fruitBox.add(new Fruit());
////        fruitBox.add(new Apple());
//        FruitBoxTemp<Fruit> fruitFruitBoxTemp  = new FruitBoxTemp<>();
//        FruitBoxTemp<Sample> sampleFruitBoxTemp = new FruitBoxTemp<>();
//        FruitBox<Fruit> fruitBox = new FruitBox<>();
////        FruitBox<Sample> sampleFruitBox = new FruitBox<Sample>(); // 안됨
////        temp2 = new FruitBox<Sample>();
//        temp2 = new FruitBox<Apple>();
//    }
//}
//
////class Box<T> {
//////    static T item2;
//////    static int compare(T t1, T t2) {}
////    T[] item3; // Ok
//////    T[] ab(){
//////        T[] tmp = new T[3]; // 안됨
//////        return tmp;
//////    }
////    T item;
////    void setItem(T item) {this.item = item;}
////    T getItem() {return item;}
////}
//
//class Fruit{ }
//class Apple extends Fruit{ }
//class Grape extends Fruit{ }
//class Box<T>{
//    ArrayList<T> list = new ArrayList<>();
//
//    void add(T item){list.add(item);}
//    T get(int i){return list.get(i);}
//    ArrayList<T> getList(){return list;}
//    int size() {return list.size();}
//    public String toString() {return list.toString();}
//}
//class Sample{
//    void temp(){
//        Generics.printAll2(new ArrayList<>(), new ArrayList<>());
//    }
//}
//interface Sample2{}
//class FruitBoxTemp<T> extends Box<T>{}
//class FruitBoxTemp2<T extends Sample2> extends Box<T>{}
//class FruitBoxTemp3<T extends Fruit & Sample2> extends Box<T>{}
//class FruitBox<T extends Fruit> extends Box<T>{}