package com.dr5hx.generateqrcode.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user_login_log", schema = "qrcode", catalog = "")
public class UserLoginLog {
    private long id;
    private long userId;
    private String userName;
    private String userIp;
    private Timestamp userTime;
    private String userDevice;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_ip")
    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    @Basic
    @Column(name = "user_time")
    public Timestamp getUserTime() {
        return userTime;
    }

    public void setUserTime(Timestamp userTime) {
        this.userTime = userTime;
    }

    @Basic
    @Column(name = "user_device")
    public String getUserDevice() {
        return userDevice;
    }

    public void setUserDevice(String userDevice) {
        this.userDevice = userDevice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLoginLog that = (UserLoginLog) o;
        return id == that.id &&
                userId == that.userId &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userIp, that.userIp) &&
                Objects.equals(userTime, that.userTime) &&
                Objects.equals(userDevice, that.userDevice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, userName, userIp, userTime, userDevice);
    }
}
