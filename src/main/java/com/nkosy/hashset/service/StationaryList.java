package com.nkosy.hashset.service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nkosy on 2015/02/19.
 */
public interface StationaryList {
    Set mylist = new HashSet();
    public void add(String item);
    public void remove(String item);
    public String view();
}
