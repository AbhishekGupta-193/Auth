package com.user.auth.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="mobile_no")
    private String mobileNo;

    @Column(name="name")
    private String name;

    @Column(name="password")
    private String password;
}
