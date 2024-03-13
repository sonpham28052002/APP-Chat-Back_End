package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.entities.User;
import vn.edu.iuh.fit.repositories.UserRepository;

@SpringBootApplication
public class ZaloAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaloAppApplication.class, args);
    }

//    @Autowired
//    private UserRepository userRepository;
//
//    @Bean
//    CommandLineRunner createSample(){
//        return args -> {
//            User user = new User("1", "0957685532", "Son");
//            userRepository.save(user);
//        };
//    }

}
