package com.silver.lwb.controller;

import com.alibaba.fastjson.JSONObject;
import com.silver.lwb.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for the Channel Page Management.
 *
 * @author Yuchen Chiang
 */
@RestController
@RequestMapping(value = "/channel")
public class ChannelController {

    @Autowired
    ChannelService channelService;

    /**
     * Return channel list by records, pnums, category and status.
     * @param records records per page
     * @param pnums page nums
     * @param category category of channel
     * @param status '1' active and '0' all
     * @return JSONObject
     */
    @GetMapping(value = "/list")
    public @ResponseBody JSONObject channelList(@RequestParam(value = "records") int records, @RequestParam(value = "pnum") int pnums, @RequestParam(value = "category", required = false) String category, @RequestParam(value = "status", required = false) boolean status) {

        if (status) return channelService.inquireActiveChannelList(records, pnums, category);
        else return channelService.inquireAllChannelList(records, pnums, category);
    }

}
