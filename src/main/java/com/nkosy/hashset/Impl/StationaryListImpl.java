package com.nkosy.hashset.Impl;

import com.nkosy.hashset.StationaryList;

/**
 * Created by nkosy on 2015/02/19.
 */
public class StationaryListImpl implements StationaryList {
    @Override
    public void add(String item) {

        Object value = mylist.add( new String (item) );
        if ( value == null )
            System.out.println( "Could not add " + item );
        else
        {
            System.out.println( "Added " + item );
            System.out.println( "New contents are " + mylist );
        }

    }

    @Override
    public void remove(String item) {
        mylist.remove(item);

    }

    @Override
    public String view() {
        return mylist.toString();
    }
}
