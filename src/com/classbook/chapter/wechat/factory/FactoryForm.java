package com.classbook.chapter.wechat.factory;

import javax.swing.*;

/**
 * @program: classprogram
 * @Description: 抽象工厂
 * @author: Mr.Cheng
 * @date: 2019/11/18 1:29 下午
 */
abstract class FactoryForm {
    /**
    * @Description: 生产窗体
    * @Param: []
    * @return: javax.swing.JFrame
    * @Author: Mr.Cheng
    * @Date: 2019/11/18 1:31 下午
    */ 
    abstract public JFrame getJFrame();
}
