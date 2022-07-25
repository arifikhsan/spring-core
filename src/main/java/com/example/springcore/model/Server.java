package com.example.springcore.model;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Server {
    @PostConstruct
    public void start() {
        log.info("Server is started");
    }

    @PreDestroy
    public void stop() {
        log.info("Server is stopped");
    }
}
