package cz.ivosahlik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Intellij Idea
 * Created by ivosahlik on 15/01/18
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home/home";
    }

}
