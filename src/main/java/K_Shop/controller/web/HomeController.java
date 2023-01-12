package K_Shop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

@RequestMapping(value = {"/login" })
public String GetLogin() {
	return "login";
}
@RequestMapping(value = { "", "/home" })
public String GetHome() {
	return "home";
}

@RequestMapping(value = {"/shop" })
public String GetShop() {
	return "shop";
}

@RequestMapping(value = { "/dang-ki" })
public String Register() {
	return "register";
}
}
