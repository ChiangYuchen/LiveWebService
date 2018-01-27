package com.silver.lwb.dao;

import com.silver.lwb.pojo.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dao Interface of the user_profile DAO.
 *
 * @author Yuchen Chiang
 */
@Repository(value = "userProfileDao")
public interface UserProfileDao {

    /**
     *
     * @param userProfile pojo
     * @return boolean
     */
    boolean insert(UserProfile userProfile);

    boolean update(UserProfile userProfile);

    String inquireUserAvatar(int uid);

    UserProfile inquireUserProfile(int uid);
}
