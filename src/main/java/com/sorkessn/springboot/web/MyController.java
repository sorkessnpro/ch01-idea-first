package com.sorkessn.springboot.web;

import com.sorkessn.springboot.ObjectByMe.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/dosome")
    public ModelAndView dosome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","hello");
        mv.setViewName("springboot.jsp");
        return mv;
    }
}
