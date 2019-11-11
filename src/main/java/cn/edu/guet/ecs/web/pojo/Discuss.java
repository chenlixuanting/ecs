package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 讨论
 */
@Data
public class Discuss implements Serializable {

    private Integer id;

    private DiscussType discussType;

    private String content;

    private User user;

    private Date createTime;

    private Date updateTime;

}
