package se.tankesmedjan.mapquestbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tankesmedjan.mapquestbackend.repositories.AdminUserRepo;

@Service
public class AdminUserService {

    private final AdminUserRepo adminUserRepo;

    @Autowired
    public AdminUserService(AdminUserRepo adminUserRepo){
        this.adminUserRepo = adminUserRepo;
    }
}
