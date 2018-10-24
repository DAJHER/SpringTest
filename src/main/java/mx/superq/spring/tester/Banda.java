package mx.superq.spring.tester;
import org.springframework.stereotype.Component;
@Component("banda")
public class Banda implements PlayList {
	@Override
	public String getName() {
		return "Banda";
	}
}
