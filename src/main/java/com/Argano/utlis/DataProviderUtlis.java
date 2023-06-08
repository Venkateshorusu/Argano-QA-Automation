package com.Argano.utlis;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.Argano.constants.FrameworkConstants;

public final class DataProviderUtlis {
	
	private static List<Map<String, String>> list= new ArrayList<>();

	@DataProvider(parallel= false)
	public static Object[] getData(Method m)
	{
		String testname = m.getName();
		if(list.isEmpty())
		{
			list = ExcelUtlis.getTestDetails(FrameworkConstants.getTestdatasheet());
		}
	
	List<Map<String, String>> testdatalist = new ArrayList<>();
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).get("TestName").equalsIgnoreCase(testname))
			if(list.get(i).get("Execute").equalsIgnoreCase("yes"))
		{{
			testdatalist.add(list.get(i));
		}}
	}
		list.removeAll(testdatalist);
		return testdatalist.toArray();
		
	}
}
