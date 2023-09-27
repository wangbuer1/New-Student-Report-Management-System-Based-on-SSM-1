package com.entity.view;

import com.entity.BaodaozhinanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报道指南
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
@TableName("baodaozhinan")
public class BaodaozhinanView  extends BaodaozhinanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaodaozhinanView(){
	}
 
 	public BaodaozhinanView(BaodaozhinanEntity baodaozhinanEntity){
 	try {
			BeanUtils.copyProperties(this, baodaozhinanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
