package com.dao;

import com.entity.MeishifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishifenleiVO;
import com.entity.view.MeishifenleiView;


/**
 * 美食分类
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:27:04
 */
public interface MeishifenleiDao extends BaseMapper<MeishifenleiEntity> {
	
	List<MeishifenleiVO> selectListVO(@Param("ew") Wrapper<MeishifenleiEntity> wrapper);
	
	MeishifenleiVO selectVO(@Param("ew") Wrapper<MeishifenleiEntity> wrapper);
	
	List<MeishifenleiView> selectListView(@Param("ew") Wrapper<MeishifenleiEntity> wrapper);

	List<MeishifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<MeishifenleiEntity> wrapper);
	
	MeishifenleiView selectView(@Param("ew") Wrapper<MeishifenleiEntity> wrapper);
	
}
