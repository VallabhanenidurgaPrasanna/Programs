package com.tekworkss.Arogya;

public interface Dao {
	public void patientRegistration(Patient p);
	public void viewAllPatients();
	public void searchPatientById(int id);
	public void deletePatientById(int id);
	public void searchPatientBycity(String city);
	public void searchPatientByAgeGroup(int start,int end);
	public void searchByPatientRecovery(int id);
}
