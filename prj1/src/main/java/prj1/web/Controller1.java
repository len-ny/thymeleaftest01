package prj1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/api")
public class Controller1 {

	// this can be run by App2 & App1
	@GetMapping(value="/hello")
	public String hello() {
		return "hello world";
	}

	// this can be run by App1 only
	@GetMapping(value="/hello2")
	public ModelAndView hello2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello-world");
        return mav;
	}

	@RequestMapping("/hello3")
    public String hello3(Model model) {

      //  model.addAttribute("someKey", "someValue");
        return "hello-world"; // this is the template name in src/main/resources
    }

}
