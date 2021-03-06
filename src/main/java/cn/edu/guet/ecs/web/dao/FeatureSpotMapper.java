package cn.edu.guet.ecs.web.dao;

import cn.edu.guet.web.pojo.FeatureSpot;
import cn.edu.guet.web.pojo.FeatureSpotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeatureSpotMapper {
    long countByExample(FeatureSpotExample example);

    int deleteByExample(FeatureSpotExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeatureSpot record);

    int insertSelective(FeatureSpot record);

    List<FeatureSpot> selectByExample(FeatureSpotExample example);

    FeatureSpot selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeatureSpot record, @Param("example") FeatureSpotExample example);

    int updateByExample(@Param("record") FeatureSpot record, @Param("example") FeatureSpotExample example);

    int updateByPrimaryKeySelective(FeatureSpot record);

    int updateByPrimaryKey(FeatureSpot record);
}