package bean;

import org.junit.Test;

public class UserTest {

    @Test
    public void test(){
        User user =  User.builder().password("123").build();
        System.out.println(user.getUsername());
    }



}
