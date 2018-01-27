package com.silver.lwb.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Yuchen Chiang
 */
@Repository(value = "userRolerDao")
public interface UserRolerDao {

    boolean insert(@Param("uid") int uID, @Param("rid") int rID);

    List<Integer> inquireRolerIDList(@Param("uid") int uID);

    /**
     *
     * @param uID uid
     * @return union inquire result with table roler_profile
     */
    List<String> inquireRolerNameList(@Param("uid") int uID);
}
