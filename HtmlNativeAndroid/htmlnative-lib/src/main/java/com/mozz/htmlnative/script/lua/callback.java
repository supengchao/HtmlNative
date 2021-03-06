package com.mozz.htmlnative.script.lua;

import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.TwoArgFunction;

/**
 * @author Yang Tao, 17/3/21.
 */

public class callback extends TwoArgFunction {
    private LuaRunner mRunner;

    public callback(LuaRunner runner) {
        mRunner = runner;
    }

    @Override
    public LuaValue call(LuaValue arg1, LuaValue arg2) {
        if (!arg2.eq_b(LuaValue.NIL)) {
            String funName = arg1.tojstring();
            mRunner.putFunction(funName, arg2);
        }
        return LuaValue.NIL;

    }
}
