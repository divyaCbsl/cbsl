package com.example.CaseSearch.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Year;
import java.util.Date;

@Data
@Entity
@Table(name = "case_details")
public class CaseDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long caseId;
    private String caseNumber;
    private Year caseYear;
    private String caseType;
    @Column(name = "e_filing_number")
    private String e_filing_number;
    @Column(name = "e_filing_Date")
    private Date e_filing_date;
    private String cnrNumber;
    private String caseStatus;
    private String section;
    private String petitionerName;
    private String petitionerAdvocateName;
    private String respondentName;
    private String respondentAdvocateName;
    private Date previousHearingDate;
    private String previousHearingDescription;
    private Date nextHearingDate;
    private Date judgementDate;
    private String judgeName;
    private Year firYear;
    private String chargeSheetNumber;
    private String policeStationName;
}
