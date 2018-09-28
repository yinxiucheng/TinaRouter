package tina.com.router.core.template;

import java.util.Map;

import tina.com.router.annotation.RouteMeta;

/**
 * @author Lance
 * @date 2018/2/22
 */

public interface IRouteGroup {

    void loadInto(Map<String, RouteMeta> atlas);
}
