package com.cts.dataloader.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cts.dataloader.dtos.ResponseDTO;
import com.cts.dataloader.entitities.PatientDetailsEntity;
import com.cts.dataloader.exception.DataLoaderException;
import com.cts.dataloader.services.PatientService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientService;

	@PostMapping("/load/patientdata")
	public ResponseDTO patientData(@RequestParam MultipartFile excelFile) {

		System.out.println("call got in controller");
		ResponseDTO responseDto = new ResponseDTO();

		// try {
		String message = patientService.patientData(excelFile);
		responseDto.setResult(message);
		responseDto.setMessage("Data Uploaded Successfully.");
//		} catch (DataLoaderException e) {
//			responseDto.setException(e.getMessage());
//		}

		return responseDto;

	}

	@GetMapping("/retrieve/{patientName}")
	public ResponseDTO getPatientDetails(@PathVariable String patientName) {
		ResponseDTO responseDto = new ResponseDTO();

		try {
			List<PatientDetailsEntity> patientDetailsEntities = patientService.getPatientDetails(patientName);
			responseDto.setResultArray(patientDetailsEntities.toArray());
			responseDto.setMessage("Patient details found Successfully...");
		} catch (DataLoaderException e) {
			responseDto.setException(e.getMessage());
		}
		return responseDto;

	}

	@PutMapping("/updatepatient/{patientId}")
	public ResponseDTO updatePatientDetails(@PathVariable int patientId,
			@RequestBody PatientDetailsEntity patientDetailsEntity) {

		ResponseDTO responseDto = new ResponseDTO();
		try {
			PatientDetailsEntity patientDetailsEntity2 = patientService.updatePatientDetails(patientId,
					patientDetailsEntity);
			responseDto.setMessage("Patient details updated Successfully...");
			responseDto.setResult(patientDetailsEntity2);

		} catch (DataLoaderException e) {
			responseDto.setException(e.getMessage());
		}

		return responseDto;

	}

	@GetMapping("/getAllPatientData")
	public ResponseDTO getAllPatientData() {
		ResponseDTO responseDto = new ResponseDTO();

		try {
			List<PatientDetailsEntity> patientDetailsEntities = patientService.getAllPatientData();
			responseDto.setResultArray(patientDetailsEntities.toArray());
			responseDto.setMessage("Patient details found Successfully...");
		} catch (DataLoaderException e) {
			responseDto.setException(e.getMessage());
		}
		return responseDto;

	}
}
