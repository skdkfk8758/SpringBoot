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

    String home() {

        String banner = "Riot_Practice " + "\n" + "Team is Seven \n" + " "  + "ComputerScience" + " by " + " [김동현, 이승재, 권연욱, 김은경] ";



        return banner;
    }


    public static void main( String[] args )
            throws Exception
    {
        SpringApplication.run(App.class, args);
    }
}