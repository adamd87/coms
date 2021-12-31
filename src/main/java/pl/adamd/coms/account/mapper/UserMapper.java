package pl.adamd.coms.account.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import pl.adamd.coms.account.dto.UserViewResponse;
import pl.adamd.coms.account.entity.User;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public
interface UserMapper {

    UserViewResponse userEntityToUserDto(User user);

    List<UserViewResponse> userEntityListToUserDtoList(List<User> userList);
}
