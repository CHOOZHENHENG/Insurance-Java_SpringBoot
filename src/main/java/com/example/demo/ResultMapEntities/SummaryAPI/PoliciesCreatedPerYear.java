package com.example.demo.ResultMapEntities.SummaryAPI;

import lombok.Data;

@Data
public class PoliciesCreatedPerYear {
    private String year;
    private int policyCreated;
}
