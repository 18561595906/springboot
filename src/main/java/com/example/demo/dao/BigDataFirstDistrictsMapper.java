package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.BigDataFirstDistricts;

/**
 * @Description: 一级表--区县维度表
 * @Author: jeecg-boot
 * @Date:   2021-10-18
 * @Version: V1.0
 */

@Mapper
public interface BigDataFirstDistrictsMapper {

	int selectMaxNum();
	BigDataFirstDistricts selectByModel(BigDataFirstDistricts bigDataFirstDistricts);
}

