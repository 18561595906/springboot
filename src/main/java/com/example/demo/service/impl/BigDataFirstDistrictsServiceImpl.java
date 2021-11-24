package com.example.demo.service.impl;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.dao.BigDataFirstDistrictsMapper;
import com.example.demo.entity.BigDataFirstDistricts;
import com.example.demo.service.IBigDataFirstDistrictsService;


/**
 * @Description: 一级表--区县维度表
 * @Author: jeecg-boot
 * @Date:   2021-10-19
 * @Version: V1.0
 */
@Service
public class BigDataFirstDistrictsServiceImpl  implements IBigDataFirstDistrictsService {
    @Autowired
    private BigDataFirstDistrictsMapper bigDataFirstDistrictsMapper;

	@Override
	public int selectMaxNum() {
		return bigDataFirstDistrictsMapper.selectMaxNum();
	}

	@Override
	public boolean saveBatch(Collection<BigDataFirstDistricts> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveOrUpdateBatch(Collection<BigDataFirstDistricts> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBatchById(Collection<BigDataFirstDistricts> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveOrUpdate(BigDataFirstDistricts entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BigDataFirstDistricts getOne(Wrapper<BigDataFirstDistricts> queryWrapper, boolean throwEx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getMap(Wrapper<BigDataFirstDistricts> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <V> V getObj(Wrapper<BigDataFirstDistricts> queryWrapper, Function<? super Object, V> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseMapper<BigDataFirstDistricts> getBaseMapper() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<BigDataFirstDistricts> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

	
	  @Override public BigDataFirstDistricts selectByModel(BigDataFirstDistricts bigDataFirstDistricts) { 
		  return bigDataFirstDistrictsMapper.selectByModel(bigDataFirstDistricts); 
	  }
	




}
