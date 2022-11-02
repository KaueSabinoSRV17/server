package com.example.server.model;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Pool {

    @Id
    private UUID id;
    private String title;

    @Column(unique = true)
    private String code;

    private OffsetDateTime createdAt;

    @OneToMany
    private List<Participant> participants;

    @ManyToOne
    @Column(nullable = true)
    private User owner;

    public Pool(String title, String code) {
        this.title = title;
        this.code = code;
        this.createdAt = OffsetDateTime.now();
    }
    

}
