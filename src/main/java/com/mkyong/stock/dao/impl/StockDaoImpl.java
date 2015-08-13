package com.mkyong.stock.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao{
	
	public void save(Stock stock){
		getHibernateTemplate().save(stock);
	}
	
	public void update(Stock stock){
		getHibernateTemplate().update(stock);
	}
	
	public void delete(Stock stock){
		getHibernateTemplate().delete(stock);
	}
	
	public Stock findByStockCode(String stockCode){
		List list = getHibernateTemplate().find("from Stock where stockCode=?",stockCode);
		if (list != null && list.size() != 0) {
			return (Stock) list.get(0);
		}else {
			return null;
		}
	}

}
