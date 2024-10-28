package com.entity.view;

import com.entity.YinyueCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 音乐收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("yinyue_collection")
public class YinyueCollectionView extends YinyueCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yinyue
			/**
			* 音乐名
			*/
			private String yinyueName;
			/**
			* 音乐封面
			*/
			private String yinyuePhoto;
			/**
			* 音乐文件
			*/
			private String yinyueMusic;
			/**
			* 音乐详情
			*/
			private String yinyueContent;

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

	public YinyueCollectionView() {

	}

	public YinyueCollectionView(YinyueCollectionEntity yinyueCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, yinyueCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set yinyue
					/**
					* 获取： 音乐名
					*/
					public String getYinyueName() {
						return yinyueName;
					}
					/**
					* 设置： 音乐名
					*/
					public void setYinyueName(String yinyueName) {
						this.yinyueName = yinyueName;
					}
					/**
					* 获取： 音乐封面
					*/
					public String getYinyuePhoto() {
						return yinyuePhoto;
					}
					/**
					* 设置： 音乐封面
					*/
					public void setYinyuePhoto(String yinyuePhoto) {
						this.yinyuePhoto = yinyuePhoto;
					}
					/**
					* 获取： 音乐文件
					*/
					public String getYinyueMusic() {
						return yinyueMusic;
					}
					/**
					* 设置： 音乐文件
					*/
					public void setYinyueMusic(String yinyueMusic) {
						this.yinyueMusic = yinyueMusic;
					}
					/**
					* 获取： 音乐详情
					*/
					public String getYinyueContent() {
						return yinyueContent;
					}
					/**
					* 设置： 音乐详情
					*/
					public void setYinyueContent(String yinyueContent) {
						this.yinyueContent = yinyueContent;
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
