package com.timeless.menglavol.design.pattern.responsibility.request;

/**
 * @ClassName: Request
 * @Description: 请求类
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class Request {

    // 请求名称
    private String name;

    // 请求优先级
    private int priority;

    // 请求描述
    private String description;

    public Request(String name, int priority, String description) {
        this.name = name;
        this.priority = priority;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
