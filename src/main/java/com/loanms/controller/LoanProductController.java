/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loanms.controller;

import com.loanms.entities.LoanProduct;
import com.loanms.repos.LoanProductRepo;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author Harmony
 */

@RestController
//@RequestMapping(value="/loan_product")
public class LoanProductController {
    
    @Autowired
    LoanProductRepo loanProductRepo;
    
    private URI resourceURI(long id){
        
         URI newPollUri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
         return newPollUri;
    }
    
    
    @PostMapping("/loanproducts")
    public ResponseEntity<?> createLoanProduct(@RequestBody LoanProduct loanProduct){
        
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(resourceURI(loanProduct.getProductId()));
        loanProductRepo.save(loanProduct);
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
        
    }
    
    @GetMapping("/loanproducts")
    public ResponseEntity<Iterable<LoanProduct>> getAllLoanProduct() {
        
        Iterable<LoanProduct> getAllLoanProduct = loanProductRepo.findAll();
        return new ResponseEntity<>(getAllLoanProduct,HttpStatus.OK);
        
    }
    
}
