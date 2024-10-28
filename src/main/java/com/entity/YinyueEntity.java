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
 * 音乐
 *
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("yinyue")
public class YinyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YinyueEntity() {

	}

	public YinyueEntity(T t) {
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
     * 音乐名
     */
    @TableField(value = "yinyue_name")

    private String yinyueName;


    /**
     * 音乐封面
     */
    @TableField(value = "yinyue_photo")

    private String yinyuePhoto;


    /**
     * 音乐文件
     */
    @TableField(value = "yinyue_music")

    private String yinyueMusic;


    /**
     * 音乐详情
     */
    @TableField(value = "yinyue_content")

    private String yinyueContent;


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
	 * 设置：音乐名
	 */
    public String getYinyueName() {
        return yinyueName;
    }


    /**
	 * 获取：音乐名
	 */

    public void setYinyueName(String yinyueName) {
        this.yinyueName = yinyueName;
    }
    /**
	 * 设置：音乐封面
	 */
    public String getYinyuePhoto() {
        return yinyuePhoto;
    }


    /**
	 * 获取：音乐封面
	 */

    public void setYinyuePhoto(String yinyuePhoto) {
        this.yinyuePhoto = yinyuePhoto;
    }
    /**
	 * 设置：音乐文件
	 */
    public String getYinyueMusic() {
        return yinyueMusic;
    }


    /**
	 * 获取：音乐文件
	 */

    public void setYinyueMusic(String yinyueMusic) {
        this.yinyueMusic = yinyueMusic;
    }
    /**
	 * 设置：音乐详情
	 */
    public String getYinyueContent() {
        return yinyueContent;
    }


    /**
	 * 获取：音乐详情
	 */

    public void setYinyueContent(String yinyueContent) {
        this.yinyueContent = yinyueContent;
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
        return "Yinyue{" +
            "id=" + id +
            ", yinyueName=" + yinyueName +
            ", yinyuePhoto=" + yinyuePhoto +
            ", yinyueMusic=" + yinyueMusic +
            ", yinyueContent=" + yinyueContent +
            ", createTime=" + createTime +
        "}";
    }
}
