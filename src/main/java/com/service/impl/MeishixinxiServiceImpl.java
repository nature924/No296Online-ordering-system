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


import com.dao.MeishixinxiDao;
import com.entity.MeishixinxiEntity;
import com.service.MeishixinxiService;
import com.entity.vo.MeishixinxiVO;
import com.entity.view.MeishixinxiView;

@Service("meishixinxiService")
public class MeishixinxiServiceImpl extends ServiceImpl<MeishixinxiDao, MeishixinxiEntity> implements MeishixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishixinxiEntity> page = this.selectPage(
                new Query<MeishixinxiEntity>(params).getPage(),
                new EntityWrapper<MeishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishixinxiEntity> wrapper) {
		  Page<MeishixinxiView> page =new Query<MeishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishixinxiVO> selectListVO(Wrapper<MeishixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishixinxiVO selectVO(Wrapper<MeishixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishixinxiView> selectListView(Wrapper<MeishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishixinxiView selectView(Wrapper<MeishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
