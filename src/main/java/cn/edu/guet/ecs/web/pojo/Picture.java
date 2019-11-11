package cn.edu.guet.ecs.web.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片
 */
@Data
public class Picture implements Serializable {

    private Integer id;

    private String url;

    private Date createTime;

    private Date updateTime;

}
