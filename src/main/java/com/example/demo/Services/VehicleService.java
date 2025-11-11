package com.example.demo.Services;

import com.example.demo.Mappers.VehicleMapper;
import com.example.demo.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Resource
    private VehicleMapper vehicleMapper;

    public Result vehicleList(){
        return Result.success(vehicleMapper.getVehicleTable());
    }
}
