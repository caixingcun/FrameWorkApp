package com.example.frameworkapp.util;


public class LayoutInjectUtil {
    /**
     * 获取容器的布局id
     * @param container the container of InjectLayout
     * @return the layout id
     */
    public static int getInjectLayoutId(Object container){
        InjectLayout injectLayout = container.getClass().getAnnotation(InjectLayout.class);
        if(injectLayout == null) {
            LogUtils.debug("Can not find annotation 'InjectLayout' on "+container.getClass().getName()+".");
            return 0;
        }
        return injectLayout.value();
    }
}
