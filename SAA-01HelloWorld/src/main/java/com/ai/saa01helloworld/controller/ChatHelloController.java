package com.ai.saa01helloworld.controller;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 *
 * @author Yang Hao
 * @date 2026-05-07 22:46
 */
@RestController
public class ChatHelloController {

    //对话模型,调用百炼平台
    @Resource
    private ChatModel chatModel;

    /**
     * 通用调用
     *
     * @param msg
     * @return
     */
    @GetMapping("/hello/call")
    public String hello(@RequestParam(name = "msg", defaultValue = "你是谁") String msg) {
        return chatModel.call(msg);
    }

    /**
     * 流式调用
     *
     * @param msg
     * @return
     */
    @GetMapping("/hello/stream")
    public Flux<String> helloStream(@RequestParam(name = "msg", defaultValue = "你是谁") String msg) {
        return chatModel.stream(msg);
    }
}
