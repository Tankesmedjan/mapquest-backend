package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.dto.AdminUserDTO;
import se.tankesmedjan.mapquestbackend.mappers.AdminUserMapper;
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
     * @return the list of all AdminUsers.
     */
    public List<AdminUser> getAdminUsers() {
        return adminUserRepo.findAll();
    }

    /**
     * Checks if the username and password is correct.
     * @param adminUserDTO contains username and password.
     * @return true or false based on the input.
     */
    public Boolean checkAuth(AdminUserDTO adminUserDTO){
        return !adminUserRepo.findAdminUserByUsernameAndPassword(adminUserDTO.getUsername(), adminUserDTO.getPassword()).isEmpty();
    }

    /**
     * Basic method for adding an AdminUser.
     * @param adminUserDTO the body of an AdminUser.
     * @return saves the AdminUser.
     */
    public AdminUserDTO addAdminUser(AdminUserDTO adminUserDTO) {

        AdminUser creatNewAdminUser = AdminUserMapper.INSTANCE.dtoToAdminUser(adminUserDTO);
        adminUserRepo.save(creatNewAdminUser);
        return adminUserDTO;
    }

    /**
     * Basic method for deleting a specific AdminUser.
     * @param id the ID of the AdminUser to be deleted.
     * @return deletes the chosen AdminUser.
     */
    public AdminUser deleteAdminUser(String id) {
        AdminUser adminUser = adminUserRepo.findAdminUserById(id);
        adminUserRepo.delete(adminUser);
        return adminUser;
    }
}
