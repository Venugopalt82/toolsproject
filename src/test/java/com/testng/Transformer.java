package com.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;

public class Transformer implements IAnnotationTransformer{
	
	@Override
	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	}
	
}
