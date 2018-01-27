package com.silver.lwb.dao;

import com.silver.lwb.pojo.UserProfile;
import org.springframework.stereotype.Repository;

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
}
