/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loanms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Harmony
 */
/**@Entity
@Getter
@Setter
@Table
public class LoanApplicant extends User {
    
    @Column(nullable = false)
    private String dateOfBirth;
    
    @Column(nullable = false)
    private String nationality;
    
    @Column(nullable = false)
    private String stateOfOrigin;
    
    @Column(nullable = false)
    private String lga;
    
    @Column(nullable = false)
    private String idCardNumber;
    
    @Column(nullable = false)
    private String houseNumber;
    
    @Column(nullable = false)
    private String street;
    
    @Column(nullable = false)
    private String town;
    
    @Column(nullable = false)
    private String city;
    
    @Column(nullable = false)
    private String country;
    
    @Column(nullable = false)
    private String phoneNumber;
    
    @Column(nullable = false)
    private String cemail;
    
    @Column(nullable = false)
    private String employmentStatus;
    
    @Column(nullable = false)
    private String occupation;
    
    @Column(nullable = false)
    private String nameOfEmployer;
    
    @Column(nullable = false)
    private String purposeOfLoan;
    
    @Column(nullable = false)
    private String dateRequired;
    
    @Column(nullable = false)
    private String amount;
}
**/