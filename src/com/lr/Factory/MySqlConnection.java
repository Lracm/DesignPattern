package com.lr.Factory;


public class MySqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("连接Mysql数据库");
    }
}
