package com.example.springbootwebdemouserdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    UserRepo repo;

    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
    @RequestMapping("login")
    public ModelAndView loginPage(String mobile, HttpSession session)
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("addData");
        session.setAttribute("user", mobile);
        mv.addObject("user",mobile);
        return mv;
    }
    @RequestMapping("addToDB")
    public ModelAndView addToDB(String id,String name, String age,String mobile ,String pwd,HttpSession session)
    {
        repo.save(new User(Integer.parseInt(id),name,age,pwd,mobile));
        ModelAndView mv=new ModelAndView();
        mv.setViewName("addData");
        mv.addObject("user",session.getAttribute("user"));
        mv.addObject("msg","Added Successfully");
        return mv;
    }
    @RequestMapping("search")
    public ModelAndView search(String query,HttpSession session)
    {
        List<User> list=repo.findByName(query);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("addData");
        if(list.size()>0) {
            mv.addObject("id", list.get(0).getId());
            mv.addObject("name", list.get(0).getName());
            mv.addObject("age", list.get(0).getAge());
            mv.addObject("mobile", list.get(0).getMobile());
            mv.addObject("pwd", list.get(0).getPwd());
        }
        mv.addObject("user",session.getAttribute("user"));
        mv.addObject("msg",""+list.size()+" result founds");
        return mv;
    }
}
