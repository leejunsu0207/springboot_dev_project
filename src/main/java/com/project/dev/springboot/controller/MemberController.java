package com.project.dev.springboot.controller;

import com.project.dev.springboot.domain.Member;
import com.sun.org.apache.xpath.internal.objects.XString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm")
    public String registerForm(){
        log.info("registerForm");

        return "registerForm";
    }

    @GetMapping("/registerByGet01")
    public String registerByGet01(String userId,  @DateTimeFormat(pattern = "yyyyMMdd") LocalDate dateOfBirth){
        log.info(">>>>>>>>>>>>>>>>>>>>>>> registerByGet01");

        log.info("userId = "+userId);
        log.info("dateOfBirth = "+dateOfBirth);

        return "success";
    }

    @GetMapping("/registerByGet02")
    public String registerByGet02(Member member){
        log.info(">>>>>>>>>>>>>>>>>>>>>>> registerByGet02");

        log.info("member.getUserId() = "+member.getUserId());
        log.info("member.getDateOfBirth() = "+member.getDateOfBirth());

        return "success";
    }

    @PostMapping("/register")
    public String register(Member member){
        log.info(">>>>>>>>>>>>>>>>>>>>>>> register");

        log.info("member.getUserId() = "+member.getUserId());
        log.info("member.getPassword() = "+member.getPassword());
        log.info("member.getDateOfBirth() = "+member.getDateOfBirth());
        return "success";
    }






//    @PostMapping("/register01")
//    public String register01(Member member){
//        log.info(">>>>>>>>>>>>>>>>>>>>>>> register01");
//
//        log.info("member.getUserId() = "+member.getUserId());
//        log.info("member.getPassword() = "+member.getPassword());
//        log.info("member.getCoin() = "+member.getCoin());
//
//        return "success";
//    }
//
//    @PostMapping("/register02")
//    public String register02(Member member, int coin){
//        log.info(">>>>>>>>>>>>>>>>>>>>>>> register02");
//
//        log.info("member.getUserId() = "+member.getUserId());
//        log.info("member.getPassword() = "+member.getPassword());
//        log.info("member.getCoin() = "+member.getCoin());
//        log.info("coin = "+coin);
//
//        return "success";
//    }
//
//    @PostMapping("/register03")
//    public String register03(int uid, Member member){
//        log.info(">>>>>>>>>>>>>>>>>>>>>>> register03");
//
//        log.info("uid = "+uid);
//        log.info("member.getUserId() = "+member.getUserId());
//        log.info("member.getPassword() = "+member.getPassword());
//        log.info("member.getCoin() = "+member.getCoin());
//
//        return "success";
//    }







//    @GetMapping("/register/{userId}")
//    public String registerByPath(String userId){
//        log.info("registerByPath");
//
//        log.info("userId = "+userId);
//
//        return "success";
//
//    }
//
//    @GetMapping("/register/{userId}/{coin}")
//    public String registerByPath(@PathVariable("userId") String userId, @PathVariable("coin") int coin){
//        log.info("registerByPath");
//
//        log.info("userId = "+userId);
//        log.info("coin = "+coin);
//
//        return "success";
//
//    }
//
//    @PostMapping("/register01")
//    public String register01(String userId){
//        log.info("register01");
//
//        log.info("userId = "+userId);
//
//        return "success";
//    }
//
//    @PostMapping("/register0201")
//    public String register0201(String username){
//        log.info("register0201");
//
//        log.info("username = "+username);
//
//        return "success";
//    }
//
//    @PostMapping("/register0202")
//    public String register0202(@RequestParam("userId")String username){
//        log.info("register0202");
//
//        log.info("userId = "+username);
//
//        return "success";
//    }
//
//    @PostMapping("/register0301")
//    public String register0301(String memberId){
//        log.info("register0301");
//
//        log.info("userId = "+memberId);
//
//        return "success";
//    }
//
//    @PostMapping("/register0302")
//    public String register0302(@RequestParam("userId")String memberId){
//        log.info("register0302");
//
//        log.info("userId = "+memberId);
//
//        return "success";
//    }






//    @GetMapping("/register")
//    public String registerByParameter(String userId, String password){
//        log.info("registerByParameter");
//
//        log.info("userID = "+userId);
//
//        log.info("password = "+password);
//
//        return "success";
//
//    }
//
//    @GetMapping("/register/{userId}")
//    public String registerByPath(String userId){
//        log.info("registerByPath");
//
//        log.info("userId = "+userId);
//
//        return "success";
//
//    }
//
//    @PostMapping("/register01")
//    public String register01(String userId){
//        log.info("register01");
//
//        log.info("userId = "+userId);
//
//        return "success";
//    }
//
//    @PostMapping("/register02")
//    public String register02(String userId, String password){
//        log.info("register02");
//
//        log.info("userID = "+userId);
//
//        log.info("password = "+password);
//
//        return "success";
//
//    }
//
//    @PostMapping("/register03")
//    public String register03(String userId, String password){
//        log.info("register03");
//
//        log.info("userID = "+userId);
//
//        log.info("password = "+password);
//
//        return "success";
//
//    }
//
//    @PostMapping("/register04")
//    public String register04(String userId, String password, String coin){
//        log.info("register04");
//
//        log.info("userID = "+userId);
//
//        log.info("password = "+password);
//
//        log.info("coin = "+coin);
//
//        return "success";
//
//    }
//
//    @PostMapping("/register05")
//    public String register05(String userId, String password, String coin){
//        log.info("register05");
//
//        log.info("userID = "+userId);
//
//        log.info("password = "+password);
//
//        log.info("coin = "+coin);
//
//        return "success";
//
//    }

}
