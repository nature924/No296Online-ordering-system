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


import com.dao.MeishidingdanDao;
import com.entity.MeishidingdanEntity;
import com.service.MeishidingdanService;
import com.entity.vo.MeishidingdanVO;
import com.entity.view.MeishidingdanView;

@Service("meishidingdanService")
public class MeishidingdanServiceImpl extends ServiceImpl<MeishidingdanDao, MeishidingdanEntity> implements MeishidingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishidingdanEntity> page = this.selectPage(
                new Query<MeishidingdanEntity>(params).getPage(),
                new EntityWrapper<MeishidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishidingdanEntity> wrapper) {
		  Page<MeishidingdanView> page =new Query<MeishidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishidingdanVO> selectListVO(Wrapper<MeishidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishidingdanVO selectVO(Wrapper<MeishidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishidingdanView> selectListView(Wrapper<MeishidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishidingdanView selectView(Wrapper<MeishidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
