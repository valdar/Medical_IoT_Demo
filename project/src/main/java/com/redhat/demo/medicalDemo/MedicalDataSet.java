package com.redhat.demo.medicalDemo;

public class MedicalDataSet {
	private String	timestamp;
	private String	deviceID;
	private	String	payload;
	
	public MedicalDataSet(String time, String devID, String pay)
	{
		this.timestamp 	= time;
		this.deviceID 	= devID;
		this.payload	= pay;
	}
	
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	/**
	 * @return the deviceID
	 */
	public String getDeviceID() {
		return deviceID;
	}
	
	/**
	 * @param deviceID the deviceID to set
	 */
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	
	/**
	 * @return the payload
	 */
	public String getPayload() {
		return payload;
	}
	
	/**
	 * @param payload the payload to set
	 */
	public void setPayload(String payload) {
		this.payload = payload;
	}
}
