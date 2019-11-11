package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 作业
 */
@Data
public class Work implements Serializable {

    private Integer id;

    private String title;

    private List<WorkItem> workItems;

    private Course course;

    private Date createTime;

    private Date updateTime;

}
