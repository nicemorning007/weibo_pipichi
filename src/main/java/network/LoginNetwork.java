/*
 * Copyright (c) 2018. All Rights Reserved.
 * FileName: LoginNetwork.java
 * Author: NiceMorning
 */

package network;

import config.WeiboLinkConfig;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * 该类用于登陆请求
 * <p>
 * author: nicemorning
 * version: 1.0
 * date: 2018/8/5
 */
public class LoginNetwork {

    /**
     * 登陆第一步，获取到加密js文件。
     * 也可用于获取最新版本的微博登陆加密JS文件，用于更新loginEncode.js文件版本
     */
    public void preLogin() {
        String url = WeiboLinkConfig.loginUrl;
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 登陆第二步
     * 请求servertime,pubkey等数据，通过GET 请求获取一个 JSON格式的数据
     */
    public void getLoginInfoValue() {

    }

}
