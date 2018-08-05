/*
 * Copyright (c) 2018. All Rights Reserved.
 * FileName: WeiboLoginCallbackJsonEntity.java
 * Author: NiceMorning
 */

package pojo.weibo;

/**
 * 该类存储请求登陆请求完成后得到一组JSON格式的数据
 * <p>
 * Retcode 0 代表执行成功
 * Pcid  暂时用不到
 * Servertime和nonce 很重要，这两个数据很重要，是配合对账户密码进行加密的值
 * Pubkey 是加密算法的公钥
 * Rsakv 代表rsa加密算法
 * 上述数据中，servertime,nonce,rsakv是需要传回服务器的数据
 * author: nicemorning
 * version: 1.0
 * date: 2018/8/5
 */
public class WeiboLoginCallbackJsonEntity {
    private int retcode;
    private long servertime;
    private String pcid;
    private String nonce;
    private String pubkey;
    private String rsakv;
    private int exectime;

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public int getRetcode() {
        return retcode;
    }

    public void setServertime(long servertime) {
        this.servertime = servertime;
    }

    public long getServertime() {
        return servertime;
    }

    public void setPcid(String pcid) {
        this.pcid = pcid;
    }

    public String getPcid() {
        return pcid;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getNonce() {
        return nonce;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    public String getPubkey() {
        return pubkey;
    }

    public void setRsakv(String rsakv) {
        this.rsakv = rsakv;
    }

    public String getRsakv() {
        return rsakv;
    }

    public void setExectime(int exectime) {
        this.exectime = exectime;
    }

    public int getExectime() {
        return exectime;
    }

}
