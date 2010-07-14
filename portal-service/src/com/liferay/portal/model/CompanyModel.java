/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the Company table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       Company
 * @see       com.liferay.portal.model.impl.CompanyImpl
 * @see       com.liferay.portal.model.impl.CompanyModelImpl
 * @generated
 */
public interface CompanyModel extends BaseModel<Company> {
	public long getPrimaryKey();

	public void setPrimaryKey(long pk);

	public long getCompanyId();

	public void setCompanyId(long companyId);

	public long getAccountId();

	public void setAccountId(long accountId);

	@AutoEscape
	public String getWebId();

	public void setWebId(String webId);

	@AutoEscape
	public String getKey();

	public void setKey(String key);

	@AutoEscape
	public String getVirtualHost();

	public void setVirtualHost(String virtualHost);

	@AutoEscape
	public String getMx();

	public void setMx(String mx);

	@AutoEscape
	public String getHomeURL();

	public void setHomeURL(String homeURL);

	public long getLogoId();

	public void setLogoId(long logoId);

	public boolean getSystem();

	public boolean isSystem();

	public void setSystem(boolean system);

	public int getMaxUsers();

	public void setMaxUsers(int maxUsers);

	public Company toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Company company);

	public int hashCode();

	public String toString();

	public String toXmlString();
}