package com.melody.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
public class Teacher implements Serializable {

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("教师用户名")
    private String teacherId;

    @ApiModelProperty("教师密码")
    private String password;

    @ApiModelProperty("教师姓名")
    private String teacherName;

    @ApiModelProperty("教师头像")
    private String iconUrl;

    @ApiModelProperty("教师电话")
    private String phone;

    @ApiModelProperty("教师性别")
    private String sex;

    @ApiModelProperty("类型,0是教师，1是管理员")
    int type;

    @ApiModelProperty("账号状态,1启用,2禁用")
    int status;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建人主键id")
    private Long createUser;
    @ApiModelProperty("更新人主键id")
    private Long updateUser;
}