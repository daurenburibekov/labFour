package kz.iitu.labtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class LabtwoApplication {

    public static void main(String[] args) throws SQLException {
        //git finally completed
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigration.class);
        UserService service = context.getBean("userService", UserService.class);
        UserDAO userdao = context.getBean("userDAO", UserDAO.class);
        Member member = userdao.createUser(new Member("Name", "Email"));
        System.out.println(member.toString());
        member.setMembership(new Gold());
        service.setConnection();
        service.getUsers();
    }

}
