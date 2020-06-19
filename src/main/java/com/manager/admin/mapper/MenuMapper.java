package com.manager.admin.mapper;

import com.manager.admin.entity.MenuEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 主页菜单Mapper接口
 */
@Repository
public interface MenuMapper {

    /**
     * 获取所有菜单
     * @return
     */
    List<MenuEntity> listMenus();



}
