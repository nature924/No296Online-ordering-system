package com.dao;

import com.entity.MeishidianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishidianVO;
import com.entity.view.MeishidianView;


/**
 * 美食店
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:27:04
 */
public interface MeishidianDao extends BaseMapper<MeishidianEntity> {
	
	List<MeishidianVO> selectListVO(@Param("ew") Wrapper<MeishidianEntity> wrapper);
	
	MeishidianVO selectVO(@Param("ew") Wrapper<MeishidianEntity> wrapper);
	
	List<MeishidianView> selectListView(@Param("ew") Wrapper<MeishidianEntity> wrapper);

	List<MeishidianView> selectListView(Pagination page,@Param("ew") Wrapper<MeishidianEntity> wrapper);
	
	MeishidianView selectView(@Param("ew") Wrapper<MeishidianEntity> wrapper);
	
}
