package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController 
{
	@GetMapping("/welcomee")
	public ModelAndView getMsg1() 
	{
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "WelocUm Boy");
//		first parameter is a string key that represents an attribute name.
//		second parameter is the value associated with the key.
				
		mav.setViewName("index");   // i.e., index.html or index.jsp etc.
		
//		In summary, setViewName allows you to specify the logical view name, and 
//		the view resolver handles the mapping to the actual view.
		
		return mav;
	}

	@GetMapping("/greett")
	public ModelAndView getMsg2() 
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg2", "Good Mlllllorning...!!");
		mav.setViewName("index");
		return mav;
	}

}
