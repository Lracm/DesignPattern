package com.lr.Factory;

public class SqlServerConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("连接SQlServer数据库");
    }
}
