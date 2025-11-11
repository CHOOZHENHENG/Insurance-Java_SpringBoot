package com.example.demo.Services;

import com.example.demo.Mappers.PolicyMapper;
import com.example.demo.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
    @Resource
    private PolicyMapper policyMapper;

    public Result policyList(){
        return Result.success(policyMapper.getPolicyTable());
    }
}
