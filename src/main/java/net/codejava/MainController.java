package net.codejava;
 
import java.util.*;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
@Controller
public class MainController {
     
    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
         
        return "register_form";
    }
      @GetMapping("/register_success")
      public String showForm1(Model model) {
          User user = new User();
    	  return "register_success";
      }  
      }
     
    
