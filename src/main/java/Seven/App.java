package Seven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class App {
    @Value("${environment.message}")
    private String message;

    @RequestMapping("/")
    @ResponseBody
    String home() {

        String banner = "Team Name is Seven Computer Science" +"<br>"+ "Member : 권연욱, 김동현, 김은경, 이승재";


        return "Server is " + message + "\\n" + banner;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}