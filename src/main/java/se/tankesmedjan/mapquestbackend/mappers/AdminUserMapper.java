package se.tankesmedjan.mapquestbackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.tankesmedjan.mapquestbackend.dto.AdminUserDTO;
import se.tankesmedjan.mapquestbackend.models.AdminUser;

/**
 * Mapper with MapStruct
 * https://mapstruct.org/documentation/reference-guide/
 *
 * Maps the dto:information to entities
 */

@Mapper
public interface AdminUserMapper {

    AdminUserMapper INSTANCE = Mappers.getMapper( AdminUserMapper.class );

    @Mapping(source = "password", target = "password")
    @Mapping(source = "username", target = "username")
    AdminUser dtoToAdminUser (AdminUserDTO adminUserDTO);

}
