package Springbootcontroller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Maincontroller {
	 @RequestMapping("/")
	  public String index() {
	    return "index.html";
	  }
}

