package com.Argano.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import com.Argano.constants.FrameworkConstants;
import com.Argano.utlis.ExcelUtlis;

public class MethodInterceptor implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		List<IMethodInstance> result = new ArrayList<>();

		List<Map<String, String>> list = ExcelUtlis.getTestDetails(FrameworkConstants.getRunmanagersheet());
		for (int i = 0; i < methods.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("TestName"))
						&& list.get(j).get("Execute").equalsIgnoreCase("yes")) {
					methods.get(i).getMethod().setDescription((list.get(j).get("TestDescription")));
					result.add(methods.get(i));

				}
			}
		}
//System.out.println(result);
		return result;
	}
}
