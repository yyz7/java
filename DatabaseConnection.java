package database912;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库连接类
 * @author yyz
 * @version 1.0.2
 * @createTime 2019年09月12日 11:29:40
 */
public class DatabaseConnection {
    private static String driverClass = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai";
    private static String user = "root";
    private static String password = "1234";

    /**
     * 打开并返回数据库连接
     * @return
     */
    public static Connection getConnection() throws Exception {
    /*    //加载数据库驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //打开连接
        Connection con = DriverManager.getConnection(url,user,password);*/
        //创建数据源对象
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        Connection con = dataSource.getConnection();
        return con;
    }
}
