package com.example.indexcontact.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class IndexContactController {
	@RequestMapping("/index")
	public String indexPage () {
		return "This is the main page.";
	}
	
	@RequestMapping("/contact")
	public String contactPage () {
		return "This is the contact page.";
	}
}

