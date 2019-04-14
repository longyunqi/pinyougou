package com.pingyougou.sellergoods.service;



import java.util.List;

import com.pinyougou.pojo.TbBrand;

public interface BrandService {
/**
 * 这是卖家的接口，可以查询出所有的品牌列表
 */
	public List<TbBrand> findAll();
}
