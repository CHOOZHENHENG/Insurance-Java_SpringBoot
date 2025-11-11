package com.example.demo.Mappers;

import com.example.demo.ResultMapEntities.ActiveVehicle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActiveVehicleMapper {

    List<ActiveVehicle> getActiveVehicle();
}
