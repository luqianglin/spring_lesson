package cn.et.lession3.log;



import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyMessage {
	Logger  logger = Logger.getLogger(MyMessage.class);
	public void beforeSeek(JoinPoint jp){
		
		String method=jp.getSignature().getName();
		logger.debug("方法"+method+":调用");
		
	}
}
