package pl.adamd.coms.account.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adamd.coms.account.service.UserViewService;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
class UserController {
    private final UserViewService userViewService;
}
