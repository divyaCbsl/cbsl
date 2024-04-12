package com.example.CaseSearch.controller;

import com.example.CaseSearch.model.CaseDetails;
import com.example.CaseSearch.service.CaseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;

@RestController
@RequestMapping("/caseSearch")
public class CaseDetailController {

    @Autowired
    CaseDetailService caseDetailService;

    @PostMapping
    public void addCaseFileDetails(@RequestBody CaseDetails caseDetails) {
        caseDetailService.addCaseFileDetails(caseDetails);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public CaseDetails getCaseFileDetails(@RequestParam String caseNumber,@RequestParam String caseType, @RequestParam Year caseYear) {
        return caseDetailService.getCaseFileDetails(caseNumber,caseType,caseYear);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/allCases")
    public List<CaseDetails> getAllCaseFiles() {
        return caseDetailService.getAllCaseFiles();
    }

    @GetMapping("/{caseNumber}")
    public ResponseEntity<CaseDetails> getSingleFile(@PathVariable String caseNumber){
        return caseDetailService.getSingleCaseDetail(caseNumber);
    }


    @PutMapping("/{caseNumber}")
    public void updateCaseDetail(@PathVariable String caseNumber, @RequestBody CaseDetails casedetails ) {
        caseDetailService.updateCaseFileDetail(casedetails);
    }
}
