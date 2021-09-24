package com.project.dev.springboot.controller;

import com.project.dev.springboot.domain.*;
import com.sun.org.apache.xpath.internal.objects.XString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Controller
public class MemberController {


    // 모델을 통한 데이터 전달
    @GetMapping("/read01")
    public String read01(Model model){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>> read01");

        model.addAttribute("userId", "leejunsu");
        model.addAttribute("password", "password");
        model.addAttribute("email", "test@test.com");
        model.addAttribute("userName", "leejunsu");
        model.addAttribute("birthDay", "1990-02-07");

        return "read01";
    }

    @GetMapping("/read02")
    public String read02(Model model){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>> read02");
        Member member = new Member();

        member.setUserId("leejunsu");
        member.setPassword("password");
        member.setEmail("test@test.com");
        member.setUserName("leejunsu");

        LocalDate dateOfBrith = LocalDate.of(1990, 02, 07);
        member.setDateOfBirth(dateOfBrith);

        model.addAttribute(member);
        return "read02";
    }

    @GetMapping("/read03")
    public String read03(Model model){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>> read03");
        Member member = new Member();

        member.setUserId("leejunsu");
        member.setPassword("password");
        member.setEmail("test@test.com");
        member.setUserName("leejunsu");

        LocalDate dateOfBrith = LocalDate.of(1990, 02, 07);
        member.setDateOfBirth(dateOfBrith);

        model.addAttribute("user",member);
        return "read03";
    }

    @GetMapping("/read04")
    public String read04(Model model){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>> read04");

        String[] carArray = {"benz", "audi"};

        List<String> carList = new ArrayList<>();
        carList.add("benz");
        carList.add("audi");

        String[] hobbyArray = {"music", "movie"};

        List<String> hobbyList = new ArrayList<>();
        hobbyList.add("music");
        hobbyList.add("movie");

        model.addAttribute("carArray", carArray);
        model.addAttribute("carList", carList);
        model.addAttribute("hobbyArray", hobbyArray);
        model.addAttribute("hobbyList", hobbyList);

        return "read04";

    }

    @GetMapping("/read05")
    public String read05(Model model){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>> read05");

        Member member = new Member();

        Address address = new Address();
        address.setPostCode("77777");
        address.setLocation("seoul");

        member.setAddress(address);

        List<Card> cardList = new ArrayList<>();

        Card card1 = new Card();
        card1.setNo("11111");

        YearMonth validMonth = YearMonth.of(2021, 9);
        card1.setValidMonth(validMonth);

        cardList.add(card1);

        Card card2 = new Card();
        card2.setNo("22222");

        YearMonth validMonth2 = YearMonth.of(2021, 9);
        card2.setValidMonth(validMonth2);

        cardList.add(card2);

        member.setCardList(cardList);

        model.addAttribute("user", member);

        return "read05";

    }

