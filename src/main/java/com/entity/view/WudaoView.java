package com.entity.view;

import com.entity.WudaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 舞蹈
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("wudao")
public class WudaoView extends WudaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public WudaoView() {

	}

	public WudaoView(WudaoEntity wudaoEntity) {
		try {
			BeanUtils.copyProperties(this, wudaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}















}
