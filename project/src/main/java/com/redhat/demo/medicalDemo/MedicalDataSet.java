package com.redhat.demo.medicalDemo;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "medicalDataSet")
@XmlType(propOrder = { "timestamp", "deviceID", "patientID", "payload" })
public class MedicalDataSet {
	private String	timestamp;
	private String	deviceID;
	private String	patientID;	
	private	String	payload;
	
	public MedicalDataSet()
	{
		this.timestamp 	= "";
		this.deviceID 	= "";
		this.patientID	= "";
		this.payload	= "";
	}
	
	public MedicalDataSet(String time, String devID, String patID, String pay)
	{
		this.timestamp 	= time;
		this.deviceID 	= devID;
		this.patientID	= patID;
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

	/**
	 * @return the patientID
	 */
	public String getPatientID() {
		return patientID;
	}

	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
}
