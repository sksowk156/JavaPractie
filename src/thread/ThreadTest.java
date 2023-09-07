package thread;

//class Thread1 extends Thread {
//    @Override
//    public void run() {
//        System.out.println(getName()); // 부모 클래스(Thread)의 메서드를 사용할 수 있다.
//    }
//}
//
//class Thread2 implements Runnable {
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()); // Thread의 static 메서드인 currentThread()로부터 현재 실행 중인 쓰레드를 참조해 getName()메서드를 호출한다.
//    }
//}

//class Thread3 implements Runnable {
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {}
//
//        for (int i = 0; i < 300; i++) {
//            System.out.print("a");
//        }
//        System.out.println();
//        System.out.println("Thread3 종료");
//    }
//}
//
//class Thread4 implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 300; i++) {
//            System.out.print("b");
//        }
//        System.out.println();
//        System.out.println("Thread4 종료");
//    }
//}


import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//class Thread1 extends Thread{
//    @Override
//    public void run() {
//        int i = 10;
//        while(i!=0 && !isInterrupted()){
//            System.out.println(i--);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                interrupt();
//            }
//        }
//        System.out.println("카운트가 종료됨");
//    }
//}
//class ThreadRunnable implements Runnable {
//    Thread th; // 내부에서 사용할 Thread 객체를 하나 생성
//
//    @Override
//    public void run() {
//        String name = th.getName();
//        while (!stopped) {
//            if (!suspended) {
//                try {
//                    System.out.println(name+" 작업중");
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println(name + " interrupt()로 인해 예외상황 발생");
//                }
//            } else {
//                Thread.yield();
//            }
//        }
//        System.out.println(name + "쓰레드 종료");
//    }
//
//    boolean suspended = false; // suspend()와 stop()을 대체하기 위해
//    boolean stopped = false;
//
//    ThreadRunnable(String name) { // 생성자를 통해서 내부에서 쓰레드를 생성해 쓰자
//        th = new Thread(this, name); // Thread(Runnable r, String name)
//    }
//
//    public void suspend() {
//        suspended = true;
//        th.interrupt();
//        System.out.println(th.getName() + " suspend가 interrupt()호출 -> while문 동작O, if문 동작X, else문 동작");
//    }
//
//    public void stop() {
//        stopped = true;
//        th.interrupt();
//        System.out.println(th.getName() + " stop이 interrupt()호출 -> while문 동작X");
//    }
//
//    public void resume() {
//        suspended = true;
//    }
//
//    public void start() {
//        th.start();
//    }
//
//    public void join(){
//        try {
//            th.join();
//        } catch (InterruptedException e) {}
//    }
//}
//class Account {
//    private int balance = 1000;
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public synchronized void withdraw(int money) {
//        if (balance >= money) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//            balance -= money;
//        }
//    }
////    public void withdraw(int money) {
////        synchronized (this) {
////            if (balance >= money) {
////                try {
////                    Thread.sleep(1000);
////                } catch (InterruptedException e) {
////                }
////                balance -= money;
////            }
////        }
////    }
//}
//
//class ThreadSample implements Runnable {
//    Account acc = new Account();
//
//    @Override
//    public void run() {
//        while (acc.getBalance() > 0) {
//            int money = (int) (Math.random() * 3 + 1) * 100;
//            acc.withdraw(money);
//            System.out.println("balance : " + acc.getBalance());
//        }
//    }
//}
//class Customer implements Runnable {
//    private Table table;
//    private String food;
//
//    Customer(Table table, String food) {
//        this.table = table;
//        this.food = food;
//    }
//
////    boolean eatFood() {
////        return table.remove(food);
////    }
//
//    @Override
//    public void run() {
//        while (true) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//            }
//
//            String name = Thread.currentThread().getName();
//            table.remove(food);
//            System.out.println(name + " ate a " + food);
//
////            if (eatFood()) {
////                System.out.println(name + " ate a " + food);
////            } else {
////                System.out.println(name + " failed to eat :");
////            }
//        }
//    }
//}
//
//class Cook implements Runnable {
//    private Table table;
//
//    Cook(Table table) {
//        this.table = table;
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//            int idx = (int) (Math.random() * table.dishNum());
//            table.add(table.dishNames[idx]);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//            }
//        }
//    }
//}
//
//class Table {
//    // Cook객체가 요리를 만들 때 이 배열에서 랜덤으로 뽑아 요리한다. -> donut 확률을 높이기 위해 donut이 2개
//    String[] dishNames = {"donut", "donut", "burger"};
//    final int MAX_FOOD = 6;
//    private ArrayList<String> dishes = new ArrayList<>();
//
//    public int dishNum() {
//        return dishNames.length;
//    }
//
//    public synchronized void add(String dish) {
////        if (dishes.size() >= MAX_FOOD) {
////            return;
////        }
//        while(dishes.size() >= MAX_FOOD){
//            String name = Thread.currentThread().getName();
//            System.out.println(name + " 테이블이 꽉차서 요리사가 기다리는중");
//            try {
//                wait(); // 요리사 쓰레드를 기다리게 한다.
//                Thread.sleep(1000); // 1초간 기다림
//            } catch (InterruptedException e) {}
//        }
//        dishes.add(dish); // 음식 완성
//        notify(); // 기다리고 있던 손님 쓰레드를 깨운다.
//        System.out.println("Dishes : " + dishes.toString());
//    }
//
//    public void remove(String dishName) {
//        synchronized (this) {
//            String name = Thread.currentThread().getName();
//            System.out.println(name + " 먹을려고 앉았다");
//            while (dishes.size() == 0) {
//                System.out.println(name + " 음식이 없어서 기다리는중");
//                try {
//                    wait(); // 손님 쓰레드를 기다리게 한다.
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {}
//            }
//            while(true){
//                for (int i = 0; i < dishes.size(); i++) {
//                    if (dishName.equals(dishes.get(i))) {
//                        System.out.println(name + " 식사 끝");
//                        dishes.remove(i);
//                        notify(); // 기다리고 있던 요리사 쓰레드를 깨운다.
//                    }
//                }
//                try {
//                    System.out.println(name + " 원하는 음식이 없어서 기다리는중");
//                    wait();
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {}
//            }
//
////            if(dishes.size() > 0){
////                for (int i = 0; i < dishes.size(); i++) {
////                    if (dishName.equals(dishes.get(i))) {
////                        System.out.println(name + " 식사 끝");
////                        dishes.remove(i);
////                        return true;
////                    }
////                }
////                System.out.println(name + " 원하는게 없어 못먹음");
////            }
//        }
//    }
//}

class Customer implements Runnable {
    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            String name = Thread.currentThread().getName();
            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook implements Runnable {
    private Table table;

    Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Table {
    // Cook객체가 요리를 만들 때 이 배열에서 랜덤으로 뽑아 요리한다. -> donut 확률을 높이기 위해 donut이 2개
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    private ReentrantLock lock = new ReentrantLock(); // 공유 대상이 되는 클래스 내부에 생성
    private Condition forCook = lock.newCondition();
    private Condition forCust = lock.newCondition();

    public int dishNum() {
        return dishNames.length;
    }

    public void add(String dish) {
        lock.lock();
        try {
            while (dishes.size() >= MAX_FOOD) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " 기다리는 중");
                try {
                    forCook.await(); // wait(), Cook쓰레드를 기다리게 한다.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
            dishes.add(dish);
            forCust.signal(); // notify(), 기다리고 있는 Cust쓰레드를 깨운다.
            System.out.println("Dishes : " + dishes.toString());
        } finally {
            lock.unlock();
        }
    }

    public void remove(String dishName) {
        lock.lock();
        String name = Thread.currentThread().getName();
        System.out.println(name + " 먹을려고 앉았다");
        try {
            while (dishes.size() == 0) {
                System.out.println(name + " 음식이 없어서 기다리는중");
                try {
                    forCust.await(); // wait(), Cust쓰레드를 기다리게 한다.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        System.out.println(name + " 식사 끝");
                        dishes.remove(i);
                        forCook.signal(); // notify(), 기다리고 있던 요리사 쓰레드를 깨운다.
                    }
                }
                try {
                    System.out.println(name + " 원하는 음식이 없어서 기다리는중");
                    forCust.await(); // wait(), Cust쓰레드를 기다리게 한다.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        } finally {
            lock.unlock();
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        Table table = new Table(); // 여러 쓰레드가 공유하는 객체
        new Thread(new Cook(table), "Cook1").start();
        new Thread(new Customer(table, "donut"), "Cust1").start();
        new Thread(new Customer(table, "burger"), "Cust2").start();
//        Runnable r = new ThreadSample();
//        new Thread(r).start();
//        new Thread(r).start();

//        Thread temp = new Thread();
//        try {
//            temp.join();
//        } catch (InterruptedException e) {}

//        ThreadRunnable temp1 = new ThreadRunnable("1");
//        ThreadRunnable temp2 = new ThreadRunnable("2");
//        ThreadRunnable temp3 = new ThreadRunnable("3");
//        temp1.start();
//        temp2.start();
//        temp3.start();
//
//        try {
//            System.out.println("main 작업중");
//            Thread.sleep(2000);
//            temp1.suspend();
//            System.out.println("main 작업중");
//            Thread.sleep(2000);
//            temp2.suspend();
//            System.out.println("main 작업중");
//            Thread.sleep(3000);
//            temp1.resume();
//            System.out.println("main 작업중");
//            Thread.sleep(3000);
//            temp1.stop();
//            temp2.stop();
//            System.out.println("main 작업중");
//            Thread.sleep(2000);
//            temp3.stop();
//        } catch (InterruptedException e) {
//        }

//        Thread1 temp = new Thread1();
//        temp.start();
//        String input = JOptionPane.showInputDialog("아무 값이나 입력하시요");
//        System.out.println(input);
//        temp.interrupt();
//
//        System.out.println(temp.isInterrupted());

//        Thread temp1 = new Thread(new Thread3());
//        Thread temp2 = new Thread(new Thread4());
//
//        temp1.start();
//        temp2.start();
//
////        try {
////            temp1.sleep(2000);
////        } catch (InterruptedException e) {}
//
//        System.out.println("메인 종료");
//        Thread temp = new Thread(new ThreadTest());
//        temp.setDaemon(true); // 데몬 쓰레드로 설정
//        temp.start();
//
//        for (int i = 1; i <= 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//
//            System.out.println(i);
//            if (i == 5) isAutoSave = true;
//        }
    }
//    static Boolean isAutoSave = false;
//
//    @Override
//    public void run() {
//        while (true) { // 무한 루프
//            try {
//                Thread.sleep(3000); // 3초마다
//            } catch (InterruptedException e) {
//            }
//            if (isAutoSave) {
//                autoSave();
//            }
//        }
//    }
//
//    void autoSave() {
//        System.out.println("자동 저장");
//    }

//        ThreadGroup main = Thread.currentThread().getThreadGroup();
//        ThreadGroup grp1 = new ThreadGroup("Group1");
//        ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");
//        ThreadGroup grp2 = new ThreadGroup("Group2");
//
//        grp1.setMaxPriority(3);
//
//        Runnable tempRunnable = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000); // 1초가 멈춤
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        new Thread(grp1, tempRunnable, "thread 1").start();
//        new Thread(subGrp1, tempRunnable, "thread 2").start();
//        new Thread(grp2, tempRunnable, "thread 3").start();
//
//        System.out.println(main.getName()+" "+ main.activeGroupCount() + " " + main.activeCount()); // main 3 5
//
//        main.list();
//        java.lang.ThreadGroup[name=main,maxpri=10]
//          Thread[main,5,main]
//          Thread[Monitor Ctrl-Break,5,main]
//          java.lang.ThreadGroup[name=Group1,maxpri=3]
//              Thread[thread 1,3,Group1]
//              java.lang.ThreadGroup[name=SubGroup1,maxpri=3]
//                  Thread[thread 2,3,SubGroup1]
//          java.lang.ThreadGroup[name=Group2,maxpri=10]
//              Thread[thread 3,5,Group2]

//        Thread1 sample1 = new Thread1();
//        Thread sample2 = new Thread(new Thread2());
//
//        sample1.setPriority(7);
//        sample2.setPriority(Thread.NORM_PRIORITY); // 5
//
//        System.out.println(sample1.getPriority()); // 7
//        System.out.println(sample2.getPriority()); // 5
//
//        sample1.start(); // Thread-0
//        sample2.start(); // Thread-1
//    }
}
