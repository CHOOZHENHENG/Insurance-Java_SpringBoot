package com.example.demo.Services;

import com.example.demo.Mappers.BillMapper;
import com.example.demo.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    @Resource
    private BillMapper billMapper;

    public Result billList(){
        return Result.success(billMapper.getBillTable());
    }
}
