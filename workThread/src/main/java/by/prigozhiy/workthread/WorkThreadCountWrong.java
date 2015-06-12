/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.prigozhiy.workthread;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergey_Prig
 */
public class WorkThreadCountWrong extends Thread implements IObjectCount{

    private static /*volatile*/ int count; // /*volatile*/ - использоавть память без кэширования - возрастате время выполнения
    
    @Override
    public /*synchronized*/ void counting() // /*synchronized*/ - ждать покуда освободиться от работы другого потока  - время выполнения
    {
        //synchronized(new Object()) - сихранизация только переменной,а не метода.
        //{
        count++;
        //}
    }
    
    public int getCount()
    {
        return count;
    }
    
    @Override
    public void run() {
        //while(true)  // поток работает, как сервис 
        for(int i = 1; i<=1_000_000; i++)
        {
            counting();
        }
    }
    
}
