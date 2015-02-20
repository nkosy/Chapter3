package com.nkosy;

import com.nkosy.hashmap.service.CarList;
import com.nkosy.hashmap.service.Impl.CarListImpl;
import com.nkosy.hashset.service.Impl.StationaryListImpl;
import com.nkosy.hashset.service.StationaryList;
import com.nkosy.list.service.Impl.ShoppingListImpl;
import com.nkosy.list.service.ShoppingList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nkosy on 2015/02/19.
 */
public class TestApp {
    //List
    ShoppingList list;
    //Set
    StationaryList mylist;
    //Map
    CarList vihicles;
    @Before
    public void setUp() throws Exception {
        //List
        list = new ShoppingListImpl();
        list.thelist.clear();
        list.add("peanuts");

        //Set
        mylist = new StationaryListImpl();
        mylist.add("pen");
        mylist.add("book");
        mylist.add("ruler");

        //Map
        vihicles = new CarListImpl();
        vihicles.add("123", "BMW");

    }

    //List
    @Test
    public void testList() throws Exception {
        Assert.assertEquals("[peanuts]", list.view());
    }

    //Set
    @Test
    public void testSet() throws Exception {
        Assert.assertEquals("[book, pen, ruler]", mylist.view());

    }
    
    //Map


    @Test
    public void testCars() throws Exception {
        Assert.assertEquals("{regNo=car}", vihicles.view());
    }

    @After
    public void tearDown() throws Exception {


    }
}
