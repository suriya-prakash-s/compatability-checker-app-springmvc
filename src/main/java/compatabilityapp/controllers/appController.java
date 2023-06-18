package compatabilityapp.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import compatabilityapp.dto.UserInfoDto;

@Controller
public class appController {
	
	@RequestMapping("/")
	public String getHome(@ModelAttribute("userInfo") UserInfoDto userInfoDto) {
		return "home-page";
	}
	
	@RequestMapping("/process-form")
	public String processForm(@Valid @ModelAttribute("userInfo") UserInfoDto userInfoDto, BindingResult result) {
		if(result.hasErrors()) {
			return "home-page";
		}
		return "result-page";
	}

}
