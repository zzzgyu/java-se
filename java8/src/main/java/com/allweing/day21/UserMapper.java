package com.allweing.day21;

public interface UserMapper {

    @Select(value = "select * from tb_user where id=#{id}")
    User findUserById(Integer id);
}
