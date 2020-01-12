package org.javastart.hibernatespring;

import org.javastart.hibernatespring.data.Type;
import org.javastart.hibernatespring.data.User;
import org.javastart.hibernatespring.data.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HibernateSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HibernateSpringApplication.class, args);
        UserService service = context.getBean(UserService.class);
        User user = new User();
        user.setName("Marcin");
        user.setType(Type.PREMIUM);

        service.save(user);
    }

}
