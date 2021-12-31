package pl.adamd.coms.account.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import pl.adamd.coms.account.dto.UserViewResponse;
import pl.adamd.coms.account.entity.User;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public
interface UserMapper {


    UserViewResponse userEntityToUserDto(User user);
}
