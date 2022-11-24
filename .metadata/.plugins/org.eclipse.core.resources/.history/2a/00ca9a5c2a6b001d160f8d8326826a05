package com.cts.dataloader.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.dataloader.entitities.PatientDetailsEntity;

public interface PatientRepository extends JpaRepository<PatientDetailsEntity, Integer> {

	@Query("select p from PatientDetailsEntity p where p.patientName LIKE %?1%")
	List<PatientDetailsEntity> getPatientDetailsByName(String upperCase);

	@Query("select p from PatientDetailsEntity p where p.patientId=?1")
	Optional<PatientDetailsEntity> getPatientDetailsById(int patientId);

}
