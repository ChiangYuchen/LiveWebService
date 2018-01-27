package com.silver.lwb.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Service Interface of the Channel Service.
 *
 * @author Yuchen Chiang
 */
public interface ChannelService {

    boolean createChannel();

    boolean isChannelExistsAndPermitted(String cName, String cSecretKey);

    void changeChannelPublishStaus(String cName);

    void increaseChannelPlayCount(String cName);

    void descreaseChannelPlayCount(String cName);

    JSONObject inquireAllChannelList(int records, int pnums, String category);

    JSONObject inquireActiveChannelList(int records, int pnums, String category);
}
