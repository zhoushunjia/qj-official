package com.stylefeng.guns.modular.system.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stylefeng.guns.common.persistence.dao.OperationLogMapper;
import com.stylefeng.guns.core.base.controller.BaseController;
import com.stylefeng.guns.modular.system.dao.LogDao;

/**
 * 
 *
 * @author fengshuonan
 * @Date 2017年4月5日 19:45:36
 */
@Controller
public class HomeController extends BaseController {

	private String PREFIX = "/system/";

    @Resource
    private OperationLogMapper operationLogMapper;

    @Resource
    private LogDao logDao;
    
    @RequestMapping(value = "/contactUs", method = RequestMethod.GET)
    public String contactUs(Model model) {

        return PREFIX + "/contactUs.html";
    }
    @RequestMapping(value = "/team", method = RequestMethod.GET)
    public String team(Model model) {

        return PREFIX + "/team.html";
    }
    @RequestMapping(value = "/serviceContent", method = RequestMethod.GET)
    public String serviceContent(Model model) {

        return PREFIX + "/serviceContent.html";
    }
    @RequestMapping(value = "/FAQ", method = RequestMethod.GET)
    public String FAQ(Model model) {

        return PREFIX + "/FAQ.html";
    }
    @RequestMapping(value = "/aboutUs", method = RequestMethod.GET)
    public String aboutUs(Model model) {

        return PREFIX + "/aboutUs.html";
    }
}
