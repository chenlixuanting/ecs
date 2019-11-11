package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 课程
 */
@Data
public class Course implements Serializable {

    private Integer id;

    private String title;//课程标题

    private Picture profile;//课程信息简介

    private String description;//课程描述信息

    private CourseType courseType;//课程分类

    private Courseware courseware;//课程课件

    private Video introductionVideo;//课程介绍视频

    private List<User> teacherTeam;//课程教学团队

    private Date openCourseTime;//课程开课时间

    private Date closeCourseTime;//课件结课时间

    private Integer minHoursArrWeek;//最小课时安排

    private Integer maxHoursArrWeek;//最大课时安排

    private List<Work> works;//课程测验和作业

    private Exam exam;//课程考试

    private List<Appraise> appraises;//课程评价

    private List<Discuss> discusses;//课程讨论
    
}
