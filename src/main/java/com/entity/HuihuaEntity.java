package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 绘画
 *
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("huihua")
public class HuihuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuihuaEntity() {

	}

	public HuihuaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Huihua{" +
            "id=" + id +
            ", huihuaName=" + huihuaName +
            ", huihuaPhoto=" + huihuaPhoto +
            ", huihuaContent=" + huihuaContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
