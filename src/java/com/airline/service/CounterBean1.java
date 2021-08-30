/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.service;

import javax.ejb.Singleton;

/**
 *
 * @author Muhamed S. NasR
 */
@Singleton
public class CounterBean1 {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int addOneToCounter() {

        count += 1;


        return count;


    }
}
