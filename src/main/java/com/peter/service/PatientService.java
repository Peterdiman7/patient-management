package com.peter.service;

import com.peter.dto.PatientRequestDTO;
import com.peter.dto.PatientResponseDTO;

import java.util.List;
import java.util.UUID;

public interface PatientService {
    List<PatientResponseDTO> getPatients();
    PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO);
    PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO);
    void deletePatient(UUID id);
}
