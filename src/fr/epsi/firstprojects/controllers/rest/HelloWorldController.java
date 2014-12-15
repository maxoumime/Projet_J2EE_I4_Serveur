package fr.epsi.firstprojects.controllers.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mberthea on 02/10/2014.
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value="/hello/{name}", method = RequestMethod.GET)
    public @ResponseBody String getHello(@PathVariable("name") String name){

        return "Hey "+name;
    }
}
