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
@Repository(value = "channelProfilelDao")
public interface ChannelProfileDao {

    /**
     *
     * @param channelProfile pojo
     * @return true if success
     */
    boolean insert(ChannelProfile channelProfile);

    /**
     *
     * @param channelProfile pojo
     * @return true if success
     */
    boolean update(ChannelProfile channelProfile);

    /**
     *
     * @param cid channel id
     * @return true if success
     */
    boolean delete(int cid);

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
     * @param cid channel id
     * @return channel info
     */
    ChannelProfile inquireChannelByCID(@Param("id") int cid);

    /**
     *
     * @param o offset
     * @param n num
     * @return Active channel list
     */
    List<ChannelProfile> inquireActiveChannelList(@Param("o") int o, @Param("n") int n);

    /**
     *
     * @param o offset
     * @param n num
     * @return All channel list
     */
    List<ChannelProfile> inquireAllChannelList(@Param("o") int o, @Param("n") int n);

    /**
     *
     * @param o offset
     * @param n num
     * @param category category
     * @return Active channel list by category
     */
    List<ChannelProfile> inquireActiveChannelListByCategory(@Param("o") int o, @Param("n") int n, @Param("category") String category);

    /**
     *
     * @param o offset
     * @param n num
     * @param category category
     * @return All channel list by category
     */
    List<ChannelProfile> inquireAllChannelListByCtegory(@Param("o") int o, @Param("n") int n, @Param("category") String category);
}
