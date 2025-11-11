package com.example.demo.Mappers;

import com.example.demo.ResultMapEntities.UnpaidDriver;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UnpaidDriverMapper {

    List<UnpaidDriver> getUnpaidDriver();
}
