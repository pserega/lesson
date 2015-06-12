/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.prigozhiy.workthread;

/**
 *
 * @author Sergey_Prig
 */
public class WorkThreadCountRight extends Thread {
    
    private IObjectCount count;

    public WorkThreadCountRight(IObjectCount count) {
        this.count = count;
    }
    
    @Override
    public void run() {
        for(int i = 1; i<=1_000_000; i++)
        {
            count.counting();
        }
    }
    
}
