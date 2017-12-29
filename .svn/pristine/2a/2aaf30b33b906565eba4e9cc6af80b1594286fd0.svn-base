package cn.et.lession2.mvc.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.et.lession2.mvc.TEL;
import cn.et.lession2.mvc.service.MyService;

@TEL
public class MyController {
	@Resource(name="myService")
	MyService m;
	public void service(String sql){
		System.out.println(m.query(sql));
	}
}
