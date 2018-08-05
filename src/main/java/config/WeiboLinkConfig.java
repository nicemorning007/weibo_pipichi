/*
 * Copyright (c) 2018. All Rights Reserved.
 * FileName: WeiboLinkConfig.java
 * Author: NiceMorning
 */

package config;

import java.util.Calendar;

/**
 * 微博访问连接和头部的配置
 * <p>
 * author: nicemorning
 * version: 1.0
 * date: 2018/8/5
 */
public abstract class WeiboLinkConfig {
    public static final String photoUrl = "/photos";
    public static final String weiboUrl = "https://weibo.com/p";
    public static final String userId = "/1005055716132106";
    private static String timestamp = String.valueOf(Calendar.getInstance().getTimeInMillis());
    public static final String loginUrl = "https://login.sina.com.cn/crossdomain2.php?action=login&entry=weibo&r=https://passport.weibo.com/wbsso/login?ssosavestate=1565004142&url=https%3A%2F%2Fweibo.com%2Fajaxlogin.php%3Fframelogin%3D1%26callback%3Dparent.sinaSSOController.feedBackUrlCallBack%26sudaref%3Dweibo.com&display=0&ticket=ST-MTg4MzIyODg0Mw==-1533468142-yf-5C152D013B1766E966C9E94E9DB1CD5A-1&retcode=0&login_time=" + timestamp + "&sign=7b78330a771a3fd3&sr=1920*1080";
}
