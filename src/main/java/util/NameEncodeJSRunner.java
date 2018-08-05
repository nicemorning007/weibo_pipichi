/*
 * Copyright (c) 2018. All Rights Reserved.
 * FileName: NameEncodeJSRunner.java
 * Author: NiceMorning
 */

package util;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 使用新浪微博的JS方法对用户名加密
 * <p>
 * author: nicemorning
 * version: 1.0
 * date: 2018/8/5
 */
public class NameEncodeJSRunner {
    private ScriptEngineManager manager = new ScriptEngineManager();
    private ScriptEngine engine = manager.getEngineByName("JavaScript");
    Invocable inv = null;

    public NameEncodeJSRunner() {
        try {
            engine.eval(new FileReader(new File("loginScript/loginEncode.js")));
        } catch (FileNotFoundException e) {
        } catch (ScriptException e) {
        }
        inv = (Invocable) engine;
    }

    public String executeFunction(String username) {
        String value = null;
        try {
            value = String.valueOf(inv.invokeFunction("suencode", username));
        } catch (NoSuchMethodException e) {
        } catch (ScriptException e) {
        }
        return value;
    }
}
