package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 试题
 */
@Data
public class Question extends CoursewareDetail implements Serializable {

    private String content;

    private List<Picture> pictures;

    private Answer answer;

    private Integer score;

}
