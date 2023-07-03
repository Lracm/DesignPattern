package com.lr.Factory;


public class SqlServerFactory implements DBFactory {

    @Override
    public Connection createConnection() {
        return new SqlServerConnection();
    }

    @Override
    public Statement createStatement() {
        return new SqlServerStatement();
    }
}
