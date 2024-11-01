package com.dao;

import com.entity.MeishipingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishipingjiaVO;
import com.entity.view.MeishipingjiaView;


/**
 * 美食评价
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:27:04
 */
public interface MeishipingjiaDao extends BaseMapper<MeishipingjiaEntity> {
	
	List<MeishipingjiaVO> selectListVO(@Param("ew") Wrapper<MeishipingjiaEntity> wrapper);
	
	MeishipingjiaVO selectVO(@Param("ew") Wrapper<MeishipingjiaEntity> wrapper);
	
	List<MeishipingjiaView> selectListView(@Param("ew") Wrapper<MeishipingjiaEntity> wrapper);

	List<MeishipingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<MeishipingjiaEntity> wrapper);
	
	MeishipingjiaView selectView(@Param("ew") Wrapper<MeishipingjiaEntity> wrapper);
	
}
