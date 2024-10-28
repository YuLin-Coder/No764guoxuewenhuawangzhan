package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuihuaEntity;
import java.util.Map;

/**
 * 绘画 服务类
 * @author 
 * @since 2021-04-07
 */
public interface HuihuaService extends IService<HuihuaEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}