package com.vmc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.vmc.pojo.Device;

public class DeviceController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> addDevice(@RequestBody Device device)
	{

		System.out.println("DeviceController.addDevice");
//	    logger.info("新增");
//	    logger.info("捕获到前台传递过来的Model，名称为："+User.);
//	    Map<String, String> map = new HashMap<String, String>(1);
//	    map.put("success", "true");
//	    return map;
		return null;
	}
}
