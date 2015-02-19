package com.nkosy.list.service.Impl;

import com.nkosy.list.service.ShoppingList;

/**
 * Created by nkosy on 2015/02/19.
 */
public class ShoppingListImpl implements ShoppingList {

    @Override
    public void add(String item){
        thelist.add(item);
        System.out.println(item + " has been succesfully added to your list");

        for(int i= 0; i < thelist.size(); i++)
        {

        }
    }

    @Override
    public void remove(String item) {
        boolean found = false;
           for(int i= 0; i < thelist.size(); i++){
               if(item == thelist.get(i))
               {
                   found = true;
                   thelist.remove(i);
                   System.out.println(item + " successfully removed");
               }

           }
        if(found == false)
            System.out.println(item +" does not exist");


    }

    @Override
    public String view() {
        return thelist.toString();
    }


}
