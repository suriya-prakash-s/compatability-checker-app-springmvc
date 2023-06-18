package compatabilityapp.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import compatabilityapp.dto.UserRegistrationDto;

@Controller
public class registrationController {

	@RequestMapping("/register")
	public String doRegistration(@ModelAttribute("userReg") UserRegistrationDto userRegInfo) {
		userRegInfo.setName("dummy");
		return "register-page";
	}

	@RequestMapping("/process-signup")
	public String processRegistration(@Valid @ModelAttribute("userReg") UserRegistrationDto userRegInfo,
			BindingResult result) {
		if(result.hasErrors()) {
			return "register-page";
		}
		return "signup-success";

	}

}
