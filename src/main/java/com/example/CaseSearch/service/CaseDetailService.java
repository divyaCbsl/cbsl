package com.example.CaseSearch.service;

import com.example.CaseSearch.model.CaseDetails;
import com.example.CaseSearch.repository.CaseDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;

@Service
public class CaseDetailService {

    @Autowired
    CaseDetailRepo caseDetailRepo;
    public void addCaseFileDetails(CaseDetails caseDetails) {
        caseDetailRepo.save(caseDetails);
    }

    public CaseDetails getCaseFileDetails(String caseNumber, String caseType, Year caseYear) {
        return caseDetailRepo.findByCaseNumberAndCaseTypeAndCaseYear(caseNumber, caseType, caseYear);
    }

    public void updateCaseFileDetail(CaseDetails casedetails) {

    }
}
