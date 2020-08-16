package vn.simple.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vn.simple.entity.Employee;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.setName("Kien1");
        Employee employee2 = (Employee) context.getBean("employee");
        System.out.println(employee2.getName());

        return employee.call();
    }
}
