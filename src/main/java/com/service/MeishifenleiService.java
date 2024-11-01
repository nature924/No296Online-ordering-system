package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishifenleiView;


/**
 * 美食分类
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:27:04
 */
public interface MeishifenleiService extends IService<MeishifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishifenleiVO> selectListVO(Wrapper<MeishifenleiEntity> wrapper);
   	
   	MeishifenleiVO selectVO(@Param("ew") Wrapper<MeishifenleiEntity> wrapper);
   	
   	List<MeishifenleiView> selectListView(Wrapper<MeishifenleiEntity> wrapper);
   	
   	MeishifenleiView selectView(@Param("ew") Wrapper<MeishifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishifenleiEntity> wrapper);
   	
}

