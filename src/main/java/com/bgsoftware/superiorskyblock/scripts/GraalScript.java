package com.bgsoftware.superiorskyblock.scripts;

import com.bgsoftware.superiorskyblock.api.scripts.IScriptEngine;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

import javax.script.Bindings;
import javax.script.ScriptException;
import javax.script.SimpleBindings;
import java.util.Map;

public final class GraalScript implements IScriptEngine {

    private static final GraalScript instance = new GraalScript();

    public static GraalScript getInstance() {
        return instance;
    }

    private GraalScript(){

    }

    @Override
    public Object eval(String stringToEvaluate) throws ScriptException {
        return eval(stringToEvaluate, new SimpleBindings());
    }

    @Override
    public Object eval(String stringToEvaluate, Bindings bindings) throws ScriptException {
        try(Context context = Context.create("js")) {
            Value jsBindings = context.getBindings("js");

            for(Map.Entry<String, Object> entry : bindings.entrySet())
                jsBindings.putMember(entry.getKey(), entry.getValue());

            return context.eval("js", stringToEvaluate).as(Object.class);
        }
    }

}
