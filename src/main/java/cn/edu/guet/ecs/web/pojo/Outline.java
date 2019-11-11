package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 教程大纲
 */
@Data
public class Outline extends CoursewareDetail implements Serializable {

    private Integer id;

    private String url;

    private CoursewareItem coursewareItem;

    private Date createTime;

    private Date updateTime;

}
