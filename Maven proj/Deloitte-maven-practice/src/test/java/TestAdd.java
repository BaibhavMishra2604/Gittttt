import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.deloitte.java.Add;

@Testable
public class TestAdd {
	
	
	Add a;
	
	@BeforeEach
	public void createAdd() {
		a= new Add();
	}
	
	@Test
	public void TestingAdd() {
		assertEquals(5, a.Add(3, 2), "Positive number addition failed" );
	}
	
	@Test
	public void TestingNegAdd() {
		assertEquals(-5, a.Add(-2, -3), "Negetive number addition failed" );
	}
}
