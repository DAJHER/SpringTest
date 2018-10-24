package mx.superq.spring.tester;
import org.springframework.stereotype.Component;
@Component("smartPhonePlayer")
public class SmartPhonePlayer implements Device {
	public void turnOn() {
		System.out.println("SmartPhone Encendido");		
	}
	public void play() {
		System.out.println("SmartPhone Reproduciendo");		
	}
	public void stop() {
		System.out.println("SmartPhone Deteniendo");		
	}
	public void turnOff() {
		System.out.println("SmartPhone Apagado");		
	}
}
