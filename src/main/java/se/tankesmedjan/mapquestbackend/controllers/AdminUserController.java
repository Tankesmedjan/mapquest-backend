package se.tankesmedjan.mapquestbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.tankesmedjan.mapquestbackend.dto.AdminUserDTO;
import se.tankesmedjan.mapquestbackend.models.AdminUser;
import se.tankesmedjan.mapquestbackend.services.AdminUserService;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/admin")
public class AdminUserController {

    private final AdminUserService adminUserService;

    @Autowired
    public AdminUserController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    @GetMapping
    public List<AdminUser> getAdminUsers() {
        return adminUserService.getAdminUsers();
    }

    @PostMapping
    public AdminUserDTO addAdminUser(@RequestBody AdminUserDTO adminUserDTO) {
        return adminUserService.addAdminUser(adminUserDTO);
    }

    @DeleteMapping("/delete")
    public String deleteAdminUser(@RequestParam String id) {
        return "Successfully deleted the AdminUser: " + adminUserService.deleteAdminUser(id).getUsername();
    }
}
