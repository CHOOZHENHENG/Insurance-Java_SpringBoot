package com.example.demo.Controllers;

import com.example.demo.Result;
import com.example.demo.Services.DriverService;
import com.example.demo.Services.VehicleService;
import com.example.demo.Services.BillService;
import com.example.demo.Services.PolicyService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinalRestController {

    @Resource
    private PolicyService policyService;

    @Resource
    private DriverService driverService;

    @Resource
    private VehicleService vehicleService;

    @Resource
    private BillService billService;

    //4 APIs
    @GetMapping(path = "/policy")
    private Result PolicyList() {
        return policyService.policyList();
    }

    @GetMapping(path = "/driver")
    private Result DriverList() {
        return driverService.driverList();
    }

    @GetMapping(path = "/vehicle")
    private Result VehicleList() {
        return vehicleService.vehicleList();
    }

    @GetMapping(path = "/bill")
    private Result BillList() {
        return billService.billList();
    }
}
