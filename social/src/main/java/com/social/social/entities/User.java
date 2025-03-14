package com.social.social.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    private User(){

    }

    public User(Long userId, String userName, String emailId) {
        this.userId = userId;
        this.userName = userName;
        EmailId = emailId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userName;
    private String EmailId;




}
