package com.doku.demoapps.controller;

import com.doku.demoapps.dto.GeneratePaymentCodeDto;
import com.doku.demoapps.entity.Transaction;
import com.doku.demoapps.services.GeneratePaymentCodeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

@Controller
public class GeneratePaymentCodeController {
    @Autowired
    GeneratePaymentCodeServices generatePaymentCodeServices;

    @GetMapping()
    public String getPaycode() {
        return "generate-paycode";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Transaction> generate(@RequestBody GeneratePaymentCodeDto generatePaymentCodeDto) throws IOException {
        Transaction transaction = generatePaymentCodeServices.generate(generatePaymentCodeDto);
        return ResponseEntity.ok(transaction);
    }
}
