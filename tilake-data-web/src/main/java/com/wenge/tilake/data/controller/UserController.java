package com.wenge.tilake.data.controller;

import com.wenge.tilake.metadata.message.NewsInfoReply;
import com.wenge.tilake.metadata.message.NewsInfoRequest;
import com.wenge.tilake.metadata.message.NewsInfoServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haobao
 */
@RequestMapping("data")
@RestController
public class UserController {

    @GrpcClient("tilake-data-service")
    private NewsInfoServiceGrpc.NewsInfoServiceBlockingStub blockingStub;

    @GetMapping("queryNewsInfo")
    public String queryNewsInfo(String name) {
        NewsInfoReply newsReply = blockingStub.queryRequest(NewsInfoRequest.newBuilder()
                .setName(name).build());
        return String.format("im %s,%s", name, newsReply.getMessage());
    }
}
