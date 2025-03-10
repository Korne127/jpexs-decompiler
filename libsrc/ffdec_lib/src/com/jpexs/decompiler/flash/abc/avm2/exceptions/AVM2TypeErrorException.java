/*
 *  Copyright (C) 2010-2023 JPEXS, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.decompiler.flash.abc.avm2.exceptions;

/**
 *
 * @author JPEXS
 */
public class AVM2TypeErrorException extends AVM2ExecutionException {

    public AVM2TypeErrorException(int code, boolean debug) {
        super(codeToMessage(code, debug, null));
    }

    public AVM2TypeErrorException(int code, boolean debug, Object[] params) {
        super(codeToMessage(code, debug, params));
    }

    private static String codeToMessage(int code, boolean debug, Object[] params) {
        String msg = null;
        switch (code) {
        }

        String result = "TypeError: Error #" + code;
        if (debug && msg != null) {
            result += ": " + msg;
        }

        return result;
    }
}
