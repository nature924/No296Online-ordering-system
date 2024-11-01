package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishidianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishidianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishidianView;


/**
 * 美食店
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:27:04
 */
public interface MeishidianService extends IService<MeishidianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishidianVO> selectListVO(Wrapper<MeishidianEntity> wrapper);
   	
   	MeishidianVO selectVO(@Param("ew") Wrapper<MeishidianEntity> wrapper);
   	
   	List<MeishidianView> selectListView(Wrapper<MeishidianEntity> wrapper);
   	
   	MeishidianView selectView(@Param("ew") Wrapper<MeishidianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishidianEntity> wrapper);
   	
}

