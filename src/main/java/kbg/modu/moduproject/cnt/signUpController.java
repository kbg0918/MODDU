package kbg.modu.moduproject.cnt;

import kbg.modu.moduproject.Service.SignUpService;
import kbg.modu.moduproject.domain.Member;
import kbg.modu.moduproject.repo.SignUpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class signUpController {

    @Autowired
    SignUpService ss;

    @Autowired
    SignUpRepository sr;


    /**
     * 회원가입 폼
     * @Return
     */
    @RequestMapping("/")
    public String signUpForm() {
        return "signUp";
    };

    @RequestMapping("/signUp")
    public String signUp(Member m) {
        ss.joinSignUp(m);
        return "redirect:/login"; //로그인 구현 예정
    }



}
