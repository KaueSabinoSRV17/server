package com.example.server.model;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;

    @Column(unique = true)
    private String email;

    @Column(nullable = true)
    private String avatarUrl;
    private OffsetDateTime createdAt;

    @OneToMany
    private List<Participant> participatingAt;

    @OneToMany
    @Column(nullable = true)
    private List<Pool> ownPools;

    public User(String name, String email, String avatarUrl) {
        this.name = name;
        this.email = email;
        this.avatarUrl = avatarUrl;
        this.createdAt = OffsetDateTime.now();
    }

}

