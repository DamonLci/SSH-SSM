package com.project.service;

import java.util.List;

import com.project.bean.GoodsBean;

public interface IGoodsService {
	/**
	 * ��ѯ���е���Ʒ
	 * @return
	 */
	public List<GoodsBean> findAllGoods();
	
	/**
	 * ͨ����Ʒid��ȡ����Ʒ��Ϣ
	 * @param id
	 * @return
	 */
	public GoodsBean findById(int id);
}
