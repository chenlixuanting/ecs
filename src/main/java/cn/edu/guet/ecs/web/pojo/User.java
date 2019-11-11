package cn.edu.guet.ecs.web.pojo;

import lombok.Data;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户
 */
@Data
public class User implements Serializable {

    private Integer id;

    private UserType userType;

    private Picture profile;

    private String mobile;

    private String account;

    private String password;

    private String username;

    private College college;

    private List<Course> joinCourses;

    private List<Discuss> discusses;

    private List<Appraise> appraises;

    private Date createTime;

    private Date updateTime;

}
