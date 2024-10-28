package com.entity.model;

import com.entity.WudaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 舞蹈
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-07
 */
public class WudaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
	 * 获取：舞蹈名
	 */
    public String getWudaoName() {
        return wudaoName;
    }


    /**
	 * 设置：舞蹈名
	 */
    public void setWudaoName(String wudaoName) {
        this.wudaoName = wudaoName;
    }
    /**
	 * 获取：舞蹈图片
	 */
    public String getWudaoPhoto() {
        return wudaoPhoto;
    }


    /**
	 * 设置：舞蹈图片
	 */
    public void setWudaoPhoto(String wudaoPhoto) {
        this.wudaoPhoto = wudaoPhoto;
    }
    /**
	 * 获取：舞蹈视频
	 */
    public String getWudaoVideo() {
        return wudaoVideo;
    }


    /**
	 * 设置：舞蹈视频
	 */
    public void setWudaoVideo(String wudaoVideo) {
        this.wudaoVideo = wudaoVideo;
    }
    /**
	 * 获取：舞蹈详情
	 */
    public String getWudaoContent() {
        return wudaoContent;
    }


    /**
	 * 设置：舞蹈详情
	 */
    public void setWudaoContent(String wudaoContent) {
        this.wudaoContent = wudaoContent;
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
