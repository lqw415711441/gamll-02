package com.galaxy.gmall.usermanage.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author 李清旺
 * @create 2020-11-18-23:54
 */
@Data
public class UserInfo implements Serializable {
       @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;
        @Column
        private String loginName;
        @Column
        private String nickName;
        @Column
        private String passwd;
        @Column
        private String name;
        @Column
        private String phoneNum;
        @Column
        private String email;
        @Column
        private String headImg;
        @Column
        private String userLevel;
    }
