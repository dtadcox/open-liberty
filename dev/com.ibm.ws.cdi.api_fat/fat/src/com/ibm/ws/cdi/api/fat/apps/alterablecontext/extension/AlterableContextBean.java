/*******************************************************************************
 * Copyright (c) 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.cdi.api.fat.apps.alterablecontext.extension;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlterableContextBean {
    public String getMsg() {
        return "I haven't been altered yet";
    }

}
