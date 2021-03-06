package com.qa.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by InterlliJ IDEA.
 * User:3to
 * Date:17-12-12
 * Time:下午6:24
 */
@Entity
@Table(name = "qa_log_record", schema = "qacommunity", catalog = "")
public class QaLogRecord {
    private int id;
    private String account;
    private String type;
    private String createIp;
    private Date createDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "create_ip")
    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }

    @Basic
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QaLogRecord logRecord = (QaLogRecord) o;

        if (id != logRecord.id) return false;
        if (account != null ? !account.equals(logRecord.account) : logRecord.account != null) return false;
        if (type != null ? !type.equals(logRecord.type) : logRecord.type != null) return false;
        if (createIp != null ? !createIp.equals(logRecord.createIp) : logRecord.createIp != null) return false;
        if (createDate != null ? !createDate.equals(logRecord.createDate) : logRecord.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (createIp != null ? createIp.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
