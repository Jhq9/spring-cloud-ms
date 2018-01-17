package isa.qa.senior.mapper;

import isa.qa.senior.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    Long saveUser(UserDO user);

    void deleteById(Long id);

    Long updateUser(UserDO user);

    UserDO findById(Long id);

    List<UserDO> findAll();

    UserDO findByPhone(String phone);

    UserDO findByEmail(String email);

}