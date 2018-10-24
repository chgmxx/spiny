package com.gioov.spiny.user.controller;

import com.gioov.spiny.common.constant.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.gioov.spiny.user.service.UserService.SYSTEM_ADMIN;

/**
 * @author godcheese
 * @date 2018-02-22
 */
@Controller
@RequestMapping(Page.User.VIEW_MENU)
public class ViewMenuController {

    @PreAuthorize("hasRole('" + SYSTEM_ADMIN + "') OR hasAuthority('/USER/VIEW_MENU/PAGE_ALL')")
    @RequestMapping("/page_all")
    public String pageAll() {
        return Page.User.VIEW_MENU + "/page_all";
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/add_dialog")
    public String addDialog() {
        return Page.User.VIEW_MENU + "/add_dialog";
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/edit_dialog")
    public String editDialog() {
        return Page.User.VIEW_MENU + "/edit_dialog";
    }
}
