package com.example.demo;

import com.example.demo.ResultMapEntities.SummaryAPI.*;
import lombok.Data;

import java.util.List;

@Data
public class SummaryAPI {
    private List<VehicleMakeCount> vehicleMakeCount;
    private List<ViolationPointPerState> violationPointPerState;
    private List<ViolationPointPerDriver> violationPointPerDriver;
    private List<PoliciesCreatedPerYear> policiesCreatedPerYear;

    public static SummaryAPI summaryAPI(List vehicleMakeCount, List violationPointPerState, List violationPointPerDriver, List policiesCreatedPerYear){
        SummaryAPI summaryAPI = new SummaryAPI();
        summaryAPI.setVehicleMakeCount(vehicleMakeCount);
        summaryAPI.setViolationPointPerState(violationPointPerState);
        summaryAPI.setViolationPointPerDriver(violationPointPerDriver);
        summaryAPI.setPoliciesCreatedPerYear(policiesCreatedPerYear);
        return summaryAPI;
    }
}
