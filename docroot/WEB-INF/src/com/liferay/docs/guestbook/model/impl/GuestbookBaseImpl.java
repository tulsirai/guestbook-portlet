/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.docs.guestbook.model.impl;

import com.liferay.docs.guestbook.model.Guestbook;
import com.liferay.docs.guestbook.service.GuestbookLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Guestbook service. Represents a row in the &quot;GB_Guestbook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GuestbookImpl}.
 * </p>
 *
 * @author trai
 * @see GuestbookImpl
 * @see com.liferay.docs.guestbook.model.Guestbook
 * @generated
 */
public abstract class GuestbookBaseImpl extends GuestbookModelImpl
	implements Guestbook {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a guestbook model instance should use the {@link Guestbook} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			GuestbookLocalServiceUtil.addGuestbook(this);
		}
		else {
			GuestbookLocalServiceUtil.updateGuestbook(this);
		}
	}
}