package mx.superq.spring.tester;
public class DVDPlayer implements Device {
	public void turnOn() {
		System.out.println("DVD Encendido");		
	}
	public void play() {
		System.out.println("DVD Reproduciendo");		
	}
	public void stop() {
		System.out.println("DVD Detenido");		
	}
	public void turnOff() {
		System.out.println("DVD Apagado");		
	}
}
