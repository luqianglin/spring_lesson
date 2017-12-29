package cn.et.lession2.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lession2.mvc.dao.MyDao;

@Service
public class MyService {
	@Autowired
	private MyDao myDao;
	
	public String query(String sql){
		return myDao.queryMyResult(sql).toString();
	}
	
}
