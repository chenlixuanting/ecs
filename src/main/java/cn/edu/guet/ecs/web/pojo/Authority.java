package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限
 */
@Data
public class Authority implements Serializable {

    private Integer id;

    private String name;

    private Integer value;

    private Date createTime;

    private Date updateTime;

}
