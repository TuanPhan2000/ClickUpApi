package com.phan.clickupapi.command;

public interface Command<T, R> {

    T execute(R data) throws Exception;

}
