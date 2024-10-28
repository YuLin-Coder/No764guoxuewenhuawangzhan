package com.dao;

import com.entity.HuihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuihuaView;

/**
 * 绘画 Dao 接口
 *
 * @author 
 * @since 2021-04-07
 */
public interface HuihuaDao extends BaseMapper<HuihuaEntity> {

   List<HuihuaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
