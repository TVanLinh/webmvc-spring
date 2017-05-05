package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linhtran on 03/05/2017.
 */

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello()
    {
        System.out.println("HelloHere!");
        return "hello";
    }


    @RequestMapping(value = "/listuser",method = RequestMethod.GET)
    public String listUser(ModelMap modelMap)
    {
        System.out.println("ok");
        List<User> list=new ArrayList<User>();
        list.add(new User("Tran Van Linh","123456"));
        list.add(new User("Tran Van Tai","123456"));
        list.add(new User("Tran Van Bao","123456"));
        list.add(new User("Tran Van Tung","123456"));
        modelMap.put("listUser",list);
        return "listuser";
    }

    //url hellocontroller/hienthi/content
    @RequestMapping(value = "/hienthi/{content}",method = RequestMethod.GET)
    public  String hienThi(@PathVariable(value = "content")String content,ModelMap modelMap)
    {
        modelMap.put("content",content);
        return "hienthi";
    }

    @RequestMapping(value = "/session")
    public  String testHttpSession(HttpSession httpSession)
    {
        httpSession.setAttribute("test","this is session");
        return "session";
    }

    @RequestMapping(value = "/testmodel")
    public ModelAndView testModalAndView()
    {
        ModelAndView   modelAndView=new ModelAndView("testmodel");
        ModelMap modelMap=modelAndView.getModelMap();
        modelMap.put("model",new User("tvLinh","1244555"));
        return modelAndView;
    }

    @RequestMapping(value = "/test-rqparam")
    public String testRequestParam(ModelMap modelMap,@RequestParam(value = "id") String id)
    {
        System.out.println("id: "+id);
        modelMap.put("id",id);
        return "demo-request-param";
    }
}
