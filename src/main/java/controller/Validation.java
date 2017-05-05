package controller;

import model.Person;
import model.PersonNameEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by linhtran on 04/05/2017.
 */

@Controller
@SessionAttributes(value = "name", types = {String.class})
//@RequestMapping("/valid")

public class Validation {

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
//       // binder.setDisallowedFields(new String[] {"birthDay"});
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd*MM*yyyy");
//        binder.registerCustomEditor(Date.class,"birthDay",new CustomDateEditor(simpleDateFormat,false));
//        binder.registerCustomEditor(String.class,"name",new PersonNameEditor());
    }

    @RequestMapping(value = "/valid-signin",method = RequestMethod.GET)
    public  String  validSign()
    {
        return "valid-signin";
    }

    @ModelAttribute(name = "name")
    String getName()
    {
        return "Tran Van Linh";
    }


    @RequestMapping(value = "valid-view", method = RequestMethod.POST)
    public ModelAndView validView(@Valid @ModelAttribute(value = "person")Person person, BindingResult bindingResult,@CookieValue(value = "name") @ModelAttribute(value = "name") String name,ModelMap model)
    {
        System.out.println("ModelAttribute: "+model.get("name"));
        System.out.println("name: "+name);
        if(bindingResult.hasErrors())
        {
            return new ModelAndView("valid-signin");
        }
        return new ModelAndView("valid-view");
    }
}
