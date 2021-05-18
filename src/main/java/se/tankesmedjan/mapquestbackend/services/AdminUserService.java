package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.models.AdminUser;
import se.tankesmedjan.mapquestbackend.repositories.AdminUserRepo;

import java.util.List;

@Service
public class AdminUserService {

    private final AdminUserRepo adminUserRepo;

    @Autowired
    public AdminUserService(AdminUserRepo adminUserRepo){
        this.adminUserRepo = adminUserRepo;
    }

    public List<AdminUser> getAdminUsers() {
        return adminUserRepo.findAll();
    }

    public AdminUser addAdminUser(AdminUser adminUser) {
        return adminUserRepo.save(adminUser);
    }
}
