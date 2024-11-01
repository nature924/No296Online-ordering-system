package com.dao;

import com.entity.MeishidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishidingdanVO;
import com.entity.view.MeishidingdanView;


/**
 * 美食订单
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:27:04
 */
public interface MeishidingdanDao extends BaseMapper<MeishidingdanEntity> {
	
	List<MeishidingdanVO> selectListVO(@Param("ew") Wrapper<MeishidingdanEntity> wrapper);
	
	MeishidingdanVO selectVO(@Param("ew") Wrapper<MeishidingdanEntity> wrapper);
	
	List<MeishidingdanView> selectListView(@Param("ew") Wrapper<MeishidingdanEntity> wrapper);

	List<MeishidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<MeishidingdanEntity> wrapper);
	
	MeishidingdanView selectView(@Param("ew") Wrapper<MeishidingdanEntity> wrapper);
	
}
