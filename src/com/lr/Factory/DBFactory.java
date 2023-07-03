package com.lr.Factory;

public interface DBFactory {
    public Connection createConnection();
    public Statement createStatement();
}
