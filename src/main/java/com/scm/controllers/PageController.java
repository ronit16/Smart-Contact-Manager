package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    //home route
    @RequestMapping("/home")
    public String homePage(Model model) {
        System.out.println("Home page handler");
        // sending data to view
        model.addAttribute("title", "Home - Smart Contact Manager");
        model.addAttribute("name", "Ronit Shah");
        model.addAttribute("Github", "https://github.com/ronit16");
        return "home";
    }

    //about route
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        System.out.println("About page handler");
        // sending data to view
        model.addAttribute("title", "About - Smart Contact Manager");
        return "about";
    }

    //services route
    @RequestMapping("/services")
    public String servicesPage(Model model) {
        System.out.println("Services page handler");
        // sending data to view
        model.addAttribute("title", "Services - Smart Contact Manager");
        return "services";
    }
}
