/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/containerpage/client/Attic/CmsDummyZIndexManager.java,v $
 * Date   : $Date: 2010/11/16 14:32:06 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.ade.containerpage.client;

import com.google.gwt.dom.client.Element;

/**
 * Dummy implementation of the Z index manager which does nothing, used for every other browser than IE.<p>
 * 
 * @author Georg Westenberger
 * 
 * @version $Revision: 1.1 $
 * 
 * @since 8.0
 */
public class CmsDummyZIndexManager implements I_CmsContainerZIndexManager {

    /**
     * @see org.opencms.ade.containerpage.client.I_CmsContainerZIndexManager#addContainer(java.lang.String, com.google.gwt.dom.client.Element)
     */
    public void addContainer(String name, Element element) {

        // do nothing
    }

    /**
     * @see org.opencms.ade.containerpage.client.I_CmsContainerZIndexManager#enter(java.lang.String)
     */
    public void enter(String containerName) {

        // do nothing
    }

    /**
     * @see org.opencms.ade.containerpage.client.I_CmsContainerZIndexManager#leave(java.lang.String)
     */
    public void leave(String containerName) {

        // do nothing
    }

    /**
     * @see org.opencms.ade.containerpage.client.I_CmsContainerZIndexManager#start(java.lang.String)
     */
    public void start(String containerName) {

        // do nothing
    }

    /**
     * @see org.opencms.ade.containerpage.client.I_CmsContainerZIndexManager#stop()
     */
    public void stop() {

        // do nothing
    }

}
