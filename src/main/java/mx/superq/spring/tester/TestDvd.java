
package mx.superq.spring.tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDvd {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Tester tester = applicationContext.getBean("tester", Tester.class);	
		tester.test();
	}
}