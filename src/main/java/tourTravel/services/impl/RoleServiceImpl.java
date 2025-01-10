package tourTravel.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourTravel.dtos.RoleResponseDto;
import tourTravel.entities.Role;
import tourTravel.mappers.RoleMapper;
import tourTravel.repositories.RoleRepository;
import tourTravel.services.RoleService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public RoleResponseDto getRoleById(UUID id) {
        Role role = roleRepository.findById(id).orElse(null);
        return role != null ? roleMapper.toResponseDto(role) : null;
    }

    @Override
    public List<RoleResponseDto> getAllRoles() {
        return roleRepository.findAll().stream()
                .map(roleMapper::toResponseDto)
                .collect(Collectors.toList());
    }

}
