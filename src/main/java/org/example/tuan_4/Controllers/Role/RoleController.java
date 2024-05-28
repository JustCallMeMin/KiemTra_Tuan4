package org.example.tuan_4.Controllers.Role;

import org.example.tuan_4.Entities.Role;
import org.example.tuan_4.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping()
    public String listRoles(Model model) {
        List<Role> roles = roleService.findAll();
        model.addAttribute("roles", roles);
        return "Role/index";
    }

    @GetMapping("/create")
    public String showCreateRoleForm(Model model) {
        model.addAttribute("role", new Role());
        return "Role/create";
    }

    @PostMapping("/create")
    public String createRole(@ModelAttribute Role role) {
        roleService.save(role);
        return "redirect:/roles";
    }

    @GetMapping("/edit/{id}")
    public String showEditRoleForm(@PathVariable String id, Model model) {
        Role role = roleService.findById(id);
        model.addAttribute("role", role);
        return "Role/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateRole(@PathVariable String id, @ModelAttribute Role role) {
        role.setRoleId(id);
        roleService.save(role);
        return "redirect:/roles";
    }

    @PostMapping("/delete/{id}")
    public String deleteRole(@PathVariable String id) {
        roleService.delete(id);
        return "redirect:/roles";
    }
}
