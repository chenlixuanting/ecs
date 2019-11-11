package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程公告
 */
@Data
public class Announcement implements Serializable {

    private Integer id;

    private String title;

    private String content;

    private Date createTime;

    private Date updateTime;

}
