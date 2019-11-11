package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ExamScore implements Serializable {

    private Integer id;

    private User user;

    private Exam exam;

    private Integer score;

    private Integer joinTime;

    private Date createTime;

    private Date updateTime;

}
