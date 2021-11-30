package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BigDataFirstDistricts;
import com.example.demo.service.IBigDataFirstDistrictsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

 /**
 * @Description: 一级表--区县维度表
 * @Author: jeecg-boot
 * @Date:   2021-10-21
 * @Version: V1.0
 */

@RestController
@Api(value = "朦胧的夜的测试接口")
@RequestMapping("/first/bigDataFirstDistricts")

@Slf4j
public class BigDataFirstDistrictsController {
	@Autowired
	private IBigDataFirstDistrictsService bigDataFirstDistrictsService;
	
	
	 @GetMapping(value = "/queryDeimensionList")
	 @ApiOperation(value="单独一个入参测试接口", notes="接口描述，例如：只能输入‘朦胧的夜’")
	 public int queryDeimensionList() {
		 int deimension=0;
		 deimension = bigDataFirstDistrictsService.selectMaxNum();
		 return deimension;
	 }
	 
	 
	
		  @GetMapping(value = "/selectDeimensionInfo")
		  @ApiOperation(value="单独一个入参测试接口112345", notes="接口描述，例如：只能输入‘朦胧的夜’112345")
		  public String queryDeimension(){ 
		  String deimension=""; 
		  BigDataFirstDistricts bigDataFirstDistricts = new BigDataFirstDistricts();
		  bigDataFirstDistricts.setId("330a17d7fde14fba9aa54bd08103b089");
		  bigDataFirstDistricts = bigDataFirstDistrictsService.selectByModel(bigDataFirstDistricts); 
		  deimension = bigDataFirstDistricts.getDeimension(); 
		  return deimension; 
		  }
		 
}
