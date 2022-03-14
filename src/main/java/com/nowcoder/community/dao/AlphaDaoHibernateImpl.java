package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: ZhuJiapeng
 * @Description:
 * @Date: Created in 18:43 2021/12/25
 * @Modified By:
 */
@Repository
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
