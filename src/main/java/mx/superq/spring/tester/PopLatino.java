package mx.superq.spring.tester;
import org.springframework.stereotype.Component;
@Component("tester")
public class PopLatino implements PlayList {

	@Override
	public String getName() {
		return "Pop Latino";
	}

}
