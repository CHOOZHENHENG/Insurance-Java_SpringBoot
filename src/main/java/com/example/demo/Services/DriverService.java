package com.example.demo.Services;

import com.example.demo.Mappers.DriverMapper;
import com.example.demo.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Resource
    private DriverMapper driverMapper;

    public Result driverList(){
        return Result.success(driverMapper.getDriverTable());
    }
}
