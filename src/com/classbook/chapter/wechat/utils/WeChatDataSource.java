package com.classbook.chapter.wechat.utils;

import com.classbook.chapter.wechat.userinfo.UserInfo;

import java.io.*;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/11/27 4:02 下午
 */
public class WeChatDataSource {
    /**
    * @Description: to get user information from user file
    * @Param: [filepath]
    * @return: com.classbook.chapter.wechat.userinfo.UserInfo
    * @Author: Mr.Cheng
    * @Date: 2019/11/29 2:38 下午
    */
    public UserInfo getUserInfoFromFile(String filepath,String filename) throws FileNotFoundException {
        UserInfo userInfo = null;
        File file =  new File(filepath + filename);
        if(!file.exists()){
            throw new FileNotFoundException();
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            if("".equals(br.readLine()) || "".equals(br.readLine())){
                throw new FileNotFoundException();
            }
            userInfo = new UserInfo();
            userInfo.setUserName(br.readLine());
            userInfo.setUserPassword(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    public UserInfo getUserInfoFromDatabase(){
        return null;
    }
}
