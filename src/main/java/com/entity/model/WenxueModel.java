package com.entity.model;

import com.entity.WenxueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 文学
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-07
 */
public class WenxueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 文学名
     */
    private String wenxueName;


    /**
     * 文学图片
     */
    private String wenxuePhoto;


    /**
     * 文学内容
     */
    private String wenxueContent;


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
	 * 获取：文学名
	 */
    public String getWenxueName() {
        return wenxueName;
    }


    /**
	 * 设置：文学名
	 */
    public void setWenxueName(String wenxueName) {
        this.wenxueName = wenxueName;
    }
    /**
	 * 获取：文学图片
	 */
    public String getWenxuePhoto() {
        return wenxuePhoto;
    }


    /**
	 * 设置：文学图片
	 */
    public void setWenxuePhoto(String wenxuePhoto) {
        this.wenxuePhoto = wenxuePhoto;
    }
    /**
	 * 获取：文学内容
	 */
    public String getWenxueContent() {
        return wenxueContent;
    }


    /**
	 * 设置：文学内容
	 */
    public void setWenxueContent(String wenxueContent) {
        this.wenxueContent = wenxueContent;
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
