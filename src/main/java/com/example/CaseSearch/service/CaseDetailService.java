package com.example.CaseSearch.service;

import com.example.CaseSearch.model.CaseDetails;
import com.example.CaseSearch.repository.CaseDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;

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
//    public CaseDetails getSingleCaseDetails(String caseNumber){
//        return caseDetailRepo.findByCaseNumber(caseNumber);
//    }

    public ResponseEntity<CaseDetails> getSingleCaseDetail(String caseNumber){
        List<CaseDetails> caseDetails = caseDetailRepo.findAllByCaseNumber(caseNumber);
        CaseDetails caseDetail;
        HttpStatus status;
        if (caseDetails.size() > 1) {
            throw new IllegalStateException("Duplicate values!! Try entering Case Year and Case Type.");
        }
        else {
            status = HttpStatus.OK;
        }

        return new ResponseEntity<>(caseDetailRepo.findByCaseNumber(caseNumber),status);
    }


    public void updateCaseFileDetail(CaseDetails casedetails) {

    }

    public List<CaseDetails> getAllCaseFiles() {
        return caseDetailRepo.findAll();
    }
}
