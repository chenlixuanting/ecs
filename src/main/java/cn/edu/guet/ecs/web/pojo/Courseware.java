package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 课件
 */
@Data
public class Courseware implements Serializable {

    private Integer id;

    private String name;

    private List<CoursewareItem> coursewareItems;

    private List<Work> works;

    private Date createTime;

    private Date updateTime;

}
