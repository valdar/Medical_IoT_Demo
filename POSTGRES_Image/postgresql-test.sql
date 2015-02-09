DROP TABLE "heartRate";
CREATE TABLE "heartRate" (
    pid        		 varchar(20) primary key, 
    patientID     	 DECIMAL,
    timestamp       	 INTEGER,
    value		 INTEGER
);


