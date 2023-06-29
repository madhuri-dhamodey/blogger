package md.practice.blogger.controller;

import md.practice.blogger.model.Post;
import md.practice.blogger.util.Pager;
import org.springframework.data.domain.Page;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String getListPage(Model m, @AuthenticationPrincipal User user){
        m.addAttribute("username", user!=null ? user.getUsername() : null);
        return user!=null ? "/home" : "/login";

    }
}
