/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.prigozhiy.workthread;

import java.util.List;

/**
 *
 * @author Sergey_Prig
 */
public class WorkThreadAddWrong implements Runnable{

    private List arrayList;
    
    public WorkThreadAddWrong(List arrayList) {
    this.arrayList = arrayList;
    }
    
    @Override
    public void run() {
        for(int i = 3; i<=7; i++)
        {
        arrayList.add(i);
        }
    }
    
}
