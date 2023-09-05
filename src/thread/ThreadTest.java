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
class ThreadRunnable implements Runnable {
    Thread th; // 내부에서 사용할 Thread 객체를 하나 생성

    @Override
    public void run() {
        String name = th.getName();
        while (!stopped) {
            if (!suspended) {
                try {
                    System.out.println(name+" 작업중");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(name + " interrupt()로 인해 예외상황 발생");
                }
            } else {
                Thread.yield();
            }
        }
        System.out.println(name + "쓰레드 종료");
    }

    boolean suspended = false; // suspend()와 stop()을 대체하기 위해
    boolean stopped = false;

    ThreadRunnable(String name) { // 생성자를 통해서 내부에서 쓰레드를 생성해 쓰자
        th = new Thread(this, name); // Thread(Runnable r, String name)
    }

    public void suspend() {
        suspended = true;
        th.interrupt();
        System.out.println(th.getName() + " suspend가 interrupt()호출 -> while문 동작O, if문 동작X, else문 동작");
    }

    public void stop() {
        stopped = true;
        th.interrupt();
        System.out.println(th.getName() + " stop이 interrupt()호출 -> while문 동작X");
    }

    public void resume() {
        suspended = true;
    }

    public void start() {
        th.start();
    }

    public void join(){
        try {
            th.join();
        } catch (InterruptedException e) {}
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread temp = new Thread();
        try {
            temp.join();
        } catch (InterruptedException e) {}

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
