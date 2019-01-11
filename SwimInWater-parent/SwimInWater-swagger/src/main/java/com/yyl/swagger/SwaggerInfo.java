package com.yyl.swagger;

import org.springframework.stereotype.Component;

/**
 * swagger 配置信息
 */
@Component
public class SwaggerInfo {
	/** 模块名字 */
    private String groupName ="controller";
    /** 包名 */
    private String basePackage;

    private String antPath;
    /** 标题 */
    private String title = "HTTP API";
    /** 描述 */
    private String description = "Swagger 自动生成接口文档";

    private String license = "Apache License Version 2.0";

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getAntPath() {
        return antPath;
    }

    public void setAntPath(String antPath) {
        this.antPath = antPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
