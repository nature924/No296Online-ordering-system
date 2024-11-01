package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MeishipingjiaDao;
import com.entity.MeishipingjiaEntity;
import com.service.MeishipingjiaService;
import com.entity.vo.MeishipingjiaVO;
import com.entity.view.MeishipingjiaView;

@Service("meishipingjiaService")
public class MeishipingjiaServiceImpl extends ServiceImpl<MeishipingjiaDao, MeishipingjiaEntity> implements MeishipingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishipingjiaEntity> page = this.selectPage(
                new Query<MeishipingjiaEntity>(params).getPage(),
                new EntityWrapper<MeishipingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishipingjiaEntity> wrapper) {
		  Page<MeishipingjiaView> page =new Query<MeishipingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishipingjiaVO> selectListVO(Wrapper<MeishipingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishipingjiaVO selectVO(Wrapper<MeishipingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishipingjiaView> selectListView(Wrapper<MeishipingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishipingjiaView selectView(Wrapper<MeishipingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
