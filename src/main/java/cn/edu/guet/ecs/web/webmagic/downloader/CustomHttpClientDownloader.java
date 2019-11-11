package cn.edu.guet.ecs.web.webmagic.downloader;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.downloader.HttpClientDownloader;

/**
 * @author Administrator
 */
@Slf4j
@Component
public class CustomHttpClientDownloader extends HttpClientDownloader {

    @Override
    protected void onError(Request request) {
        log.info(request.getUrl() + "download failure!!");
    }

}
