package com.silver.lwb.dao;

import com.silver.lwb.pojo.ChannelProfile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mvc.xml","classpath:spring/spring-mybatis.xml"})
public class ChannelProfileDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private ChannelProfileDao channelProfileDao;

    @Test
    public void inquireAllChannelList() {

        ChannelProfile channelProfile = new ChannelProfile();
        channelProfile.setcID(1);
        channelProfile.setcName("silver");
        channelProfile.setcCategory("default");
        channelProfile.setcImage("");
        channelProfile.setcPushRTMP("default");
        channelProfile.setcPullRTMP("default");
        channelProfile.setcSecretKey("sk");

        channelProfileDao.insert(channelProfile);
        List<ChannelProfile> channelProfileList = channelProfileDao.inquireAllChannelList(0, 1);

        System.out.println(channelProfileList.get(0).getcName()+"---"+channelProfileList.get(0).getcSecretKey());
    }

    @Test
    public void isChannelExists() {
        ChannelProfile channelProfile = new ChannelProfile();
        channelProfile.setcID(1);
        channelProfile.setcName("silver");
        channelProfile.setcCategory("default");
        channelProfile.setcImage("");
        channelProfile.setcPushRTMP("default");
        channelProfile.setcPullRTMP("default");
        channelProfile.setcSecretKey("sk");
        channelProfile.setcPermission(true);

        channelProfileDao.insert(channelProfile);
        List<Integer> list = channelProfileDao.isChannelExists("silver", "skk");
        System.out.println("cID1="+list.isEmpty());
    }
}
