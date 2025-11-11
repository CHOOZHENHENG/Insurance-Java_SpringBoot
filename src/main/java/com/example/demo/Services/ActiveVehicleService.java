package com.example.demo.Services;

import com.example.demo.Mappers.ActiveVehicleMapper;
import com.example.demo.ResultMapEntities.ActiveVehicle;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiveVehicleService {

    @Resource
    ActiveVehicleMapper activeVehicleMapper;

    public List<ActiveVehicle> activeVehicleList(){
        return activeVehicleMapper.getActiveVehicle();
    }

}
