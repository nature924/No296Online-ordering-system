package com.entity.view;

import com.entity.MeishidianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食店
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 15:27:04
 */
@TableName("meishidian")
public class MeishidianView  extends MeishidianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeishidianView(){
	}
 
 	public MeishidianView(MeishidianEntity meishidianEntity){
 	try {
			BeanUtils.copyProperties(this, meishidianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
