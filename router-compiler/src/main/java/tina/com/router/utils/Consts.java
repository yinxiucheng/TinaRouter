package tina.com.router.utils;

import com.squareup.javapoet.ClassName;

/**
 * @author yxc
 * @date 2018/9/28
 */
public final class Consts {

    public static final ClassName ROUTER = ClassName.get("tina.com.router.core", "TinaRouter");

    public static final String ARGUMENTS_NAME = "moduleName";
    public static final String ANN_TYPE_ROUTE = "tina.com.router.annotation.Route";
    public static final String ANN_TYPE_Extra = "tina.com.router.annotation.Extra";



    public static final String SEPARATOR = "$";
    public static final String PROJECT = "TinaRouter";
    public static final String NAME_OF_ROOT = PROJECT + SEPARATOR + "Root" + SEPARATOR;
    public static final String NAME_OF_GROUP = PROJECT + SEPARATOR + "Group" + SEPARATOR;
    public static final String NAME_OF_EXTRA = SEPARATOR + "Extra";

    public static final String PACKAGE_OF_GENERATE_FILE = "tina.com.router.routes";

    public static final String ACTIVITY = "android.app.Activity";
    public static final String ISERVICE = "tina.com.router.core.template.IService";

    public static final String IROUTE_ROOT = "tina.com.router.core.template.IRouteRoot";
    public static final String IROUTE_GROUP = "tina.com.router.core.template.IRouteGroup";


    public static final String METHOD_LOAD_INTO = "loadInto";
    public static final String METHOD_LOAD_EXTRA = "loadExtra";


}
