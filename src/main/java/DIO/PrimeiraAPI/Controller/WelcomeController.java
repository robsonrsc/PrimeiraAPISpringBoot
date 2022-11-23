package DIO.PrimeiraAPI.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Bem vindo a minha primeira Spring Boot WEB API";
    }
}
