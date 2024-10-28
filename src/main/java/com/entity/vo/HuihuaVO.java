package com.entity.vo;

import com.entity.HuihuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 绘画
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("huihua")
public class HuihuaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 绘画名
     */

    @TableField(value = "huihua_name")
    private String huihuaName;


    /**
     * 绘画图片
     */

    @TableField(value = "huihua_photo")
    private String huihuaPhoto;


    /**
     * 绘画内容
     */

    @TableField(value = "huihua_content")
    private String huihuaContent;


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
	 * 设置：绘画名
	 */
    public String getHuihuaName() {
        return huihuaName;
    }


    /**
	 * 获取：绘画名
	 */

    public void setHuihuaName(String huihuaName) {
        this.huihuaName = huihuaName;
    }
    /**
	 * 设置：绘画图片
	 */
    public String getHuihuaPhoto() {
        return huihuaPhoto;
    }


    /**
	 * 获取：绘画图片
	 */

    public void setHuihuaPhoto(String huihuaPhoto) {
        this.huihuaPhoto = huihuaPhoto;
    }
    /**
	 * 设置：绘画内容
	 */
    public String getHuihuaContent() {
        return huihuaContent;
    }


    /**
	 * 获取：绘画内容
	 */

    public void setHuihuaContent(String huihuaContent) {
        this.huihuaContent = huihuaContent;
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
