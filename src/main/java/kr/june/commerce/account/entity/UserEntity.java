package kr.june.commerce.account.entity;

import javax.persistence.*;

@Entity(name = "accounts_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @Column(name = "username")
    public String userName;
}
