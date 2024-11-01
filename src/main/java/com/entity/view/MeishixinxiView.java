package com.entity.view;

import com.entity.MeishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 15:27:04
 */
@TableName("meishixinxi")
public class MeishixinxiView  extends MeishixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeishixinxiView(){
	}
 
 	public MeishixinxiView(MeishixinxiEntity meishixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, meishixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
