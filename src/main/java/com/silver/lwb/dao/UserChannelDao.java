package com.silver.lwb.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dao for user with living stream channel.
 *
 * @author Yuchen Chiang
 */
@Repository(value = "userChannelDao")
public interface UserChannelDao {

    boolean insert(@Param("uid") int uID, @Param("cid") int cID);

    boolean delete(@Param("uid") int uID);

    boolean isUserExist(@Param("uid") int uID);

    int inquireUID(@Param("cid") int cID);

    int inquireCID(@Param("uid") int uID);

    List<Integer> inquireAllUID();
}
