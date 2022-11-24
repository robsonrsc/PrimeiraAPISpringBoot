package DIO.PrimeiraAPI.Repository;


import DIO.PrimeiraAPI.Model.user;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(user usuario){
        if(usuario.toString()   ==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<user> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<user> usuarios = new ArrayList<>();
        usuarios.add(new user("gleyson","password"));
        usuarios.add(new user("frank","masterpass"));
        return usuarios;
    }
    public user findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new user("gleyson","password");
    }
    public user findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new user("gleyson","password");
    }
}
