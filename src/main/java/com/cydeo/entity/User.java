package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean enabled;
    private String phone;
    private Role role;
    private Gender gender;

    // NOTE: when you are working with Lombok, and you are extending from another class or a super class,
    // then lombok will not create a constructor including the super class fields.
    // therefore, you need to manually crate the " all args constructor " as shown below
    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime, Long lastUpdateUserId, String firstName, String lastName, String userName, String password, boolean enabled, String phone, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.phone = phone;
        this.role = role;
        this.gender = gender;
    }
}
