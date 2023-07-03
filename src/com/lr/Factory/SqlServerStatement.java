package com.lr.Factory;

public class SqlServerStatement implements Statement{
    @Override
    public void state() {
        System.out.println("执行SqlServer数据库操作语句");
    }
}