    @GetMapping("/read06")
    public String read06(Model model){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>> read06");
        Member member = new Member();

        member.setUserId("leejunsu");
        member.setPassword("password");
        member.setEmail("test@test.com");
        member.setUserName("leejunsu");

        member.setGender("male");
        member.setDeveloper("Y");
        member.setForeigner(true);
        member.setNationality("korea");
        member.setCars("benz");

        String[] carArray = {"benz", "audi"};

        member.setCarArray(carArray);

        List<String> carList = new ArrayList<>();
        carList.add("benz");
        carList.add("audi");

        member.setCarList(carList);

        member.setHobby("movie");

        String[] hobbyArray = {"music", "movie"};

        member.setHobbyArray(hobbyArray);

        List<String> hobbyList = new ArrayList<>();
        hobbyList.add("music");
        hobbyList.add("movie");

        member.setHobbyList(hobbyList);

        Address address = new Address();
        address.setPostCode("77777");
        address.setLocation("seoul");

        member.setAddress(address);

        List<Card> cardList = new ArrayList<>();

        Card card1 = new Card();
        card1.setNo("11111");

        YearMonth validMonth = YearMonth.of(2021, 9);
        card1.setValidMonth(validMonth);

        cardList.add(card1);

        Card card2 = new Card();
        card2.setNo("22222");

        YearMonth validMonth2 = YearMonth.of(2021, 9);
        card2.setValidMonth(validMonth2);

        cardList.add(card2);

        member.setCardList(cardList);

        LocalDate dateOfBrith = LocalDate.of(1990, 02, 7);
        member.setDateOfBirth(dateOfBrith);

        String introduction = "hi. \n nice to meet you";

        member.setIntroduction(introduction);

        model.addAttribute("user", member);

        return "read06";
    }




//    // 파일업로드 Ajax방식 요청 처리
//    @PostMapping(value="/uploadAjax", produces = "text/plain;charset=UTF-8")
//    public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception{
//        String originalFilename = file.getOriginalFilename();
//
//        log.info("originalName : "+originalFilename);
//
//        ResponseEntity<String> entity = new ResponseEntity<>("upload success"+originalFilename, HttpStatus.OK);
//
//        return entity;
//    }








//    // Ajax 방식 요청 처리
//    @GetMapping("/register/{userId}")
//    public ResponseEntity<String> register01(@PathVariable("userId") String userId){
//        log.info("register01");
//
//        log.info("userId = " + userId);
//
//        ResponseEntity<String> entity = new ResponseEntity<>("success", HttpStatus.OK);
//
//        return entity;
//    }
//
//    @PostMapping("/register/{userId}/{password}")
//    public ResponseEntity<String> register02(@PathVariable("userId") String userId, @PathVariable("password") String password){
//        log.info("register02");
//
//        log.info("userId = " + userId);
//        log.info("password = " + password);
//
//        ResponseEntity<String> entity = new ResponseEntity<>("success", HttpStatus.OK);
//
//        return entity;
//    }
//
//    @PostMapping("/register03")
//    public ResponseEntity<String> register03(@RequestBody Member member){
//        log.info("register03");
//
//        log.info("userId = " + member.getUserId());
//        log.info("password = " + member.getPassword());
//
//        ResponseEntity<String> entity = new ResponseEntity<>("success", HttpStatus.OK);
//
//        return entity;
//    }
//
//    @PostMapping("/register04")
//    public ResponseEntity<String> register04(String userId){
//        log.info("register04");
//
//        log.info("userId = " + userId);
//
//        ResponseEntity<String> entity = new ResponseEntity<>("success", HttpStatus.OK);
//
//        return entity;
//    }
//
//    @PostMapping("/register05")
//    public ResponseEntity<String> register05(String userId, String password){
//        log.info("register05");
//
//        log.info("userId = " + userId);
//        log.info("password = " + password);
//
//        ResponseEntity<String> entity = new ResponseEntity<>("success", HttpStatus.OK);
//
//        return entity;
//    }
//
//    @PostMapping("/register/{userId}")
//    public ResponseEntity<String> register06(@PathVariable("userId") String userId, @RequestBody Member member){
//        log.info("register06");
//
//        log.info("userId = " + userId);
//
//        log.info("member.getUserId() = " + member.getUserId());
//        log.info("member.getPassword() = " + member.getPassword());
//
//        ResponseEntity<String> entity = new ResponseEntity<>("success", HttpStatus.OK);
//
//        return entity;
//    }
//
//    @PostMapping("register07")
//    public ResponseEntity<String> register07(@RequestBody List<Member> memberList){
//        log.info("register07");
//
//        for(Member member : memberList) {
//            log.info("member.getUserId() = " + member.getUserId());
//            log.info("member.getPassword() = " + member.getPassword());
//        }
//
//        ResponseEntity<String> entity = new ResponseEntity<>("success", HttpStatus.OK);
//
//        return entity;
//    }
//
//    @PostMapping("register08")
//    public ResponseEntity<String> register08(@RequestBody Member member){
//        log.info("register08");
//
//        log.info("member.getUserId() = " + member.getUserId());
//        log.info("member.getPassword() = " + member.getPassword());
//
//        Address address = member.getAddress();
//
//        if(address != null){
//            log.info("address.getPostCode() = " + address.getPostCode());
//            log.info("address.getLocation() = " + address.getLocation());
//        }else{
//            log.info("address == null");
//        }
//
//        ResponseEntity<String> entity = new ResponseEntity<>("success", HttpStatus.OK);
//
//        return entity;
//    }
//
//    @PostMapping("register09")
//    public ResponseEntity<String> register09(@RequestBody Member member){
//        log.info("register09");
//
//        log.info("userId = " + member.getUserId());
//        log.info("password = " + member.getPassword());
//
//        List<Card> cardList = member.getCardList();
//
//        if(cardList != null){
//           log.info("cardList.size() = "+cardList.size());
//
//           for(int i=0; i < cardList.size(); i++){
//               Card card = cardList.get(i);
//               log.info("card.getNo() = "+card.getNo());
//               log.info("card.getValidMonth() = "+card.getValidMonth());
//           }
//        }else{
//            log.info("cardList == null");
//        }
//
//        ResponseEntity<String> entity = new ResponseEntity<>("success", HttpStatus.OK);
//
//        return entity;
//    }










//    @GetMapping("/registerForm")
//    public String registerForm(){
//        log.info("registerForm");
//
//        return "registerForm";
//    }
//
//
//    // 파일 업로드 폼 방식 요청 처리
//    @PostMapping("/registerFile01")
//    public String registerFile01(MultipartFile picture) throws Exception {
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>> registerFile01");
//
//        log.info("originName : " + picture.getOriginalFilename());
//        log.info("size : " + picture.getSize());
//        log.info("contentType : " + picture.getContentType());
//
//        return "success";
//
//    }
//
//    @PostMapping("/registerFile02")
//    public String registerFile02(String userId, String password, MultipartFile picture) throws Exception{
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>> registerFile02");
//
//        log.info("userId = " +userId);
//        log.info("password  = " +password);
//
//        log.info("originName : " + picture.getOriginalFilename());
//        log.info("size : " + picture.getSize());
//        log.info("contentType : " + picture.getContentType());
//
//        return "success";
//
//    }
//
//    @PostMapping("/registerFile03")
//    public String registerFile03(Member member, MultipartFile picture) throws Exception{
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>> registerFile03");
//
//        log.info("userId = " +member.getUserId());
//        log.info("password  = " +member.getPassword());
//
//        log.info("originName : " + picture.getOriginalFilename());
//        log.info("size : " + picture.getSize());
//        log.info("contentType : " + picture.getContentType());
//
//        return "success";
//
//    }
//
//    @PostMapping("/registerFile04")
//    public String registerFile04(FileMember fileMember) throws Exception{
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>> registerFile04");
//
//        log.info("userId = " +fileMember.getUserId());
//        log.info("password  = " +fileMember.getPassword());
//
//        MultipartFile picture = fileMember.getPicture();
//
//        log.info("originName : " + picture.getOriginalFilename());
//        log.info("size : " + picture.getSize());
//        log.info("contentType : " + picture.getContentType());
//
//        return "success";
//
//    }
//
//    @PostMapping("/registerFile05")
//    public String registerFile05(MultipartFile picture, MultipartFile picture2)throws Exception{
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>> registerFile05");
//
//        log.info("picture originName : " + picture.getOriginalFilename());
//        log.info("picture size : " + picture.getSize());
//        log.info("picture contentType : " + picture.getContentType());
//
//        log.info("picture2 originName : " + picture2.getOriginalFilename());
//        log.info("picture2 size : " + picture2.getSize());
//        log.info("picture2 contentType : " + picture2.getContentType());
//
//        return "success";
//
//    }
//
//    @PostMapping("/registerFile06")
//    public String registerFile06(List<MultipartFile> pictureList)throws Exception{
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>> registerFile06");
//
//        log.info("registerFile06 picture.size() : " + pictureList.size());
//
//        for(MultipartFile picture : pictureList) {
//            log.info("picture originName : " + picture.getOriginalFilename());
//            log.info("picture size : " + picture.getSize());
//            log.info("picture contentType : " + picture.getContentType());
//        }
//
//        return "success";
//
//    }
//
//    @PostMapping("/registerFile07")
//    public String registerFile07(MultiFileMember multiFileMember)throws Exception{
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>> registerFile07");
//
//        List<MultipartFile> pictureList = multiFileMember.getPictureList();
//        log.info("registerFile07 picture.size() : " + pictureList.size());
//
//        for(MultipartFile picture : pictureList) {
//            log.info("picture originName : " + picture.getOriginalFilename());
//            log.info("picture size : " + picture.getSize());
//            log.info("picture contentType : " + picture.getContentType());
//        }
//
//        return "success";
//
//    }
//
//    @PostMapping("/registerFile08")
//    public String registerFile08(MultipartFile[] pictureList)throws Exception{
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>> registerFile08");
//
//        log.info("registerFile08 pictureList.length : " + pictureList.length);
//
//        for(MultipartFile picture : pictureList) {
//            log.info("picture originName : " + picture.getOriginalFilename());
//            log.info("picture size : " + picture.getSize());
//            log.info("picture contentType : " + picture.getContentType());
//        }
//
//        return "success";
//
//    }









//    @GetMapping("/registerAllForm")
//    public String registerAllForm(){
//        log.info("registerAllForm");
//        return "registerAllForm";
//    }
//
//
//    // 폼방식 요청처리
//    @PostMapping("/registerMemberUserId")
//    public String registerMemberUserId(Member member){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerMemberUserId");
//        log.info(" member.getUserId() = "+member.getUserId());
//
//        return "success";
//    }
//
//    @PostMapping("/registerUser")
//    public String registerUser(Member member){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerUser");
//        log.info(" member.getUserId() = "+member.getUserId());
//        log.info(" member.getGender() = "+member.getGender());
//        log.info(" member.getHobby() = "+member.getHobby());
//        log.info(" member.isForeigner() = "+member.isForeigner());
//        log.info(" member.getDeveloper() = "+member.getDeveloper());
//        log.info(" member.getDateOfBirth() = "+member.getDateOfBirth());
//        log.info(" member.getCars() = "+member.getCars());
//        log.info(" member.getIntroduction() = "+member.getIntroduction());
//
//        String[] hobbyArray = member.getHobbyArray();
//
//        if(hobbyArray != null){
//            log.info("hobbyArray.length = " + hobbyArray.length);
//
//            for(int i = 0; i < hobbyArray.length; i++){
//                log.info("hobbyArray["+i+"] = "+hobbyArray[i]);
//            }
//        }else{
//            log.info("hobbyArray == null ");
//        }
//
//        List<String> hobbyList = member.getHobbyList();
//
//        if(hobbyList != null){
//            log.info("hobbyList.size() = " + hobbyList.size());
//
//            for(int i = 0; i < hobbyList.size(); i++){
//                log.info("hobbyList["+i+"] = "+hobbyList.get(i));
//            }
//        }else{
//            log.info("hobbyList == null ");
//        }
//
//        Address address = member.getAddress();
//
//        if(address != null){
//            log.info("address.getPostCode() = " + address.getPostCode());
//            log.info("address.getLocation() = " + address.getLocation());
//        }else{
//            log.info("address == null ");
//        }
//
//        List<Card> cardList = member.getCardList();
//
//        if(cardList != null){
//            log.info("cardList.size() = " + cardList.size());
//
//            for(int i = 0; i < cardList.size(); i++){
//                Card card = cardList.get(i);
//                log.info("card.getNo() = "+card.getNo());
//                log.info("card.getValidMonth() = "+card.getValidMonth());
//            }
//        }else{
//            log.info("cardList == null ");
//        }
//
//        String[] carArray = member.getCarArray();
//
//        if(carArray != null){
//            log.info("carArray.length = " + carArray.length);
//
//            for(int i = 0; i < carArray.length; i++){
//                log.info("carArray["+i+"] = "+carArray[i]);
//            }
//        }else{
//            log.info("carArray == null ");
//        }
//
//        List<String> carList = member.getCarList();
//
//        if(carList != null){
//            log.info("carList.size() = " + carList.size());
//
//            for(int i = 0; i < carList.size(); i++){
//                log.info("carList["+i+"] = "+carList.get(i));
//            }
//        }else{
//            log.info("carList == null ");
//        }
//
//        return "success";
//    }
//
//    @PostMapping("/registerUserId")
//    public String registerUserId(String userId){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerUserId");
//        log.info(" userId = "+userId);
//        return "success";
//    }
//
//    @PostMapping("/registerPassword")
//    public String registerPassword(String password){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerPassword");
//        log.info(" password = "+password);
//        return "success";
//    }
//
//    @PostMapping("/registerTextArea")
//    public String registerTextArea(String introduction){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerTextArea");
//        log.info(" introduction = "+introduction);
//        return "success";
//    }
//
//    @PostMapping("/registerRadio")
//    public String registerRadio(String gender){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerRadio");
//        log.info(" gender = "+gender);
//        return "success";
//    }
//
//    @PostMapping("/registerCheckbox01")
//    public String registerCheckbox01(String hobby){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerCheckbox01");
//        log.info(" hobby = "+hobby);
//        return "success";
//    }
//
//    @PostMapping("/registerCheckbox02")
//    public String registerCheckbox02(String[] hobbyArray){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerCheckbox02");
//        if(hobbyArray != null){
//            log.info("hobbyArray.length = " + hobbyArray.length);
//
//            for(int i = 0; i < hobbyArray.length; i++){
//                log.info("hobbyArray["+i+"] = "+hobbyArray[i]);
//            }
//        }else{
//            log.info("hobbyArray == null ");
//        }
//        return "success";
//    }
//
//    @PostMapping("/registerCheckbox03")
//    public String registerCheckbox03(List<String> hobbyList){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerCheckbox03");
//        if(hobbyList != null){
//            log.info("hobbyList.size() = " + hobbyList.size());
//
//            for(int i = 0; i < hobbyList.size(); i++){
//                log.info("hobbyList["+i+"] = "+hobbyList.get(i));
//            }
//        }else{
//            log.info("hobbyList == null ");
//        }
//        return "success";
//    }
//
//    @PostMapping("/registerCheckbox04")
//    public String registerCheckbox04(String developer){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerCheckbox04");
//
//        log.info("developer ="+developer);
//
//        return "success";
//    }
//
//    @PostMapping("/registerCheckbox05")
//    public String registerCheckbox05(boolean foreigner){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerCheckbox05");
//
//        log.info("foreigner ="+foreigner);
//
//        return "success";
//    }
//
//    @PostMapping("/registerSelect")
//    public String registerSelect(String nationality){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerSelect");
//
//        log.info("nationality ="+nationality);
//
//        return "success";
//    }
//
//    @PostMapping("/registerMultipleSelect01")
//    public String registerMultipleSelect01(String cars){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerMultipleSelect01");
//
//        log.info("cars ="+cars);
//
//        return "success";
//    }
//
//    @PostMapping("/registerMultipleSelect02")
//    public String registerMultipleSelect02(String[] carArray){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerMultipleSelect02");
//
//        if(carArray != null){
//            log.info("carArray.length = " + carArray.length);
//
//            for(int i = 0; i < carArray.length; i++){
//                log.info("carArray["+i+"] = "+carArray[i]);
//            }
//        }else{
//            log.info("carArray == null ");
//        }
//
//        return "success";
//    }
//
//    @PostMapping("/registerMultipleSelect03")
//    public String registerMultipleSelect03(ArrayList<String> carList){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerMultipleSelect03");
//
//        if(carList != null){
//            log.info("carList.size() = " + carList.size());
//
//            for(int i = 0; i < carList.size(); i++){
//                log.info("carList["+i+"] = "+carList.get(i));
//            }
//        }else{
//            log.info("carList == null ");
//        }
//
//        return "success";
//    }
//
//    @PostMapping("/registerAddress")
//    public String registerAddress(Address address){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerAddress");
//
//        if(address != null){
//            log.info("address.getPostCode() = " + address.getPostCode());
//            log.info("address.getLocation() = " + address.getLocation());
//        }else{
//            log.info("address == null ");
//        }
//
//        return "success";
//    }
//
//    @PostMapping("/registerUserAddress")
//    public String registerUserAddress(Member member){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerUserAddress");
//
//        Address address = member.getAddress();
//
//        if(address != null){
//            log.info("address.getPostCode() = " + address.getPostCode());
//            log.info("address.getLocation() = " + address.getLocation());
//        }else{
//            log.info("address == null ");
//        }
//
//        return "success";
//    }
//
//    @PostMapping("/registerUserCardList")
//    public String registerUserCardList(Member member){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerUserCardList");
//
//        List<Card> cardList = member.getCardList();
//
//        if(cardList != null){
//            log.info("cardList.size() = " + cardList.size());
//
//            for(int i = 0; i < cardList.size(); i++){
//                Card card = cardList.get(i);
//                log.info("card.getNo() = "+card.getNo());
//                log.info("card.getValidMonth() = "+card.getValidMonth());
//            }
//        }else{
//            log.info("cardList == null ");
//        }
//
//        return "success";
//    }
//
//    @PostMapping("/registerDate01")
//    public String registerDate01(Date dateOfBirth){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerDate01");
//
//        if(dateOfBirth != null){
//            log.info("dateOfBirth = "+dateOfBirth);
//        }else{
//            log.info("dateOfBirth == null");
//        }
//
//        return "success";
//    }
//
//    @PostMapping("/registerDate02")
//    public String registerDate02(@DateTimeFormat(pattern = "yyyyMMdd") Date dateOfBirth){
//        log.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>> registerDate02");
//
//        if(dateOfBirth != null){
//            log.info("dateOfBirth = "+dateOfBirth);
//        }else{
//            log.info("dateOfBirth == null");
//        }
//
//        return "success";
//    }























//    // date타입처리
//    @GetMapping("/registerByGet01")
//    public String registerByGet01(String userId,  @DateTimeFormat(pattern = "yyyyMMdd") LocalDate dateOfBirth){
//        log.info(">>>>>>>>>>>>>>>>>>>>>>> registerByGet01");
//
//        log.info("userId = "+userId);
//        log.info("dateOfBirth = "+dateOfBirth);
//
//        return "success";
//    }
//
//    @GetMapping("/registerByGet02")
//    public String registerByGet02(Member member){
//        log.info(">>>>>>>>>>>>>>>>>>>>>>> registerByGet02");
//
//        log.info("member.getUserId() = "+member.getUserId());
//        log.info("member.getDateOfBirth() = "+member.getDateOfBirth());
//
//        return "success";
//    }
//
//    @PostMapping("/register")
//    public String register(Member member){
//        log.info(">>>>>>>>>>>>>>>>>>>>>>> register");
//
//        log.info("member.getUserId() = "+member.getUserId());
//        log.info("member.getPassword() = "+member.getPassword());
//        log.info("member.getDateOfBirth() = "+member.getDateOfBirth());
//        return "success";
//    }






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
