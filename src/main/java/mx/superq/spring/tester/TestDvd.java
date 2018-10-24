package mx.superq.spring.tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestDvd {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Tester tester = applicationContext.getBean("tester", Tester.class);	
		Banda banda = applicationContext.getBean("banda", Banda.class);
		Rock rock = applicationContext.getBean("rock", Rock.class);
		
		
		MP3Player mp3Player = applicationContext.getBean("mp3Player", MP3Player.class);
		mp3Player.setPlayList(banda);
		tester.setDevice(mp3Player);		
		tester.test();
		
		mp3Player.setPlayList(rock);			
		tester.test();

	}
}