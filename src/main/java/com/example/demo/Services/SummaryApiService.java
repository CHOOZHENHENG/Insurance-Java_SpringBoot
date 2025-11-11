package com.example.demo.Services;

import com.example.demo.Mappers.SummaryApiMapper;
import com.example.demo.ResultMapEntities.SummaryAPI.*;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryApiService {

    @Resource
    private SummaryApiMapper summaryApiMapper;

    public List<VehicleMakeCount> vehicleMakeCountList(){
        return summaryApiMapper.getVehicleMakeCount();
    }

    public List<ViolationPointPerState> violationPointPerStateList(){
        return summaryApiMapper.getViolationPointPerState();
    }

    public List<ViolationPointPerDriver> violationPointPerDriverList(){
        return summaryApiMapper.getViolationPointPerDriver();
    }

    public List<PoliciesCreatedPerYear> policiesCreatedPerYearList(){
        return summaryApiMapper.getPoliciesCreatedPerYear();
    }
}
