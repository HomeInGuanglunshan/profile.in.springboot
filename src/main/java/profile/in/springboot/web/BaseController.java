package profile.in.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

	@Value("${my.env}")
	String myEnv;

	@RequestMapping("where")
	@ResponseBody
	public String where() {
		return this.myEnv;
	}
}
