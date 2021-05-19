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


    /**
     * Basic method for getting a list of all AdminUsers.
     *
     * @return the list of AdminUsers.
     */
    public List<AdminUser> getAdminUsers() {
        return adminUserRepo.findAll();
    }

    /**
     * Basic method for adding an AdminUser.
     * @param adminUser the body of an AdminUser.
     * @return saves the AdminUser.
     */
    public AdminUser addAdminUser(AdminUser adminUser) {
        return adminUserRepo.save(adminUser);
    }
}
