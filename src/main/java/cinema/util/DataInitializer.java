package cinema.util;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private RoleService roleService;
    private UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role userRole = new Role();
        userRole.setName(Role.RoleName.USER);
        roleService.add(userRole);
        Role adminRole = new Role();
        adminRole.setName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        User userAdmin = new User();
        userAdmin.setEmail("admin@gmail.com");
        userAdmin.setPassword("admin");
        userAdmin.setRoles(Set.of(adminRole));
        userService.add(userAdmin);
        User userUser = new User();
        userUser.setEmail("user@gmail.com");
        userUser.setPassword("user");
        userUser.setRoles(Set.of(userRole));
        userService.add(userUser);
    }
}
