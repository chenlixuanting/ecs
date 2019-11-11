package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理员
 */
@Data
public class Admin implements Serializable {

    private Integer id;

    private String account;

    private String password;

    private Date createTime;

    private Date updateTime;

}
