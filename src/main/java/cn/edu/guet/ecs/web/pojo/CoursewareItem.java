package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 课件详情项
 */
@Data
public class CoursewareItem implements Serializable {

    private Integer id;

    private List<CoursewareDetail> coursewareDetails;

}
