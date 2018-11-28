package com.study.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法A");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法B");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法A");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法B");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsClient(){
        System.out.println("这是客户端组运行之后运行的方法");
    }
}
