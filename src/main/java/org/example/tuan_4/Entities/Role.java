package org.example.tuan_4.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Role {
    @Id
    private String role_id = UUID.randomUUID().toString();


    private String role_name;
    public void setRoleId(String role_id) {
        this.role_id = role_id;
    }
    @OneToMany(mappedBy = "role")
    private Set<User> users;
}
