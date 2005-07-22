/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/frontend/templateone/form/CmsCaptchaService.java,v $
 * Date   : $Date: 2005/07/22 15:22:39 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (C) 2002 - 2004 Alkacon Software (http://www.alkacon.com)
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

package org.opencms.frontend.templateone.form;

import com.octo.captcha.service.image.EhcacheManageableImageCaptchaService;
import com.octo.captcha.service.image.ImageCaptchaService;

/**
 * Provides the facility to create and cache the captcha images.<p>
 * 
 * @author Thomas Weckert (t.weckert@alkacon.com)
 * @version $Revision: 1.1 $
 */
public class CmsCaptchaService extends EhcacheManageableImageCaptchaService implements ImageCaptchaService {

    /**
     * Creates a new captcha service.<p>
     * 
     * @param captchaSettings the settings to render captcha images
     */
    public CmsCaptchaService(CmsCaptchaSettings captchaSettings) {

        super(new CmsCaptchaEngine(captchaSettings), 180, 100000);
    }

}
