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


import com.dao.MeishifenleiDao;
import com.entity.MeishifenleiEntity;
import com.service.MeishifenleiService;
import com.entity.vo.MeishifenleiVO;
import com.entity.view.MeishifenleiView;

@Service("meishifenleiService")
public class MeishifenleiServiceImpl extends ServiceImpl<MeishifenleiDao, MeishifenleiEntity> implements MeishifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishifenleiEntity> page = this.selectPage(
                new Query<MeishifenleiEntity>(params).getPage(),
                new EntityWrapper<MeishifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishifenleiEntity> wrapper) {
		  Page<MeishifenleiView> page =new Query<MeishifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishifenleiVO> selectListVO(Wrapper<MeishifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishifenleiVO selectVO(Wrapper<MeishifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishifenleiView> selectListView(Wrapper<MeishifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishifenleiView selectView(Wrapper<MeishifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
