package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;

@Controller //Marks this class as a controller implementation class.
@SessionAttributes({"loggedInUser"})//Adding this attribute at SESSION level.
public class SpringMvcController {
	//@RequestMapping("/greet")
	@GetMapping("/greet")
	public String getIndexPage() {
		System.out.println("Request received.");
		String viewName = "index";
		return viewName;
	}
	//@RequestMapping("/login")
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	//@RequestMapping(value = "/doValidate", method = RequestMethod.POST)
	@PostMapping("/doValidate")
	public String doValidateUser(
			@RequestParam("uid") String userName,
			@RequestParam("pwd") String password
			) {
		String resultPage = "failure";
		//Populating a model object: User based upon username and password
		User currentUser = new User(userName, password);
		//Checking the validity using UserValidator
		boolean valid =  UserValidator.isValid(currentUser);
		if(valid) {
			resultPage = "success";
		}
		return resultPage;
	}

	@PostMapping("/doValidateAgain")
	public String doValidateUserAgain(
			@RequestParam("uid") String userName,
			@RequestParam("pwd") String password,
			Model modelObject) {
		String resultPage = "failurePage";
		User currentUser = new User(userName, password);
		boolean valid =  UserValidator.isValid(currentUser);
		if(valid) {
			//Adding the userName into the model object
			modelObject.addAttribute("loggedInUser", userName);
			resultPage = "successPage";
		}
		return resultPage;
	}



}






