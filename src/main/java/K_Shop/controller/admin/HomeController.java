package K_Shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "quan-tri")
public class HomeController {

	@RequestMapping(value = { "/quan-tri", "/quan-tri/home" })
	public String GetHome() {
		return "admin/home";
	}
}
