package com.example.CaseSearch.controller;

import com.example.CaseSearch.model.CaseDetails;
import com.example.CaseSearch.service.CaseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;

@RestController
@RequestMapping("caseSearch")
public class CaseDetailController {

    @Autowired
    CaseDetailService caseDetailService;

    @PostMapping
    public void addCaseFileDetails(@RequestBody CaseDetails caseDetails) {
        caseDetailService.addCaseFileDetails(caseDetails);
    }

    @GetMapping
    public CaseDetails getCaseFileDetails(@RequestParam String caseNumber,@RequestParam String caseType, @RequestParam Year caseYear) {
        return caseDetailService.getCaseFileDetails(caseNumber,caseType,caseYear);
    }
    @GetMapping("allCases")
    public List<CaseDetails> getAllCaseFiles() {
        return caseDetailService.getAllCaseFiles();
    }

    @PutMapping("/{caseNumber}")
    public void updateCaseDetail(@PathVariable String caseNumber, @RequestBody CaseDetails casedetails ) {
        caseDetailService.updateCaseFileDetail(casedetails);
    }
}
