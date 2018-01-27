package com.silver.lwb.controller;

import com.silver.lwb.service.ChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller for the Channel Stream Management.
 *
 * @author Yuchen Chiang
 */
@Controller
@RequestMapping(value = "/channel/stream")
public class ChannelStreamController {

    @Autowired
    ChannelService channelService;

    private static final Logger logger = LoggerFactory.getLogger(ChannelStreamController.class);

    //此方法的响应时间也比较长为1141ms，因为需要经过视图解析器的处理
    @RequestMapping(value = "/on_publish", method = RequestMethod.POST)
    public HttpServletResponse onPublish(HttpServletRequest request, HttpServletResponse response) {

        String cName = request.getParameter("name"), cSecretKey = request.getParameter("key");
        if (channelService.isChannelExistsAndPermitted(cName, cSecretKey)) response.setStatus(HttpServletResponse.SC_OK);
        else response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        logger.info("stream publish request with cname={}, key={}, response={}", cName, cSecretKey, response.getStatus());
        return response;
    }

//      抛异常做出响应的时间过久，测试时响应时间为1099ms，因为需要经视图解析器的处理
//    @PostMapping(value = "/on_publish")
//    public ResponseEntity onPublish(@RequestParam("name") String cName, @RequestParam("key") String cSecretKey) {
//
//        HttpStatus status = HttpStatus.BAD_REQUEST;
//        if (channelService.isChannelExistsAndPermitted(cName, cSecretKey)) status = HttpStatus.OK;
//        else {
//            logger.info("stream publish request with cname={}, key={}, response={}", cName, cSecretKey, status.toString());
//            throw new ResourceNotFoundException();
//        }
//
//        return new ResponseEntity(status);
//    }

    @RequestMapping(value = "/on_publish_done", method = RequestMethod.POST)
    public void onPublishDone(HttpServletRequest request) {

        String cName = request.getParameter("name"), addr = request.getParameter("addr");
        logger.info("Stream {} publish done from ip {}", cName, addr);
        channelService.changeChannelPublishStaus(cName);
    }

    //此方法响应时间最短，只需要经消息转换器的处理，用时38ms
    @RequestMapping(value = "/on_play", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public ResponseEntity onPlay(@RequestParam("name") String cName, @RequestParam("addr") String addr) {

        logger.info("Client ip {} stream {} play on", addr, cName);
        channelService.increaseChannelPlayCount(cName);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "on_play_done", method = RequestMethod.POST)
    public void onPlayDone(HttpServletRequest request) {

        String cName = request.getParameter("name"), addr = request.getParameter("addr");
        logger.info("Client ip {} stream {} play done", addr, cName);
        channelService.descreaseChannelPlayCount(cName);
    }
}
