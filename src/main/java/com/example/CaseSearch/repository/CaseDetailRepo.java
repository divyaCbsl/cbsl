package com.example.CaseSearch.repository;

import com.example.CaseSearch.model.CaseDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Year;

public interface CaseDetailRepo extends JpaRepository<CaseDetails,Long> {

    CaseDetails findByCaseNumberAndCaseTypeAndCaseYear(String caseNumber, String caseType, Year caseYear);

}
