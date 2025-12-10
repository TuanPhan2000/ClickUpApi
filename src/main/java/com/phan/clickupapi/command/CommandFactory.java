package com.phan.clickupapi.command;

import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CommandFactory {

    @Autowired
    private ApplicationContext applicationContext;

    public <T, R> T execute(Class<? extends Command<T, R>> commandClass, @Nullable R data) throws Exception {
        Command<T, R> command = applicationContext.getBean(commandClass);
        return command.execute(data);
    }
}

