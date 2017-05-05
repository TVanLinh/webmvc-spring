package controller;

import com.sun.org.apache.regexp.internal.RE;
import model.Customer;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by linhtran on 03/05/2017.
 */
@Controller
@RequestMapping("/form")
public class FormController {

    @RequestMapping(value = "/signin",method = RequestMethod.GET)
    public  String signin(ModelMap modelMap)
    {
        modelMap.addAttribute("user",new User());
        return "signin";
    }


    @RequestMapping(value = "/xulydangki",method = RequestMethod.POST)
    public  String xulydangki(@ModelAttribute(value = "user")User user, ModelMap modelMap)
    {
        modelMap.put("user",user);
        return "wellcome";
    }

    @RequestMapping(value = "/xlctm",method = RequestMethod.POST)
    public  String xulyCustomer(Model model, @RequestParam(value = "name")String name,@RequestParam(value = "comment")String comment)
    {
        System.out.println(name+"\t\t"+comment);
        model.addAttribute("customer",new Customer(name,comment));
        return "view-custormer";
    }


    @RequestMapping(value = "/xlctm2",method = RequestMethod.POST)
    public  String xulyCustomer2(@ModelAttribute(value = "customer") Customer customer)
    {
        System.out.println(customer);
        for (String str:customer.getProducts())
        {
            System.out.println(str);
        }
        return "view-custormer";
    }

    @RequestMapping(value = "/xlctm3",method = RequestMethod.POST)
    public  String xulyCustomer3(Model model, Customer customer)
    {
        System.out.println(customer);
        for (String str:customer.getProducts())
        {
            System.out.println(str);
        }
        return "view-custormer";
    }

    @RequestMapping(value = "/xlctm4",method = RequestMethod.POST)
    public ModelAndView xulyCustomer4(@ModelAttribute(value = "customer1")Customer customer)
    {
        ModelAndView modelAndView=new ModelAndView("view-ctm2");
        return  modelAndView;
    }

    @RequestMapping(value = "/xlctm5",method = RequestMethod.POST)
    public  String  xulyCustomer5(@ModelAttribute(value = "customer1") Customer customer, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
          return "order";
        }
        return   "view-ctm2";
    }
    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public  String order()
    {
        return "order";
    }
}
