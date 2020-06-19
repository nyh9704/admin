package com.manager.admin.service.serviceImpl;

import com.manager.admin.entity.MenuEntity;
import com.manager.admin.mapper.MenuMapper;
import com.manager.admin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 主页菜单服务层实现层
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    /**
     * 获取所有菜单
     * @return
     */
    @Override
    public Map<String, Object> ListMenus() {
        Map<String,Object> map = new HashMap<>();
        List<MenuEntity> list =  this.menuMapper.listMenus();
         map.put("result",list);
        return map;
    }
}
