package cz.ivosahlik.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Intellij Idea
 * Created by ivosahlik on 15/01/18
 */
@RestController
public class PostController {

    @RequestMapping("/post")
    public String post() {
        return "rest";
    }

}
