package cn.et.lession2.jdbc;

import java.rmi.server.ObjID;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.management.Query;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	static JdbcTemplate jt;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lession2/jdbc/spring.xml");
		jt=(JdbcTemplate)context.getBean("jdbcTemplate");
	}
	public static void main(String[] args) throws SQLException {
		
	//	DataSource dataSource =(DataSource)context.getBean("dataSouce");
		query("select * from mynews");
		
	}
	public static void query(String sql){
		List<Map<String, Object>> list = jt.queryForList(sql);
		System.out.println(list);
		
	}
	public static void update(){
		String sql="delete from mynews where id=1";
		jt.execute(sql);
	}
}
