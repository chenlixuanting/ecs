package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程评价
 */
@Data
public class Appraise implements Serializable {

    private Integer id;

    private Course course;

    private User user;

    private Integer score;

    private String content;

    private Date createTime;

    private Date updateTime;

}
