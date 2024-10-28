package com.dao;

import com.entity.WenxueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenxueView;

/**
 * 文学 Dao 接口
 *
 * @author 
 * @since 2021-04-07
 */
public interface WenxueDao extends BaseMapper<WenxueEntity> {

   List<WenxueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
