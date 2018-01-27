package com.silver.lwb.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Local User Authentic Dao
 *
 * @author Yuchen Chiang
 */
@Repository(value = "userLocalAuthDao")
public interface UserLocalAuthDao {

    boolean insert(@Param("uid") int uID, @Param("uname") String uName, @Param("upassword") String uPassword);

    boolean update(@Param("uid") int uID, @Param("uName") String uName, @Param("uPassword") String uPassword);

    List<Integer> inquireUID(@Param("uname") String uName, @Param("upassword") String uPassword);
}
