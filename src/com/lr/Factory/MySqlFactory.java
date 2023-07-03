package com.lr.Factory;

public class MySqlFactory implements DBFactory {
    @Override
    public Connection createConnection() {
         return new MySqlConnection();

    }

    @Override
    public Statement createStatement() {
        return new MySqlStatement();
    }
}
