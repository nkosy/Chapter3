package com.nkosy.config;

import com.nkosy.hashmap.service.CarList;
import com.nkosy.hashmap.service.Impl.CarListImpl;
import com.nkosy.hashset.service.Impl.StationaryListImpl;
import com.nkosy.hashset.service.StationaryList;
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

    @Bean(name="carlist")
    public CarList getCrService(){
        return new CarListImpl();
    }
}
