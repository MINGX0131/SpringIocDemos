package com.ming.ioc.containeroverview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ming.ioc.containeroverview.config.AppConfig;
import com.ming.ioc.containeroverview.dao.jpa.JpaAccountDao;
import com.ming.ioc.containeroverview.dao.jpa.JpaItemDao;
import com.ming.ioc.containeroverview.service.PetStoreServiceImpl;

import com.ming.ioc.containeroverview.dao.AccountDao;
import com.ming.ioc.containeroverview.dao.ItemDao;

public class MainApplication {
	
    public static void main(String[] args) {
    	// client가 직접 제어
//    	AccountDao accountDao = new JpaAccountDao();
//    	ItemDao itemDao = new JpaItemDao();
//    	
//    	PetStoreServiceImpl petStoreService = new PetStoreServiceImpl();
//        petStoreService.setAccountDao(accountDao);
//        petStoreService.setItemDao(itemDao);
    	
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        PetStoreServiceImpl petStoreService = 
        		context.getBean(PetStoreServiceImpl.class);
        
        // petStoreService를 사용하여 비즈니스 로직 수행
        petStoreService.addItem("dog");
    	

    }
}