package com.entity.model;

import com.entity.HuihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 绘画
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-07
 */
public class HuihuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 绘画名
     */
    private String huihuaName;


    /**
     * 绘画图片
     */
    private String huihuaPhoto;


    /**
     * 绘画内容
     */
    private String huihuaContent;


    /**
     * 绘画时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：绘画名
	 */
    public String getHuihuaName() {
        return huihuaName;
    }


    /**
	 * 设置：绘画名
	 */
    public void setHuihuaName(String huihuaName) {
        this.huihuaName = huihuaName;
    }
    /**
	 * 获取：绘画图片
	 */
    public String getHuihuaPhoto() {
        return huihuaPhoto;
    }


    /**
	 * 设置：绘画图片
	 */
    public void setHuihuaPhoto(String huihuaPhoto) {
        this.huihuaPhoto = huihuaPhoto;
    }
    /**
	 * 获取：绘画内容
	 */
    public String getHuihuaContent() {
        return huihuaContent;
    }


    /**
	 * 设置：绘画内容
	 */
    public void setHuihuaContent(String huihuaContent) {
        this.huihuaContent = huihuaContent;
    }
    /**
	 * 获取：绘画时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：绘画时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
