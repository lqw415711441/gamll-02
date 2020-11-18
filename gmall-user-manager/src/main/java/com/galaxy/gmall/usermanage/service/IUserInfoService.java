package com.galaxy.gmall.usermanage.service;

import com.galaxy.gmall.usermanage.bean.UserInfo;

import java.util.List;

/**
 * @author 李清旺
 * @create 2020-11-19-0:01
 */
public interface IUserInfoService {

    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);


}
