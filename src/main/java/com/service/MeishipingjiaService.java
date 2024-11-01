package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishipingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishipingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishipingjiaView;


/**
 * 美食评价
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:27:04
 */
public interface MeishipingjiaService extends IService<MeishipingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishipingjiaVO> selectListVO(Wrapper<MeishipingjiaEntity> wrapper);
   	
   	MeishipingjiaVO selectVO(@Param("ew") Wrapper<MeishipingjiaEntity> wrapper);
   	
   	List<MeishipingjiaView> selectListView(Wrapper<MeishipingjiaEntity> wrapper);
   	
   	MeishipingjiaView selectView(@Param("ew") Wrapper<MeishipingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishipingjiaEntity> wrapper);
   	
}

