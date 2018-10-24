package mx.superq.spring.tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestDvd {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Tester tester = applicationContext.getBean("testerDvd", Tester.class);	
		tester.test();
		
		 tester = applicationContext.getBean("testerBluRay", Tester.class);	 
		 tester.test();
		 
		 tester = applicationContext.getBean("testerMp3", Tester.class);	
		 tester.test();
		 
		 tester = applicationContext.getBean("testerSmartPhon", Tester.class);	
		 tester.test();
	}
}