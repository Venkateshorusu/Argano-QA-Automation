package com.Argano.listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.Argano.utlis.DataProviderUtlis;

public class AnnotationTransformer implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	
		annotation.setDataProvider("getData");
		annotation.setDataProviderClass(DataProviderUtlis.class);
		annotation.setRetryAnalyzer(RetryFailedTests.class);
	}

}
