package com.interfacepk.defaultANDstatic;

public interface MyStaticDefaultInterface {

	void abstractMethod();
	 default void defaultMehtod()
	{
		System.out.println("I am from default Method");
		abstractMethod();
	}
	 static void staticMehtod()
		{
			System.out.println("I am from static Method");
			
		}
}
