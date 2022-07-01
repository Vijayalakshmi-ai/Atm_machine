package com.Atm_Machine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
	Account account;
	double amount = 0;

	@Before
	public void setup() {
		account = new Account(123123123, 7890, 10000, 10000);
		account.setAmount(1000);

	}

	@Test
	public void testcalcCheckingWithdraw() {
		amount = 1000;
		assertThat(account.calcCheckingWithdraw(amount), is(9000.0));

	}

	@Test
	public void testcalcSavingWithdraw() {
		amount = 1000;
		assertThat(account.calcSavingWithdraw(amount), is(9000.0));

	}

	@Test
	public void testcalcCheckingDeposit() {
		amount = 1000;
		assertThat(account.calcCheckingDeposit(amount), is(11000.0));

	}

	@Test
	public void testcalcSavingDeposit() {
		amount = 1000;
		assertThat(account.calcSavingDeposit(amount), is(11000.0));

	}

	@After
	public void tearDown() {
		System.out.println("This testcase named  " + this.getName() + "  runs successfully");

	}

}
