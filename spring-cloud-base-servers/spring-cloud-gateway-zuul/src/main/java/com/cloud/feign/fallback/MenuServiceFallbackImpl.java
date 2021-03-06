package com.cloud.feign.fallback;

import com.cloud.common.vo.MenuVo;
import com.cloud.feign.MenuService;
import com.cloud.feign.MenuServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author summer
 * @date 2017/10/31
 * why add @IService when i up version ?
 * https://github.com/spring-cloud/spring-cloud-netflix/issues/762
 */
public class MenuServiceFallbackImpl implements MenuServiceClient {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Set<MenuVo> findMenuByRole(String role) {
        logger.error("调用{}异常{}","findMenuByRole",role);
        return null;
    }
}
