package cn.edu.guet.ecs.web.dao;

import cn.edu.guet.web.pojo.HotDestination;
import cn.edu.guet.web.pojo.HotDestinationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotDestinationMapper {
    long countByExample(HotDestinationExample example);

    int deleteByExample(HotDestinationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotDestination record);

    int insertSelective(HotDestination record);

    List<HotDestination> selectByExample(HotDestinationExample example);

    HotDestination selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotDestination record, @Param("example") HotDestinationExample example);

    int updateByExample(@Param("record") HotDestination record, @Param("example") HotDestinationExample example);

    int updateByPrimaryKeySelective(HotDestination record);

    int updateByPrimaryKey(HotDestination record);
}