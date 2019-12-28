package sec.hackmypassword.controller;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sec.hackmypassword.domain.Signup;
import sec.hackmypassword.repository.SignupRepository;

@Controller
public class DefaultController {

    @Autowired
    private SignupRepository signupRepository;
    
    @RequestMapping("*")
    //@ResponseBody
    public String defaultResponseBody() {
        return "index";
    }
    
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String submitForm(@RequestParam String name, @RequestParam String address) {
        signupRepository.save(new Signup(name, address));
        return "done";
    }
}
