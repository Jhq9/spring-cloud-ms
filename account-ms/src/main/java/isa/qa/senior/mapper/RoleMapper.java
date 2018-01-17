package isa.qa.senior.mapper;

import isa.qa.senior.domain.RoleDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    Long saveRole(RoleDO role);

    Long deleteById(Long id);

    Long updateRole(RoleDO role);

    RoleDO findById(Long id);

    List<RoleDO> findAll();

    RoleDO findByName(String name);

}