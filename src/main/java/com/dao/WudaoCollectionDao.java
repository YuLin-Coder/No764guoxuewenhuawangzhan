package com.dao;

import com.entity.WudaoCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WudaoCollectionView;

/**
 * 舞蹈收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-07
 */
public interface WudaoCollectionDao extends BaseMapper<WudaoCollectionEntity> {

   List<WudaoCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
