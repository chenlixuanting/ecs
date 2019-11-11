package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 试题答案
 */
@Data
public class Answer implements Serializable {

    private Integer id;

    private String content;

    private Date createTime;

    private Date updateTime;

}
