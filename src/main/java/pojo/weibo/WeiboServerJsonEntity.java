/*
 * Copyright (c) 2018. All Rights Reserved.
 * FileName: WeiboServerJsonEntity.java
 * Author: NiceMorning
 */

package pojo.weibo;

/**
 * 该类存储从微博服务器端返回的servertime,pubkey等数据
 * <p>
 * author: nicemorning
 * version: 1.0
 * date: 2018/8/5
 */
public class WeiboServerJsonEntity {

    private int retcode;
    private long servertime;
    private String pcid;
    private String nonce;
    private String pubkey;
    private String rsakv;
    private int is_openlock;
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

    public void setIs_openlock(int is_openlock) {
        this.is_openlock = is_openlock;
    }

    public int getIs_openlock() {
        return is_openlock;
    }

    public void setExectime(int exectime) {
        this.exectime = exectime;
    }

    public int getExectime() {
        return exectime;
    }
}
