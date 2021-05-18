package se.tankesmedjan.mapquestbackend.controllers;


import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.models.AdminUser;
import se.tankesmedjan.mapquestbackend.services.AdminUserService;

import java.util.List;

@RequestMapping("/api/admin")
public class AdminUserController {

    private final AdminUserService adminUserService;

    public AdminUserController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    @GetMapping
    public List<AdminUser> getAdminUsers() {
        return adminUserService.getAdminUsers();
    }

    @PostMapping
    public AdminUser addAdminUser(@RequestBody AdminUser adminUser) {
        return adminUserService.addAdminUser(adminUser);
    }
}
