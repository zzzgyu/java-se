package com.allweing.day05;

/**
 * @auther: zzzgyu
 */

public class Test1 {
    public static void main(String[] args) {

//        User user = new User();
//        new Thread(user,"thread-----1").start();
//        new Thread(user,"thread-----2").start();
//        new Thread(user,"thread-----3").start();
//        new Thread(new  Runnable() {
//            @Override
//            public void run() {
//                System.out.println("ll");
//            }
//        },"thread---------4").start();
//        new Thread(()->{
//            System.out.println("pp");
//        },"thread-------------5").start();
//
//        Person person = new Person();
//        person.start();

        Thread thread = new Thread(()->{
            System.out.println("yy");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("hhhhh");
        },"thread--------------10");
        thread.setPriority(10);
        //thread.setDaemon(true);
        thread.start();


    }
}

class User implements Runnable{

    public void say() {
        System.out.println("User-------------");
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        say();

    }
}

class Person extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("oooooooooooooooooo");
    }
}
