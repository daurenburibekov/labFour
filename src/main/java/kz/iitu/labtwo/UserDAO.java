package kz.iitu.labtwo;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {
    public Member createUser(Member member){
        return new Member(member.getName(), member.getEmail());
    }
}
