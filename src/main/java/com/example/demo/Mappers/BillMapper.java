package com.example.demo.Mappers;

import com.example.demo.Entities.Bill;
import com.example.demo.ResultMapEntities.ActiveVehicle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillMapper {

    List<Bill> getBillTable();
}
