package com.wenge.tilake.data.service;

import com.wenge.tilake.metadata.message.NewsInfoReply;
import com.wenge.tilake.metadata.message.NewsInfoRequest;
import com.wenge.tilake.metadata.message.NewsInfoServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import java.time.LocalDateTime;

/**
 * @author haobao
 */
@GrpcService
public class TilakeDataService extends NewsInfoServiceGrpc.NewsInfoServiceImplBase {

    @Override
    public void queryRequest(NewsInfoRequest request, StreamObserver<NewsInfoReply> responseObserver) {
        responseObserver.onNext(NewsInfoReply.newBuilder().setMessage(String.format("%s_%s", request.getName(), LocalDateTime.now().toString())).build());
        responseObserver.onCompleted();
    }

}
