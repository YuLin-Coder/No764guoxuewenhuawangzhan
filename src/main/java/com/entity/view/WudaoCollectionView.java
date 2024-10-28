package com.entity.view;

import com.entity.WudaoCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 舞蹈收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("wudao_collection")
public class WudaoCollectionView extends WudaoCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 wudao
			/**
			* 舞蹈名
			*/
			private String wudaoName;
			/**
			* 舞蹈图片
			*/
			private String wudaoPhoto;
			/**
			* 舞蹈视频
			*/
			private String wudaoVideo;
			/**
			* 舞蹈详情
			*/
			private String wudaoContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户性别
			*/
			private Integer sexTypes;
				/**
				* 用户性别的值
				*/
				private String sexValue;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;

	public WudaoCollectionView() {

	}

	public WudaoCollectionView(WudaoCollectionEntity wudaoCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, wudaoCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set wudao
					/**
					* 获取： 舞蹈名
					*/
					public String getWudaoName() {
						return wudaoName;
					}
					/**
					* 设置： 舞蹈名
					*/
					public void setWudaoName(String wudaoName) {
						this.wudaoName = wudaoName;
					}
					/**
					* 获取： 舞蹈图片
					*/
					public String getWudaoPhoto() {
						return wudaoPhoto;
					}
					/**
					* 设置： 舞蹈图片
					*/
					public void setWudaoPhoto(String wudaoPhoto) {
						this.wudaoPhoto = wudaoPhoto;
					}
					/**
					* 获取： 舞蹈视频
					*/
					public String getWudaoVideo() {
						return wudaoVideo;
					}
					/**
					* 设置： 舞蹈视频
					*/
					public void setWudaoVideo(String wudaoVideo) {
						this.wudaoVideo = wudaoVideo;
					}
					/**
					* 获取： 舞蹈详情
					*/
					public String getWudaoContent() {
						return wudaoContent;
					}
					/**
					* 设置： 舞蹈详情
					*/
					public void setWudaoContent(String wudaoContent) {
						this.wudaoContent = wudaoContent;
					}













				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 用户性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 用户性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 用户性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}



}
