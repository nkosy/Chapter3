package com.nkosy.config;

import com.nkosy.hashset.Impl.StationaryListImpl;
import com.nkosy.hashset.StationaryList;
import com.nkosy.list.service.Impl.ShoppingListImpl;
import com.nkosy.list.service.ShoppingList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nkosy on 2015/02/19.
 */
@Configuration
public class AppConfig {
    @Bean(name="mylist")
    public ShoppingList getService(){
        return new ShoppingListImpl();
    }

    @Bean(name="stlist")
    public StationaryList getStService(){
        return new StationaryListImpl();
    }
}
