//package dumdum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	BankAccount ba;

	@BeforeEach
	void setUp() throws Exception {
		ba = new BankAccount("a", 10);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDeposit() {
		ba.deposit(100);
		assertEquals(110, ba.getCurrentBalance());
	}
	
	@Test
	void testWithdraw() {
		ba.withdraw(5);
		assertEquals(5, ba.getCurrentBalance());

	}

	@Test
	void testWithdrawWithInsufficientFunds() {
		ba.withdraw(15);
		assertEquals(0, ba.getCurrentBalance());
	}
}
