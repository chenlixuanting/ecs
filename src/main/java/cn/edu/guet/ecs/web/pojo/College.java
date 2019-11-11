package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 大学
 */
@Data
public class College implements Serializable {

    private Integer id;

    private String name;

    private Picture logo;

    private Date createTime;

    private Date updateTime;

}
