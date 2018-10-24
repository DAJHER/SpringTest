package mx.superq.spring.tester;
import org.springframework.stereotype.Component;
@Component("tester")
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
	public void setPlayList(PlayList playList) {
		this.playList = playList;
	}
}
