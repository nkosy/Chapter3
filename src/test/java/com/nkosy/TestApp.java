package com.nkosy;

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
    @Before
    public void setUp() throws Exception {
        //List
        list = new ShoppingListImpl();
        list.add("peanuts");

        //Set
        mylist = new StationaryListImpl();
        mylist.add("pen");
        mylist.add("book");
        mylist.add("ruler");
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

    @After
    public void tearDown() throws Exception {


    }
}
