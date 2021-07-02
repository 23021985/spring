package com.novi.eindopdracht.idrunk.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(com.novi.eindopdracht.idrunk.model.AuthorityKey.class)
@Table(name = "authorities")
public class Authority implements Serializable {


    @Id
    @Column(nullable = false)
    private String mail;

    @Id
    @Column(nullable = false)
    private String authority;

    public Authority() {}
    public Authority(String mail, String authority) {
        this.mail = mail;
        this.authority = authority;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getAuthority() {
        return authority;
    }
    public void setAuthority(String authority) {
        this.authority = authority;
    }

}



