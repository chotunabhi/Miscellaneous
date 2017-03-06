package com.java.annotations;

import java.lang.annotation.Annotation;

public class TestAnnotationParser {
	public void read() throws Exception{
		Class<RunAnnotation> ob = RunAnnotation.class;
		
		if(ob.isAnnotationPresent(TestAnnotaion.class)){
			
		}
		
		
	}
}
