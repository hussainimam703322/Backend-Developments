package com.hussain.springbootweb_servlet_jsp;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        return "index.jsp";
    }

    //in servlet if we want to get data from client then we need to use http methods
    //when there are multiple pages, and we want to access then to maintain the data between the pages so we need something called session
    @RequestMapping("add")
    public String add(HttpServletRequest request, HttpSession session){

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        int result = num1 + num2;
        session.setAttribute("result",result);
        return "result.jsp";
    }



//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, Model model){
//        // if we not use same variable then it will give you error to resolve they will use @RequestMapping
//
//        int result = num1 + num2;
//        model.addAttribute("result",result);
//        return "result.jsp";
//    }


//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
//
//        // if we not use same variable then it will give you error to resolve they will use @RequestMapping
//        int result = num1 + num2;
//        mv.addObject("result",result);
//        mv.setViewName("result");
//        return mv;
//    }





}
