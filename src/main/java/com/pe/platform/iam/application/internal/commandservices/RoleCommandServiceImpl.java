package com.pe.platform.iam.application.internal.commandservices;
import com.pe.platform.iam.domain.model.commands.SeedRolesCommand;
import com.pe.platform.iam.domain.model.entities.Role;
import com.pe.platform.iam.domain.model.valueobjects.Roles;
import com.pe.platform.iam.domain.services.RoleCommandService;
import com.pe.platform.iam.infrastructure.persistence.jpa.repositories.RoleRepository;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class RoleCommandServiceImpl implements RoleCommandService {
    private final RoleRepository roleRepository;

    public RoleCommandServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void handle(SeedRolesCommand command) {
        Arrays.stream(Roles.values()).forEach(role -> {
            if(!roleRepository.existsByName(role)) {
                roleRepository.save(new Role(Roles.valueOf(role.name())));
            }
        });
    }
}