package com.manager.admin.controller;

import com.manager.admin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 主页菜单控制层
 */
@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;

    /**
     * 获取菜单
     * @return
     */
    @RequestMapping("/listMenus")
    @ResponseBody
    public Map<String,Object> ListMenus(){
        Map<String,Object> map = new HashMap<>();
        try {
            map = this.menuService.ListMenus();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
