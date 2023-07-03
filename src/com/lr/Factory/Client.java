package com.lr.Factory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入您要链接的数据库类型(mysql/sqlserver)");
        String DB = scanner.next();
        if(DB.equals("mysql")) {
            DBFactory factory1 = new MySqlFactory();
            Connection connect1 = new MySqlConnection();
            Statement state1 = new MySqlStatement();
            connect1 = factory1.createConnection();
            connect1.connect();
            state1 = factory1.createStatement();
            state1.state();
        } else if (DB.equals("sqlserver")) {
            DBFactory factory2 = new SqlServerFactory();
            Connection connect2 = new SqlServerConnection();
            Statement state2 = new SqlServerStatement();
            connect2=factory2.createConnection();
            connect2.connect();
            state2=factory2.createStatement();
            state2.state();
        }else {
            System.out.println("您输入的格式有误，请检查后重新输入！");
        }
    }
}
