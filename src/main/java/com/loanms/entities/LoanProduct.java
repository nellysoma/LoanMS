/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loanms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Harmony
 */

@Entity
@Setter
@Getter
public class LoanProduct {
   
    @Id
    @SequenceGenerator(name="loan_product_gen", sequenceName="loan_product_loan_product_id_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "loan_product_gen")
    @Column(name = "LOAN_PRODUCT_ID", columnDefinition = "serial")
    private Long productId;
    
    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;
    
    @Column(name = "INSTALLMENT_TYPE", nullable = false)
    private String installlmentType;
    
    @Column(name = "INTEREST_RATE", nullable = false)
    private String interestRate;
    
    @Column(name = "REPAYMENT_DURATION", nullable = false)
    private String repaymentDuration;
    
    public Long getProductId(Long productId){
        
        this.productId = productId;
        return  this.productId;
    }
}
