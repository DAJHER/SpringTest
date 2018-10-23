package mx.superq.spring.tester;
public class MP3Player implements Device {
	public void turnOn() {
		System.out.println("Encendiendo MP3");		
	}
	public void play() {
		System.out.println("Reproduciendo MP3");		
	}
	public void stop() {
		System.out.println("Detenido MP3");		
	}
	public void turnOff() {
		System.out.println("Apagando MP3");		
	}
}
