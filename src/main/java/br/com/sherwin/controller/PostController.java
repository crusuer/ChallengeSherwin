package br.com.sherwin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sherwin.model.Post;
import br.com.sherwin.service.PostService;

@Controller
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping("/")
    public ModelAndView findAll() {

        ModelAndView mv = new ModelAndView("/post");
        mv.addObject("posts", service.findAll());

        return mv;
    }

    @GetMapping("/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {

        ModelAndView mv = new ModelAndView("/post");
        Post post = service.findOne(id).get();
        mv.addObject("posts", post);

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Post post) {

        ModelAndView mv = new ModelAndView("/postAdd");
        mv.addObject("post", post);

        return mv;
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Post post, BindingResult result) {

        if (result.hasErrors()) {
            return add(post);
        }

        service.save(post);

        return findAll();
    }

}
