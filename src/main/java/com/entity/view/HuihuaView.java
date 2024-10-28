package com.entity.view;

import com.entity.HuihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 绘画
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("huihua")
public class HuihuaView extends HuihuaEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public HuihuaView() {

	}

	public HuihuaView(HuihuaEntity huihuaEntity) {
		try {
			BeanUtils.copyProperties(this, huihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}















}
