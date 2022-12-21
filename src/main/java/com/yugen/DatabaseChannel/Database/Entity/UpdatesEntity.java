package com.yugen.DatabaseChannel.Database.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "updates")
public class UpdatesEntity {

    @Id
    @Column(name = "Id")
    private int Id;

    @Column(name = "upd")
    private int updateId;

    @Column(name = "chat")
    private int chatId;

    @Column(name = "obj")
    private String jsonObj;

    public UpdatesEntity() {
    }

    public UpdatesEntity(int updateId, int chatId, String jsonObj) {
        this.updateId = updateId;
        this.chatId = chatId;
        this.jsonObj = jsonObj;
    }

    public long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(int updateId) {
        this.updateId = updateId;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getJsonObj() {
        return jsonObj;
    }

    public void setJsonObj(String jsonObj) {
        this.jsonObj = jsonObj;
    }
}
