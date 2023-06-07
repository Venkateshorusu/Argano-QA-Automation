package Pages;

import org.testng.annotations.Test;

public class NewTransactionTest {
	 
	@Test
	public void test2()
	{
		
		 NewTransaction.UptoSave();
	}
	@Test
	public void test3()
	{
		 NewTransaction.addLineItem();
	}
	@Test
	public void test4() throws InterruptedException
	{
		 NewTransaction.CreateNew();
	}
	@Test
	public void test1() throws Exception
	{
		LogInToAD.log();
	}

}
