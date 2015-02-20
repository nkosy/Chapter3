package com.nkosy.hashmap.service.Impl;

import com.nkosy.hashmap.service.CarList;

/**
 * Created by nkosy on 2015/02/20.
 */
public class CarListImpl implements CarList {
    @Override
    public void add(String regNo, String car) {
        carsList.put(regNo, car);
    }

    @Override
    public String view() {
        //for(Object key: carsList.keySet())
            //System.out.println(key.toString() + " - " + carsList.get(key.toString()));
        return carsList.toString();
    }
}
