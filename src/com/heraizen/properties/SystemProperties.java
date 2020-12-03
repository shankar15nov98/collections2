package com.heraizen.properties;

public class SystemProperties {
	public static void main(String[] args) {
		System.out.println("Operating system name: " + System.getProperty("os.name"));
		System.out.println("Java virtual machine name: " + System.getProperty("java.vm.name"));
		System.out.println("Java path: " + System.getProperty("java.class.path"));

	}
}
