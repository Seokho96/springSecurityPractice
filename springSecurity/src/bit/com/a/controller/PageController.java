package bit.com.a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

	@GetMapping(value = "/page")
	public String page() throws Exception{
		return "/page";
	}
	
	@GetMapping(value = "/user/page")
	public String userPage() throws Exception{
		return "/user/page";
	}
	
	@GetMapping(value = "/member/page")
	public String memberPage() throws Exception{
		return "/member/page";
	}
	
	@GetMapping(value = "/admin/page")
	public String adminPage() throws Exception{
		return "/admin/page";
	}
	
	
}







