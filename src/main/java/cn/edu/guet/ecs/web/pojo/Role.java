package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色
 */
@Data
public class Role implements Serializable {

    private Integer id;

    private String name;

    private List<Authority> authorities;

    private Date createTime;

    private Date updateTime;

}
