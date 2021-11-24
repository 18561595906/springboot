package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.BigDataFirstDistricts;

/**
 * @Description: 一级表--区县维度表
 * @Author: jeecg-boot
 * @Date:   2021-10-19
 * @Version: V1.0
 */
public interface IBigDataFirstDistrictsService extends IService<BigDataFirstDistricts> {


	int selectMaxNum();
	BigDataFirstDistricts selectByModel(BigDataFirstDistricts bigDataFirstDistricts);

}
