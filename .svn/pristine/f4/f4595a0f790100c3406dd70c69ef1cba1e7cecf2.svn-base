package cn.et.lession4.testm.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class AcDaoImpl {
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	BcDaoImpl b;
	public void updateAminus(int money) throws Exception {
		//¿ÛÇ®
		String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where id=1";
		jdbc.execute(sql);
		//¼ÓÇ®
		b.saveBadd(money);
		//throw new FileNotFoundException();
		throw new NullPointerException();
		//int i=2/0;
		
	}
	public void updateAminusTest() throws Exception {
		
		String sql="update mymoney set lostedmoney=80 where username='A'";
		jdbc.execute(sql);
		
		
	}
}
