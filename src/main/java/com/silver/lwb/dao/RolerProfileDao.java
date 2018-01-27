package com.silver.lwb.dao;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Yuchen Chiang
 */
@Repository(value = "rolerProfileDao")
public interface RolerProfileDao {

    String inquireRolerName(int rID);
}
