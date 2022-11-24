package DIO.PrimeiraAPI.Controller;


import DIO.PrimeiraAPI.Model.user;
import DIO.PrimeiraAPI.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UserRepository repository;

    @GetMapping ("/users")
    public List<user> getUser(){
        return repository.findAll();

    }

    @GetMapping("/users/{username}")
    public  user getOne (@PathVariable ("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/users/{id}")
    public  void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);

    }

}
