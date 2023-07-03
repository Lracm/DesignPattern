package com.lr.Factory;


public class MySqlStatement implements Statement {
    @Override
    public void state() {
        System.out.println("执行MySql数据库操作语句");
    }
}
