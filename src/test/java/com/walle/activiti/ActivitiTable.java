package com.walle.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author ：zhouwei
 * @date ：Created in 2019/8/4 17:06
 * @description：生成表
 * @modified By：
 */
public class ActivitiTable {
    /**
     * 创建Activiti流的相关的数据库表
     */
    @Test
    public void creatTable(){
        InputStream congXML = ActivitiTable.class.getClassLoader().getResourceAsStream("activiti.cfg.xml");
        ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromInputStream(congXML)
                .buildProcessEngine();
    }
}