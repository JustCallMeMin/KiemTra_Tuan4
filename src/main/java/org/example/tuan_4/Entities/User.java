package org.example.tuan_4.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    private String id = UUID.randomUUID().toString();

    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
