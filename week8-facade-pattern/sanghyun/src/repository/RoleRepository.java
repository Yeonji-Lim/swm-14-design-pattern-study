package repository;

import document.Email;
import document.Role;

import java.util.HashMap;

public class RoleRepository {
    private static final HashMap<Long, Role> repository = new HashMap<>();
    private static Long sequence = 1L;

    private static final RoleRepository roleRepository = new RoleRepository();

    public void save(Role role) {
        role.setId(sequence);
        repository.put(sequence++, role);
        System.out.println("RoleRepository.save");
    }

    public void deleteById(Long id) {
        repository.remove(id);
        System.out.println("RoleRepository.deleteById");
    }

    public Role findByUserId(Long userId) {
        for (Role role : repository.values()) if(role.getUserId().equals(userId)) return role;
        return null;
    }

    public static RoleRepository getRoleRepository() {
        return roleRepository;
    }

    private RoleRepository() {
    }
}
