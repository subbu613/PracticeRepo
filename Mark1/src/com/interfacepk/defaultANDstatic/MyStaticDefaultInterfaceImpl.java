package com.interfacepk.defaultANDstatic;

public class MyStaticDefaultInterfaceImpl extends superClass implements MyStaticDefaultInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStaticDefaultInterfaceImpl impl=new MyStaticDefaultInterfaceImpl();
		impl.defaultMehtod();
	}

	/*@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println(" from MyStaticDefaultInterfaceImpl abstractMethod()");
	}*/

}

class superClass{
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println(" from superClass abstractMethod()");
	}
	
}