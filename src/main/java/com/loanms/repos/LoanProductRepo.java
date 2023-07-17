/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.loanms.repos;

import com.loanms.entities.LoanProduct;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Harmony
 */
public interface LoanProductRepo extends JpaRepository<LoanProduct, Long> {
    
}
