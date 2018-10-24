package mx.superq.spring.tester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("mp3Player")
public class MP3Player implements Device {
	private PlayList playList;
	public void turnOn() {
		System.out.println("Encendiendo MP3");		
	}
	public void play() {
		System.out.println("Reproduciendo MP3 PlayList " + playList.getName());		
	}
	public void stop() {
		System.out.println("Detenido MP3");		
	}
	public void turnOff() {
		System.out.println("Apagando MP3");		
	}
	@Autowired
	@Qualifier("rock")
	public void setPlayList(PlayList playList) {
		this.playList = playList;
	}
}
