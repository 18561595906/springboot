package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BigDataFirstDistricts;
import com.example.demo.service.IBigDataFirstDistrictsService;

import lombok.extern.slf4j.Slf4j;

 /**
 * @Description: 一级表--区县维度表
 * @Author: jeecg-boot
 * @Date:   2021-10-21
 * @Version: V1.0
 */

@RestController
@RequestMapping("/first/bigDataFirstDistricts")
@Slf4j
public class BigDataFirstDistrictsController {
	@Autowired
	private IBigDataFirstDistrictsService bigDataFirstDistrictsService;
	
	 @GetMapping(value = "/queryDeimensionList")
	 public int queryDeimensionList() {
		 int deimension=0;
		 deimension = bigDataFirstDistrictsService.selectMaxNum();
		 return deimension;
	 }
	 
	 
	
		  @GetMapping(value = "/selectDeimensionInfo") public String queryDeimension(){ 
		  String deimension=""; 
		  BigDataFirstDistricts bigDataFirstDistricts = new BigDataFirstDistricts();
		  bigDataFirstDistricts.setId("330a17d7fde14fba9aa54bd08103b089");
		  bigDataFirstDistricts = bigDataFirstDistrictsService.selectByModel(bigDataFirstDistricts); 
		  deimension = bigDataFirstDistricts.getDeimension(); 
		  return deimension; 
		  }
		 
}
