package com.example.CaseSearch.repository;

import com.example.CaseSearch.model.CaseDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Year;
import java.util.List;

public interface CaseDetailRepo extends JpaRepository<CaseDetails,Long> {

    CaseDetails findByCaseNumberAndCaseTypeAndCaseYear(String caseNumber, String caseType, Year caseYear);



    CaseDetails findByCaseNumber(String caseNumber);

    List<CaseDetails> findAllByCaseNumber(String caseNumber);
}
