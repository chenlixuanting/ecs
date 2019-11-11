package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 作业分数
 */
@Data
public class WorkScore implements Serializable {

    private Integer id;

    private WorkItem workItem;

    private Integer commitTime;

    private Integer score;

    private Date createTime;

    private Date updateTime;

}
