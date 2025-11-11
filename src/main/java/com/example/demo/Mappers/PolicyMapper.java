package com.example.demo.Mappers;

import com.example.demo.Entities.Policy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PolicyMapper {

    List<Policy> getPolicyTable();
}
