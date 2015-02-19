package com.nkosy.list.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nkosy on 2015/02/19.
 */
public interface ShoppingList {
    public List thelist = new ArrayList();
    public void add(String item);
    public void remove(String item);
    public String view();
}