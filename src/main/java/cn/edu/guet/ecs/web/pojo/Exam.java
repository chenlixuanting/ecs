package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 考试
 */
@Data
public class Exam implements Serializable {

    private Integer id;

    private List<Question> questions;

    private Integer totalScore;

    private Integer timeLimit;

    private Integer maxCommitTime;

    private Date closeTime;

    private Date createTime;

    private Date updateTime;

}
