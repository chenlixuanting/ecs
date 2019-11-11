package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class WorkItem implements Serializable {

    private Integer id;

    private String title;

    private List<Question> questions;

    private Date createTime;

    private Date updateTime;
}
