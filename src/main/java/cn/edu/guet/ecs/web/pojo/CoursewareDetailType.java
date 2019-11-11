package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 课件项分类
 */
@Data
public class CoursewareDetailType implements Serializable {

    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;

}
