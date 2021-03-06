/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Vladislav Zablotsky
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE. 
 */
package com.github.javaplugs.jsf;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * Implements JSF converter for {@link Instant} type.
 * You can refer it as &lt;f:converter converterId="jsfplugs.Instant" /&gt;
 * or use it from library xmlns:jp="https://github.com/javaplugs/jsf-plugs"
 * as &lt;jp:convertInstant /&gt;
 *
 * @see DateTimeConverter
 */
public class InstantConverter extends DateTimeConverter {

    public InstantConverter() {
        this.formatter = DateTimeFormatter.ISO_TIME;
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Instant inst = Instant.from(formatter.parse(value));
        return inst;
    }
}
