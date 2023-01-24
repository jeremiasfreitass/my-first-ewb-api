package dio.web.api.repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

        public void save(User user){
                if(user.getId() == null)
                        System.out.println("SAVE - Recebendo o usuário na camada de repositório.");
                else
                        System.out.println("UPDATE - Recebendo o usuário na camada de repositório.");

                System.out.println(user);
        }

        public void deleteById(Integer id){
                System.out.println(String.format("DELETE/Id - Recebendo o id: %d para excluir um "));
        }
}

