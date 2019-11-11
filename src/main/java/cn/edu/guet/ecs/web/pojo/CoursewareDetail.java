package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 课件项详情父类
 */
@Data
public abstract class CoursewareDetail implements Serializable {

    protected Integer id;

    protected CoursewareDetailType coursewareDetailType;

}
