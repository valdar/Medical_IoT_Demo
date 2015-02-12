package com.redhat.demo.medicalDemo;

import java.util.Random;
 
public class DummyDataGenerator {

	private MedicalDataSet medSet;
	
	private void genRandomData(){
		Random random = new Random();
		
		medSet = new MedicalDataSet(	String.valueOf( System.nanoTime() ), 
										Integer.toString(random.nextInt(4)), 
										Integer.toString(random.nextInt(10)),
										Integer.toString(random.nextInt(1000)));	
	}
	
	public MedicalDataSet getMedicalDataSet(){
		
		genRandomData();
		
		medSet.getTimestamp();
		medSet.getDeviceID();
		medSet.getPayload();

		return medSet;
	}
}