package com.entity.model;

import com.entity.YinyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 音乐
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-07
 */
public class YinyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：音乐名
	 */
    public String getYinyueName() {
        return yinyueName;
    }


    /**
	 * 设置：音乐名
	 */
    public void setYinyueName(String yinyueName) {
        this.yinyueName = yinyueName;
    }
    /**
	 * 获取：音乐封面
	 */
    public String getYinyuePhoto() {
        return yinyuePhoto;
    }


    /**
	 * 设置：音乐封面
	 */
    public void setYinyuePhoto(String yinyuePhoto) {
        this.yinyuePhoto = yinyuePhoto;
    }
    /**
	 * 获取：音乐文件
	 */
    public String getYinyueMusic() {
        return yinyueMusic;
    }


    /**
	 * 设置：音乐文件
	 */
    public void setYinyueMusic(String yinyueMusic) {
        this.yinyueMusic = yinyueMusic;
    }
    /**
	 * 获取：音乐详情
	 */
    public String getYinyueContent() {
        return yinyueContent;
    }


    /**
	 * 设置：音乐详情
	 */
    public void setYinyueContent(String yinyueContent) {
        this.yinyueContent = yinyueContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
