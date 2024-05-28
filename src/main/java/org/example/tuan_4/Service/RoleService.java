package org.example.tuan_4.Service;

import org.example.tuan_4.Entities.Role;
import org.example.tuan_4.Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public Role findById(String id) {
        return roleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid role Id:" + id));
    }

    public void delete(String id) {
        roleRepository.deleteById(id);
    }
}
