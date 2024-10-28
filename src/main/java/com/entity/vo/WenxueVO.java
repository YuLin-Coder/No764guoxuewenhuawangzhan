package com.entity.vo;

import com.entity.WenxueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 文学
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("wenxue")
public class WenxueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 文学名
     */

    @TableField(value = "wenxue_name")
    private String wenxueName;


    /**
     * 文学图片
     */

    @TableField(value = "wenxue_photo")
    private String wenxuePhoto;


    /**
     * 文学内容
     */

    @TableField(value = "wenxue_content")
    private String wenxueContent;


    /**
     * 绘画时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：文学名
	 */
    public String getWenxueName() {
        return wenxueName;
    }


    /**
	 * 获取：文学名
	 */

    public void setWenxueName(String wenxueName) {
        this.wenxueName = wenxueName;
    }
    /**
	 * 设置：文学图片
	 */
    public String getWenxuePhoto() {
        return wenxuePhoto;
    }


    /**
	 * 获取：文学图片
	 */

    public void setWenxuePhoto(String wenxuePhoto) {
        this.wenxuePhoto = wenxuePhoto;
    }
    /**
	 * 设置：文学内容
	 */
    public String getWenxueContent() {
        return wenxueContent;
    }


    /**
	 * 获取：文学内容
	 */

    public void setWenxueContent(String wenxueContent) {
        this.wenxueContent = wenxueContent;
    }
    /**
	 * 设置：绘画时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：绘画时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
