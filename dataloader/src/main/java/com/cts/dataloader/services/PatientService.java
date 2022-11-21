package com.cts.dataloader.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cts.dataloader.entitities.PatientDetailsEntity;
import com.cts.dataloader.exception.DataLoaderException;


public interface PatientService {

	String patientData(MultipartFile excelFile);

	List<PatientDetailsEntity> getPatientDetails(String patientName) throws DataLoaderException;

	PatientDetailsEntity updatePatientDetails(int patientId, PatientDetailsEntity patientDetailsEntity) throws DataLoaderException;

	List<PatientDetailsEntity> getAllPatientData() throws DataLoaderException;
	
	

}
