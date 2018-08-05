/*
 * Copyright (c) 2018. All Rights Reserved.
 * FileName: PwdEncodeJSRunner.java
 * Author: NiceMorning
 */

package util;

import pojo.weibo.CallbackForm;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Class description
 * <p>
 * author: nicemorning
 * version: 1.0
 * date: 2018/8/5
 */
public class PwdEncodeJSRunner {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("JavaScript");
    Invocable inv = null;

    public PwdEncodeJSRunner() {
        try {
            engine.eval(new FileReader(new File("js/rsa.js")));
        } catch (FileNotFoundException e) {
        } catch (ScriptException e) {
        }
        inv = (Invocable) engine;
    }

    public String executeFunction(CallbackForm form, String pwd) {
        String value = null;
        try {
            value = String.valueOf(inv.invokeFunction("RSAEncode",
                    form.getPubkey(), "10001", pwd, form.getServertime(), form.getNonce()));
        } catch (NoSuchMethodException e) {
        } catch (ScriptException e) {
        }
        return value;
    }
}
