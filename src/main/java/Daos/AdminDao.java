package Daos;

import Models.admin;
import Models.user;

import java.sql.*;
import java.util.ArrayList;

public class AdminDao {
    static Connection connection=ConnectionMysql.getConnect();
    public static admin selectadmin() throws SQLException {
        admin admin=new admin();
        String sql="SELECT `user`,`pwd` FROM case_study.`admin`;";
        PreparedStatement ps=connection.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            admin.setUsername(rs.getString("user"));
            admin.setPasswd(rs.getString("pwd"));
        }
        return admin;
    }
    public static user selectloginUser(String username) throws SQLException {
        user user=new user();
        String sql="SELECT * FROM case_study.`user` where username=?;";
        PreparedStatement ps=connection.prepareStatement(sql);
        ps.setString(1,username);
        ResultSet rs=ps.executeQuery();
        rs.next();
        user.setUsername(rs.getString("username"));
        user.setPasswd(rs.getString("passwd"));
        System.out.println(user.getUsername()+user.getPasswd()+1);
        return user;
    }
}
