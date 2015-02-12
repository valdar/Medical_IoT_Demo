package com.redhat.demo.medicalDemo;

public class DataToSQLBean {

	public String toSql(MedicalDataSet dataSet) 
	    {
	        StringBuilder sb = new StringBuilder();
	 
	        sb.append("INSERT INTO \"heartRate\" ");
	        sb.append("(patientID, timestamp, value) values (");
	        sb.append("'").append(dataSet.getPatientID()).append("', ");
	        sb.append("'").append(dataSet.getTimestamp()).append("', ");
	        sb.append("'").append(dataSet.getPayload()).append("') ");

	        System.out.println("SQL ="+ sb.toString() );
	        
	        return sb.toString();
	    }
	    
}
