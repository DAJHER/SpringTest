package mx.superq.spring.tester;
import org.springframework.stereotype.Component;
@Component("tester")
public class Tester {
	private Device device;
	public void test() {
		device.turnOn();
		device.play();
		device.stop();
		device.turnOff();
	}
	//@Autowired
	//@Qualifier("dvdPlayer")
	public void setDevice(Device device) {
		this.device = device;
	}	
}
