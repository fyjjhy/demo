package jdbc;

import java.sql.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月03日 <br>
 * @see jdbc <br>
 * @since V1.0 <br>
 */
public class ConnectionPool {
    // 数据库驱动
    private String jdbcDriver = "";

    // 数据库URL
    private String dbUrl = "";

    // 数据库用户名
    private String dbUserName = "";

    // 数据库用户密码
    private String dbPassword = "";

    // 测试连接是否可用的测试表名，默认没有测试表
    private String testTable = "";

    // 连接池的初始大小
    private int initialConnections = 10;

    // 连接池自动增加的大小
    private int incrementalConnections = 5;

    // 连接池最大的大小
    private int maxConnections = 50;

    // 存放连接池中数据库连接的向量，初始值为null，它中存放的对象为PooledConnection型
    private Vector connections = null;

    /**
     * Description: <br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param jdbcDriver jdbc驱动类
     * @param dbUrl 数据库URL
     * @param dbUserName 连接数据库用户名
     * @param dbPassword 连接数据库用户的密码
     * @return <br>
     */
    public ConnectionPool(String jdbcDriver, String dbUrl, String dbUserName, String dbPassword) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.dbUserName = dbUserName;
        this.dbPassword = dbPassword;
    }

    /**
     * Description: 返回连接池的初始大小<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public int getInitialConnections() {
        return this.initialConnections;
    }

    /**
     * Description: 设置连接池的初始大小<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param initialConnections
     * @return <br>
     */
    public void setInitialConnections(int initialConnections) {
        this.initialConnections = initialConnections;
    }

    /**
     * Description: 返回连接池自动增加的大小<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public int getIncrementalConnections() {
        return this.incrementalConnections;
    }

    /**
     * Description: 设置连接池自动增加的大小<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param incrementalConnections
     * @return <br>
     */
    public void setIncrementalConnections(int incrementalConnections) {
        this.incrementalConnections = incrementalConnections;
    }

    /**
     * Description: 返回连接池中最大的可用连接数量<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public int getMaxConnections() {
        return this.maxConnections;
    }

    /**
     * Description: 设置连接池中最大可用的连接数量<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param maxConnections
     * @return <br>
     */
    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * Description: 获取测试数据库表的名字<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public String getTestTable() {
        return this.testTable;
    }

    /**
     * Description: 设置测试表的名字<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param testTable
     * @return <br>
     */
    public void setTestTable(String testTable) {
        this.testTable = testTable;
    }

    /**
     * Description: 创建一个数据库连接池，连接池中的可用连接的数量采用类成员 initialConnections 中设置的值<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public synchronized void createPool() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        // 确保连接池没有创建
        // 如果连接池已经创建了，保存连接的向量connections不会为空
        if (connections != null) {
            return; // 如果已经创建，则返回
        }
        // 实例化 JDBC Driver 中指定的驱动类实例
        Driver driver = (Driver) Class.forName(this.jdbcDriver).newInstance();
        // 注册JDBC驱动程序
        DriverManager.registerDriver(driver);
        // 创建保存连接的向量，初始时有0个元素
        connections = new Vector();
        // 根据 initialConnections 中设置的值，创建连接。
        createConnections(this.initialConnections);
        System.out.println(" 数据库连接池创建成功！ ");
    }

    /**
     * Description: 创建由 numConnections 指定数目的数据库连接 , 并把这些连接放入 connections 向量中<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param numConnections
     * @return <br>
     */
    private void createConnections(int numConnections) throws SQLException {
        // 循环创建指定数目的数据库连接
        for (int i = 0; i < numConnections; i++) {
            // 是否连接池中的数据库连接的数量已经达到最大？最大值由类成员 maxConnections 指出，
            // 如果 maxConnections 为0或负数，表示连接数量没有限制。如果连接数已经达到最大，即退出。
            if (this.maxConnections > 0 && this.connections.size() >= this.maxConnections) {
                break;
            }
            // add a new PooledConnection object to connections vector
            // 增加一个连接到连接池中(向量 connections 中)
            try {
                connections.addElement(new PooledConnection(newConnection()));
            } catch (SQLException e) {
                System.out.println("创建数据库连接失败：" + e.getMessage());
                throw new SQLException();
            }
            System.out.println(" 数据库连接己创建 ......");
        }
    }

    /**
     * Description: 创建一个新的数据库连接并返回它<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    private Connection newConnection() throws SQLException {
        // 创建一个数据库连接
        Connection connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        // 如果这是第一次创建数据库连接，即检查数据库，获得此数据库允许支持的最大客户连接数目
        // connections.size()==0 表示目前没有连接己被创建
        if (connections.size() == 0) {
            DatabaseMetaData metaData = connection.getMetaData();
            int driverMaxConnections = metaData.getMaxConnections();
            // 数据库返回的 driverMaxConnections 若为0，表示此数据库没有最大连接限制，或数据库的最大连接限制不知道
            // driverMaxConnections 返回的是一个整数，表示此数据库允许客户连接的数目
            // 如果连接池中设置的最大连接数量大于数据库允许的连接数目，则置连接池的最大连接数目为数据库允许的最大数目
            if (driverMaxConnections > 0 && this.maxConnections > driverMaxConnections) {
                this.maxConnections = driverMaxConnections;
            }
        }
        // 返回创建的新的数据库连接
        return connection;
    }

    /**
     * Description: 通过调用 getFreeConnection() 函数返回一个可用的数据库连接 , 如果当前没有可用的数据库连接，并且更多的数据库连接不能创
     * 建（如连接池大小的限制），此函数等待一会再尝试获取。<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public synchronized Connection getConnection() throws SQLException {
        // 确保连接池已被创建
        if (connections == null) {
            // 连接池还没创建，则返回 null
            return null;
        }
        // 获得一个可用的数据库连接
        Connection connection = getFreeConnection();
        // 如果目前没有可以使用的连接，即所有的连接都在使用中
        while (connection == null) {
            // 等一会再试
            // System.out.println("Wait");
            wait(250);
            // 重新再试，直到获得可用的连接，如果 getFreeConnection() 返回的为 null，则表明创建一批连接后也不可获得可用连接
            connection = getFreeConnection();
        }
        // 返回获得的可用连接
        return connection;
    }

    /**
     * Description: 本函数从连接池向量 connections 中返回一个可用的的数据库连接，如果当前没有可用的数据库连接，本函数则根据
     * incrementalConnections 设置的值创建数据库连接数，并放入连接池中。 如果创建后，所有的连接仍都在使用中，则返回 null<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    private Connection getFreeConnection() throws SQLException {
        // 从连接池中获得一个可用的数据库连接
        Connection connection = findFreeConnection();
        if (connection == null) {
            // 如果目前连接池中没有可用的连接，创建一些连接
            createConnections(incrementalConnections);
            // 重新从池中查找是否有可用的连接
            connection = findFreeConnection();
            if (connection == null) {
                // 如果创建连接后仍获得不到可用的连接，则返回null
                return null;
            }
        }
        return connection;
    }

    /**
     * Description: 查找连接池中所有的连接，查找一个可用的数据库连接， 如果没有可用的连接，返回 null<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    private Connection findFreeConnection() {
        Connection connection = null;
        PooledConnection pooledConnection = null;
        // 获得连接池向量中所有的对象
        Enumeration enumeration = connections.elements();
        // 遍历所有的对象，看是否有可用的连接
        while (enumeration.hasMoreElements()) {
            pooledConnection = (PooledConnection) enumeration.nextElement();
            // 判断数据库连接是否为空闲状态
            if (!pooledConnection.isBusy()) {
                // 如果此对象不忙，则获得它的数据库连接并把它设为忙
                connection = pooledConnection.getConnection();
                pooledConnection.setBusy(true);
                // 测试此数据库连接是否可用
                if (!testConnection(connection)) {
                    // 如果此连接不可用，则创建一个新的连接并替换此不可用的连接对象，如果创建失败，返回null
                    try {
                        connection = newConnection();
                    } catch (SQLException e) {
                        System.out.println("创建数据库连接失败：" + e.getMessage());
                        return null;
                    }
                    pooledConnection.setConnection(connection);
                }
                // 已经找到一个可用连接，退出
                break;
            }
        }
        // 返回找到的可用连接
        return connection;
    }

    /**
     * Description: 测试一个连接是否可用，如果不可用，关掉它并返回 false 否则可用返回 true<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param connection
     * @return <br>
     */
    private boolean testConnection(Connection connection) {
        try {
            // 判断数据库表是否存在
            if (testTable.equals("")) {
                // 如果测试表为空，试着使用此连接的 setAutoCommit() 方法来判断连接是否可用
                // (此方法只在部分数据库可用，如果不可用，抛出异常)。注意使用测试表的方法更可靠
                connection.setAutoCommit(true);
            }
            else {
                // 有测试表的时候使用测试表测试
                // check if this connection is valid
                Statement statement = connection.createStatement();
                statement.execute("select count(*) FROM " + testTable);
            }
        } catch (SQLException e) {
            // 上面抛出异常，此连接不可用，关闭它，并返回 false
            closeConnection(connection);
            return false;
        }
        // 连接可用，返回 true
        return true;
    }

    /**
     * Description: 此函数返回一个数据库连接到连接池中，并把此连接置为空闲。 所有使用连接池获得的数据库连接均应在不使用此连接时返回它。<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param connection
     * @return <br>
     */
    public void returnConnection(Connection connection) {
        // 确保连接池存在，如果连接没有创建(不存在)，直接返回
        if (connections == null) {
            System.out.println("连接池不存在，无法返回此连接到连接池中");
            return;
        }
        PooledConnection pooledConnection = null;
        Enumeration enumeration = connections.elements();
        // 遍历连接池中的所有连接，找到这个要返回的连接对象
        while (enumeration.hasMoreElements()) {
            pooledConnection = (PooledConnection) enumeration.nextElement();
            if (connection == pooledConnection.getConnection()) {
                // 找到了，设置此连接为空闲状态
                pooledConnection.setBusy(false);
                break;
            }
        }
    }

    /**
     * Description: 刷新连接池中所有的连接对象<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public synchronized void refreshConnections() throws SQLException {
        // 确保连接池已刷新存在
        if (connections == null) {
            System.out.println("连接池不存在，无法刷新！");
            return;
        }
        PooledConnection pooledConnection = null;
        Enumeration enumeration = connections.elements();
        while (enumeration.hasMoreElements()) {
            // 获得一个连接对象
            pooledConnection = (PooledConnection) enumeration.nextElement();
            // 如果对象忙则等 5 秒，5 秒后直接刷新
            if (pooledConnection.isBusy()) {
                wait(5000);
            }
            // 关闭此连接，用一个新的连接代替它
            closeConnection(pooledConnection.getConnection());
            pooledConnection.setConnection(newConnection());
            pooledConnection.setBusy(false);
        }
    }

    /**
     * Description: 关闭连接池中所有的连接，并清空连接池。<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    public synchronized void closeConnectionPool() {
        // 确保连接池已存在，如果不存在，则返回
        if (connections == null) {
            System.out.println("连接池不存在，无法关闭！");
            return;
        }
        PooledConnection pooledConnection = null;
        Enumeration enumeration = connections.elements();
        while (enumeration.hasMoreElements()) {
            pooledConnection = (PooledConnection) enumeration.nextElement();
            // 如果忙，等 5 秒
            if (pooledConnection.isBusy()) {
                wait(5000);
            }
            // 5 秒后直接关闭它
            closeConnection(pooledConnection.getConnection());
            // 从连接池向量中删除它
            connections.removeElement(pooledConnection);
        }
        // 置连接池为空
        connections = null;
    }

    /**
     * Description: 关闭一个数据库连接<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param connection
     * @return <br>
     */
    private void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("关闭数据库连接出错：" + e.getMessage());
        }
    }

    /**
     * Description: 使程序等待给定的毫秒数<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param mSeconds
     * @return <br>
     */
    private void wait(int mSeconds) {
        try {
            Thread.sleep(mSeconds);
        } catch (InterruptedException e) {
        }
    }

    class PooledConnection {
        // 数据库连接
        Connection connection = null;
        // 此连接是否正在使用的标志，默认没有正在使用
        boolean busy = false;

        // 构造函数，根据一个 Connection 构造一个 PooledConnection 对象
        public PooledConnection(Connection connection) {
            this.connection = connection;
        }

        // 返回此对象中的连接
        public Connection getConnection() {
            return connection;
        }

        // 设置此对象的，连接
        public void setConnection(Connection connection) {
            this.connection = connection;
        }

        // 获得对象连接是否忙
        public boolean isBusy() {
            return busy;
        }

        // 设置对象的连接正在忙
        public void setBusy(boolean busy) {
            this.busy = busy;
        }
    }
}
