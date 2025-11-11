package com.example.demo.Mappers;

import com.example.demo.ResultMapEntities.SummaryAPI.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SummaryApiMapper {
    List<VehicleMakeCount> getVehicleMakeCount();
    List<ViolationPointPerState> getViolationPointPerState();
    List<ViolationPointPerDriver> getViolationPointPerDriver();
    List<PoliciesCreatedPerYear> getPoliciesCreatedPerYear();
}
