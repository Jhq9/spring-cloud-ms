/**
 * @author jinhuaquan
 * @create 2017-12-08 下午5:29
 * @desc roleService interface
 **/
package isa.qa.senior.service;

import isa.qa.senior.domain.RoleDO;

import java.util.List;

public interface RoleService {

    /**
     * @param role
     *
     *  新增一个角色Role
     */
    Long saveRole(RoleDO role);

    /**
     * @param id
     *
     *  根据id删除一个角色
     */
    Long deleteById(Long id);

    /**
     *  更新角色信息
     *
     *  @param role
     */
    Long updateRole(RoleDO role);

    /**
     *  根据id找到角色
     *  @param id
     *
     *  @return
     */
    RoleDO findById(Long id);

    /**
     * 找出所有的角色
     *
     * @return
     */
    List<RoleDO> findAll();

}
