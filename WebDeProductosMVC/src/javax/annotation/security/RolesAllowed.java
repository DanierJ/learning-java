/*
 * Copyright (c) 2005, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.annotation.security;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Specifies the list of security roles permitted to access method(s) in an 
 * application.  The value of the <code>RolesAllowed</code> annotation 
 * is a list of security role names. 
 * This annotation can be specified on a class or on method(s). Specifying it 
 * at a class level means that it applies to all the methods in the class. 
 * Specifying it on a method means that it is applicable to that method only. 
 * If applied at both the class and methods level, the method value overrides 
 * the class value if the two conflict.
 *
 * @since Common Annotations 1.0
 */
@Documented
@Retention (RUNTIME)
@Target({TYPE, METHOD})
public @interface RolesAllowed {
    /**
     * List of roles that are permitted access.
     */
    String[] value();
}
