package com.iset.produits.security;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class SecurityController {

    @GetMapping("/accessDenied")
    public String geterror() {
        return "accessDenied";
    }

    @PostMapping("/accessDenied")
    public String posterror() {
        return "accessDenied";
    }
    @GetMapping("/login")
    public String login()
    {
        return "login";

    }
    @GetMapping("/logout")
    public void logout(HttpServletRequest request) throws ServletException, IOException {
        request.logout();
    }

}