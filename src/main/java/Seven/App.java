package Seven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


public class App
{
    @Controller
    @EnableAutoConfiguration
    public class SampleController {
        @Value("${environment.message}")
        private String message;

        @RequestMapping("/")
        @ResponseBody
        String home() {
            return "Seven " + " "  + "ComputerScience" + " " + " [김동현, 이승재, 권연욱, 김은경] ";
        }


    public static void main( String[] args )
            throws Exception
    {
        SpringApplication.run(SampleController.class, args);
    }

    }