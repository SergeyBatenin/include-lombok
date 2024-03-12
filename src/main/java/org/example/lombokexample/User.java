package org.example.lombokexample;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private int age;

    public static void main(String[] args) {
        User user = new User("testname", 36);
        System.out.println(user);
    }
}
