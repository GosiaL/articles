package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.model.Article;

@Controller
public class ArticleController {
    @GetMapping("/")
    public String form(ModelMap modelMap){
        modelMap.addAttribute("article", new Article());
        return "articles/form";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Article article, ModelMap modelMap){
        modelMap.addAttribute("article", article);
        return "articles/add";
    }
}
