package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: ZhuJiapeng
 * @Description:
 * @Date: Created in 14:42 2022/3/11
 * @Modified By:
 */
@Mapper
@Repository
public interface UserMapper {

    User selectById(int id);

    User selectByName(String name);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);

    int updateHeader(int id,String HeaderUrl);

    int updatePassword(int id,String password);
}
