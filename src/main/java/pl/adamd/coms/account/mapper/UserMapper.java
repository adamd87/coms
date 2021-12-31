package pl.adamd.coms.account.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.adamd.coms.account.dto.UserViewResponse;
import pl.adamd.coms.account.entity.User;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserViewResponse userEntityToUserDto(User user);
}
