package com.nkosy.hashmap.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nkosy on 2015/02/20.
 */
public interface CarList {
    Map carsList = new HashMap();
    public void add(String regNo, String car);
    public String view();
}
