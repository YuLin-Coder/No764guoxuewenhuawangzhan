package com.dao;

import com.entity.WudaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WudaoView;

/**
 * 舞蹈 Dao 接口
 *
 * @author 
 * @since 2021-04-07
 */
public interface WudaoDao extends BaseMapper<WudaoEntity> {

   List<WudaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
