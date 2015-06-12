/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.prigozhiy.workthread;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergey_Prig
 */
public class RunThreads {
    
    public static void main(String[] args) throws InterruptedException {
        
        Long time;
        
        //нужно использовать в потоке - потока защищенные collection , например ConcurrentHashMap 
        List list = new ArrayList();   
        list.add("1");
        list.add("2");
        
        Thread thread1 = new Thread(new WorkThreadAddWrong(list));
        Thread thread2 = new Thread(new WorkThreadSelectWrong(list));
        
        thread1.start();
        thread2.start();
        
        time = System.currentTimeMillis();
        
        WorkThreadCountWrong thread3 = new WorkThreadCountWrong();
        WorkThreadCountWrong thread4 = new WorkThreadCountWrong();
        
        thread3.start();
        thread4.start();
        
        thread3.join();
        thread4.join();
        //2 потока закончили работу
        
        System.out.println("WorkThreadCountWrong ["+ (System.currentTimeMillis()- time) +" ms] :=" + thread3.getCount());
        
        time = System.currentTimeMillis();
        
        // final - запрет на изменения ссылки, в примитивных типах(int,...) запрет на изменения значения переменной
        final IObjectCount count = new ObjectCount(); 
        
        WorkThreadCountRight thread5 = new WorkThreadCountRight(count);
        WorkThreadCountRight thread6 = new WorkThreadCountRight(count);
        
        thread5.start();
        thread6.start();
        
        thread6.join(); 
        thread5.join();
        //2 потока закончили работу
       
        System.out.println("WorkThreadCountRight ["+ (System.currentTimeMillis()- time) +" ms] :=" + count.getCount());
        
        //wait,notify - выполнить потоки по очереди
        by.prigozhiy.workthread.SeriesRunExample.example();
        
    }
    
}
