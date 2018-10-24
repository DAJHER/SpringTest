package mx.superq.spring.tester;
import org.springframework.stereotype.Component;
@Component("rock")
public class Rock implements PlayList  {
	@Override
	public String getName() {
		return "Rock";
	}
}
