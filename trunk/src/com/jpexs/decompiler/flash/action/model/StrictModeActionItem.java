/*
 *  Copyright (C) 2011-2013 JPEXS
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jpexs.decompiler.flash.action.model;

import com.jpexs.decompiler.flash.helpers.HilightedTextWriter;
import com.jpexs.decompiler.graph.GraphSourceItem;
import com.jpexs.decompiler.graph.model.LocalData;

public class StrictModeActionItem extends ActionItem {

    public int mode;

    public StrictModeActionItem(GraphSourceItem instruction, int mode) {
        super(instruction, PRECEDENCE_PRIMARY);
        this.mode = mode;
    }

    @Override
    protected HilightedTextWriter appendTo(HilightedTextWriter writer, LocalData localData) {
        return hilight("StrictMode(" + mode + ");", writer); //I still don't know how AS source of Strict Mode instruction looks like, assuming this...
    }

    @Override
    public boolean hasReturnValue() {
        return false; //FIXME ?
    }
}
