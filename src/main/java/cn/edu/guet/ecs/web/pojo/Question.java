package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 试题
 */
@Data
public class Question extends CoursewareDetail implements Serializable {

    private Integer id;

    private String content;

    private Answer answer;
    
}
