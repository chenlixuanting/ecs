package cn.edu.guet.ecs.web.service.impl;

import cn.edu.guet.web.dao.FeatureSpotMapper;
import cn.edu.guet.web.service.FeatureSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class FeatureSpotServiceImpl implements FeatureSpotService {

    @Autowired
    private FeatureSpotMapper featureSpotMapper;

}
