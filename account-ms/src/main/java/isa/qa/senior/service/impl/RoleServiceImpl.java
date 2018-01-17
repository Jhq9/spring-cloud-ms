package isa.qa.senior.service.impl;

import isa.qa.senior.domain.RoleDO;
import isa.qa.senior.mapper.RoleMapper;
import isa.qa.senior.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by CodeGenerator on 2017/10/16.
 *
 * Role的service层具体实现
 */
@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleMapper roleMapper;

    @Override
    @Transactional
    public Long saveRole(RoleDO role) {
        return roleMapper.saveRole(role);
    }

    @Override
    public Long deleteById(Long id) {
       return roleMapper.deleteById(id);
    }

    @Override
    @Transactional
    public Long updateRole(RoleDO role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public RoleDO findById(Long id) {
        return roleMapper.findById(id);
    }

    @Override
    public List<RoleDO> findAll() {
        return roleMapper.findAll();
    }
}
