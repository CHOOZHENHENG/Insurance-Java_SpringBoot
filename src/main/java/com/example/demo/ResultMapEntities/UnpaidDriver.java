package com.example.demo.ResultMapEntities;

import lombok.Data;

@Data
public class UnpaidDriver {
    private String name;
    private String policyNumber;
    private double totalAmount;
    private double balance;
    private double minPayment;
    private String dueDate;
    private String paymentOption;
}
