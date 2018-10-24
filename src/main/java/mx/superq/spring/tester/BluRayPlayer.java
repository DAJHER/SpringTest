package mx.superq.spring.tester;
import org.springframework.stereotype.Component;
@Component("bluRayPlayer")
public class BluRayPlayer implements Device {
	public void turnOn() {
		System.out.println("Encendiendo BluRay");		
	}
	public void play() {
		System.out.println("Reproduciendo BluRay");		
	}
	public void stop() {
		System.out.println("Detenido BluRay");		
	}
	public void turnOff() {
		System.out.println("Apagando BluRay");		
	}
}
