package com.example.demo.Entities;

import lombok.Data;

@Data
public class Bill {
    private int billId;
    private int policyId;
    private String dueDate;
    private double minimumPayment;
    private String createdDate;
    private double balance;
    private String status;
}
