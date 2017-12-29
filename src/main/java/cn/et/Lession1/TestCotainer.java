package cn.et.Lession1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.instrument.classloading.weblogic.WebLogicLoadTimeWeaver;
/**
 * FileSystemXmlApplicationContext ���ļ�ϵͳѰ��xml�ļ� ���̷�
 * ClassPathXmlApplicationContext ����·����Ѱ��  ����ʹ��
 * GenericXmlApplicationContext ͨ��Ĭ�ϲ�����·��
 * WebApplicationtext web.xml��ʵ����
 * 
 * �ͽ�ԭ�� ����ApplicationContextָ�� ��֧���ַ���������ҷ�ʽ
 * 		classpath;
 * 		file;
 * @author Administrator
 *
 */
public class TestCotainer {
	public static void main(String[] args) {
		//��������
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lession1/spring.xml");
		A a=(A)context.getBean("a");
		A b=(A)context.getBean("b");
		System.out.println(a==b);
		
		//B����ֻ����һ��
//		B b1=context.getBean(B.class);
//		System.out.println(b1);
		
		//B�ַ�����Ĭ��ȡ��һ��
		B b2 =(B)context.getBean("cn.et.Lession1.B");
		System.out.println(b2);
		
		//���û��ָ��id����  Ĭ�ϵ����� ������#���
		String[] str = context.getBeanDefinitionNames();
		for(String tmp:str){
			System.out.println(tmp);
		}
		
	}
}
