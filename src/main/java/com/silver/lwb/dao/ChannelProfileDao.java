package com.silver.lwb.dao;


import com.silver.lwb.pojo.ChannelProfile;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dao Interface of the channel_profile DAO.
 *
 * @author Yuchen Chiang
 */
@Repository(value = "channeProfilelDao")
public interface ChannelProfileDao {

    /**
     *
     * @param channelProfile pojo
     * @return true if success
     */
    boolean insert(ChannelProfile channelProfile);

    /**
     *
     * @param cName channel name
     * @param cSecretKey channel live secret key
     * @return List<Integer>
     */
    List<Integer> isChannelExists(@Param("n") String cName, @Param("k") String cSecretKey);

    /**
     *
     * @param cid channel id
     * @return true if channel is permitted
     */
    boolean isChannelPermitted(@Param("id") int cid);

    /**
     *
     * @param o offset
     * @param n num
     * @return List<ChannelProfile> if databases is not empty
     */
    List<ChannelProfile> inquireAllChannelList(@Param("o") int o, @Param("n") int n);
}
