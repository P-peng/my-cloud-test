package com.ge.member.mapper;

import com.ge.member.entity.TestEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/5/19 0019
 */
public interface TestMapper {

    List<TestEntity> select();

    int insert(@Param("name") String name);
}
