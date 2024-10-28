package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.WudaoCollectionDao;
import com.entity.WudaoCollectionEntity;
import com.service.WudaoCollectionService;
import com.entity.view.WudaoCollectionView;

/**
 * 舞蹈收藏 服务实现类
 * @author 
 * @since 2021-04-07
 */
@Service("wudaoCollectionService")
@Transactional
public class WudaoCollectionServiceImpl extends ServiceImpl<WudaoCollectionDao, WudaoCollectionEntity> implements WudaoCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<WudaoCollectionView> page =new Query<WudaoCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
