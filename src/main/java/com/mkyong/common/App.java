package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.model.Stock;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	
    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");

    	/** select **/
    	Stock stock = stockBo.findByStockCode("1");
    	System.out.println(stock);
    	stock = stockBo.findByStockCode("2");
    	System.out.println(stock);

    	System.out.println("Done");
    }
}
