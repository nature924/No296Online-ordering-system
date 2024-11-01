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


import com.dao.MeishidianDao;
import com.entity.MeishidianEntity;
import com.service.MeishidianService;
import com.entity.vo.MeishidianVO;
import com.entity.view.MeishidianView;

@Service("meishidianService")
public class MeishidianServiceImpl extends ServiceImpl<MeishidianDao, MeishidianEntity> implements MeishidianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishidianEntity> page = this.selectPage(
                new Query<MeishidianEntity>(params).getPage(),
                new EntityWrapper<MeishidianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishidianEntity> wrapper) {
		  Page<MeishidianView> page =new Query<MeishidianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishidianVO> selectListVO(Wrapper<MeishidianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishidianVO selectVO(Wrapper<MeishidianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishidianView> selectListView(Wrapper<MeishidianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishidianView selectView(Wrapper<MeishidianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
