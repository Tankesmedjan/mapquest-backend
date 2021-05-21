package se.tankesmedjan.mapquestbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import se.tankesmedjan.mapquestbackend.models.AdminUser;

import java.util.List;

public interface AdminUserRepo extends CrudRepository<AdminUser, String> {

    List<AdminUser> findAll();
    AdminUser findAdminUserById(String id);
    List<AdminUser> findAdminUserByUsernameAndPassword(String username, String password);
}
