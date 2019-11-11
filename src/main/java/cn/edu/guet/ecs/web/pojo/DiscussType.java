package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 讨论分类
 */
@Data
public class DiscussType implements Serializable {

    private Integer id;

    private String title;

    private String detail;

    private Date createTime;

    private Date updateTime;

}
