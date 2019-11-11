package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程分类
 */
@Data
public class CourseType implements Serializable {

    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;
}
