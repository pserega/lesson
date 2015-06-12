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
public class WorkThreadSelectWrong implements Runnable{

    private List arrayList;
    
    public WorkThreadSelectWrong(List arrayList) {
    this.arrayList = arrayList;
    } 
    
    @Override
    public void run() {
        for(Object string : arrayList)
        {
            System.out.println(string);
        }
    }
    
}
