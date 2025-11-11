package com.example.demo.Controllers;

import com.example.demo.Result;
import com.example.demo.Services.*;
import com.example.demo.SummaryAPI;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FinalController {

    @Resource
    private SummaryApiService summaryApiService;

    @Resource
    private UnpaidDriverService unpaidDriverService;

    @Resource
    private ActiveVehicleService activeVehicleService;

    @GetMapping(path = "/summaryAPI")
    public String SummaryAPI(Model model){
        model.addAttribute("summaryList",
                SummaryAPI.summaryAPI(
                        summaryApiService.vehicleMakeCountList(),
                        summaryApiService.violationPointPerStateList(),
                        summaryApiService.violationPointPerDriverList(),
                        summaryApiService.policiesCreatedPerYearList()));
        return "summaryApiView";
    }

    @GetMapping(path = "/activeVehicle")
    private String ActiveVehicleList(Model model){
        model.addAttribute("activeVehicleList",
                Result.success(activeVehicleService.activeVehicleList()).getData());
        return "activeVehicleView";
    }

    @GetMapping(path = "/unpaidDriver")
    private ModelAndView UnpaidDriverList(){
        ModelAndView mav = new ModelAndView("unpaidDriverView");
        mav.addObject("unpaidDriverList",
               Result.success(unpaidDriverService.unpaidDriverList()).getData());
        return mav;
    }
}
