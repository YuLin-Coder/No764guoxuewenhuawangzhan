package com.entity.vo;

import com.entity.YinyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 音乐
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("yinyue")
public class YinyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
