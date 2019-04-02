package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Person> getPerson(){
        List<Person> list=new ArrayList<Person>();

        Person p1=new Person();
        p1.setFirstName("a");
        p1.setLastName("b");
        p1.setAge(1);

        Person p2=new Person();
        p2.setFirstName("c");
        p2.setLastName("d");
        p2.setAge(2);

        list.add(p1);
        list.add(p2);

        return list;

    }

}
