package kr.springboot.springstudy.db;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.pool.HikariProxyResultSet;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class Database {

    DriverManagerDataSource driverManagerDataSource;

    DataSource dataSource;

    HikariDataSource hikariDataSource;

    HikariProxyResultSet hikariProxyResultSet;

}
