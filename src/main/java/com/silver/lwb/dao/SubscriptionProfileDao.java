package com.silver.lwb.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Yuchen Chiang
 */
@Repository(value = "subscriptionProfileDao")
public interface SubscriptionProfileDao {

    boolean insert(@Param("vid") int vID, @Param("pid") int pID);

    boolean delete(@Param("vid") int vID, @Param("pid") int pID);

    boolean isPublisherSubscribed(@Param("vid") int vID, @Param("pid") int pID);

    int inquireSubscribeViewerCount(int pID);
}
