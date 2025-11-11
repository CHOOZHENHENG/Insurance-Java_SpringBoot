package com.example.demo.Services;

import com.example.demo.Mappers.UnpaidDriverMapper;
import com.example.demo.ResultMapEntities.UnpaidDriver;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnpaidDriverService {
    @Resource
    UnpaidDriverMapper unpaidDriverMapper;

    public List<UnpaidDriver> unpaidDriverList(){
        return unpaidDriverMapper.getUnpaidDriver();
    }
}
