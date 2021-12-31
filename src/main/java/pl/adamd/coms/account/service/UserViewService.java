package pl.adamd.coms.account.service;

import pl.adamd.coms.account.dto.UserCreateRequest;
import pl.adamd.coms.account.dto.UserViewResponse;

public interface UserViewService {
    UserViewResponse createNewEmployee(UserCreateRequest newEmployee);
}
