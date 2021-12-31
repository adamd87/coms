package pl.adamd.coms.account.service;

import pl.adamd.coms.account.dto.UserCreateRequest;
import pl.adamd.coms.account.dto.UserViewResponse;

import java.util.List;

public interface UserViewService {
    UserViewResponse createNewEmployee(UserCreateRequest newEmployee);

    List<UserViewResponse> getAll();
}
